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
	IS_BOOK_RETURNED bool not null,

	FOREIGN KEY (BOOK_ID) REFERENCES BOOK(ID)
	, FOREIGN KEY (USER_ID) REFERENCES USER(ID)
     );



-- INSERT
insert into book(TITLE, COPIES, AVERENGE_READING_TIME) values 
('Da Vinci Code,The', 20, '03:00:00')
,('Harry Potter and the Deathly Hallows', 30,'5:00:00')
, ('Harry Potter and the Philosophers Stone', 40, '4:00:00')
, ('Harry Potter and the Order of the Phoenix', 5, '10:00:00')
, ('Fifty Shades of Grey', 0, '11:00:00');

insert into authors(NAME) values ('Brown, Dan'), ('Rowling, J.K.'), ('James, E. L.'), ('Brown, Dan');

insert into book_authors(AUTHOR_ID, BOOK_ID, AUTHOR_ROLE) values (1, 1, 1), (2, 2, 1), (2, 3, 1), (2, 4, 1), (3, 5, 1), (4, 5, 0);

insert into role(NAME) values
('USER'), ('MANAGER');



-- автор і його книжки
insert into book_authors values 
((SELECT ID from authors WHERE ID=4), (SELECT ID from book WHERE ID=1),
 (SELECT ID from author_role WHERE NAME='AUTHOR'))
, ((SELECT ID from authors WHERE ID=1), (SELECT ID from book WHERE ID=1),
 (SELECT ID from author_role WHERE NAME='CO-AUTHOR'))
, ((SELECT ID from authors WHERE ID=2), (SELECT ID from book WHERE ID=3),
 (SELECT ID from author_role WHERE NAME='AUTHOR'))
;

insert into user(ROLE_ID, NAME, EMAIL, PASSWORD, REGISTRATION_DATE, BIRTHDAY_DATE) values 
((SELECT ID from role WHERE NAME='USER'), 'Jonh Weak', 'email@google.com', 'xxxxxx', '2012-12-31', '1980-05-02');

insert into journal(USER_ID, BOOK_ID, DATE_OF_RENT, EXPECTED_RETURN_DATE, IS_BOOK_RETURNED) values
 ((SELECT ID from user WHERE ID=1), (SELECT ID from book WHERE ID=2), '2013-02-01', '2013-03-01', false);



-- SELECT

-- 1.	Get information about all books
select * from book;

-- 2.	Check if needed book is available
select COPIES>=1 as IS_AVAILABLE from book where TITLE='book name'; -- if available return 1, else 0

-- 3.	Find books by author (main author, co-author)
select book.*, authors.NAME as AUTHOR 
from book inner join authors 
on book.ID=authors.BOOK_ID
where authors.NAME='author name';

-- 4.	Find book by title
select *  from book where TITLE='book name';

-- 5.	Get the most popular and the most unpopular books in selected period


