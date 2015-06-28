package com.into;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;

public class DServlet extends HttpServlet {

	    
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		
		ClassLoader cl = this.getClass().getClassLoader();
		InputStream input = cl.getResourceAsStream("/../../index.jsp");

		String str = IOUtils.toString(input);
		PrintWriter pw = response.getWriter();
		System.out.println(str);
		pw.print("<h1>" + str + "<h1>");
	}
	@Override
	

}
