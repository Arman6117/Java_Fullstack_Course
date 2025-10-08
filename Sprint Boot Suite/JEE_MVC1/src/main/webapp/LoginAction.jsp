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
  String username  = request.getParameter("username");
  String password  = request.getParameter("password");
  
  Data d = new Data();
  
  d.setUsername(username);
  d.setPassword(password);
  
  DAO obj = new DAO();
  
  boolean isValid = obj.validate(username, password);
  
  if(isValid) {
	  session.setAttribute("username", username);
	  session.setAttribute("password", password);
      RequestDispatcher rd =  request.getRequestDispatcher("Dashboard.jsp");
      rd.forward(request, response);
  } else {
      response.sendRedirect("Login.jsp?msg=invalid");
  }
%>
</body>
</html>