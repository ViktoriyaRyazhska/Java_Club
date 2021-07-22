SELECT `book_id`,
	COUNT(`book_id`) AS `most_popular` 
    FROM     `rent_info`
    WHERE 	 `rent_date` 
    BETWEEN '2021-02-21 15:00:00' AND '2021-07-21 15:00:00'
    GROUP BY `book_id`
    ORDER BY `most_popular` DESC;
 