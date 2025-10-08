<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="com.model.DAO"%>
<%@page import="com.model.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./CSS/index.css" />

<title>Insert title here</title>
</head>
<body>
<%
 String id = request.getParameter("uid");
 out.println("ID: " + id);
 Data d = new Data();
 DAO obj = new DAO();
 List data = obj.fetchUserById(id);
 ListIterator li = data.listIterator();
 
 while(li.hasNext()){
	d = (Data)li.next();
%>
	<div class="login-container">
		<h2>Edit Your info</h2>
		<form action="EditAction.jsp" method="post">
		    <label for="uid">UID</label> 
			<input type="text" value="<%= d.getUid()%>" readonly="readonly" id="uid" name="uid"  /> 
			
			<label for="fullname">Fullname</label> 
			<input type="text" value="<%=d.getFullname() %>" id="fullname" name="fullname"placeholder="Enter Your Fullname" required /> 
			
			<label for="email">Email</label>
			<input type="email" value="<%= d.getEmail() %>" id="email" name="email"placeholder="Enter your email" required />
			
			<label for="username">Username</label>
			<input type="text" value="<%= d.getUsername() %>" id="username" name="username"placeholder="Choose a username" required /> 
			
			<label for="password">Password</label>
			<input type="password" value="<%= d.getPassword() %>" id="password" name="password"placeholder="Create a password" required /> 
			
		
			<button type="submit">Save</button>
		</form>
		
	</div>
	<%
	}
	%>
	
	<%
		String msg = request.getParameter("msg");

		if ("valid".equals(msg)) {
		%>
		<h4 style="color: green">Updated Successfully</h1>
		<%
		}

		if ("invalid".equals(msg)) {
		%>
	
		<h4 style="color: red">Updation failed</h1>
		<%
		}
		%>
</body>
</html>