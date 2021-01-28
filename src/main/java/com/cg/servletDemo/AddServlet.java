package com.cg.servletDemo;



import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		int a= Integer.parseInt(req.getParameter("num1"));
		int b= Integer.parseInt(req.getParameter("num2"));
			        HttpSession session =req.getSession();
		int x=a+b;
		int c;
	        session.setAttribute("x", x);
      // session.setAttribute("x", 12);
//Cookie cookie = new Cookie("x" ,x+""); //string has to be passed so we are concatenating
//res.addCookie(cookie);

System.out.println(x);

PrintWriter out = res.getWriter();
out.println("the result is " +x);

//	        RequestDispatcher rd = req.getRequestDispatcher("Square");
//	        rd.forward(req, res);
	        res.sendRedirect("Square?x="+x);
//res.sendRedirect("Square");
}
}

