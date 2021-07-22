start transaction;

UPDATE rent_info
SET rent_status = 'RETURNED'
WHERE id = '1';

UPDATE book
SET copies = copies + 1
WHERE id = '1';

commit;