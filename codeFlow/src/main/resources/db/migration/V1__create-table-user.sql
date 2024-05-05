CREATE TABLE contate_nos
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    nome     VARCHAR(255)          NULL,
    email    VARCHAR(255)          NULL,
    numero   VARCHAR(255)          NULL,
    mensagem VARCHAR(255)          NULL,
    CONSTRAINT pk_contatenos PRIMARY KEY (id)
);