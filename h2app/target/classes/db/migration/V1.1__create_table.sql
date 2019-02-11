create table Homework (id bigint not null auto_increment,date_time date,tm time,status Enum('done','cancelled','todo')
,user_name varchar(255),
dt date,text varchar(255),primary key(id));