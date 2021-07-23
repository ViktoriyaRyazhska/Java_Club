create database if not exists library ;
use library;

create table if not exists  BOOK(ID int AUTO_INCREMENT PRIMARY KEY,
     TITLE varchar(100) not null,
     COPIES int not null,
     AVERENGE_READING_TIME TIME not null);
	
create table  if not exists AUTHORS(ID int AUTO_INCREMENT PRIMARY KEY,
     NAME varchar(100) not null);
     
create table if not exists BOOK_AUTHORS (
	author_id  int not null,
	book_id int not null,

	FOREIGN KEY (author_id) REFERENCES AUTHORS(ID), 
	FOREIGN KEY (book_id) REFERENCES BOOK(ID)
);
	
	
create table if not exists  ROLE(ID int AUTO_INCREMENT PRIMARY KEY,
     NAME varchar(100) not null);
     
create table if not exists  USER(ID int AUTO_INCREMENT PRIMARY KEY,
     ROLE_ID int not null,
     NAME varchar(100) not null,
	 EMAIL varchar(100) not null,
     PASSWORD CHAR(82) not null,
     REGISTRATION_DATE DATE not null,
     BIRTHDAY_DATE DATE not null,
     
     FOREIGN KEY (ROLE_ID) REFERENCES ROLE(ID)
     );
	
create table  if not exists JOURNAL(ID int AUTO_INCREMENT PRIMARY KEY,
     USER_ID int not null,
     BOOK_ID int not null,
     DATE_OF_RENT date not null,
     EXPECTED_RETURN_DATE date not null,
     IS_BOOK_RETURNED bool not null,
     
     FOREIGN KEY (BOOK_ID) REFERENCES BOOK(ID)
     , FOREIGN KEY (USER_ID) REFERENCES USER(ID)
     );



-- INSERT
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values ('Da Vinci Code,The', 20, '03:00:00');
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values ('Harry Potter and the Deathly Hallows', 30,'5:00:00');
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values ('Harry Potter and the Philosophers Stone', 40, '4:00:00');
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values ('Harry Potter and the Order of the Phoenix', 5, '10:00:00');
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values ('Fifty Shades of Grey', 0, '11:00:00');

insert into authors(ID, NAME) values (1, 'Brown, Dan');
insert into authors(ID, NAME) values (2, 'Rowling, J.K.');
insert into authors(ID, NAME) values (3, 'Rowling, J.K.');
insert into authors(ID, NAME) values (4, 'Rowling, J.K.');
insert into authors(ID, NAME) values (5, 'James, E. L.');

insert into role(NAME) values ('USER');
insert into role(NAME) values ('MANAGER');

insert into user(ROLE_ID, NAME, EMAIL, PASSWORD, REGISTRATION_DATE, BIRTHDAY_DATE) values 
(1, 'Jonh Weak', 'email@google.com', 'xxxxxx', '2012-12-31', '1980-05-02');

insert into journal(USER_ID, BOOK_ID, DATE_OF_RENT, EXPECTED_RETURN_DATE, IS_BOOK_RETURNED) values
 (1, 3, '2013-02-01', '2013-03-01', 0);


-- SELECT
-- All users

-- 1.	Get information about all books
select * from book;

-- 2.	Check if needed book is available
select COPIES>1 
from book 
where TITLE='book name'; -- if available return 1, else 0

-- 3.	Find books by author (main author, co-author)
select book.*, authors.NAME as AUTHOR 
from book join authors 
on book.ID=authors.BOOK_ID
where authors.NAME='author name';

-- 4.	Find book by title
select * 
from book 
where TITLE='book name';

-- 5.	Get the most popular and the most unpopular books in selected period

-- Reader

-- 3.	Get his/her statistics (how many and how long books were been read, reading now)

-- 4.	Get the most popular and the most unpopular books in selected period

-- Manager

-- 1.	Register book with copies

-- 2.	Update book’ information

-- 3.	Delete One copy/Book with all copies

-- 4.	Give book to Reader

-- 5.	Set title of book and display count of this Book’ copies with information about them (available/unavailable in Library)

-- 6.	Get statistics by Reader (books which this user has read, is reading, how long he is our client)

-- 7.	Get statistics by Book (general, by copies, average time of reading)

-- 8.	Get statistics by Readers (average age, time of working with Library, average number of requests to Library in selected period)

-- 9.	Get list of users who has not returned book in time with detailed information about them

-- 10.	How many books were giving in selected period?




