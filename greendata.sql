create database greendata;

create table banks
(
    id int not null auto_increment primary key,
    name varchar(2048) not null,
    bik varchar(2048) not null
);

create table dic_organizational
(
    id int not null auto_increment primary key,
    name varchar(255) not null
);

create table clients
(
    id int not null auto_increment primary key,
    name varchar(2048) not null,
    shortname varchar(128) not null,
    address varchar(2048) not null,
    organizational int not null
);

create table deposits
(
    id int not null auto_increment primary key,
    client_id int not null,
    bank_id int not null,
    open_date datetime not null,
    percent decimal(65,10) not null,
    term int not null
);

insert into dic_organizational (name) values ('ООО');
insert into dic_organizational (name) values ('АО');
insert into dic_organizational (name) values ('ПАО');
insert into dic_organizational (name) values ('ИП');
insert into dic_organizational (name) values ('ФЛ');

insert into banks (name, bik) values ('АГРОСПЕЦСНАБГАЗМЯСБАНК');