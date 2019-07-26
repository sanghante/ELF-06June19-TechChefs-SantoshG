<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My Sample Form</title>
</head>
<body>

<!-- <form action="./formSubmit" method="post"> -->
<!-- <form action="./springFormSubmit" method="post"> -->
<!-- <form action="./springFormSubmitUsingBean" method="post"> -->
<!-- <form action="./springFormSubmitUsingReqParam" method="post"> -->
<!-- <form action="./springFormSubmitUsingReqParamEL" method="post"> -->
<form action="./springFormSubmitUsingBeanEL" method="post">

User Id : <input type="text" name="userId">
Password: <input type="text" name="password">

<br><br>
<input type="submit">
</form>

</body>
</html>