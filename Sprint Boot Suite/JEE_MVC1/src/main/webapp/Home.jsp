<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<link rel="stylesheet" href="./CSS/index.css" />
</head>
<body>
	<div class="login-container">
		<h2>Register</h2>
		<form action="SignupAction.jsp" method="post">
			<label for="uid">UID</label> <input type="text" id="uid" name="uid"
				placeholder="Enter Uid" required /> <label for="fullname">Full
				name</label> <input type="text" id="fullname" name="fullname"
				placeholder="Enter Your Fullname" required /> <label for="email">Email</label>
			<input type="email" id="email" name="email"
				placeholder="Enter your email" required /> <label for="username">Username</label>
			<input type="text" id="username" name="username"
				placeholder="Choose a username" required /> <label for="password">Password</label>
			<input type="password" id="password" name="password"
				placeholder="Create a password" required /> <label
				for="confirm-password">Confirm Password</label> <input
				type="password" id="confirm-password" name="confirm-password"
				placeholder="Re-enter password" required />

			<button type="submit">Register</button>
			<p>
				Already have an account? <a href="Login.jsp">Login</a>
			</p>
		</form>

		<%
		String msg = request.getParameter("msg");

		if ("valid".equals(msg)) {
		%>
		<h1 style="color: green">Registered Successfully</h1>
		<%
		}

		if ("invalid".equals(msg)) {
		%>
	
		<h4 style="color: red">Registration failed</h1>
		<%
		}
		%>


	</div>
</body>
</html>