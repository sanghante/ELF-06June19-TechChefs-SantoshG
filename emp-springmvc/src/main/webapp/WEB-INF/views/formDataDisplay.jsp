<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple display form</title>
</head>
<body>

<% int userId = (Integer) request.getAttribute("userId");
	String password = (String)request.getAttribute("password");		
%>

User Id entered was : <%=userId %>
<BR>
Password entered was: <%=password %>

</body>
</html>