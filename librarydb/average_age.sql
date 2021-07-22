SELECT ROUND(AVG(age), 1) AS average_age_client
FROM user
WHERE user.role_id = '1';