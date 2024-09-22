<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Account</title>
</head>
<body>
	<form action="/LoginForm/createAccount" method="post">
		<div class="container">
			<h1>Sign Up</h1>
			<p>Please fill in this form to create an account.</p>
			<hr>

			<label for="email"><b>Email</b></label> 
			<input type="text" placeholder="Enter Email" name="email"> 
			<label for="psw"> <b>ID</b></label> 
			<input type="text" placeholder="Enter ID" name="id" required> 
			<label for="psw"> <b>Role ID</b></label> 
			<input type="text" placeholder="Enter Role ID" name="role_id" required><br>
			<label for="First_name"><b>First name</b></label> 
			<input type="text" placeholder="Enter first name" name="First_name"required>
			
			<label for="email"><b>Last name</b></label> 
			<input type="text" placeholder="Enter Last name" name="Last_name" required> 
			<label for="psw"> <b>Username</b></label> 
			<input type="text" placeholder="Enter username" name="username" required><br> 
			<label for="psw-repeat"><b>Password</b></label> 
			<input type="password" placeholder="Enter Password" name="password"required>
			
			<label for="email"><b>Phone number</b></label> 
			<input type="text" placeholder="Enter phone number" name="phone_number" required> 
			<label for="psw"> <b>Avatar</b></label> 
			<input type="text" placeholder="Enter avatar" name="username" > 
			
			


			<p>
				By creating an account you agree to our <a href="#"
					style="color: dodgerblue">Terms & Privacy</a>.
			</p>

			<div class="clearfix">
				<button type="button" class="cancelbtn">Cancel</button>
				<button type="submit" class="signupbtn">Sign Up</button>
			</div>
		</div>


	</form>
</body>
</html>