create database projetoa3;
use projetoa3;
create table vacinas (
idVac        int not null auto_increment unique,
PRIMARY KEY (idVac)
);
create table enabledvaccine(
idVacD   int not null auto_increment unique,
qtdVac1  int,
qtdVac2  int,
qtdVac3  int,
idVac    int,
PRIMARY KEY (idVacD),
FOREIGN KEY (idVac) REFERENCES vacinas (idVac)
);
create table localvaccine(
idVacL   int not null auto_increment unique,
adress1  varchar(50),
adress2  varchar(50),
adress3  varchar(50),
idVacD    int,
PRIMARY KEY (idVacL),
FOREIGN KEY (idVaD) REFERENCES enabledvaccine (idVaD)
);
create table salario(
idSal   int not null auto_increment unique,
data     varchar(50) ,
valor    varchar(50) ,
PRIMARY KEY (idSal)
);
create table contact(
idUserC   int           not null auto_increment unique,
tel1      varchar(50)   not null unique,
email     varchar(100)  not null unique,
adress    varchar(100)  not null,
state     varchar(50)   not null,
country   varchar(50)   not null,
idUser    int            ,
PRIMARY KEY (idUserC),
FOREIGN KEY (idUser) REFERENCES user (idUser)
);
create table userdata(
idUserD   int not null auto_increment unique,
rg        varchar(15) not null unique,
cpf       varchar(15) not null unique,
estado_civil     varchar(15)  not null,
sexo    varchar(15)  not null,
birthdate     varchar(25)   ,
idUser    int,
PRIMARY KEY (idUserD),
FOREIGN KEY (idUser) REFERENCES user (idUser)
);
select * from user;