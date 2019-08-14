<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Document</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script>
	function validateForm() {
		var form_input = document.forms[0].getElementsByTagName("input");
		var form_error = document.forms[0].getElementsByTagName("span");
		for (let i = 0; i < form_input.length; i++) {
			if (form_input[i].value === "") {
				form_error[i].display = "block";
				if (i === 0) {
					form_error[i].innerHTML = "Department ID cannot be empty";
				} else if (i === 1) {
					form_error[i].innerHTML = "Department Name cannot be empty";
				}
				return false;
			} else if (form_input[i].value !== "") {
				form_error[i].style.display = "none";
			}
		}
		return true;
	}
</script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 offset-3 card">
				<div class="card-body">
					<h4 class="text-center border-bottom">Employee Login</h4>
					<br>
				
					<div class='alert alert-warning alert-dismissible fade show'
						role='alert'>
						${msg}
						<button type='button' class='close' data-dismiss='alert'
							aria-label='Close'>
							<span aria-hidden='true'>&times;</span>
						</button>
					</div>
					
					<form class="form-horizontal" action="./authenticate" method="POST">
						<div class="col-auto">
							<label class="sr-only" for="id">Id</label>
							<div class="input-group mb-2">
								<div class="input-group-prepend">
									<div class="input-group-text">ID</div>
								</div>
								<input onkeyup="validateForm()" type="number"
									class="form-control" name="id" placeholder="Enter Employee ID">
							</div>
						</div>
						<span id="email-error" style="display: none"
							class="text-danger small"></span>
						<div class="col-auto">
							<label class="sr-only" for="password">Password</label>
							<div class="input-group mb-2">
								<div class="input-group-prepend">
									<div class="input-group-text">Password</div>
								</div>
								<input onkeyup="validateForm()" type="password"
									class="form-control" name="password"
									placeholder="Enter Password">
							</div>
						</div>
						<br>
						<div class=" row">
							<button type="reset"
								class="offset-1 col-md-5 btn btn-outline-dark"
								style="border-radius: 3px 0 0 3px; border-right: 0">Reset</button>
							<button type="submit" class="col-md-5 btn btn-outline-info"
								style="border-radius: 0 3px 3px 0;">Login</button>
						</div>
						<br>
						<div class=" row">
							<a href="../employee/createEmployeePage"
								class="offset-1 col-md-5 btn btn-outline-success"
								style="border-radius: 3px 0 0 3px; border-right: 0">Create
								Account</a> <a href="forgotpassword.html"
								class="col-md-5 btn btn-outline-success"
								style="border-radius: 0 3px 3px 0;">Forgot Password</a>
						</div>

					</form>

				</div>
			</div>
		</div>
	</div>
</body>
</html>