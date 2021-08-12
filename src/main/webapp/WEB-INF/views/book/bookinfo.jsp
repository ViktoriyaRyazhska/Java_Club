<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>"${book.name}" by ${book.author} statistic:</h3>
Amount of readers: ${amountOfReaders} <br>
Amount of users reading this book now: ${amountOfBooksBookIsReading} <br>
Sum of book reading time (in days): ${sumOfBookReadingTime} <br>
<%--Time ${user.username} is our client (in days): ${daysClient}--%>
</body>
</html>
