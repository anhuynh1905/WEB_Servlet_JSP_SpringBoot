<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
<link rel="stylesheet" href="view/loginform.css">
</head>
<body>
	<div class="container">
		<div class="screen">
			<div class="screen__content">
				<form class="login" action="/LoginForm/login" method="post">

					<c:if test="${alert != null}">
						<h3 class="alert alert danger" ${alert}></h3>
					</c:if>

					<div class="login__field">
						<i class="login__icon fas fa-user"></i> <input type="text"
							name="username" class="login__input"
							placeholder="Username ">
					</div>
					<div class="login__field">
						<i class="login__icon fas fa-lock"></i> <input type="password"
							name="password" class="login__input" placeholder="Password">
					</div>
					<button class="button login__submit">
						<span class="button__text">Log In Now</span> <i
							class="button__icon fas fa-chevron-right"></i>
					</button>
					<label class="button login__submit">Remember Me <input
						type="checkbox" name="remember" checked="checked"> <span
						class="checkmark"></span>
					</label >
					<a class="button login__submit" href="/LoginForm/reset">Forget Password</a>
					<a class="button login__submit" href="/LoginForm/createAccount">Create new account</a>
				</form>
				<div class="social-login">
					<div class="social-icons">
						<a href="#" class="social-login__icon fab fa-instagram"></a> <a
							href="#" class="social-login__icon fab fa-facebook"></a> <a
							href="#" class="social-login__icon fab fa-twitter"></a>
					</div>
				</div>
			</div>
			<div class="screen__background">
				<span class="screen__background__shape screen__background__shape4"></span>
				<span class="screen__background__shape screen__background__shape3"></span>
				<span class="screen__background__shape screen__background__shape2"></span>
				<span class="screen__background__shape screen__background__shape1"></span>
			</div>
		</div>
	</div>
</body>
</html>