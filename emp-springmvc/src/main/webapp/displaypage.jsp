<%@page import="com.techchefs.emp.dto.EmployeeOtherInfoBean"%>
<%@page import="com.techchefs.emp.dto.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Home Page</title>
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
		<!-- <form method="get"> -->
		<h6>{msg}</h6>
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
				<div class="col-md-4">
					<!-- <a href='./display'> -->
					<img src="/resources/image_avatar.png" alt="Avatar" style="width: 100px;">
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
					<button type="submit" class="profile-edit-btn" name="btnAddMore"
						value="Add Employee" onclick="location.href='./createEmployee'" >Create Account</button>
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
							
														
							<!-- Other Info -->
							<div class="row">
								<div class="col-md-6">
									<label>Father Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.fatherName}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Mother Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.motherName}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Emergency Contact Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.emergencyContactName}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Emergency Contact Number</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.emergencyContactNumber}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Aadhar Number</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.aadhar}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Passport Number</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.passport}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>PAN Number</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.pan}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Marital Status</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.ismarried}
									</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Blood Group</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.bloodGrp}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Religion</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.religion}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Nationality</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.nationality}</p>
								</div>
							</div>
							<div class="row">
								<div class="col-md-6">
									<label>Spouse Name</label>
								</div>
								<div class="col-md-6">
									<p>${empBean.otherInfo.spouseName}</p>
								</div>
							</div>
							

					</div>
				</div>
			</div>
		<!-- </form> -->
	</div>
</body>
</html>