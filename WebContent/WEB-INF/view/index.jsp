<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Hello. This program is the test of Spring MVC and Hibernate</h3>

	<c:if test="${!empty listEntity}">
		<p>Entities:</p>
		<c:forEach items="${listEntity}" var="l">
			<p>${l.name}${l.contacts}</p>
		</c:forEach>
	</c:if>
	<form:form method="post" commandName="newEntity" action="add.do">
		Name:<form:input path="name"/> <br>
		Contacts:<form:input path="contacts"/> <br>
		<input type="submit"/>
	</form:form>
</body>
</html>