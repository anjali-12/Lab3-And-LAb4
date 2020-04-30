<!DOCTYPE html>  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">  
<title>Edit Form</title>  
</head>  
<body>  
<%@page import="com.cg.trainee.dao.TraineeDao,com.cg.trainee.entity.User"%>  
  
<%  
String id=request.getParameter("id");  
User u=TraineeDao.getRecordById(Integer.parseInt(traineeid));  
%>  
  
<h1>Edit Form</h1>  
<form action="edittrainee.jsp" method="post">  
<input type="hidden" name="id" value="<%=u.getTraineeId() %>"/>  
<table>  
<tr><td>Name:</td><td>  
<input type="text" name="name" value="<%= u.getTraineeName()%>"/></td></tr>  

<tr><td>Domain:</td><td>  
<input type="email" name="domain" value="<%= u.getTraineeDomain()%>"/></td></tr>  
<tr><td>Location:</td><td>  
<input type="radio" name="location" value="Chennai"/>Chennai  
<input type="radio" name="location" value="Banglore"/>Banglore </td></tr>  

 
<tr><td colspan="2"><input type="submit" value="Edit User"/></td></tr>  
</table>  
</form>  
  
</body>  
</html>  