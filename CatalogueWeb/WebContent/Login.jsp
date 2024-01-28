<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" href="Style2.css" type="text/css">

</head>
<body>

<div id="login">
  <form action="Login" id="login_form" method="post">
    <div class="field_container">
      <input type="text" placeholder="username" name="uname">
    </div>
    
    <div class="field_container">
      <input type="Password" placeholder="Password" name="pass">
      <button id="sign_in_button">
        <span class="button_text">Sign In</span>
        <span class="button_text"><a href="HomePage.jsp">Home</a></span>
        <span class="button_text"><a href="Register.jsp">Sign Up</a></span>
      </button>
    </div>

	</form>	
</div>
</body>
</html>