<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="products" class="com.module.Product"/>
<jsp:setProperty name="products" property="*"/>

<jsp:useBean id="util"
             class="com.module.ProductUtil"
             scope="session" />

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<body>
<%
    util.addProduct(products);
%>

Product Added Successfully!
<%=products %>
</body>
</html>