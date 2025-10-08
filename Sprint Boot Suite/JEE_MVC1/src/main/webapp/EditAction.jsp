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

int uid = Integer.parseInt(request.getParameter("uid"));
String username = request.getParameter("username");
String fullname =  request.getParameter("fullname");
String email = request.getParameter("email");
String password = request.getParameter("password");


out.println(uid);
out.println(username);
out.println(fullname);
out.println(email);

Data d = new Data();
d.setUid(uid);
d.setUsername(username);
d.setFullname(fullname);
d.setEmail(email);
d.setPassword(password);

DAO obj = new DAO();

int res = obj.update(d);

if(res > 0) {
	session.setAttribute("username", d.getUsername());
	  session.setAttribute("password", d.getPassword());
	  RequestDispatcher rd= request.getRequestDispatcher("Dashboard.jsp");
	  rd.forward(request, response);
} else {
    response.sendRedirect("EditInfo.jsp?msg=invalid");
}
 
%>
</body>
</html>