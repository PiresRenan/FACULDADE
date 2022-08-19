create database faturamento;
use `ex01-sd`;
CREATE TABLE Pessoa (
    idUser INT NOT NULL AUTO_INCREMENT UNIQUE,
    nome VARCHAR(50) NOT NULL,
    idade int,
    PRIMARY KEY (idUser)
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
CREATE TABLE salario (
    idSal INT NOT NULL AUTO_INCREMENT UNIQUE,
    data VARCHAR(50),
    valor VARCHAR(50),
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
CREATE TABLE userdata (
    idUserD INT NOT NULL AUTO_INCREMENT UNIQUE,
    rg VARCHAR(15) NOT NULL UNIQUE,
    cpf VARCHAR(15) NOT NULL UNIQUE,
    estado_civil VARCHAR(15) NOT NULL,
    sexo VARCHAR(15) NOT NULL,
    birthdate VARCHAR(25),
    idUser INT,
    PRIMARY KEY (idUserD),
    FOREIGN KEY (idUser)
        REFERENCES user (idUser)
);
SELECT 
    *
FROM
    user;