<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add user</title>
</head>
<body>

	<jsp:include page="/pages/login.jsp" flush="true" />
	<jsp:include page="/pages/index.jsp" flush="true" />

	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

	<form action="${contextPath}/application/user/add" method="post">
		<table>
		<thead>
		<tr>
		<td colspan="2">${errorMessage}</td>
		</tr>
		</thead>
			<tr>
				<td>Username:</td>
				<td><input type="text" id="username" name="Username" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" id="password" name="Password" /></td>
			</tr>
			<tr>
				<td><input type="submit" id="add" name="action" value="Add" /></td>
			</tr>
			<tr>
				<td><c:out value="${requestScope.validationError}"></c:out></td>
			</tr>
		</table>
	</form>

</body>
</html>