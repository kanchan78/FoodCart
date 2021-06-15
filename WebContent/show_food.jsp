<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu of FoodCart</title>
</head>
<body>
<h1 align="center">Menu</h1>
<p>
<table border="1" cellpadding="30%" align="center" bordercolor="red">
<thead>
<tr>
<th>Id</th>
<th>FoodItem</th>
<th>Price</th>
</tr>
</thead>
<tbody>
<c:forEach items="${foodItems}" var="items">
<tr>
<td>${items.id }</td>
<td><c:out value="${items.item }"></c:out></td>
<td>${items.price }</td>
</tr>
</c:forEach>
</tbody>
</table>
</p>
</body>
</html>