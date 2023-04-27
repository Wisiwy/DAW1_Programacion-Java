import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/* Este es el programa a desarrollar
		 * La colección sobre la que trabajar es la siguiente
		 * Hay un método static que deberéis utilizar para cargar la
		 * información si no podéis leer el fichero XML.
		 * SOLO EN ESE CASO
		 * 
		 * No hace falta un menú, cargáis los datos y sacáis los listados
		 */
		List<Participante> lista = new ArrayList<>();
		
		//cargaSinXML si no podéis leer los datos del fichero XML
		//cargaSinXML(lista);
	}
	
	public static void cargaSinXML(List<Participante> lista) {
		/* SOLO HACE FALTA SI NO PODÉIS LEER EL FICHERO XML
		 * Se trata de una matriz en la que por filas están los datos de 
		 * cada participante. Hay de dos tipos. Unos tienen seis atributos 
		 * y los otros cinco. 
		 * Prueba, Apellido, Nombre, Sexo, Fecha nacimiento, Marca
		 * Prueba, Apellido, Nombre, Fecha nacimiento, Nacionalidad
		 * 
		 * Con los datos de la matriz se crean los objetos y se carga la lista
		 */
		String[][] datos= {{"60m","RODRÍGUEZ SERRANO","DANIEL","M","1995-01-01","6.75"},
		{"60m","LÓPEZ BARRANCO","SERGIO","M","1999-01-01","6.86"},
		{"400m","HUSILLOS DOMINGO","ÓSCAR","M","1993-01-01","46.22"},
		{"400m","GARCÍA CABRERA","SAMUEL","M","1991-01-01","47.02"},
		{"400m","BUA DE MIGUEL","LUCAS","M","1994-01-01","46.92"},
		{"800m","GARCÍA GARCÍA","MARIANO","M","1997-01-01","1:47.63"},
		{"800m","SÁNCHEZ-VALLADARES GARCÍA","PABLO","M","1997-01-01","1:48.43"},
		{"800m","DE ARRIBA LÓPEZ","ÁLVARO","M","1994-01-01","1:49.99"},
		{"1.500m","GÓMEZ SANTIAGO","JESÚS","M","1991-01-01","3:38.47"},
		{"1.500m","FONTES GARCÍA-BALIBREA","IGNACIO","M","1998-01-01","3:38.68"},
		{"1.500m","EL KHAYAMI EL KOMIRY","ABDERRAHMAN","M","1995-01-01","3:49.34"},
		{"3.000m","MECHAAL MECHAAL","ADEL ","M","1990-01-01","7:46.52"},
		{"3.000m","KATIR EL HAOUZI","MOHAMED","M","1998-01-01","7:49.72"},
		{"3.000m","GARCÍA GARRIDO","GONZALO","M","1995-01-01","7:59.09"},
		{"60mv","MARTÍNEZ ECHARTE","ASIER","M","2000-01-01","7.61"},
		{"60mv","LLOPIS DOMÉNECH","ENRIQUE","M","2000-01-01","7.74"},
		{"60mv","SALORT ASENSIO","LUÍS","M","1999-01-01","7.97"},
		{"60m","PÉREZ RODRÍGUEZ","MARÍA ISABEL","F","1993-01-01","7.39"},
		{"60m","SEVILLA LÓPEZ-VIEJA","PAULA","F","1997-01-01","7.44"},
		{"400m","JIMÉNEZ HERNÁNDEZ","ANDREA","F","2001-01-01","54.34"},
		{"400m","BOKESA ABIA","AAURI LORENA","F","1988-12-12","53.64"},
		{"800m","GARCÍA TENA","DANIELA","F","2001-01-01","2:04.14"},
		{"1.500m","PÉREZ MIGUEL","MARTA","F","1993-01-01","4:20.39"},
		{"1.500m","GUERRERO PUIGDEVALL","ESTHER","F","1990-01-01","4:12.39"},
		{"1.500m","MUÑOZ MARQUÉS","ÁGUEDA","F","1999-01-01","4:09.94"},
		{"3.000m","RODRÍGUEZ MONTERO","LUCÍA","F","1998-01-01","8:53.90"},
		{"3.000m","GARCÍA ALONSO","MARTA","F","1998-01-01","9:02.00"},
		{"3.000m","FERNÁNDEZ DE LA GRANJA","BLANCA","F","1992-01-01","9:11.06"},
		{"60mv","ERRANDONEA FERNÁNDEZ BARRENA","TERESA","F","1994-01-01","8.09"},
		{"60mv","JEREZ CASTELLANOS","CARIDAD","F","1991-01-01","8.29"},
		{"60mv","BENACH SOLE","XENIA","F","2000-01-01","8.22"},
		{"Longitud","DIAME DIAME","FÁTIMA","F","1996-01-01","6.57"},
		{"Triple Salto","PELETEIRO BRION","ANA","F","1995-01-01","14.52"},
		{"Peso","TOIMIL FERNÁNDEZ","MARÍA BELÉN","F","1994-01-01","18.64"},
		{"60m","BOLT","USAIN","1986-08-21","Jamaicana"},
		{"400m","PERÉC","MARIE-JOSÉ","1968-05-09","Francesa"},
		{"800m","COE","SEBASTIAN","1956-09-29","Británica"},
		{"1.500m","COE","SEBASTIAN","1956-09-29","Británica"},
		{"3.000m","KIPTANUI","MOSES","1970-10-01","Keniata"},
		{"60mv","MORACHO TORRENTE","JAVIER","1957-08-18","Española"},
		{"Peso","MARTÍNEZ","MANUEL","1974-12-07","Española"},
		{"Longitud","DRECHSLER","HEIKE","1964-12-16","Alemana"},
		{"Triple Salto","DRECHSLER","HEIKE","1964-12-16","Alemana"}};
		

		//lista.add(new Clase  (datos[][]));
	}

}
