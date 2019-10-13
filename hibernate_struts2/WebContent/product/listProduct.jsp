<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Products</title>
</head>
<body>
	<%@ include file="../include/navigator.jsp" %>

	<table align="center" border="1" cellspacing="0" width="500px">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>price</td>
			<td>category</td>
			<td>edit</td>
			<td>delete</td>
		</tr>
		
		<s:iterator value="products" var="product">
			<tr>
				<td>${product.id }</td>
				<td>${product.name }</td>
				<td>${product.price }</td>
				<td>${product.category.name }</td>
				<td><a href="editProduct?product.id=${product.id}">edit</a></td>
				<td><a href="deleteProduct?product.id=${product.id }">delete</a></td>
			</tr>
		</s:iterator>
	</table>
	
	<br>
	
	<form action="addProduct" method="post">
		<table align="center" border="1" cellspacing="0">
	 		<s:select label="categorys" 
	 		name="product.category.id" 
	 		list="categorys"
	 		listKey="id"
	 		listValue="name"
	 		multiple="false"></s:select>
	 		
	 		<tr>
	 			<td>name: </td>
	 			<td><input type="text" name="product.name" value=""></td>
	 		</tr>
	 		
	 		<tr>
	 			<td>price: </td>
	 			<td><input type="text" name="product.price" value="0"></td>
	 		</tr>
	 		
	 		<tr>
	 			<td colspan="2" align="center">
	 			<input type="submit" value="提交">
	 			</td>
	 		</tr>
		</table>
	</form>
</body>
</html>