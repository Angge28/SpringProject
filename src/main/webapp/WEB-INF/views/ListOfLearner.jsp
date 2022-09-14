<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Of Learner</title>
<style>
	table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}

th, td {
  padding: 15px;
}

a:link {
  color: blue;
  background-color: transparent;
  text-decoration: none;
  padding: 15px;
}

a:visited {
  color: red;
  background-color: transparent;
  text-decoration: none;
}

a:hover {
  color: green;
  background-color: transparent;
  text-decoration: underline;
}

a:active {
  color: blue;
  background-color: transparent;
  text-decoration: underline;
}
</style>
</head>
<body>
	<h2>77 Global Learning and Management System</h2>
	<a href="home"> Home page | </a>
	<a href="about_us"> About Us | </a>
	<a href="learner"> Enrollment Form |</a>
	<a href="ListOfLearner"> List of Learner |</a>
	<a href="list"> List of Course |</a>
	
<h3>List of Learner</h3>
<table>
	<thead>
	
  		<tr>
    		<th>Learner Name</th>
    		<th>Age</th>
    		<th>Employee ID</th>
     		<th>Email</th>
  		</tr>
  	</thead>
 	<tbody>
 	<c:forEach var="learner" items="${ListOfLearner}">
 		 <tr>
    		<th>${learner.learnerName} </th>
    		<th>${learner.learnerAge}</th>
    		<th>${learner.employeeId}</th>
    		<th>${learner.emailId}</th>
  		</tr>
  		</c:forEach>
  </tbody>
  
</table>
	
</body>
</html>