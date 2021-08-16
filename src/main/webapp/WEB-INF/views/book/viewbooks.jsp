<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Book List</h1>
<form method="get" action="/book/search">
    <input type="text" name="keyword" />
    <input type="submit" value="Search" />
</form>
<table border="2" width="70%" cellpadding="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Author</th>
        <th>Co-author</th>
        <th>Copies</th>
        <th>Rent</th>
        <th>Return</th>
        <th>Statistic</th>
    </tr>
    <c:forEach var="book" items="${books}">
        <sec:authentication var="principal" property="principal" />
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>${book.coAuthor}</td>
            <td>${book.copies}</td>
            <td><a href="/rent-info/request/${book.id}/${principal.id}">Rent</a></td>
            <td><a href="/rent-info/return/${book.id}/${principal.id}">Return</a></td>
            <td><a href="/book/${book.id}">Statistic</a></td>
        </tr>
    </c:forEach>
</table>
<br/>
<a href="/view-books">Clear search</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<a href="/">Home</a> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
</body>
</html>
