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

<h3>General statistic:</h3>
The most popular book: "${theMostPopular.name}" by ${theMostPopular.author} <br>
The most unpopular book: "${theMostUnpopular.name}" by ${theMostUnpopular.author} <br>
</body>
</html>
