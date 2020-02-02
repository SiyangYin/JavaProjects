<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table#xyz{
     width: 50%;
     background-color: #c48ec5;

}
</style>
</head>
<body>
<%
String a=request.getParameter("fullname");
String b=request.getParameter("address");
String c=request.getParameter("age");
String d=request.getParameter("qual");
String e=request.getParameter("percent");
String f=request.getParameter("yop");
%>
<table id="xyz">
<tr>
<td>Full Name</td>
<td><%=a%></td>
</tr>
<tr>
<td>Address</td>
<td><%=b%></td>
</tr>
<tr>
<td>Age</td>
<td><%=c%></td>
</tr>
<tr>
<td>Qualification</td>
<td><%=d%></td>
</tr>
<tr>
<td>Percentage</td>
<td><%=e%></td>
</tr>
<tr>
<td>Year of Passing</td>
<td><%=f%></td>
</tr>
</table>
</body>
</html>