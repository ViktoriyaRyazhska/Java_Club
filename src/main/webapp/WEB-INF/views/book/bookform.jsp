<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        .error {
            color: red;
        }
    </style>
</head>
<body>
<h1>Add New Book</h1>
<form:form method="post" action="save" modelAttribute="book">
    <table>
        <tr>
            <td>Name :</td>
            <td>
                <form:input path="name"/> <br>
                <form:errors path="name" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td>Author :</td>
            <td>
                <form:input path="author"/> <br>
                <form:errors path="author" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td>Co-author :</td>
            <td><form:input path="coAuthor"/></td>
        </tr>
        <tr>
            <td>Copies :</td>
            <td>
                <form:input path="copies"/> <br>
                <form:errors path="copies" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
