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
<link rel="stylesheet" href="../profile.css">
<style>
img {
	border-radius: 50%;
	width: 100px;
	height: 100px;
}
</style>
</head>
<body>

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
					<!-- <a href='./display'> -->
					<img src="../image_avatar.png" alt="Avatar" style="width: 100px;">
					<!-- </a> --> 
				</div>
				<div class="col-md-6">
					<div class="profile-head">
						<h5>${empBean.name}</h5>
						<h6>${empBean.designation}</h6>
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
									<p>${empBean.id}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.name}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Age</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.age}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Email</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.email}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Phone</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.phoneNumber}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Joining Date</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.joiningDate}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Designation</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.designation}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Account Number</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.accountNumber}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Gender</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.gender}</p>
								</div>
							</div>
						</div>
							<div class="row">
								<div class="col-md-6">
									<label>Salary</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.salary}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>DOB</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.dob}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Department ID</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.departmentId}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Manager Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.managerId}</p>
								</div>
							</div>

					</div>
				</div>
			</div>
		</form>
	</div>
</body>
</html>