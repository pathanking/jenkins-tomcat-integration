<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="windows-1256">
<title>Jenkins Tomcat CI/CD</title>
</head>
<body>
	<h1>Welcome to Continuous Integration & Continuous Deployment using Jenkins!</h1>

	<form action="WelcomeServlet" method="post">
		Username: <input type="text" name="username" placeholder="enter username"> <br><br>
		Password: <input type="password" name="password" placeholder="enter password"> <br>
		<button type="submit">Submit</button>
	</form>
</body>
</html>