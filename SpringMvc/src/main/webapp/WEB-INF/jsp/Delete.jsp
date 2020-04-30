<%@page import="com.javatpoint.dao.UserDao"%>  
<jsp:useBean id="u" class="com.cg.trainee.dao.TraineeDao"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
<%  
TraineeDao.delete(u);  
response.sendRedirect("viewusers.jsp");  
%>  