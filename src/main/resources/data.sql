DROP TABLE IF EXISTS EMPRESA;
CREATE TABLE EMPRESA (
id VARCHAR(50)  PRIMARY KEY,
ruc VARCHAR (11)  NOT NULL,
razonsocial VARCHAR (50) NOT NULL,
direccion VARCHAR (50) ,
estado VARCHAR (30) NOT NULL
);
INSERT INTO empresa VALUES ('1235644512', '12345678901','universidad nacional mayor de san marcos','Lima,Peru','abierto');
INSERT INTO empresa VALUES ('1212476545', '98765432198', 'universidad nacional ingenieria','Lima,Peru','abierto');
INSERT INTO empresa VALUES ('12124765412312', '55565432198', 'universidad privada del norte','Lima,Lima','cerrado');