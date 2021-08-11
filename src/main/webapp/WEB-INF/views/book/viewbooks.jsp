<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Book List</h1>
<form method="get" action="search">
    <input type="text" name="keyword" />
    <input type="submit" value="Search" />
</form>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Author</th>
        <th>Co-author</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.coAuthor}</td>
            <td><a href="edit-book/${book.id}">Edit</a></td>
            <td><a href="delete-book/${book.id}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="book-form">Add New Book</a>
</body>
</html>
