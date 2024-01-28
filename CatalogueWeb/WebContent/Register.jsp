<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
<link rel="stylesheet" href="Style2.css" type="text/css">
</head>
<body>
	<div id="login">
  <form action="Register" id="login_form" method="post">
    <div class="field_container">
      <input type="text" placeholder="First Name" name="fname">
    </div>
    
    <div class="field_container">
      <input type="text" placeholder="Last Name" name="lname">
    </div>
    
    <div class="field_container">
      <input type="text" placeholder="username" name="uname">
    </div>
    
    <div class="field_container">
      <input type="Password" placeholder="Password" name="pass">
      
      
      <div class="field_container">
      <input type="text" placeholder="Address" name="address">
    </div>
    
    <div class="field_container">
      <input type="text" placeholder="E-mail" name="email">
    </div>
      
     	<button id="sign_in_button">
        <span class="button_text">Sign Up</span>
        <span class="button_text"><a href="HomePage.jsp">Home</a></span>
        <span class="button_text"><a href="Login.jsp">Login</a></span>
      </button>
    </div>

	</form>	
</body>
</html>