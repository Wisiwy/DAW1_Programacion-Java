CREATE TABLE pilotos(
 idp INT NOT NULL PRIMARY KEY,
 nombre VARCHAR(15),
 coche VARCHAR(15),
 escuderia VARCHAR(15),
 edad INT
);

CREATE TABLE circuitos(
 idc INT NOT NULL PRIMARY KEY,
 circuito VARCHAR(15)
);

CREATE TABLE puntua(
 idp INT NOT NULL,
 idc INT NOT NULL,
 anio INT,
 velMedia FLOAT,
 PRIMARY KEY(idp,idc),
 FOREIGN KEY (idp) REFERENCES pilotos(idp),
 FOREIGN KEY (idc) REFERENCES circuitos(idc)
);


