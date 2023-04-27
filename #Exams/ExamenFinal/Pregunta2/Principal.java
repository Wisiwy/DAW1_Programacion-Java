import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		/* Este es el programa a desarrollar
		 * La colecci�n sobre la que trabajar es la siguiente
		 * Hay un m�todo static que deber�is utilizar para cargar la
		 * informaci�n si no pod�is leer el fichero XML.
		 * SOLO EN ESE CASO
		 * 
		 * No hace falta un men�, carg�is los datos y sac�is los listados
		 */
		List<Participante> lista = new ArrayList<>();
		
		//cargaSinXML si no pod�is leer los datos del fichero XML
		//cargaSinXML(lista);
	}
	
	public static void cargaSinXML(List<Participante> lista) {
		/* SOLO HACE FALTA SI NO POD�IS LEER EL FICHERO XML
		 * Se trata de una matriz en la que por filas est�n los datos de 
		 * cada participante. Hay de dos tipos. Unos tienen seis atributos 
		 * y los otros cinco. 
		 * Prueba, Apellido, Nombre, Sexo, Fecha nacimiento, Marca
		 * Prueba, Apellido, Nombre, Fecha nacimiento, Nacionalidad
		 * 
		 * Con los datos de la matriz se crean los objetos y se carga la lista
		 */
		String[][] datos= {{"60m","RODR�GUEZ�SERRANO","DANIEL","M","1995-01-01","6.75"},
		{"60m","L�PEZ�BARRANCO","SERGIO","M","1999-01-01","6.86"},
		{"400m","HUSILLOS�DOMINGO","�SCAR","M","1993-01-01","46.22"},
		{"400m","GARC�A�CABRERA","SAMUEL","M","1991-01-01","47.02"},
		{"400m","BUA�DE�MIGUEL","LUCAS","M","1994-01-01","46.92"},
		{"800m","GARC�A�GARC�A","MARIANO","M","1997-01-01","1:47.63"},
		{"800m","S�NCHEZ-VALLADARES�GARC�A","PABLO","M","1997-01-01","1:48.43"},
		{"800m","DE�ARRIBA�L�PEZ","�LVARO","M","1994-01-01","1:49.99"},
		{"1.500m","G�MEZ�SANTIAGO","JES�S","M","1991-01-01","3:38.47"},
		{"1.500m","FONTES�GARC�A-BALIBREA","IGNACIO","M","1998-01-01","3:38.68"},
		{"1.500m","EL�KHAYAMI�EL�KOMIRY","ABDERRAHMAN","M","1995-01-01","3:49.34"},
		{"3.000m","MECHAAL�MECHAAL","ADEL�","M","1990-01-01","7:46.52"},
		{"3.000m","KATIR�EL�HAOUZI","MOHAMED","M","1998-01-01","7:49.72"},
		{"3.000m","GARC�A�GARRIDO","GONZALO","M","1995-01-01","7:59.09"},
		{"60mv","MART�NEZ�ECHARTE","ASIER","M","2000-01-01","7.61"},
		{"60mv","LLOPIS�DOM�NECH","ENRIQUE","M","2000-01-01","7.74"},
		{"60mv","SALORT�ASENSIO","LU�S","M","1999-01-01","7.97"},
		{"60m","P�REZ�RODR�GUEZ","MAR�A�ISABEL","F","1993-01-01","7.39"},
		{"60m","SEVILLA�L�PEZ-VIEJA","PAULA","F","1997-01-01","7.44"},
		{"400m","JIM�NEZ�HERN�NDEZ","ANDREA","F","2001-01-01","54.34"},
		{"400m","BOKESA�ABIA","AAURI�LORENA","F","1988-12-12","53.64"},
		{"800m","GARC�A�TENA","DANIELA","F","2001-01-01","2:04.14"},
		{"1.500m","P�REZ�MIGUEL","MARTA","F","1993-01-01","4:20.39"},
		{"1.500m","GUERRERO�PUIGDEVALL","ESTHER","F","1990-01-01","4:12.39"},
		{"1.500m","MU�OZ�MARQU�S","�GUEDA","F","1999-01-01","4:09.94"},
		{"3.000m","RODR�GUEZ�MONTERO","LUC�A","F","1998-01-01","8:53.90"},
		{"3.000m","GARC�A�ALONSO","MARTA","F","1998-01-01","9:02.00"},
		{"3.000m","FERN�NDEZ�DE�LA�GRANJA","BLANCA","F","1992-01-01","9:11.06"},
		{"60mv","ERRANDONEA�FERN�NDEZ�BARRENA","TERESA","F","1994-01-01","8.09"},
		{"60mv","JEREZ�CASTELLANOS","CARIDAD","F","1991-01-01","8.29"},
		{"60mv","BENACH�SOLE","XENIA","F","2000-01-01","8.22"},
		{"Longitud","DIAME�DIAME","F�TIMA","F","1996-01-01","6.57"},
		{"Triple�Salto","PELETEIRO�BRION","ANA","F","1995-01-01","14.52"},
		{"Peso","TOIMIL�FERN�NDEZ","MAR�A�BEL�N","F","1994-01-01","18.64"},
		{"60m","BOLT","USAIN","1986-08-21","Jamaicana"},
		{"400m","PER�C","MARIE-JOS�","1968-05-09","Francesa"},
		{"800m","COE","SEBASTIAN","1956-09-29","Brit�nica"},
		{"1.500m","COE","SEBASTIAN","1956-09-29","Brit�nica"},
		{"3.000m","KIPTANUI","MOSES","1970-10-01","Keniata"},
		{"60mv","MORACHO TORRENTE","JAVIER","1957-08-18","Espa�ola"},
		{"Peso","MART�NEZ","MANUEL","1974-12-07","Espa�ola"},
		{"Longitud","DRECHSLER","HEIKE","1964-12-16","Alemana"},
		{"Triple Salto","DRECHSLER","HEIKE","1964-12-16","Alemana"}};
		

		//lista.add(new Clase  (datos[][]));
	}

}
