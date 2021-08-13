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
<h1>Edit User</h1>
<form:form method="POST" action="/edit-savee" modelAttribute="user">
    <table>
        <tr>
            <td></td>
            <td><form:hidden path="id"/></td>
        </tr>
        <tr>
            <td>Username :</td>
            <td>
                <form:input path="username"/> <br>
                <form:errors path="username" cssClass="error"/>
                <div class="error"> ${notUnique} </div>
            </td>
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
