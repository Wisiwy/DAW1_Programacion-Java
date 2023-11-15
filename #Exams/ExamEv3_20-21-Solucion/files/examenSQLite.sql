
-- Volcando estructura para tabla examen.atleta
DROP TABLE IF EXISTS `atleta`;
CREATE TABLE IF NOT EXISTS `atleta` (
  `nombre` char(30) NOT NULL,
  `apellido` char(40) NOT NULL,
  `sexo` char(1) DEFAULT NULL,
  `fecha_nac` date DEFAULT NULL,
  `prueba` char(12) NOT NULL,
  `marca` char(12) DEFAULT NULL,
  PRIMARY KEY (`nombre`,`apellido`,`prueba`)
) ;

