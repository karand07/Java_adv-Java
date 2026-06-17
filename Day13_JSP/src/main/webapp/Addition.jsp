<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Addition Jsp</title>
</head>
<body>
<% 
int []arr ={12,34,54,663,21,11};
for(int i : arr){
	out.print(i +" ");
}
%>
<%-- declearing variables --%>
<form action="" method="post">
Number1<input type="number" name="a" placeholder="Enter number 1 :">
Number2:<input type="number" name="b" placeholder="Enter number 2 :">
<input type="submit">
</form>
<%-- adddition logic in jsp --%>
<% 
if(request.getMethod().equalsIgnoreCase("post")){
	int a = Integer.parseInt(request.getParameter("a"));
	int b = Integer.parseInt(request.getParameter("b"));
	int sum = a+b;
%>
	<h3>Sum =<%=sum%></h3>
	<% } %>
</body>
</html>