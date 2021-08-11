<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit User</h1>
<form:form method="POST" action="/edit-savee" modelAttribute="user">
    <table>
        <tr>
            <td></td>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Name :</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td></td>
            <td><form:hidden path="password"/></td>
        </tr>
        <tr>
            <td>Role :</td>
            <td><form:input path="role.roleType"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Edit Save"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
