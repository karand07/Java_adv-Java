<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="prdDao" class="com.shopping.dal.ProductDAO"></jsp:useBean>
<jsp:useBean id="p" class="com.shopping.model.Product"/>
<jsp:setProperty name="p" property="*"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% prdDao.addProduct(p);
out.println("Product added successfully.");
%>

<div>
<a href="index.jsp">GO to home</a>
</div>
</body>
</html>