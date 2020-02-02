package com.nagendra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Genericservletex")
public class Genericservletex extends GenericServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		res.setContentType("text/html");
		PrintWriter w=res.getWriter();
		w.print("<html><body>");
		w.print("<h1>Welcome to Marlabs</h1>");
		w.print("</body></html>");
	}

}
