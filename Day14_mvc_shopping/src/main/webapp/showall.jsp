<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="prdDao" class="com.shopping.dal.ProductDAO"></jsp:useBean>
<jsp:setProperty name="prdDao" property="*"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="display: flex;
  justify-content: center; 
  height: 100vh;    ">
<div >
<h2>
Show All Products
</h2>
<table>
<thead>
<tr>
<th>id</th>
<th>name</th>
<th>price</th>
<th>Qty</th>
</tr>
</thead>
<tbody>
<c:forEach var="prd" items="${prdDao.getAllPrds()}">
<tr>
<td>${prd.id}</td>
<td>${prd.name}</td>
<td>${prd.price}</td>
<td>${prd.qty}</td>
</tr>
</c:forEach>
</tbody>
</table>
</div>
</div>
</body>
</html>