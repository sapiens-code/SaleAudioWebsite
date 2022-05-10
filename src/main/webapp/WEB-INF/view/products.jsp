<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Danh Sách Sản Phẩm</title>
</head>
<body>
 <%@ include file="navbar.jsp"%> 
 <%@ include file="slider.jsp"%> 
	<c:forEach var="tempProduct" items="${products}">
		<c:url var="updateLink" value="/customer/showFormForUpdate">
			<c:param name="customerid" value="${tempProduct.id}"/>
		</c:url>
		<c:url var="deleteLink" value="/customer/delete">
			<c:param name="customerid" value="${tempProduct.id}"/>
		</c:url>
		<tr>
			<td>${tempProduct.name}</td>
			<td>${tempProduct.price}</td>
			<td>${tempProduct.description}</td>
			<td>
				<a href="${updateLink}">Update</a>
				<a href="${updateLink}" onclick="if(!(confirm('are you sure you want to delete this product?))) return false">Delete</a>
			</td>
		</tr>
	</c:forEach>
	 <%@ include file="footer.jsp"%> 
</body>
</html>
