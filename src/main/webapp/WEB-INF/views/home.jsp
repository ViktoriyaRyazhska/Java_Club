<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<h3>Manager/Admin functionality:</h3> &nbsp;&nbsp;
<a href="/book-form">Add Book</a> &nbsp;&nbsp;
<a href="/user-form">Add User</a> &nbsp;&nbsp;
<a href="/view-users">View/Modify Users</a> &nbsp;&nbsp;
<a href="/modify-books">View/Modify Books</a> &nbsp;&nbsp;

<br> <h3>User functionality:</h3> &nbsp;&nbsp;
<a href="/view-books">View/Rent Books</a> &nbsp;&nbsp;
</body>
<br><br>
<form:form action="/logout" method="POST">
    <button type="submit">Logout</button>
</form:form>
</html>
