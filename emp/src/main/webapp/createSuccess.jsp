<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Employee Information Capture Form</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
	
	<script src="./form.js"></script>

</head>
<body style="background: lightblue">
	<p class="h3" style="margin-left: 20%">Basic Employee Information</p>
	<hr>
	<form action="./create" method="post">
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Id</label> 
				<input name="eid" type="text" class="form-control" placeholder="Id">
			</div>
			<div class="col-3">
				<label for="empInfo">Joining Date</label>
				<input name="jdate" type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="password1">Enter Password</label>
				<input name="password1" type="password" onkeyup='validateForm()' class="form-control" placeholder="Full Name">
			</div>
			<div class="col-3">
				<label for="empInfo">Confirm Password</label>
				<input type="password" name="password2" onkeyup='validateForm()' class="form-control" placeholder="Email Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Full Name</label>
				<input name="ename" type="text" class="form-control" placeholder="Full Name">
			</div>
			<div class="col-3">
				<label for="empInfo">Email Id</label>
				<input type="text" name="email" class="form-control" placeholder="Email Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Age</label>
				<input type="text" name="eage" class="form-control" placeholder="Age">
			</div>
			<div class="col-3">
				<label for="empInfo">Designation</label>
				<input name="edesignation" type="text" class="form-control" placeholder="Designation">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="inputGender">Gender</label>
				<select id="inputGender" name="egender" class="form-control">
					<option selected>--select one--</option>
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<option value="Other">Other</option>
				</select>
			</div>
			<div class="col-3">
				<label for="empInfo">Date of Birth</label>
				<input name="edob" type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Annual Salary</label>
				<input name="esalary" type="text" class="form-control" placeholder="Salary">
			</div>
			<div class="col-3">
				<label for="empInfo">Department Id</label>
				<input name="edeptid" type="text" class="form-control" placeholder="Department Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Contact Number</label>
				<input name="ephone" type="text" class="form-control" placeholder="Phone Number">
			</div>
			<div class="col-3">
				<label for="empInfo">Manager Id</label>
				<input name="emanagerid" type="text" class="form-control" placeholder="Manager Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Bank Account Number</label>
				<input name="eaccount" type="text" class="form-control" placeholder="Account Number">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<br>
				<button type="submit" name="OK" class="form-control">Submit</button>

			</div>
		</div>

	</form>
</body>
</html>