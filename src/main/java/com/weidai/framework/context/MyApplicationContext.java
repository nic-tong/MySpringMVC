package com.weidai.framework.context;

import java.io.File;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

import com.weidai.framework.annotation.MyAutowired;
import com.weidai.framework.annotation.MyController;
import com.weidai.framework.annotation.MyService;


/**
 * @描述
 * @author nic 
 * @time：2018年6月20日 上午10:39:41
 */
public class MyApplicationContext {

	private Map<String, Object> instanceMapping = new ConcurrentHashMap<>();
	
	private List<String> classCache = new ArrayList<>();
	
	public MyApplicationContext(String location) {
		try {
			// 第一步 定位
			@SuppressWarnings("static-access")
			InputStream is = this.getClass().getClassLoader().getResourceAsStream(location);
			
			// 第二步 加载
			Properties config = new Properties();
			config.load(is);
		
		// 第三步 注册
			String basePackageName = config.getProperty("scanPackage");
		doRegister(basePackageName);
		
		// 第四步 初始化bean
		doCreateBean();
		
		// 第六步 注入
		doPopulation();
		
		System.out.println("IOC 容器初始化完成.");
		} catch (Exception e) {
			e.printStackTrace();
		}
				
	}
	private void doRegister(String packageName) {
		URL uri = this.getClass().getClassLoader().getResource("/" + packageName.replaceAll("\\.", "/"));
		File dir = new File(uri.getFile());
		for (File file: dir.listFiles()) {
			if (file.isDirectory()) {
				// 如果是文件夹，递归注册
				doRegister(packageName + "." + file.getName());
			} else {
				classCache.add(packageName + "."+file.getName().replace(".class", "")); 
			}
		}
	}
	// 注入
	private void doPopulation() {
		if(instanceMapping.isEmpty()) {return;}
		
		for (Entry<String,Object> entry : instanceMapping.entrySet()) {
			Field [] fields = entry.getValue().getClass().getDeclaredFields();
			for (Field field: fields) {
				if (!field.isAnnotationPresent(MyAutowired.class)) {continue;}
				
				MyAutowired autowired = field.getAnnotation(MyAutowired.class);
				String nameId = autowired.value().trim();
				if ("".equals(nameId)) {
					nameId = field.getType().getName();
				}
				field.setAccessible(true);
				try {
					field.set(entry.getValue(), instanceMapping.get(nameId));
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
		
	}
	private void doCreateBean() {
		if(classCache.isEmpty()) {
			return;
		}
		try {
			for (String className: classCache) {
				Class<?> clazz = Class.forName(className);
				
				// 只有类名上加了service 和Controller 的需要初始化
				if (clazz.isAnnotationPresent(MyController.class)) {
					String id = lowerFirstChar(clazz.getSimpleName());
					instanceMapping.put(id, clazz.newInstance());
				} else if (clazz.isAnnotationPresent(MyService.class)) {
					MyService service = clazz.getAnnotation(MyService.class);
					String id = service.value();
					if (!"".equals(id)) {
						instanceMapping.put(id, clazz.newInstance());
						continue;
					}
					Class<?> [] interfaces = clazz.getInterfaces();
					for(Class<?> interf : interfaces) {
						instanceMapping.put(interf.getName(), clazz.newInstance());
					}
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	private String lowerFirstChar(String str) {
		char [] chars = str.toCharArray();
		chars[0] += 32;
		return String.valueOf(chars);
	}
	public Object getBean(String name) {
		return instanceMapping.get(name);
	}
	
	public Map<String, Object> getAll() {
		return instanceMapping;
	}
}
