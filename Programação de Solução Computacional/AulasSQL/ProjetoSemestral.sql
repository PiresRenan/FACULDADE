# criando e usando um database
create database teste;
use teste;
select * from user;
# criando tabela simples
create table user(
id          int             not null unique auto_increment,
name        varchar(45)     not null,
email       varchar(45)     not null,
primary key (name)
);

# excluindo database e tabelas
drop database teste;
drop table user;

# alterando tabelas, no caso adicionando colunas
alter table user
  add senha      varchar(20)           not null;
  
# mostrando a tabela dentro de todas os database '*'
UPDATE user set SENHA=99999999 WHERE name=Kate;

delete from user where id = 4;