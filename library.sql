create database if not exists library ;
use library;

create table if not exists  BOOK(ID int AUTO_INCREMENT PRIMARY KEY,
	TITLE varchar(100) not null,
	COPIES int not null,
	AVERENGE_READING_TIME TIME not null);
	
create table  if not exists AUTHORS(ID int AUTO_INCREMENT PRIMARY KEY,
	NAME varchar(100) not null);
    
create table if not exists BOOK_AUTHORS (
	AUTHOR_ID  int not null,
	BOOK_ID int not null,
    AUTHOR_ROLE tinyint not null,

	FOREIGN KEY (AUTHOR_ID) REFERENCES AUTHORS(ID) ON UPDATE CASCADE ON DELETE RESTRICT, 
	FOREIGN KEY (BOOK_ID) REFERENCES BOOK(ID)  ON UPDATE CASCADE ON DELETE RESTRICT
);
	
	
create table if not exists  ROLE(ID int AUTO_INCREMENT PRIMARY KEY,
	NAME varchar(100) not null);
     
create table if not exists  USER(ID int AUTO_INCREMENT PRIMARY KEY,
	ROLE_ID int,
	NAME varchar(100) not null,
	EMAIL varchar(100) not null,
	PASSWORD CHAR(82) not null,
	REGISTRATION_DATE DATE not null,
	BIRTHDAY_DATE DATE not null,

	FOREIGN KEY (ROLE_ID) REFERENCES ROLE(ID) ON UPDATE CASCADE ON DELETE restrict
     );
	
create table  if not exists JOURNAL(ID int AUTO_INCREMENT PRIMARY KEY,
    USER_ID int not null,
    BOOK_ID int not null,
    DATE_OF_RENT date not null,
    EXPECTED_RETURN_DATE date not null,
    BOOK_RETURN_DATE date,
    FOREIGN KEY (BOOK_ID) REFERENCES BOOK(ID),
    FOREIGN KEY (USER_ID) REFERENCES USER(ID));



-- INSERT
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values 
('Da Vinci Code,The', 20, '03:00:00')
,('Harry Potter and the Deathly Hallows', 30,'5:00:00')
, ('Harry Potter and the Philosophers Stone', 40, '4:00:00')
, ('Harry Potter and the Order of the Phoenix', 5, '10:00:00')
, ('Fifty Shades of Grey', 0, '11:00:00');

insert into authors(NAME) values 
('Brown, Dan')
, ('Rowling, J.K.')
, ('James, E. L.')
, ('Brown, Dan');

insert into role(NAME) values
('USER')
, ('MANAGER');

-- автор і його книжки
insert into BOOK_AUTHORS values 
((SELECT ID from authors WHERE ID=4), (SELECT ID from book WHERE ID=1), 1), 
((SELECT ID from authors WHERE ID=1), (SELECT ID from book WHERE ID=1), 2), 
((SELECT ID from authors WHERE ID=2), (SELECT ID from book WHERE ID=3), 1);

insert into user(ROLE_ID, NAME, EMAIL, PASSWORD, REGISTRATION_DATE, BIRTHDAY_DATE) values 
((SELECT ID from role WHERE NAME='USER'), 'Jonh Weak2we', 'email@google.com', 'xxxxxx', '2012-12-31', '1980-05-02');

insert into journal(USER_ID, BOOK_ID, DATE_OF_RENT, EXPECTED_RETURN_DATE, BOOK_RETURN_DATE) values
((SELECT ID from user WHERE ID=1), (SELECT ID from book WHERE ID=2), '2013-02-01', '2013-03-01', null),
((SELECT ID from user WHERE ID=1), (SELECT ID from book WHERE ID=2), '2013-04-01', '2013-05-01', '2013-04-25'),
((SELECT ID from user WHERE ID=1), (SELECT ID from book WHERE ID=3), '2013-04-01', '2013-05-01', '2013-05-10');


-- SELECT
-- All user
-- 1.	Get information about all books
select * from book;

-- 2.	Check if needed book is available
select COPIES>=1 as IS_AVAILABLE from book where TITLE='book name'; -- if available return 1, else 0

