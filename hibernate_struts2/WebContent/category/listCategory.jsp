<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Category</title>
</head>
<body>
	<%@ include file="../include/navigator.jsp" %>

	<table align="center" border="1" cellspacing="0" width="500px">
		<tr>
			<td>id</td>
			<td>name</td>
			<td>products</td>
			<td>edit</td>
			<td>delete</td>
		</tr>
		<s:iterator value="categorys" var="category">
			<tr>
				<td>${category.id }</td>
				<td>${category.name }</td>
				<td><a href="listProduct?category.id=${category.id}">products</a></td>
				<td><a href="editCategory?category.id=${category.id }">edit</a></td>
				<td><a href="deleteCategory?category.id=${category.id }">delete</a></td>
			</tr>
		</s:iterator>
	</table>
	
	<br>
	
	<form action="addCategory" method="post">
		<table align="center" border="1" cellspacing="0">
			<tr>
				<td>name: </td>
				<td><input type="text" name="category.name" value=""></td>
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