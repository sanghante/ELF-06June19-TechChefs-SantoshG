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

body{
    //background: -webkit-linear-gradient(left, #3931af, #00c6ff);
    background: -webkit-linear-gradient(left, #efeef5, #dae2e4);
}
.emp-profile{
    padding: 3%;
    margin-top: 3%;
    margin-bottom: 3%;
    border-radius: 0.5rem;
    background: #fff;
}
.profile-img{
    text-align: center;
}
.profile-img img{
    width: 70%;
    height: 100%;
}
.profile-img .file {
    position: relative;
    overflow: hidden;
    margin-top: -20%;
    width: 70%;
    border: none;
    border-radius: 0;
    font-size: 15px;
    background: #212529b8;
}
.profile-img .file input {
    position: absolute;
    opacity: 0;
    right: 0;
    top: 0;
}
.profile-head h5{
    color: #333;
}
.profile-head h6{
    color: #0062cc;
}
.profile-edit-btn{
    border: none;
    border-radius: 1.5rem;
    width: 70%;
    padding: 2%;
    font-weight: 600;
    color: #6c757d;
    cursor: pointer;
}
.proile-rating{
    font-size: 12px;
    color: #818182;
    margin-top: 5%;
}
.proile-rating span{
    color: #495057;
    font-size: 15px;
    font-weight: 600;
}
.profile-head .nav-tabs{
    margin-bottom:5%;
}
.profile-head .nav-tabs .nav-link{
    font-weight:600;
    border: none;
}
.profile-head .nav-tabs .nav-link.active{
    border: none;
    border-bottom:2px solid #0062cc;
}
.profile-work{
    padding: 14%;
    margin-top: -15%;
}
.profile-work p{
    font-size: 12px;
    color: #818182;
    font-weight: 600;
    margin-top: 10%;
}
.profile-work a{
    text-decoration: none;
    color: #495057;
    font-weight: 600;
    font-size: 14px;
}
.profile-work ul{
    list-style: none;
}
.profile-tab label{
    font-weight: 600;
}
.profile-tab p{
    font-weight: 600;
    color: #0062cc;
}

body {
    font-family: Arial;
  }
  
  * {
    box-sizing: border-box;
  }
  
  form.example input[type=text] {
    padding: 10px;
    font-size: 17px;
    border: 1px solid grey;
    float: left;
    width: 80%;
    background: #f1f1f1;
  }
  
  form.example button {
    float: left;
    width: 20%;
    padding: 10px;
    background: #2196F3;
    color: white;
    font-size: 17px;
    border: 1px solid grey;
    border-left: none;
    cursor: pointer;
  }
  
  form.example button:hover {
    background: #0b7dda;
  }
  
  form.example::after {
    content: "";
    clear: both;
    display: table;
  }

  @import url(https://fonts.googleapis.com/css?family=Open+Sans);
  
.search {
  width: 100%;
  position: relative;
  display: flex;
}

.searchTerm {
  width: 100%;
  border: 3px solid #00B4CC;
  border-right: none;
  padding: 5px;
  height: 20px;
  border-radius: 5px 0 0 5px;
  outline: none;
  color: #9DBFAF;
}

.searchTerm:focus{
  color: #00B4CC;
}

.searchButton {
  width: 40px;
  height: 36px;
  border: 1px solid #00B4CC;
  background: #00B4CC;
  text-align: center;
  color: #fff;
  border-radius: 0 5px 5px 0;
  cursor: pointer;
  font-size: 20px;
}

/*Resize the wrap to see the search bar change!*/
.wrap{
  width: 30%;
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
}
</style>
</head>
<body>
<br><br>
<hr>
<div class='container emp-profile'>
<form action="../validator/validate/employee/search" method="get">
<span style="color:blue">Search Employee Id : </span><input type="text" name="userId"/><!-- <input hidden type="text" name="url" value="search"/> -->
<input type="submit" value="Search"/></form>
</div>
<hr>

	<div class="container emp-profile">
		<!-- <form method="get"> -->
		<h6>${msg}</h6>
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
<!-- 					<button type="submit" class="profile-edit-btn" name="btnAddMore"
						value="Add Employee" onclick="location.href='./createEmployee'" >Create Account</button>
 -->				</div>
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