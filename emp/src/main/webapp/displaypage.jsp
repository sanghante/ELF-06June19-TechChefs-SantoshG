<%@page import="com.techchefs.emp.dto.EmployeeOtherInfoBean"%>
<%@page import="com.techchefs.emp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="./profile.css">
<style>
img {
	border-radius: 50%;
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>

 <%  
	EmployeeInfoBean bean = (EmployeeInfoBean) request.getAttribute("userData");
 	EmployeeOtherInfoBean otherInfobean = bean.getOtherInfo();
%>

<div class='container emp-profile'>
<form action="./empSearch" method="get">
<span style="color:blue">Search Employee Id : </span><input type="text" name="eid"/>
<input type="submit" value="Search"/></form>
</div>

	<div class="container emp-profile">
		<form method="post">
			<div class="row">
				<div class="col-md-4"></div>
				<div class="col-md-7">
					<div class="wrap"></div>
				</div>
				<div class="col-md-1">
					<a href="./login.html">Logout</a>
				</div>
				<br />
				<br />
				<div class="col-md-4">
					<a href='./display'><img src="image_avatar.png" alt="Avatar" style="width: 100px;"></a> 
				</div>
				<div class="col-md-6">
					<div class="profile-head">
						<h5><%=bean.getName() %></h5>
						<h6><%=bean.getDesignation() %></h6>
						<ul class="nav nav-tabs" id="myTab" role="tablist">
							<li class="nav-item"><a class="nav-link active"
								id="home-tab" data-toggle="tab" href="#home" role="tab"
								aria-controls="home" aria-selected="true">About</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-2">
					<input type="submit" class="profile-edit-btn" name="btnAddMore"
						value="Edit" />&nbsp;&nbsp;
				</div>
			</div>
			<div class="row">
				<div class="col-md-4">
					<div class="profile-work">
<!-- 						<p>LINKS HERE</p>
						<a href="">link1</a>
 -->					</div>
				</div>
				<div class="col-md-8">
					<div class="tab-content profile-tab" id="myTabContent">
						<div class="tab-pane fade show active" id="home" role="tabpanel"
							aria-labelledby="home-tab">
							<div class="row">
								<div class="col-md-6">
									<label>User Id</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getId() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Name</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getName() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Age</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getAge() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Email</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getEmail()%></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Phone</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getPhoneNumber() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Joining Date</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getJoiningDate() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Designation</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getDesignation() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Account Number</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getAccountNumber() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Gender</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getGender() %></p>
								</div>
							</div>
						</div>
							<div class="row">
								<div class="col-md-6">
									<label>Salary</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getSalary() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>DOB</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getDob() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Department ID</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getDepartmentId() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Manager Name</label>
								</div>
								<div class="col-md-6">
									<p><%=bean.getManagerId() %></p>
								</div>
							</div>
							
							<!-- Other Info -->
							<% if(otherInfobean != null) { %>
							
							<div class="row">
								<div class="col-md-6">
									<label>Father Name</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getFatherName() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Mother Name</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getMotherName() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Emergency Contact Name</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getEmergencyContactName() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Emergency Contact Number</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getEmergencyContactNumber() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Aadhar Number</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getAadhar() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Passport Number</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getPassport() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>PAN Number</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getPan() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Marital Status</label>
								</div>
								<div class="col-md-6">
									<p><% if (otherInfobean.isIsmarried()) { %>
									Married
									<% } else { %>
									-NA-
									<%} %>
									</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Blood Group</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getBloodGrp() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Religion</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getReligion() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Nationality</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getNationality() %></p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Spouse Name</label>
								</div>
								<div class="col-md-6">
									<p><%=otherInfobean.getSpouseName() %></p>
								</div>
							</div>
							<% } %>
					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>