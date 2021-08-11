<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Add New User</h1>
<form:form method="post" action="/user/save" modelAttribute="user">
    <table>
        <tr>
            <td>Username :</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td>Password :</td>
            <td><form:password path="password"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
