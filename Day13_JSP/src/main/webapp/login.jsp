<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<form method="post">
<div> 
username <input type="text" name='username' placeholder="Enter your username...." required>
</div>
<div> 
Password <input type="text" name='pwd' placeholder="Enter your password...." required>
</div>
<input type="submit" value="validate">
</form>
<% 
if(request.getMethod().equalsIgnoreCase("post")){
	String username = request.getParameter("username");
	String pass = request.getParameter("pwd");
	if(username.equals("karan") && pass.equals("karan")){
		out.print("valid user");
%>
<h1>Welcome <%=username %></h1>
<jsp:forward page="Addition.jsp"></jsp:forward> 
<%	}
} %>
</body>
</html>