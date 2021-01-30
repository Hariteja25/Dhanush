<%@taglib 
uri="http://www.springframework.org/tags/form" 
prefix="form"%>


<html>
<head>
	<title>Emp manager</title>
<style>
	.error { 
		color: red; font-weight: bold; 
	}
	
</style>
</head>

<body>
<jsp:include page="header.jsp"></jsp:include>

<h2>Add new Employee</h2>
<font color="red">${msg }</font>
 
 
<form:form method="post" action="addpdt">
	<table>
	<tr>
		<td><form:label path="articleId">ArticleId</form:label></td>
		<td><form:input path="articleId" /></td>
	</tr>
	<tr>
		<td><form:label path="title">Title</form:label></td>
		<td><form:password path="title" /></td>
	</tr>
	<tr>
		<td><form:label path="category">Category</form:label></td>
		<td><form:input path="category" /></td>
	</tr>
	
	<tr>
		<td colspan="2">
			<input type="submit" value="Add Product"/>
		</td>
	</tr>
</table>	
	
</form:form>
</body>
</html>
 