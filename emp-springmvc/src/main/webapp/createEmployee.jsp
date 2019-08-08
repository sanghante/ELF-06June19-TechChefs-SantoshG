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
<br>
<hr>
	<p class="h3" style="margin-left: 20%">Employee Information</p>
	
	
	<hr>
	<form action="./saveEmployee" method="post">
		<div class="row">
		<div class="col-1"></div>
			<div class="col-3">
				<label for="empInfo">Employee Id</label> 
				<input name="id" type="text" class="form-control" placeholder="Id">
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
				<input name="managerId.id" type="text" class="form-control" placeholder="Manager Id">
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
            <input type="text" class="form-control" placeholder="Emergency Contact Number" name="otherInfoBean.emergencyContactNumber">
          </div>
          <div class="col-3">
                <label for="exampleInputemergeName">Emergency Contact Name</label>
            <input type="text" class="form-control" placeholder="Emergency Contact Name" name="otherInfoBean.emergencyContactName">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="exampleInputmotname">Father Name</label>
            <input type="text" class="form-control" placeholder="Father Name" name="otherInfoBean.fatherName">
          </div>
          <div class="col-3">
                <label for="exampleInputmotname">Mother Name</label>
            <input type="text" class="form-control" placeholder="Mother Name" name="otherInfoBean.motherName">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="exampleInputPan">Pan Number</label>
            <input type="text" class="form-control" placeholder="Pan Number" name="otherInfoBean.pan">
          </div>
          <div class="col-3">
                   <label for="exampleInputpassport">Passport Number</label>
               <input type="text" class="form-control" placeholder="Passport Number" name="otherInfoBean.passport">
          </div>
          </div>
          <!-- <div class="row">
          <div class="col-1"></div>
                <div class="col-3">
                </div>
          <div class="col-1"></div>
                <div class="col-3">
                        <label for="inputStatus">Marital Status</label>
                        <select id="inputStatus" class="form-control" name="otherInfo.ismarried">
                          <option selected>true</option>
                    <option value="true">true</option>
                    <option value="false">false</option>
                    <option value="false">false</option>
                </select>
                </div>

          <div class="col-3">
                <label for="exampleInputspouse">Spouse Name</label>
            <input type="text" class="form-control" placeholder="Please Enter Spouse Name" name="otherInfo.spouseName">
          </div>
        </div>  -->
        <div class="row">
        <div class="col-1"></div>
        <div class="col-3">
               <label for="inputnationality">Nationality</label>
                 <select id="inputnationality" class="form-control" name="otherInfoBean.nationality">
                  <option selected>---Select One---</option>
                    <option value="indian">Indian</option>
                    <option value="other">Other</option>
                </select>
                </div>
        <div class="col-3">
                <label for="inputreligion">Religion</label>
                <select id="inputreligion" class="form-control" name="otherInfoBean.religion">
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
                <select id="inputbloodgrp" class="form-control" name="otherInfoBean.bloodGrp">
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
                <label for="exampleInputaadhar">Aadhaar Number</label>
            <input type="text" class="form-control" placeholder="Aadhaar" name="otherInfoBean.aadhar">
          </div>
        </div>


        <hr>
        <p class="h3" style="margin-left: 20%">Address 1</p>
        <hr>

        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="addtype">Address Type</label>
            <input type="text" class="form-control" placeholder="type" name="addressInfoBeans[0].addressPKBean.addressType">
          </div>
          <div class="col-3">
                <label for="addline1">Address Line 1</label>
            <input type="text" class="form-control" placeholder="address line 1" name="addressInfoBeans[0].address1">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="addcity">City</label>
            <input type="text" class="form-control" placeholder="city" name="addressInfoBeans[0].city">
          </div>
          <div class="col-3">
                <label for="addstate">State</label>
            <input type="text" class="form-control" placeholder="state" name="addressInfoBeans[0].state">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="addcountry">Country</label>
            <input type="text" class="form-control" placeholder="country" name="addressInfoBeans[0].country">
          </div>
          <div class="col-3">
                   <label for="addpin">Pincode</label>
               <input type="text" class="form-control" placeholder="pincode" name="addressInfoBeans[0].pincode">
          </div>
          </div>

		
		<br><hr>
		
        <hr>
        <p class="h3" style="margin-left: 20%">Address 1</p>
        <hr>

        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="addtype">Address Type</label>
            <input type="text" class="form-control" placeholder="type" name="addressInfoBeans[1].addressPKBean.addressType">
          </div>
          <div class="col-3">
                <label for="addline1">Address Line 1</label>
            <input type="text" class="form-control" placeholder="address line 1" name="addressInfoBeans[1].address1">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="addcity">City</label>
            <input type="text" class="form-control" placeholder="city" name="addressInfoBeans[1].city">
          </div>
          <div class="col-3">
                <label for="addstate">State</label>
            <input type="text" class="form-control" placeholder="state" name="addressInfoBeans[1].state">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="addcountry">Country</label>
            <input type="text" class="form-control" placeholder="country" name="addressInfoBeans[1].country">
          </div>
          <div class="col-3">
                   <label for="addpin">Pincode</label>
               <input type="text" class="form-control" placeholder="pincode" name="addressInfoBeans[1].pincode">
          </div>
          </div>

		
		<br><hr>
		
		<hr>
        <p class="h3" style="margin-left: 20%">Education Info 1</p>
        <hr>
 
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="edutype">Education Type</label>
            <input type="text" class="form-control" placeholder="type" name="educationInfoBeans[0].educationPKBean.educationType">
          </div>
          <div class="col-3">
                <label for="educollege">College Name</label>
            <input type="text" class="form-control" placeholder="college" name="educationInfoBeans[0].collegeName">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="edubranch">Branch</label>
            <input type="text" class="form-control" placeholder="branch" name="educationInfoBeans[0].branch">
          </div>
          <div class="col-3">
                <label for="edudegree">Degree</label>
            <input type="text" class="form-control" placeholder="degree" name="educationInfoBeans[0].degreeType">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="eduyop">Year of Passing</label>
            <input type="text" class="form-control" placeholder="YoP" name="educationInfoBeans[0].yearOfPassing">
          </div>
          <div class="col-3">
                   <label for="edupercentage">Percentage</label>
               <input type="text" class="form-control" placeholder="percentage" name="educationInfoBeans[0].percentage">
          </div>
          </div>

		
		<br>
		<hr>

		
		<hr>
        <p class="h3" style="margin-left: 20%">Education Info 2</p>
        <hr>

       <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="edutype">Education Type</label>
            <input type="text" class="form-control" placeholder="type" name="educationInfoBeans[1].educationPKBean.educationType">
          </div>
          <div class="col-3">
                <label for="educollege">College Name</label>
            <input type="text" class="form-control" placeholder="college" name="educationInfoBeans[1].collegeName">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="edubranch">Branch</label>
            <input type="text" class="form-control" placeholder="branch" name="educationInfoBeans[1].branch">
          </div>
          <div class="col-3">
                <label for="edudegree">Degree</label>
            <input type="text" class="form-control" placeholder="degree" name="educationInfoBeans[1].degreeType">
          </div>          
        </div>
        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="eduyop">Year of Passing</label>
            <input type="text" class="form-control" placeholder="YoP" name="educationInfoBeans[1].yearOfPassing">
          </div>
          <div class="col-3">
                   <label for="edupercentage">Percentage</label>
               <input type="text" class="form-control" placeholder="percentage" name="educationInfoBeans[1].percentage">
          </div>
          </div>

		
		<br>
		<hr>

		
		<hr>
        <p class="h3" style="margin-left: 20%">Experience Info 1</p>
        <hr>

        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="expcompany">Company Name</label>
            <input type="text" class="form-control" placeholder="company" name="experienceInfoBeans[0].experiencePKBean.companyName">
          </div>
          <div class="col-3">
                <label for="expdesign">Designation</label>
            <input type="text" class="form-control" placeholder="desig" name="experienceInfoBeans[0].designation">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="expjdate">Joining Date</label>
            <input type="date" class="form-control" placeholder="joining date" name="experienceInfoBeans[0].joiningDate">
          </div>
          <div class="col-3">
                <label for="expldate">Leaving Date</label>
            <input type="date" class="form-control" placeholder="leaving date" name="experienceInfoBeans[0].leavingDate">
          </div>          
        </div>
		
		<br>
		<hr>


		
		<hr>
        <p class="h3" style="margin-left: 20%">Experience Info 2</p>
        <hr>

        <div class="row">
        <div class="col-1"></div>
          <div class="col-3">
                <label for="expcompany">Company Name</label>
            <input type="text" class="form-control" placeholder="company" name="experienceInfoBeans[1].experiencePKBean.companyName">
          </div>
          <div class="col-3">
                <label for="expdesign">Designation</label>
            <input type="text" class="form-control" placeholder="desig" name="experienceInfoBeans[1].designation">
          </div>
          </div>
        <div class="row">
          <div class="col-1"></div>
          <div class="col-3">
                <label for="expjdate">Joining Date</label>
            <input type="date" class="form-control" placeholder="joining date" name="experienceInfoBeans[1].joiningDate">
          </div>
          <div class="col-3">
                <label for="expldate">Leaving Date</label>
            <input type="date" class="form-control" placeholder="leaving date" name="experienceInfoBeans[1].leavingDate">
          </div>          
        </div>
		
		<br>
		<hr>
				
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
     <hr> 
        <br>
	</form>
</body>
</html>