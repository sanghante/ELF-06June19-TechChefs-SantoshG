<%@page import="org.springframework.web.servlet.support.ServletUriComponentsBuilder"%>
<%@page import="org.springframework.ui.ModelMap"%>
<%@page import="com.techchefs.emp.dto.EmployeeInfoBean1"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        
   <% 
   		String baseURL = ServletUriComponentsBuilder.fromCurrentContextPath().build().toUriString();
   %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>


<div class='container emp-profile'>
<form action="<%=baseURL%>/validator/validate/employee/search" method="get">
<span style="color:blue">Search Employee Id : </span><input type="text" name="userId"/><!-- <input hidden type="text" name="url" value="search"/> -->
<input type="submit" value="Search"/></form>
</div>

<%
	List<EmployeeInfoBean1> beans = (List<EmployeeInfoBean1>)request.getAttribute("beanList");
%>

	<div class="container emp-profile">
		<!-- <form method="get"> -->
		<!-- <h6>{msg}</h6> -->
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-7">
					<div class="wrap"></div>
				</div>
				<div class="col-md-1">
					<a href="./logout">Logout</a>
				</div>
				<br />
				<br />
				<div class="col-md-6">
<%-- 					<div class="profile-head">
						<h5>${empBean.name}</h5>
						<h6>${empBean.designation}</h6>
						<ul class="nav nav-tabs" id="myTab" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								id="home-tab" data-toggle="tab" href="#home" role="tab"
								aria-controls="home" aria-selected="true">About</a></li>
						</ul>
					</div>
 --%>				</div>
				<div class="col-md-2"></div>
				</div>
				</div>
				<ol>
				<ul class="nav nav-tabs" id="myTab" role="tablist" >		
				<%
							if (beans!=null) {
						%>					
				<%
										for(EmployeeInfoBean1 emp: beans) {
									%>
					<ul ><%=emp.getName()%><a href='./display?empId=<%=emp.getId()%>'><%=emp.getId()%></a> </ul>				
				
				<%}
				}
				%>
				</ul>
				</ol>
</body>
</html>