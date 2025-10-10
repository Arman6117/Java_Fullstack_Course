<%@page import="java.util.List"%>
<%@page import="java.util.ListIterator"%>
<%@page import="com.model.DAO"%>
<%@page import="com.model.Data"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	font-family: Arial, sans-serif;
	background: linear-gradient(to right, #74ebd5, #acb6e5);
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.card {
	display: flex;
	flex-direction: column;
	align-items: center;
	background: rgba(255, 255, 255, 0.4);
	padding: 10px;
	width: 800px;
	border-radius: 30px
}

.info {
	display: grid;
	grid-template-columns: 1fr 0.5fr;
}

.edit-btn {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
	margin-top: 20px;
}

.delete-btn {
	background-color: #f44336;
	color: white; padding : 10px 20px;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s ease;
	margin-top: 20px;
	margin-left: 10px;
	padding: 10px 20px;
}

.link {
	text-decoration: none;
	color: white;
}

h1 {
	font-size: 4rem;
	margin-bottom: 30px;
	color: #3a7482;
	text-shadow: 2px 2px 4px rgba(0, 0, 0, 0.3);
}

h2 {
	font-size: 2rem;
	margin-bottom: 20px;
	color: #2575fc;
	text-shadow: 1px 1px 2px rgba(0, 0, 0, 0.2);
}
</style>
</head>
<body>

	<%
	String username = (String) session.getAttribute("username");
	String password = (String) session.getAttribute("password");

	Data d = new Data();
	d.setUsername(username);
	d.setPassword(password);

	DAO obj = new DAO();
	List li = obj.fetch(d);
	ListIterator lsi = li.listIterator();
	while (lsi.hasNext()) {
		Data d2 = (Data) lsi.next();
	%>
	<div class="card">
		<h1>Dashboard</h1>
		<div class="info">
			<h2>
				Username:
				<%=d2.getUsername()%></h2>
			<h2>
				Email:
				<%=d2.getEmail()%></h2>
			<h2>
				Fullname:
				<%=d2.getFullname()%></h2>
			<h2>
				Password:
				<%=d2.getPassword()%></h2>

			<button class="edit-btn">
				<a class="link" href="EditInfo.jsp?uid=<%=d2.getUid()%>"> Edit
					Info </a>
			</button>
			<button class="delete-btn">
				<a class="link"
					href="Dashboard.jsp?action=delete&uid=<%=d2.getUid()%>"
					onclick="return confirm('Are you sure you want to delete this user?');">
					 Delete </a>
			</button>
		</div>
	</div>
	<%
	}
	%>
</body>
</html>