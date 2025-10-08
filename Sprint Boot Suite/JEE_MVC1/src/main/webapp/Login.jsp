<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
  <link rel="stylesheet" href="./CSS/index.css" />
</head>
<body>
  <div class="login-container">
    <h2>Login</h2>
    <form action="LoginAction.jsp" method="post">
      <label for="username">Username</label>
      <input type="text" id="username" name="username" placeholder="Enter username" required />

      <label for="password">Password</label>
      <input type="password" id="password" name="password" placeholder="Enter password" required />

      <button type="submit">Login</button>
      <p>Don't have an account? <a href="Registration.jsp">Sign up</a></p>
    </form>
    <%
		String msg = request.getParameter("msg");

		if ("valid".equals(msg)) {
		%>
		<h4 style="color: green">Login Successfully</h1>
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