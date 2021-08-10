<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Spring5 MVC Hibernate Demo</title>
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
            padding: 20px;
        }
    </style>
</head>
<body>
<h1>Input Form</h1>
<form:form action="addBook" method="post" modelAttribute="book">
    <table>
        <tr>
            <td>Name</td>
            <td>
                <form:input path="name" /> <br />
                <form:errors path="name" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td>Author</td>
            <td>
                <form:input path="author" /> <br />
                <form:errors path="author" cssClass="error" />
            </td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Submit</button></td>
        </tr>
    </table>
</form:form>

<h2>Books List</h2>
<table>
    <tr>
        <td><strong>Name</strong></td>
        <td><strong>Author</strong></td>
    </tr>
    <c:forEach items="${books}" var="book">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
        </tr>
    </c:forEach>
</table>
<form:form action="/logout" method="POST">
    <br> <button type="submit">Logout</button>
</form:form>
</body>
</html>