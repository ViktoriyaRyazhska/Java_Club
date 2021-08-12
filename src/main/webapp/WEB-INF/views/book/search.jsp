<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <h2>Search Result</h2>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Author</th>
            <th>Co-author</th>
            <th>Copies</th>
        </tr>
        <c:forEach items="${result}" var="book">
            <tr>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.author}</td>
                <td>${book.coAuthor}</td>
                <td>${book.copies}</td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <a href="/">Home</a>
</div>
</body>
</html>
