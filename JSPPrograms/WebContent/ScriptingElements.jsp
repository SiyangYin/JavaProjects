<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
public int add(int x,int y)
{
	return x+y;
}
%>
<%
int z=add(250,700);
%>
<%
int a=140;
int b=200;
int c;
c=a+b;
%>
The Value of Z is: <%=z%><br>
The Value of C is: <%=c%>
<%
for(int i=0;i<6;i++)
{
%><br>
The New Value of i is :<%=i%>
<%}%>
</body>
</html>