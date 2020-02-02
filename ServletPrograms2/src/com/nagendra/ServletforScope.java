package com.nagendra;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns= {"/ServletforScope"},
initParams={@WebInitParam(name="defaultUser",value="Nagendra")}
)
public class ServletforScope extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
	    PrintWriter w=response.getWriter();
	    String userName=request.getParameter("name");
	    HttpSession session=request.getSession();
	    ServletContext context=request.getServletContext();
	    if(userName !="" && userName !=null)
	    {
	    	session.setAttribute("saveduserName", userName);
	    	context.setAttribute("saveduserName", userName);
	    }
	    w.println("Session Parameter has the Username as: "+(String)session.getAttribute("saveduserName"));
	    w.println("Context Parameter has the Username as: "+(String)context.getAttribute("saveduserName"));
	    w.println("Init Parameter has the Username as: "+getServletConfig().getInitParameter("defaultUser"));
	}

}
