create table IF NOT EXISTS AUTHOR(
	idauthor int auto_increment primary key,
	nameauthor VARCHAR(50),
	dateofbirth DATE
	);
	
create table IF NOT EXISTS BOOK(
	idbook int auto_increment primary key,
	title VARCHAR(50),
	isbn int,
	idauthor int
	);
	
	