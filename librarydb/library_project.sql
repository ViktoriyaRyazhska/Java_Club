USE `library_java_club`;
DROP TABLE IF EXISTS `rent_info`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `role`;
DROP TABLE IF EXISTS `copy`;
DROP TABLE IF EXISTS `co_author_book`;
DROP TABLE IF EXISTS `book`;
DROP TABLE IF EXISTS `author`;


CREATE TABLE role(
                     id			INT NOT NULL AUTO_INCREMENT,
                     role_type	VARCHAR(255) NOT NULL,
                     CONSTRAINT user_PK PRIMARY KEY (id)
);


CREATE TABLE user(
                     id          BIGINT 		 NOT NULL AUTO_INCREMENT,
                     first_name  VARCHAR(255),
                     last_name   VARCHAR(255),
                     email       VARCHAR(255) NOT NULL,
                     age			INT			 NOT NULL,
                     password	VARCHAR(255) NOT NULL,
                     role_id		INT 		 NOT NULL,
                     creation_date TIMESTAMP  NOT NULL,
                     CONSTRAINT user_PK PRIMARY KEY (id),
                     CONSTRAINT user_role_FK FOREIGN KEY (role_id) REFERENCES role(id),
                     CONSTRAINT user_email_AK UNIQUE (email)
);


CREATE TABLE author(
                       id          BIGINT 		 NOT NULL AUTO_INCREMENT,
                       first_name  VARCHAR(255),
                       last_name	VARCHAR(255),
                       CONSTRAINT author_PK PRIMARY KEY (id)
);


CREATE TABLE book(
                     id          BIGINT 		 NOT NULL AUTO_INCREMENT,
                     title		VARCHAR(255) NOT NULL,
                     country 	VARCHAR(255) NOT NULL,
                     genre		VARCHAR(255) NOT NULL,
                     author_id 	BIGINT		 NOT NULL,
                     CONSTRAINT book_PK PRIMARY KEY (id),
                     CONSTRAINT book_author_FK FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE TABLE co_author_book(
                               book_id		BIGINT		 NOT NULL,
                               author_id	BIGINT		 NOT NULL,
                               CONSTRAINT co_author_book_PK PRIMARY KEY (book_id, author_id),
                               CONSTRAINT co_author_book_book_FK FOREIGN KEY (book_id) REFERENCES book(id),
                               CONSTRAINT co_author_book_co_author_FK FOREIGN KEY (author_id) REFERENCES author(id)
);

CREATE TABLE copy(
                     id			BIGINT 		 NOT NULL AUTO_INCREMENT,
                     book_id		BIGINT		 NOT NULL,
                     taken		TINYINT		 NOT NULL,
                     CONSTRAINT copy_PK PRIMARY KEY (id),
                     CONSTRAINT copy_book_FK FOREIGN KEY (book_id) REFERENCES book(id)
);


CREATE TABLE rent_info(
                          id						BIGINT 		 NOT NULL AUTO_INCREMENT,
                          copy_id					BIGINT		 NOT NULL,
                          user_id					BIGINT		 NOT NULL,
                          rent_status				VARCHAR(15)  NOT NULL,
                          rent_date				TIMESTAMP    NOT NULL,
                          required_return_date 	TIMESTAMP  	 NOT NULL,
                          return_date				TIMESTAMP    DEFAULT NULL,
                          CONSTRAINT rent_info_PK PRIMARY KEY (id),
                          CONSTRAINT rent_info_book_FK FOREIGN KEY (copy_id) REFERENCES copy(id),
                          CONSTRAINT rent_info_user_FK FOREIGN KEY (user_id) REFERENCES user(id),
                          CONSTRAINT rent_info_AK UNIQUE (copy_id, user_id)
);

INSERT INTO role (role_type)
VALUES ('READER'),
       ('MANAGER'),
       ('ADMIN');

INSERT INTO user (first_name, last_name, email, age, password, role_id, creation_date)
VALUES ('Ihor', 'Volianskyi', 'volianskyi.ihor@gmail.com', '22', 'futureBcrypt', '3', '2021-03-21 13:00:00'),
       ('Pavlo', 'Fedyk', 'pavlo.fedyk@gmail.com', '19', 'futureBcrypt', '2', '2021-03-27 11:00:00'),
       ('Oleksiy', 'Vasiuta', 'oleksiy.vasiuta@gmail.com', '19', 'futureBcrypt', '1', '2021-04-05 12:00:00'),
       ('Denys', 'Ivanechko', 'denys.ivanechko@gmail.com', '26', 'futureBcrypt', '1', '2021-05-10 17:00:00');

INSERT INTO author(first_name, last_name)
VALUES ('Harper', 'Lee'),
       ('F. Scott', 'Fitzgerald'),
       ('Mark', 'Twain');

INSERT INTO book(title, country, genre, author_id)
VALUES ('To Kill a Mockingbird', 'USA', 'Southern Gothic', '1'),
       ('The Great Gatsby', 'USA', 'Tragedy', '2'),
       ('The Adventures of Huckleberry Finn', 'USA', 'Picaresque novel', '3');

INSERT INTO co_author_book(book_id, author_id)
VALUES ('1', '1'),
       ('1', '2'),
       ('1', '3');


INSERT INTO copy(book_id, taken)
VALUES ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('1', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('2', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1'),
       ('3', '1');


INSERT INTO rent_info(copy_id, user_id, rent_status, rent_date, required_return_date, return_date)
VALUES ('2', '2', 'RETURNED', '2021-03-21 15:00:00', '2021-04-21 15:00:00', '2021-04-21 15:00:00'),
       ('2', '1', 'RETURNED', '2021-04-21 15:00:00', '2021-06-21 15:00:00', '2021-07-21 15:00:00'),
       ('3', '3', 'ACTIVE', '2021-05-21 15:00:00', '2021-06-21 15:00:00', NULL),
       ('4', '3', 'ACTIVE', '2021-06-12 15:00:00', '2021-07-12 15:00:00', NULL),
       ('5', '1', 'ACTIVE', '2021-06-21 15:00:00', '2021-07-21 15:00:00', NULL),
       ('6', '1', 'REQUESTED', '2021-07-21 15:00:00', '2021-08-21 15:00:00', NULL),
       ('7', '1', 'REQUESTED', '2021-07-22 15:00:00', '2021-08-22 15:00:00', NULL),
       ('8', '1', 'REQUESTED', '2021-02-21 15:00:00', '2021-03-21 15:00:00', NULL),
       ('9', '1', 'EXPIRED', '2021-02-21 15:00:00', '2021-06-21 15:00:00', NULL);



