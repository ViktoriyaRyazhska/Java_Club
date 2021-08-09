<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="/role" method="get">
    <c:forEach items="${roles}" var="role">
        ${role.id}
        ${role.authority}
        ssssssssss
    </c:forEach>
</form:form>
</body>
</html>
