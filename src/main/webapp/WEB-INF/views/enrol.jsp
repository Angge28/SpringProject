<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>

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
  color: black;
  background-color: transparent;
  text-decoration: underline;
}

input[type=button], input[type=submit], input[type=reset] {
  background-color: #04AA6D;
  border: none;
  color: white;
  padding: 16px 32px;
  text-decoration: none;
  margin: 4px 2px;
  cursor: pointer;
}

form {
			text-align: center;
            background-color: #fff;
            max-width: 500px;
            margin: 50px auto;
            padding: 30px 20px;
            box-shadow: 2px 5px 10px rgba(0, 0, 0, 0.5);
        }
 
        /* Styling form-control Class */
        .form-control {
            text-align: left;
            margin-bottom: 25px;
        }
 
        /* Styling form-control Label */
        .form-control label {
            display: block;
            margin-bottom: 10px;
        }
 
        /* Styling form-control input,
        select, textarea */
        .form-control input,
        .form-control select,
        .form-control textarea {
            border: 1px solid #777;
            border-radius: 2px;
            font-family: inherit;
            padding: 10px;
            display: block;
            width: 95%;
        }

</style>
</head>
<body>
	<h2>77 Global Learning and Management System</h2>
	<a href="home"> Home Page | </a>
	<a href="about_us"> About Us | </a>
	<a href="learner"> Enrollment Form |</a>
	<a href="ListOfLearner"> List of Learner |</a>
	<a href="list"> List of Course |</a>
	<br><br>
	<form:form modelAttribute="learnerForm" action="learnerAction" method="post">
		<label> </label>
		<form:input type="text" name="learnerName"
			placeholder="Full name.." path="learnerName" /><br>
			<form:errors path="learnerName"></form:errors>
		<br></br>
		<label> </label>
		<form:input type="number" name="learnerAge"
			placeholder="Age.." path="learnerAge" /><br>
			<form:errors path="learnerAge"></form:errors>
		<br></br>
		<label> </label>
		<form:input type="text" name="employeeId"
			placeholder="Employee ID.." path="employeeId" /><br>
			<form:errors path="employeeId"></form:errors>
		<br></br>
		<label> </label>
		<form:input type="text" name="emailId"
			placeholder="Email.." path="emailId" /><br>
			<form:errors path="emailId"></form:errors>
		<br></br>

		<input type="submit" value="Submit" />
		
	</form:form>
</body>
</html>
