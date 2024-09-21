<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Reset Password</title>
</head>
<form action="/LoginForm/reset" method="post">

<div class="username">Username:
<input type="text" name="username" >
</div>
<div class="ID">ID:
<input type="text" name="id">
</div>
<div class="new_pass">New password
<input type="password" name="new_pass">
<button type="submit" name="submit">submit</button>
</div>



</form>
</html>