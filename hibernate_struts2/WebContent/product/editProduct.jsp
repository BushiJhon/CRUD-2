<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
    
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Product</title>
</head>
<body>
	<%@ include file="../include/navigator.jsp" %>

	<form action="updateProduct" method="post">
		<table align="center" border="1" cellspacing="0" width="500px">
			<tr>
				<td>name: </td>
				<td><input type="text" name="product.name" value="${product.name}"></td>
			</tr>
			<tr>
				<td>price: </td>
				<td><input type="text" name="product.price" value="${product.price }"></td>
			</tr>
			
			<s:select label="categorys"
			name="product.category.id"
			list="categorys"
			listKey="id"
			listValue="name"
			multiple="false"></s:select>
			
			<tr>
				<td><input type="hidden" name="product.id" value="${product.id }"></td>
				<td><input type="submit" value="更新"></td>
			</tr>
		</table>
	</form>
</body>
</html>