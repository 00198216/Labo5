<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SpringJPA es maldad</title>
</head>
<body>

  <table border="1">
       <tr>
           <th>Name</th>
           <th>Last Name</th>
           <th>Age</th>
           <th>Status</th>
           
       </tr>
       
    
       <c:forEach items="${student}" var="student">
         <tr>
           <th>${student.sName}</th>
           <th>${student.lName}</th>
           <th>${student.sAge}</th>
           <th>${student.activoDelegate}</th>
           
       </tr>
       </c:forEach>
       
  </table>

</body>
</html>