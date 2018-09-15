<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>CodeAplha|Registration</title>
<jsp:include page="css_config.jsp" />
</head>
<body>
	<h1>CodeAlpha Registration Form</h1>
	<div class=" w3l-login-form">
		<h2>Register Here</h2>
		<form action="#" method="POST">

			
			<div class=" w3l-form-group">
				<label>Name:</label>
				<div class="group">
					<i class="fas fa-user"></i> <input type="text" class="form-control"
						placeholder="Enter your name.." required="required" />
				</div>
			</div>
			
			
			<div class=" w3l-form-group">
				<label>Email Id:</label>
				<div class="group">
					<i class="fas fa-user"></i> <input type="text" class="form-control"
						placeholder="Enter your emailid.." required="required" />
				</div>
			</div>
			
			
			<div class=" w3l-form-group">
				<label>Username:</label>
				<div class="group">
					<i class="fas fa-user"></i> <input type="text" class="form-control"
						placeholder="Enter Username.." required="required" />
				</div>
			</div>
			
			
			
			<div class=" w3l-form-group">
				<label>Password:</label>
				<div class="group">
					<i class="fas fa-unlock"></i> <input type="password"
						class="form-control" placeholder="Enter Password..." required="required" />
				</div>
			</div>
			
			
			<div class=" w3l-form-group">
				<label>Confirm Password:</label>
				<div class="group">
					<i class="fas fa-unlock"></i> <input type="password"
						class="form-control" placeholder="Enter Confirm Password..." required="required" />
				</div>
			</div>
			
			
			<div class="forgot">
				<a href="#">Forgot Password?</a>
				<p>
					<input type="checkbox">Remember Me
				</p>
			</div>
			<button type="submit">Login</button>
		</form>
		<p class=" w3l-register-p">
			Don't have an account?<a href="#" class="register"> Register</a>
		</p>
	</div>
	<footer>
		<p class="copyright-agileinfo">
			&copy; 2018 Material Login Form. All Rights Reserved | Design by <a
				href="#">@CodeAplpha</a>
		</p>
	</footer>
</body>
</html>