<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>## 标题 ##</title>
</head>
<body>
	<div id = "global">
		<h4>产品以保存 product has been saved.</h4>
		<p>
			<h5>细节 Details：</h5>
			Product Name: ${product.name}  </br>
			Description:  ${product.description} </br>
			Price: $${product.price }
			Product Date: ${product.productiondate}
		</p>

	</div>
</body>
</html>