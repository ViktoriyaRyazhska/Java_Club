<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/book-form">Add Book</a>
<a href="/view-books">View Books</a> <br>
<a href="/user-form">Add User</a>
<a href="/view-users">View Users</a> <br>
</body>
<br>
<form:form action="/logout" method="POST">
    <button type="submit">Logout</button>
</form:form>
</html>
