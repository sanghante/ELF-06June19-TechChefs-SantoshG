<%@page import="com.techchefs.emp.dto.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Simple display form</title>
</head>
<body>

<% UserBean userBean = (UserBean)request.getAttribute("userBean");
%>

User Id entered was : <%=userBean.getUserId() %>
<BR><BR><BR>
Password entered was: <%=userBean.getPassword() %>

</body>
</html>