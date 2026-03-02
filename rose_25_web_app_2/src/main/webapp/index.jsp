<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII" isELIgnored = "false"%>
    
<html>
	<head>
		<title> My JSP Page </title>
	</head>
	<body>
	
		<form action="user" method="GET">
			<label>Enter User Name:- </label>
			<input type="text" name="uname">
			<input type="submit">
						
		</form>
		
		
		<form action="search" method="GET">
			<label>Search:- </label>
			<input type="text" name="q">
			<input type="submit">
						
		</form>
		
		<h2>${data}</h2>
	</body>
</html>
