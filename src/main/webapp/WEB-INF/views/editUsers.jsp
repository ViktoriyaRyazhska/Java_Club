<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Users</title>
    <style type="text/css">
        .error {
            color: red;
        }

        table {
            width: 50%;
            border-collapse: collapse;
            border-spacing: 0px;
        }

        table td {
            border: 1px solid #565454;
            padding: 10px;
        }
    </style>
</head>
<body>
<h2>Register</h2>
<form:form action="/create/addUser" method="post" modelAttribute="user">
    <table>
        <tr>
            <td>Username</td>
            <td>
                <form:input path="username"/> <br/>
                <form:errors path="username" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td>Password</td>
            <td>
                <form:input path="password"/> <br/>
                <form:errors path="password" cssClass="error"/>
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <button type="submit">Submit</button>
            </td>
        </tr>
    </table>
</form:form>
</body>
</html>