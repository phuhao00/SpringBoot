-- auto-generated definition
create table user
(
  id        int auto_increment
    primary key,
  user_name varchar(100) null,
  password  varchar(100) null,
  age       int          null,
  phone     varchar(20)  null
);

