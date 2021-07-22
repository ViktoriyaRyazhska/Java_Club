SELECT count(book_id) as how_many_books_were_read_by_me, 
IF(rent_status = 'RETURNED', 
round(avg(datediff(return_date, rent_date)), 2),
round(avg(datediff(current_timestamp(), rent_date)), 2)) as average_reading_time
FROM rent_info
WHERE user_id = '2';