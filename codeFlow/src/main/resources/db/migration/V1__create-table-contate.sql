CREATE TABLE contate_nos
(
    id      BIGINT AUTO_INCREMENT NOT NULL,
    name    VARCHAR(50) NOT NULL,
    email   VARCHAR(70) NOT NULL,
    message VARCHAR(300) NOT NULL,
    number  VARCHAR(30) NOT NULL,
    CONSTRAINT pk_contate_nos PRIMARY KEY (id)
);