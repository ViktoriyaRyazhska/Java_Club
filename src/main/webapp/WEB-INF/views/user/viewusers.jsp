<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>User List</h1>
<form method="get" action="/user/search">
    <input type="text" name="keyword" />
    <input type="submit" value="Search" />
</form>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Username</th>
        <th>Role</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="user" items="${users}">
        <tr>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.role.roleType}</td>
            <td><a href="edit-user/${user.id}">Edit</a></td>
            <td><a href="delete-user/${user.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="user-form">Add New User</a>
</body>
</html>
