<%@ page import="java.util.ArrayList" %>
<%@ page import="com.shopping.dal.ProductDAO" %>
<%@ page import="com.shopping.model.Product" %>

<%
String name = request.getParameter("name");

ProductDAO dao = new ProductDAO();
ArrayList<Product> products = dao.searchBy(name);
%>

<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Price</th>
        <th>Quantity</th>
    </tr>

<%
for (Product p : products) {
%>
    <tr>
        <td><%= p.getId() %></td>
        <td><%= p.getName() %></td>
        <td><%= p.getPrice() %></td>
        <td><%= p.getQty() %></td>
    </tr>
<%
}
%>
</table>
<div><a href="index.jsp">go to homepage</a></div>