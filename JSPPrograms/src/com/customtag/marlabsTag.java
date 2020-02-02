package com.customtag;
import javax.servlet.jsp.tagext.*;
import javax.servlet.jsp.*;
import java.io.*;
public class marlabsTag extends SimpleTagSupport
{
 public void doTag() throws JspException,IOException
 {
	 JspWriter out=getJspContext().getOut();
	 out.println("Welcome to Marlabs");
 }
}
