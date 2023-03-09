CREATE TABLE instrumento(id BIGINT AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL
);

CREATE TABLE aluno(
    id BIGINT  AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    id_curso INT,
    id_instrumento INT 
);

CREATE TABLE professor(
    id BIGINT  AUTO_INCREMENT,
    nome BIGINT NOT NULL,
    id_curso INT NOT NULL,
    avaliacao DECIMAL(8, 2) NOT NULL,
    id_instrumento INT NOT NULL
);

CREATE TABLE curso(
    id BIGINT  AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    descricao VARCHAR(255) NOT NULL,
    id_preços INT NOT NULL,
    id_instrumento INT NOT NULL
);

CREATE TABLE preços(
    id BIGINT  AUTO_INCREMENT,
    valor DECIMAL(8, 2) NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    id_cursos INT NOT NULL
);

insert into aluno(
	nome, id_curso, id_instrumento) values(
	'Renato', null, null);
insert into aluno(
	nome, id_curso, id_instrumento) values(
	'Lígia', null, null);
insert into aluno(nome, id_curso, id_instrumento) values ('Jorge', null, null)

