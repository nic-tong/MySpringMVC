package com.weidai.framework.controller;

import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.weidai.framework.annotation.MyAutowired;
import com.weidai.framework.annotation.MyController;
import com.weidai.framework.annotation.MyReponseBody;
import com.weidai.framework.annotation.MyRequestMapping;
import com.weidai.framework.annotation.MyRequestParam;
import com.weidai.framework.service.IService;



/**
 * @描述
 * @author nic 
 * @time：2018年6月20日 下午12:25:13
 */
@MyController
@MyRequestMapping("/web")
public class BaseController {

	@MyAutowired
	private IService service;
	
	
	@MyRequestMapping("/app.json")
	@MyReponseBody
	public String getApp(HttpServletRequest req, HttpServletResponse resp, @MyRequestParam("name") String name) {
		try {
			resp.getWriter().write("my name is : " + name);
			return name;
		} catch (Exception e){}
		return name;
	}
	
	@MyRequestMapping("/")
	@MyReponseBody
	public String getHome(HttpServletRequest req, HttpServletResponse resp) {
		try {
			resp.getWriter().write("Home page");
		} catch (Exception e){}
		return null;
	}
}
