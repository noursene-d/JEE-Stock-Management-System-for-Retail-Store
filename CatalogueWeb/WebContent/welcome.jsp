<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="Style2.css" type="text/css">
<title>Profile Page</title>
<link rel="stylesheet" href="Style3.css" type="text/css">

</head>
<body>
<%@ include file="header.jsp" %>

	<font face="Arial" size="20px" color="#FF7A59">Welcome ${username}</font> <br>
	<font face="Arial" size="10px" color="#FF7A59">Please choose one of the actions above</font>
	
	
	<table align="center" class="productTable">
		<thead>
			<tr>
				<th>Product ID</th>
				<th>Product Name</th>
				<th>Price</th>
				<th>Size</th>
			</tr> 
		</thead>

		
  		<c:forEach items="${produits}" var="c">
	  		<tr>
	  			<td>${c.idProduit}</td>
	  			<td>${c.nomProduit}</td>
	  			<td>${c.prix}</td>
	  			<td>${c.taille}</td>
	  		</tr>
	  </c:forEach>
			

	</table>
	
	





</body>
</html>