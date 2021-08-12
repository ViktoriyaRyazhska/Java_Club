<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Book</h1>
<form:form method="POST" action="/edit-save" modelAttribute="book">
    <table>
        <tr>
            <td></td>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Name :</td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Author :</td>
            <td><form:input path="author"/></td>
        </tr>
        <tr>
            <td>Co-author :</td>
            <td><form:input path="coAuthor"/></td>
        </tr>
        <tr>
            <td>Copies :</td>
            <td><form:input path="copies"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Edit Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
