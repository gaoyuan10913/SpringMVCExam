package com.hand.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class PermissionInterceptor implements HandlerInterceptor{

	//表示是否需要将当前的请求拦截下来，
	//如果返回false，请求将被终止
	//如果返回true，请求会被继续运行
	//Object paramObject表示的是被拦截的请求目标的对象
	public boolean preHandle(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse,
			Object paramObject) throws Exception {
		//将编码过滤器删掉可以使用拦截器的方式来修改编码
		paramHttpServletRequest.setCharacterEncoding("UTF-8");
		
		System.out.println("执行preHandle");
		
		//权限控制的时候可以通过拦截器来实现
		//对用户是否登录进行判断
		if(paramHttpServletRequest.getSession().getAttribute("user") == null){
			//没有登录，就终止请求，并发送到登录页面
			paramHttpServletRequest.getRequestDispatcher("/login.jsp").forward(paramHttpServletRequest, paramHttpServletResponse);
			return false;
		}
			
		return true;
	}

	//通过ModelAndView来改变显示的视图,或修改发往视图的方法
	public void postHandle(HttpServletRequest paramHttpServletRequest, HttpServletResponse paramHttpServletResponse,
			Object paramObject, ModelAndView paramModelAndView) throws Exception {
		System.out.println("执行postHandle");

	}

	//主要是请求结束后用于资源的销毁，与destroy方法类似
	public void afterCompletion(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse, Object paramObject, Exception paramException)
			throws Exception {
		System.out.println("执行afterCompletion");
	}

}
