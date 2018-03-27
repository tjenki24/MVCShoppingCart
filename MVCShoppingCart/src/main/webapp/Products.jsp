<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All Products</title>
</head>
<body>
	<div align="center">
		<h1>All Products</h1>
		<table border="1">
			<tr>
				<td>Name</td>
				<td>Price</td>
				<td>Description</td>
				<td>Image</td>
			</tr>
			<c:forEach var="product" items="${listProduct }" varStatus="status">
			<tr>
			<td>${product.name }</td>
			<td>${product.price }</td>
			<td>${product.description }</td>
			<td>${product.image }</td>
			</tr>
			</c:forEach>
		</table>
	</div>
	
</body>
</html>