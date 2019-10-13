<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Category</title>
</head>
<body>
	<%@ include file="../include/navigator.jsp" %>

	<form action="updateCategory" method="post">
		<table align="center" border="1" cellspacing="0">
			<tr>
				<td>name: </td>
				<td><input type="text" name="category.name" value="${category.name }"></td>
			</tr>
			
			<tr>
				<td><input type="hidden" name="category.id" value="${category.id }"></td>
				<td><input type="submit" value="提交"></td>
			</tr>
		</table>
	</form>
</body>
</html>