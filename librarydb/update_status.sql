UPDATE rent_info
SET rent_status = 'EXPIRED'
WHERE reqired_return_date < current_timestamp() AND return_date IS NULL; 