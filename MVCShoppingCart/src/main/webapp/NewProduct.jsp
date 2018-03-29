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
		<form action="saveProduct" method="POST">
			<input type="hidden" id="id" name="id" value=${id }/>
			<table>
				<tr>
					<td>Name</td>
					<td><input type="text" id="name" name="name"/></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><input type="text" id="price" name="price"/></td>
				</tr>
				<tr>
					<td>Description</td>
					<td><input type="text" id="description" name="description"/></td>
				</tr>
				<tr>
					<td>Image</td>
					<td><input type="text" id="image" name="image"/></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit" value="Save"/></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>