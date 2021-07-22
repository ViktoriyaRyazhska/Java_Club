SELECT first_name, last_name, DATEDIFF(current_timestamp(), creation_date) as client_days
FROM user
WHERE id = 1;