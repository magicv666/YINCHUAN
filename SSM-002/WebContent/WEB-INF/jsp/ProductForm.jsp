<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加产品 add Product here </title>
</head>
<body>

	<div id = "global">
	<form action = "product_save" method ="post">
		<fieldset>
			<legend>添加一个产品 add a product</legend>
			<p>
				<label for = "name">Product Name:</label>
				<input type = "text" id = "name" name ="name" tabindex = "1">
			</p>
			
			<p>
				<label for = "description">Product description:</label>
				<input type = "text" id = "description" name ="description" tabindex = "2">
			</p>
			
			<p>
				<label for = "description">Product Price:</label>
				<input type = "text" id = "price" name ="price" tabindex = "3">
			</p>
			
			<p>
				<label for = "description">Product Date:</label>
				<input type = "text" id = "productiondate" name ="productiondate" tabindex = "4">
			</p>
			
			<p id = "buttons">
				<input id = "reset"  type = "reset" tabindex = "5">
				<input id = "submit" type = "submit" tabindex = "6" value = "提交">
			</p>
		</fieldset>
	</form>
	</div>

</body>
</html>