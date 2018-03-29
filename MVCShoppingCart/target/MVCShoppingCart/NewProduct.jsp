<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title> Add/Edit Product </title>
</head>
<body>
	<div align="center">
		<h1>Add/Edit Product</h1>
		<form action="saveProduct" method="post">
			<table>
				<form:hidden path="id"/>
				<tr>
					<td>Name</td>
					<td><form:input path="name"/></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><form:input path="price"/></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><form:input path="description"/></td>
				</tr>
				<tr>
					<td>Image</td>
					<td><form:input path="image"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Save"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>