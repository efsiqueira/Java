CREATE SCHEMA IF NOT EXISTS padariajava DEFAULT CHARACTER SET utf8;
USE padariajava;

CREATE TABLE IF NOT EXISTS chef(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    dtnasc DATE NOT NULL,
    especialidade VARCHAR(30) NOT NULL,
    PRIMARY KEY(id));
    
CREATE TABLE IF NOT EXISTS cliente(
	id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(45) NOT NULL,
    cpf VARCHAR(14) NOT NULL,
    dtnasc DATE NOT NULL,
    telefone VARCHAR(14) NOT NULL,
    PRIMARY KEY(id));