-- 3.	Find books by author (main author, co-author)
select book.*, authors.NAME as AUTHOR from book join book_authors on book.ID=book_authors.BOOK_ID
join authors on authors.ID = book_authors.AUTHOR_ID where authors.NAME = 'author name';

-- 4.	Find book by title
select *  from book where TITLE='book name';

-- 5.	Get the most popular and the most unpopular books in selected period
select book.TITLE, COUNT(*) as NUMBER_OF_RENTS from book 
join journal on book.ID=journal.BOOK_ID where DATE_OF_RENT between '2013-01-01' and '2013-10-01' + interval 1 day group by book.TITLE;

-- 6.	*Registration functionality
insert into user(ROLE_ID, NAME, EMAIL, PASSWORD, REGISTRATION_DATE, BIRTHDAY_DATE) values 
((SELECT ID from role WHERE NAME='role'), 'user name', 'email', 'password', 'date of registration', 'dirthday');


-- Reader



--3. Get statistics about amount of books read and long of reading

select COUNT(*) as books_read from journal WHERE user_id = 1 and journal.BOOK_RETURN_DATE IS NOT NULL; -- books read

select COUNT(*) as books_read from journal WHERE user_id = 1 and journal.BOOK_RETURN_DATE IS NULL; -- read now

select TIMESTAMPDIFF(DAY, DATE_OF_RENT, BOOK_RETURN_DATE) from journal where journal.user_id = 1 and journal.BOOK_RETURN_DATE IS NOT NULL; -- time of reading;

--5. Get email for next notification
select USER.EMAIL from USER where ID=1;




-- Manager
-- 1. Register book with copies
update book
set COPIES = COPIES + 1
where ID = 1;

-- 2. Update book’ information
update book
set TITLE='New title', AVERENGE_READING_TIME = '00:01:00'
where ID = 1;

-- 3. Delete One copy
update book
set COPIES = COPIES - 1
where ID = 1;

-- Book with all copies
delete from book
where ID = 4;


-- 4

-- Give book to Reader
-- if COPIES > 0 :
insert into journal(USER_ID, BOOK_ID, DATE_OF_RENT, EXPECTED_RETURN_DATE, IS_BOOK_RETURNED) value
((SELECT ID from user WHERE ID=1), (SELECT ID from book WHERE ID=5)
, DATE(NOW()), DATE(NOW()) + INTERVAL 14 DAY, false);
-- AND 
update book
set COPIES = COPIES - 1
where ID = 5;

-- 5. Set title of book and display count of this Book’ copies with information about them (available/unavailable in Library)
select COPIES, if(book.COPIES>0, 'available', 'unavailable') as IS_BOOK_AVAILABLE from book;

-- 6. Get statistics by Reader
-- books which this user has read, 
select b.TITLE
from book as b inner join journal as j
on j.BOOK_ID = b.ID
where j.USER_ID = 1 and j.BOOK_RETURN_DATE is not null;

-- is reading,
select b.TITLE
from book as b inner join journal as j
on j.BOOK_ID = b.ID
where j.USER_ID = 1 and j.BOOK_RETURN_DATE is null;

-- how long he is our client
select TIMESTAMPDIFF(MONTH, REGISTRATION_DATE, date(now())) AS month_he_is_our_client
from user
where ID = 1;

-- 7.	Get statistics by Book (general, by copies, average time of reading)
select * from book where ID=1;

-- 8.	Get statistics by Readers (average age, time of working with Library, average number of requests to Library in selected period)
-- averenge age
select AVG(TIMESTAMPDIFF(YEAR, BIRTHDAY_DATE, date(now()))) from USER;  

-- number of requests in period, середня кількість реквестів за день/тиждень/рік буде визначатись у коді
select COUNT(*) from journal where DATE_OF_RENT between '2013-01-01' and '2013-10-01'; 

-- 9.	Get list of users who has not returned book in time with detailed information about them
select user.*, journal.BOOK_ID, book.TITLE from user join journal on user.ID=journal.USER_ID join book on book.ID=journal.BOOK_ID where BOOK_RETURN_DATE is null;

-- 10.Amount of giving books in some period
select COUNT(*) from journal where journal.DATE_OF_RENT BETWEEN journal.DATE_OF_RENT and '2013-03-01';







