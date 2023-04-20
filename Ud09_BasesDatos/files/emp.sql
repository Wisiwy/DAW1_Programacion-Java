-- ---------------------------------------------------------------------------
---PROVINCIAS - 
-- ---------------------------------------------------------------------------
CREATE TABLE provincias (
 id_prov INT NOT NULL PRIMARY KEY,
 provincia  VARCHAR(15)
);

INSERT INTO provincias VALUES (101, 'Huesca');
INSERT INTO provincias VALUES (102, 'Zaragoza');
INSERT INTO provincias VALUES (103, 'Teruel');

INSERT INTO provincias VALUES (011, 'Lerida');
INSERT INTO provincias VALUES (012, 'Tarragona');
INSERT INTO provincias VALUES (013, 'Barcelona');
INSERT INTO provincias VALUES (014, 'Gerona');

-- ---------------------------------------------------------------------------
---LOCALIDADES - 
-- ---------------------------------------------------------------------------
CREATE TABLE localidades (
 id_loc  INT NOT NULL PRIMARY KEY,
 localidad  VARCHAR(15), 
 prov      INT NOT NULL REFERENCES provincias(id_prov)
);

INSERT INTO localidades VALUES (1011, 'Huesca',101);
INSERT INTO localidades VALUES (1012, 'Arguis',101);
INSERT INTO localidades VALUES (1013, 'Barbastro',101);
INSERT INTO localidades VALUES (1014, 'Monzon',101);

INSERT INTO localidades VALUES (1021, 'Utebo',102);
INSERT INTO localidades VALUES (1022, 'Monzalbarba',102);
INSERT INTO localidades VALUES (1023, 'Casetas',102);
INSERT INTO localidades VALUES (1024, 'Figueruelas',102);

INSERT INTO localidades VALUES (1031, 'Alcañiz',103);
INSERT INTO localidades VALUES (1032, 'Caspe',103);


-- ---------------------------------------------------------------------------
---EMPLEADOS - 
-- ---------------------------------------------------------------------------
CREATE TABLE empleados (
 id    INT  NOT NULL PRIMARY KEY,
 nombre	   VARCHAR(15),
 apellido  VARCHAR(15),
 loc    INT NOT NULL REFERENCES localidades(id_loc),
 telefono  VARCHAR(9),
 direccion VARCHAR(20),
 salario   FLOAT,
 antiguedad INT
);

INSERT INTO empleados VALUES (7369,'FEDERICO','SÁNCHEZ',1023,'654789789','c\aviador',1040,20);
INSERT INTO empleados VALUES (7499,'SUSANA','ARROYO',1011,'654987987','c\aviador',1500,30);
INSERT INTO empleados VALUES (7521,'JAVIER','SALA',1011,'654123123','c\aviador',1625,30);
INSERT INTO empleados VALUES (7566,'MARIA','JIMÉNEZ',1021,'654321321','c\aviador',2900,20);
INSERT INTO empleados VALUES (7654,'ESTEBAN','MARTÍN',1032,'654741741','c\aviador',1600,30);
INSERT INTO empleados VALUES (7698,'LAURA','NEGRO',1013,'654963963','c\aviador',3005,30);
INSERT INTO empleados VALUES (7782,'GONZALO','CEREZO',1023,'654852852','c\aviador',2885,10);
INSERT INTO empleados VALUES (7788,'FABIOLA','GIL',1024,'654258258','c\aviador',3000,20);
INSERT INTO empleados VALUES (7839,'GERMAN','REY',1031,'654742365','c\aviador',4100,10);
INSERT INTO empleados VALUES (7844,'MARTA','TOVAR',1031,'654147147','c\aviador',1350,30);

