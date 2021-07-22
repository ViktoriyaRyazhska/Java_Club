SELECT title,
CASE
	WHEN copies > 0 THEN 'Book is available to rent'
    ELSE 'Sorry, all books are rented'
END AS notification
FROM book;    