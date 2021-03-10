<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


    <% 
         if(session.getAttribute("user") == null)
         {
    	   response.sendRedirect("login.jsp");  
         }
     %>
     
     <h3>Admin Dashboard</h3> <br>
     
     <h4>User Profile</h4>
     
     <forEach var="user" items="${users}">
          <c:out value="${user}" />
          <br>
     </forEach>
     
<h3>This is ADMIN Module</h3>



</body>
</html>