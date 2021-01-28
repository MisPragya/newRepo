package com.cg.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SqServlet extends HttpServlet
{
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{

		//      int c= Integer.parseInt(req.getParameter("c"));
		int k =0;
		HttpSession session = req.getSession();
		//session.removeAttribute(“c”);
		Cookie cookies[] =  req.getCookies();  //client gives all cookies so put it in array
		/*
		 * for(Cookie c : cookies) { if (c.getName().equals("x"))
		 * k=Integer.parseInt(c.getValue()); }
		 */
		//       int k = (int) session.getAttribute("c");
		      int x = (int) session.getAttribute("x");
		PrintWriter out = res.getWriter();
		out.println("this is square servelet    \n square is "+x*x);
		//        out.println("Secon attribute "+x);
	}
}