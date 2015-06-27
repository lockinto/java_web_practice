package com.into;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AServlet extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse resoonse) throws ServletException,IOException
	{
		ServletContext application = this.getServletContext();
		String str = (String)application.getInitParameter("p1");
		System.out.println(str);
	}
}
