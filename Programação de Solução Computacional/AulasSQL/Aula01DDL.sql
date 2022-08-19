-- aula DDL
/* DDL = Data Definition Language(Linguagem de definição de dados)
PK - Primary Key
FK = Foreign Key

EMPREGADO(codigo(PK), nome)

COMANDOS DDL = CREATE ALTER E DROP
Comandos estruturais

*/
-- cria banco de dados
create database aula01;
-- acessa banco de dados
use aula01;
-- criando a tabela funcionario
-- crie primeiro tabelas que nao possuem FK
create table funcionario(
 idfunc int primary key,
 nome varchar(100)
 );

create table departamento (
iddep int auto_increment,
nome varchar(30),
idfuncD int,
Primary key(iddep),
foreign key (idfuncD) references funcionario (idfunc)
);

-- inserindo um registro na tabela funcionario
insert into funcionario values(1,'Jao')

-- inserindo numa tabela com auto incremento
insert into departamento (nome, idfuncD) values('Vendas',1);
-- insert into departamento values(null,'Vendas',1);

select * from departamento

create table Pessoa (
idpes int,
nome varchar(100),
idcasada int,idcasada
CONSTRAINT pkPessoa primary key (idpes),
CONSTRAINT fkCasadaCom Foreign Key (idcasada) references Pessoa(idpes)
);

create table funcionario2(
 idfunc int primary key,
 nome varchar(100)
 );
 
 create table departamento2 (
iddep int ,
nome varchar(30),
idfuncD int,
Primary key(iddep),
foreign key (idfuncD) references funcionario (idfunc)
);

 -- adicionando coluna cpf na tabela funcionario2 (add para adicionar e modify para mudar)
Alter table funcionario2
   add cpf numeric(11) not null unique
   
 -- Alter table para modificar a coluna 
Alter table funcionario2
    modify cpf numeric(11) not null
    
-- Alter Table para adicionar uma coluna a tabela departamento2
Alter table departamento2
add cpfD decimal(11) not null

-- Alter table para adicionar uma restrição de chave estrangeira de uma coluna única que não necessariamente é uma chave primaria
Alter table departamento2
ADD CONSTRAINT fkPessoaDep
FOREIGN KEY (cpfD) references funcionario2(cpf);

create table projeto(
idproj int primary key,
nome varchar(30)
);
-- criando uma tabela de relacionamento com chave primaria composta
create table alocado(
codprojA int,
codfuncA int,
dtalocacao date,
primary key(codprojA, codfuncA, dtalocacao),
foreign key(codprojA) references projeto(idproj),
foreign key(codfuncA) references funcionario2(idfunc)
);



