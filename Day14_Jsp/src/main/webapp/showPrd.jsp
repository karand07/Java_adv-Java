<%@ page import="com.module.Product" %>
<%@ page import="com.module.ProductUtil" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="nav.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="util"
             class="com.module.ProductUtil"
             scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All Products</title>
</head>
<body>

<h2>All Products</h2>

<table border="1">
    <tr>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>
<c:forEach var="p" items="util.getAllProducts()">
<tr>
        <td> ${p.getName()}</td>
        <td> ${p.getPrice()}</td>
        <td> ${ p.getQty() }</td>
    </tr></c:forEach>

</table>


</body>
</html>