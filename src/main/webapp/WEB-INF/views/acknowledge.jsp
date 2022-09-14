<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
</style>
  </head>
  <body>
    <h2>77 Global Learning and Management System</h2>
    <a href="home"> Home page | </a>
    <a href="about_us"> About Us | </a>
    <a href="learner"> Enrollment Form |</a>
    <a href="ListOfLearner"> List of Learner |</a>
    <a href="list"> List of Course |</a>
    
    <br></br> LEARNER NAME: ${learnerName} 
    <br></br> MESSAGE: ${message}
  </body>
</html>