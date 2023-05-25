-- Volcando estructura para tabla examen.rutas
CREATE TABLE rutas (
  id INT NOT NULL PRIMARY KEY,
  nombre VARCHAR(100),
  nivel VARCHAR(10),
  tiempo VARCHAR(10),
  distancia FLOAT,
  velocidad FLOAT,
  ascenso INT,
  descenso INT
) ;
CREATE TABLE usuario (
  nombre VARCHAR(25) NOT NULL PRIMARY KEY,
  pass VARCHAR(25) NOT NULL 
) ;
CREATE TABLE realiza (
  nombre VARCHAR(25) NOT NULL,
  id_ruta INT NOT NULL,
  fecha VARCHAR(25) NOT NULL,
  PRIMARY KEY(nombre,id_ruta,fecha),
  CONSTRAINT FK_ruta FOREIGN KEY (id_ruta) REFERENCES rutas(id),
  CONSTRAINT FK_user FOREIGN KEY (nombre) REFERENCES usuario(nombre)
) ;