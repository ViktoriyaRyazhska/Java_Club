start transaction;

insert into rent_info (book_id, user_id, rent_status, rent_date, return_date)
	values ('2', '2', 'REQUESTED', '2021-04-15 15:00:00', '2021-07-15 15:00:00');
    
update book
		set copies = copies - 1
where id = '2';

commit;