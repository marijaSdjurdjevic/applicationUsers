<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>     
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current user on system</title>
</head>
<body>

<jsp:include page="/pages/login.jsp" flush="true" />
	<jsp:include page="/pages/index.jsp" flush="true" />

	<c:set value="${pageContext.request.contextPath}" var="contextPath"></c:set>

	<form action="${contextPath}/Application/users/all" method="post">
		<table>
			<thead>
				<tr>
					<th>Username</th>
					<th>Password</th>
				</tr>
			</thead>
		</table>
	</form>
</body>
</html>