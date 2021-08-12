<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>${user.username} statistic:</h3>
Amount of read books: ${amountReadBooks} <br>
Amount of books user is reading: ${amountOfBooksUserIsReading} <br>
Average time of reading books (in days): ${averageReadingTimeReturnedBooks} <br>
Time ${user.username} is our client (in days): ${daysClient}
</body>
</html>
