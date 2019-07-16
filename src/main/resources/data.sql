DROP TABLE IF EXISTS author;
DROP TABLE IF EXISTS book;

CREATE TABLE author (
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(250) NOT NULL,
    last_name VARCHAR(250) NOT NULL
);

CREATE TABLE book (
    id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(250) NOT NULL,
    publication_date DATE NOT NULL,
    author_id INT,
    foreign key (author_id) references author(id)
);

INSERT INTO author (first_name, last_name) VALUES
                                                  ( 'Robert', 'Martin' ),
                                                  ( 'Kent', 'Beck' ),
                                                  ( 'Jon', 'Bentley' ),
                                                  ( 'Martin', 'Fowler' );

INSERT INTO book (title, publication_date, author_id) VALUES
                                                             ( 'Clean Code', '2008-07-17', 1 ),
                                                             ( 'Clean Coder', '2011-07-17', 1 ),
                                                             ( 'Refactoring', '1999-01-01', 2 ),
                                                             ( 'Programming Pearls', '1986-01-01', 3 ),
                                                             ( 'Patterns of Enterprise Application Architecture', '2002-11-05', 4 );



