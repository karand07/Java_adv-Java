<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:setProperty property="*" name="products"/>
<%@ include file="nav.jsp" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Product</title>
</head>
<body>

<h2>Add New Product</h2>

<form action="addPrd.jsp" method="post">

    <table>
        <tr>
            <td>Product Name:</td>
            <td>
                <input type="text" name="name" required>
            </td>
        </tr>

        <tr>
            <td>Product Price:</td>
            <td>
                <input type="number" name="price" step="0.01" required>
            </td>
        </tr>

        <tr>
            <td>Product Quantity:</td>
            <td>
                <input type="number" name="qty" required>
            </td>
        </tr>

        <tr>
            <td colspan="2">
                <input type="submit" value="Save Product">
                <input type="reset" value="Clear">
            </td>
        </tr>
    </table>

</form>

</body>
</html>