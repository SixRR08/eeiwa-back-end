create table user
(
    id bigint unsigned auto_increment primary key,
    department_id bigint unsigned,
    first_name varchar (50) not null,
    last_name varchar (50)not null,
    email varchar (50) not null,
    phone_number varchar(10),
    job_title varchar (50),
    hire_date date,
    password varchar (60) not null
);

CREATE TABLE calendar
(
id bigint unsigned auto_increment primary key,
full_date date not null,
user_id bigint unsigned not null
);

CREATE TABLE departments
(
id bigint unsigned auto_increment primary key,
department_name varchar (50),
user_id bigint unsigned
)
