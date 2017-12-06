<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" import="java.util.*"%> 

<script language="javascript">


</script>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>### 查询所有产品  ###</title>
</head>

<body>
<% 


%>  
	<div id = "global">
		<table border="1">
		
		<tr>
			<th>姓名</th>
			<th>日期</th>
			<th>价格</th>
			<th>描述</th>
		</tr>
		
		<c:forEach var="product" items="${page.prdList}">  
		<tr>
			<td align = "center">${product.name}</td>
			<td align = "center"><fmt:formatDate pattern="yyyy-MM-dd" value="${product.productiondate}"/></td>
			<td align = "center">${product.price }</td>
			<td align = "center">${product.description}</td>
		</tr>
		</c:forEach>  
		
		</table><br>
		 

	</div>
	
	<div class="tdbox1">|共<span>&nbsp;${page.totalRows}&nbsp;</span>条记录，每页<span>&nbsp;${page.numPerPage}&nbsp;</span>条，当前第<span>&nbsp;${page.currentPage}&nbsp;/&nbsp;${page.totalPages}&nbsp;</span>页 </div>
	<a href="querypage?pageNum=1">第一页</a>  
	<a href="querypage?pageNum=${page.currentPage+1}">下一页</a>  
	<a href="querypage?pageNum=${page.totalPages}">最后一页</a>  
 	
</body>
</html>