<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Login to Employee Management Portal</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

</head>
<body style="background:lightgrey">

        <div class="col-md-4 offset-2 text-black"  style="background:lightblue">
        <div class="card-body">
        <h5 class="text-center">Login using Employee ID**</h5>
        <h6 class="text-center" style='color:red'> <%=request.getParameter("msg") %></h6>
        </div>
        </div>
        <div class="col-md-4 offset-2 text-black"  style="background:lightblue">        
            <div class="card-body">
                <h4 class="text-center">Welcome to EMP</h4>
                <form action="./login" method="POST">
                    <div class="form-group">
                        <label for="name">Emp Id</label>
                        <input type="text" id="empid" name="empid" placeholder="Enter Employee Id" class="form-control">
                    </div>
                    <div class="form-group">
                            <label for="name">Password</label>
                            <input type="password" id="pwd" name="pwd" placeholder="Password" class="form-control">
                        </div>
                        <div class="row">
                            <div class="col">
                              <br>
                                <button  type="submit"class="form-control btn btn-outline-secondary">Submit</button>
                            </div>
        
                            <div class="col">
                              <br>
                                <button type="reset" class="form-control btn btn-outline-success">Reset</button>
                            </div>
                            
                          </div> 
                         
                         <div class="row">
                            <div class="col">
                              <br>
                                <button type="button" class="form-control btn btn-outline-success" onclick="location.href='./createEmployee.html'" >Create Account</button>
                            </div>
        
                            <div class="col">
                              <br>
                                <button type="submit" class="form-control btn btn-outline-success">Forgot Password</button>
                            </div>
                            
                          </div> 
                          
                </form>
            </div>
        </div> 
</body>
</html>