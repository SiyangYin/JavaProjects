<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>parseDate Tag</title>
</head>
<body>
<h1 style="color:red;">Date Parsing</h1>
<c:set var="now" value="17-01-2020"/>
<fmt:parseDate value="${now}" var="xyz" pattern="dd-MM-yyyy"/>
<p> Parsed Date is : <c:out value="${xyz}"/></p>
</body>
</html>