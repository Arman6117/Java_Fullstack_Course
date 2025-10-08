<%@page import="com.model.DAO"%>
<%@page import="com.model.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	
	try{
		
	
	Integer uid = Integer.parseInt(request.getParameter("uid"));
	String fullname = request.getParameter("fullname");
	String email = request.getParameter("email");
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	String conPass = request.getParameter("confirm-password");

	//out.println("UID: " + uid + "<br>");
	//out.println("Full Name: " + fullname + "<br>");
	//out.println("Email: " + email + "<br>");
	//out.println("Username: " + username + "<br>");
	//out.println("Password: " + password + "<br>");
	
	Data d = new Data();
	d.setUid(uid);
	d.setFullname(fullname);
	d.setEmail(email);
	d.setUsername(username);
	d.setPassword(password);
	
	DAO ss = new DAO();
	int res = ss.signUp(d);
	
	if(res > 0) {
		response.sendRedirect("Login.jsp?msg=valid");
	} else {
		response.sendRedirect("Registration.jsp?msg=invalid");
	}
	
	} catch(Exception e) {
		e.printStackTrace();
	}
	%>
</body>
</html>