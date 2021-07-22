SELECT round(avg(datediff(return_date, rent_date)), 2) as average_reading_time
FROM rent_info
WHERE rent_status = 'RETURNED';