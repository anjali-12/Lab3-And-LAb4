<%@page import="com.javatpoint.dao.UserDao,com.javatpoint.bean.*,java.util.*"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
  

<!DOCTYPE html>  
  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>View Users</title>  
</head>  
<body>  
  

<h1>Users List</h1>  
  
<%  
List<User> list=TraineeDao.getAllRecords();  
request.setAttribute("list",list);  
%>  
  
<table border="1" width="90%">  
<tr><th>Id</th><th>Id</th><th>Name</th><th>Domain</th>  
<th>Location</th><th></th><th>Edit</th><th>Delete</th></tr>  
<c:forEach items="${list}" var="u">  
<tr><td>${u.getId()}</td><td>${u.getName()}</td><td>${u.getDomain()}</td>  
<td>${u.getLocation()}</td></td>  
<td><a href="edittrainee.jsp?id=${u.getId()}">Edit</a></td>  
<td><a href="delete.jsp?id=${u.getId()}">Delete</a></td></tr>  
</c:forEach>  
</table>  
<br/><a href="addtrainee.jsp">Add New User</a>  
  
</body>  
</html>  