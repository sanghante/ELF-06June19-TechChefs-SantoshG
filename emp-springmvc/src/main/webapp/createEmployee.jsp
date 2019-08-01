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
	
	<script src="../form.js"></script>

</head>
<body style="background: lightblue">
	<p class="h3" style="margin-left: 20%">Employee Information</p>
	<hr>
	<form action="./saveEmployee" method="post">
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Id</label> 
				<input name="eid" type="text" class="form-control" placeholder="Id">
			</div>
			<div class="col-3">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="password1">Enter Password</label>
				<input name="password" type="password" class="form-control">
			</div>
			<div class="col-3">
				<label for="empInfo">Confirm Password</label>
				<input type="text" name="password2" class="form-control">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Full Name</label>
				<input name="name" type="text" class="form-control" placeholder="Full Name">
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
				<input type="text" name="age" class="form-control" placeholder="Age">
			</div>
			<div class="col-3">
				<label for="empInfo">Designation</label>
				<input name="designation" type="text" class="form-control" placeholder="Designation">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="inputGender">Gender</label>
				<select id="inputGender" name="gender" class="form-control">
					<option selected>--select one--</option>
					<option value="Male">Male</option>
					<option value="Female">Female</option>
					<option value="Other">Other</option>
				</select>
			</div>
			<div class="col-3">
				<label for="empInfo">Date of Birth</label>
				<input name="dob" type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Annual Salary</label>
				<input name="salary" type="text" class="form-control" placeholder="Salary">
			</div>
			<div class="col-3">
				<label for="empInfo">Department Id</label>
				<input name="departmentId" type="text" class="form-control" placeholder="Department Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Contact Number</label>
				<input name="phoneNumber" type="text" class="form-control" placeholder="Phone Number">
			</div>
			<div class="col-3">
				<label for="empInfo">Manager Id</label>
				<input name="managerId" type="text" class="form-control" placeholder="Manager Id">
			</div>
		</div>
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Bank Account Number</label>
				<input name="accountNumber" type="text" class="form-control" placeholder="Account Number">
			</div>
			<div class="col-3">
				<label for="empInfo">Joining Date</label>
				<input name="joiningDate" type="date" class="form-control" placeholder="yyyy-MM-dd">
			</div>		
		</div>

        <hr>
        <p class="h3" style="margin-left: 20%">Other Info</p>
        <hr>

        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="exampleInputemergenum">Emergency Contact Number</label>
            <input type="text" class="form-control" placeholder="Please Enter Emergency Contact Number" name="otherInfo.emergencyContactNumber">
          </div>
          <div class="col-3">
                <label for="exampleInputemergeName">Emergency Contact Name</label>
            <input type="text" class="form-control" placeholder="Please Enter Emergency Contact Name" name="otherInfo.emergencyContactName">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="exampleInputmotname">Father Name</label>
            <input type="text" class="form-control" placeholder="Please Enter Father Name" name="otherInfo.fatherName">
          </div>
          <div class="col-3">
                <label for="exampleInputmotname">Mother Name</label>
            <input type="text" class="form-control" placeholder="Please Enter Mother Name" name="otherInfo.motherName">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="exampleInputPan">Pan Number</label>
            <input type="text" class="form-control" placeholder="Please Enter Pan Number" name="otherInfo.pan">
          </div>
          <div class="col-3">
                   <label for="exampleInputpassport">Passport Number</label>
               <input type="text" class="form-control" placeholder="Please Enter Passport Number" name="otherInfo.passport">
          </div>
          </div>
          <div class="row">
          <div class="col-1"></div>
                <div class="col-3">
                </div>
         <!--  <div class="col-1"></div>
                <div class="col-3">
                        <label for="inputStatus">Marital Status</label>
                        <select id="inputStatus" class="form-control" name="otherInfo.ismarried">
                          <option selected>true</option>
                    <option value="true">true</option>
                    <option value="false">false</option>
                    <option value="false">false</option>
                </select>
                </div> -->

          <div class="col-3">
                <label for="exampleInputspouse">Spouse Name</label>
            <input type="text" class="form-control" placeholder="Please Enter Spouse Name" name="otherInfo.spouseName">
          </div>
        </div>
        <div class="row"><div class="col-1"></div>
        <div class="col-3">
               <label for="inputnationality">Nationality</label>
                 <select id="inputnationality" class="form-control" name="otherInfo.nationality">
                  <option selected>---Select One---</option>
                    <option value="indian">Indian</option>
                    <option value="other">Other</option>
                </select>
                </div>
        <div class="col-3">
                <label for="inputreligion">Religion</label>
                <select id="inputreligion" class="form-control" name="otherInfo.religion">
                  <option selected>---Select One---</option>
            <option value="hindu">Hindu</option>
            <option value="christian">Christian</option>
            <option value="muslim">Muslim</option>
        </select>
        </div>
         </div>       
        <div class="row"><div class="col-1"></div>
        <div class="col-3">
                <label for="inputbloodgrp">Blood Group</label>
                <select id="inputbloodgrp" class="form-control" name="otherInfo.bloodGrp">
                  <option selected>---Select One---</option>
            <option value="AB+">AB+</option>
            <option value="AB-">AB-</option>
            <option value="A+">A+</option>
            <option value="A-">A-</option>
            <option value="o+">o+</option>
            <option value="o-">o-</option>
        </select>
        </div>
        <div class="col-3">
                <label for="exampleInputaadhar">Aadhar Number</label>
            <input type="text" class="form-control" placeholder="Please Enter Aadhar Number" name="otherInfo.aadhar">
          </div>
        </div>
		
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<br>
				<button type="submit" name="sbmt" class="form-control">Submit</button>

			</div>
			<div class="col-3">
				<br>
				<button type="reset" class="form-control">Reset</button>
			</div>
		</div>

	</form>
</body>
</html>