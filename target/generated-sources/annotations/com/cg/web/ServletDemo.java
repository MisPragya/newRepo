package com.cg.web;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServletDemo extends HttpServlet {
	public void service(HttpServletRequest request, HttpServletResponse response) 
	{
		int a = Integer.parseInt(request.getParameter("num1"));
		int b = Integer.parseInt(request.getParameter("num2"));
		int c = a+b;
		System.out.println(c);
	}
}