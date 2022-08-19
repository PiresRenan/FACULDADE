#DDL
 #CREATE
create database faturamento;
use teste;
create table contact(
idCont             int               not null unique auto_increment,
email               varchar(50)       not null,
PRIMARY KEY (idCont)
 );#tambem pode ser criado as keys no fim
create index index_name
on table_name (nomeColuna1,nomeColuna2)

#ALTER 
ALTER TABLE nomeTabela
ADD nome_coluna    tipo_de dado(tamanho)    [contrain_type]; #se quiser excluir uma coluna é DROP nomedaColuna

#DROP
drop database bd_java;
drop table vacinas;
DROP INDEX Nome;

UPDATE client SET nome = 'iusd' where idClient = 3;

select * from contact;
