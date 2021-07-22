SELECT round(avg(datediff(current_timestamp, rent_date)), 2) as average_reading_time
FROM rent_info
WHERE rent_status = 'ACTIVE';