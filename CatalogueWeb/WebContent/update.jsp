<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>
</head>
<body>
<body>
	<%@ include file="header.jsp" %>

	<div align="center">
		<form action="controleur" method="post">
			<table class="productTable">
				<thead>
					<tr>
						<th colspan="2">
							New Product Details
						</th>
					</tr>
				</thead>
				<tr>
					<td>Product ID</td>
					<td><input type="text" name="id" size="20"
						class="productTextField" /></td>
				</tr>
				<tr>
					<td>Product Name</td>
					<td><input type="text" name="nom" size="20"
						class="productTextField" /></td>
				</tr>
			
				<tr>
					<td>Price</td>
					<td><input type="text" name="prix" size="20"
						class="productTextField" /></td>
				</tr>
				
				<tr>
					<td>Size</td>
					<td><input type="text" name="taille" size="20"
						class="productTextField" /></td>
				</tr>
			</table>
			
		    <input type="submit" value="Update Product" name="action">
		    
		    
		
			
		</form>
	</div>
</body>
</body>
</html>