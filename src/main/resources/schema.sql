CREATE TABLE seedler_info (
        id int,
        name VARCHAR(50) NOT NULL,
        role varchar(20) NOT NULL,
        seedler_group varchar(35) NOT NULL,
        team varchar(35) NOT NULL,
        location varchar(20) NOT NULL,
        bio text NOT NULL,
        PRIMARY KEY (id));

insert into seedler_info values (1, "Lido Mazzucco", "BACKEND_DEVELOPER", "PLATFORM", "PUZZLES", "Berlin", "Hi, I'm Lido.")
