package com.weidai.framework.servlet;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weidai.framework.annotation.MyController;
import com.weidai.framework.annotation.MyRequestMapping;
import com.weidai.framework.annotation.MyRequestParam;
import com.weidai.framework.context.MyApplicationContext;


/**
 * @描述
 * @author nic 
 * @time：2018年6月20日 上午10:00:35
 */
public class DispatcherServlet extends HttpServlet {

	private static final String LOCATION = "contextConfigLocation";
	
	private List<Handler> handlerMapping = new ArrayList<>();
	
	private List<HandlerAdapter> adapterMapping = new ArrayList<>();
	
//	private Map<String, Handler> handlerMapping = new HashMap<>();
	
//	private Map<Handler, HandlerAdapter> adapterMapping = new HashMap<>();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("调用contextPath:" + req.getContextPath() + " URI:" + req.getRequestURI());
		try{
			doDispatch(req,resp);
		} catch(Exception e) {
			resp.setStatus(500);
			resp.getWriter().write("500 服务器内部错误!" + Arrays.asList(e.getStackTrace()));
		}
	}

	private void doDispatch(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		
		// 从handler Mapping 中找到handler
		Handler handler = getHandler(req);
		
		if (handler == null) {
			resp.getWriter().write("404 Not Found!");
			return;
		}
		// 通过handler 找到 HandlerAdapter
		HandlerAdapter ha = getHandlerAdapter(handler);
		
		Object mv = ha.handle(req, resp, handler);
	}

	private HandlerAdapter getHandlerAdapter(Handler handler) {
		if (adapterMapping.isEmpty()) return null;
		
		for (HandlerAdapter adapter: adapterMapping) {
			if (adapter.handler.equals(handler)) {
				return adapter;
			}
		}
		return null;
	}

	private Handler getHandler(HttpServletRequest req) {
		// TODO Auto-generated method stub
		if (handlerMapping.isEmpty())
			return null;
		String url = req.getRequestURI();
		String contextPath = req.getContextPath();
		url = url.replace(contextPath, "").replace("/+", "/");
		for (Handler handler : handlerMapping) {
			if(url.equalsIgnoreCase(handler.url)) {
				return handler;
			}
		}
		return null;
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

	// 初始化 IOC 容器 和HandlerMapping
	
	@Override
	public void init(ServletConfig config) throws ServletException {
        
		MyApplicationContext context = new MyApplicationContext(config.getInitParameter(LOCATION));
		System.out.println(context.getAll());
		
		System.out.println(context.getBean("baseController"));
		// 请求解析
		initMultipartResolver(context);
		// 多语言国际化
		initLocaleResolver(context);
		// 主题view层
		initThemeResolver(context);
		// 解析url和Method的关联映射关系 URM(url relation method)
		initHandlerMappings(context);
		// 适配器（url匹配过程）
		initHandlerAdapters(context);
		// 异常解析
		initHandlerExceptionResolvers(context);
		//视图转发，根据视图名字匹配一个具体模板
		initRequestToViewNameTranslator(context);
		// 解析模板中的内容，难道服务器传过来的方法，生成html代码
		initViewResolvers(context);
		initFlashMapManager(context);
		
		System.out.println("MySpringMVC 初始化完成");
		
	}
	
	// 请求解析
	private void initMultipartResolver(MyApplicationContext context){}
	// 多语言国际化
	private void initLocaleResolver(MyApplicationContext context){}
	// 主题view层
	private void initThemeResolver(MyApplicationContext context){}
	
	
	// 解析url和Method的关联映射关系 URM(url relation method)
	private void initHandlerMappings(MyApplicationContext context){
		Map<String, Object> ioc = context.getAll();
		if (ioc.isEmpty()) {
			return;
		}
		
		for (Entry<String, Object> entry: ioc.entrySet()) {
			Class<?> clazz = entry.getValue().getClass();
			// 如果没有被Controller 注解 直接跳过
			if (!clazz.isAnnotationPresent(MyController.class)) {continue;}
			// 如果没有被 RequestMapping 注解，直接跳过
			if (!clazz.isAnnotationPresent(MyRequestMapping.class)) { continue;}
			
			MyRequestMapping requestMapping = clazz.getAnnotation(MyRequestMapping.class);
			String url = requestMapping.value();
			
			Method [] methods = clazz.getMethods();
			for (Method method : methods) {
				if (!method.isAnnotationPresent(MyRequestMapping.class)) {continue;}
				MyRequestMapping methodMapping = method.getAnnotation(MyRequestMapping.class);
				String methodUrl = url + methodMapping.value();
				handlerMapping.add(new Handler(methodUrl,method, entry.getValue()));
			}
		}
		
	}
	// 适配器（url匹配过程）Adapter 主要是用来动态匹配参数的，能够动态赋值
	private void initHandlerAdapters(MyApplicationContext context){
		if (handlerMapping.isEmpty()) {return;}
		for (Handler handler: handlerMapping) {
			
			Map<String, Integer> paramMapping = new HashMap<>();
			Class<?> [] paramTypes = handler.method.getParameterTypes();
			for (int i=0; i< paramTypes.length; i++) {
				Class<?> clazz = paramTypes[i];
				if (clazz == HttpServletRequest.class || clazz == HttpServletResponse.class) {
					paramMapping.put(clazz.getName(), i);
				}
			}
			Annotation [][] annotations = handler.method.getParameterAnnotations();
			for (int i=0; i< annotations.length; i++) {
				for(Annotation ann : annotations[i]) {
					if(ann instanceof MyRequestParam) {
						String paramName = ((MyRequestParam) ann).value();
						paramMapping.put(paramName, i);
					}
				}
			}
			adapterMapping.add(new HandlerAdapter(paramMapping, handler));
		}
	}
	// 异常解析
	private void initHandlerExceptionResolvers(MyApplicationContext context){}
	//视图转发，根据视图名字匹配一个具体模板
	private void initRequestToViewNameTranslator(MyApplicationContext context){}
	// 解析模板中的内容，难道服务器传过来的方法，生成html代码
	private void initViewResolvers(MyApplicationContext context){}
	private void initFlashMapManager(MyApplicationContext context){}
	
	/**
	 * HandlerMapping 定义
	 * @author nic
	 *
	 */
	protected class Handler {
		protected Method method;
		protected Object controller;
		protected String url;
		public Handler(String url, Method method, Object controller) {
			this.url = url;
			this.method = method;
			this.controller = controller;
		}
	}
	
	
	/**
	 * 方法适配器
	 * @author nic
	 *
	 */
	protected class HandlerAdapter {
		Map<String, Integer> paramTypeMapping;
		Handler handler;
		
		public HandlerAdapter(Map<String, Integer> paramTypeMapping, Handler handler) {
			this.handler = handler;
			this.paramTypeMapping = paramTypeMapping;
		}
		// 主要用反射调用url对应的方法
		public Object handle(HttpServletRequest req, HttpServletResponse resp,
				Handler handler) throws Exception{
			Class<?> [] paramTypes = handler.method.getParameterTypes();
			Object [] paramValues = new Object[paramTypes.length];
			// 要想给参数赋值，需要取出所有的参数
			Map<String, String[]> params = req.getParameterMap();
			for (Entry<String, String[]> param : params.entrySet()) {
				String value = Arrays.toString(param.getValue()).replaceAll("\\[|\\]", "").replaceAll(",\\s", ",");
				if (!this.paramTypeMapping.containsKey(param.getKey())) continue;
				
				int index = this.paramTypeMapping.get(param.getKey());
				paramValues[index] = value;
			}
			
			// request 和response 赋值
			if (this.paramTypeMapping.containsKey(HttpServletRequest.class.getName())) {
				int indexReq = this.paramTypeMapping.get(HttpServletRequest.class.getName());
				paramValues[indexReq] = req;
			}
			if(this.paramTypeMapping.containsKey(HttpServletResponse.class.getName())) {
				int indexResp = this.paramTypeMapping.get(HttpServletResponse.class.getName());
				paramValues[indexResp] = resp;
			}
			
			Object obj = handler.method.invoke(handler.controller, paramValues);
			return obj;
		}
	}
}
