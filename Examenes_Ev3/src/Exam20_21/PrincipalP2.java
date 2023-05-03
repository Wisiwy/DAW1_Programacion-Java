package Exam20_21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import aUtilidad.Input;

public class PrincipalP2 {

	public static void main(String[] args) {
		/*
		 * Este es el programa a desarrollar La colecci�n sobre la que trabajar es la
		 * siguiente Hay un m�todo static que deber�is utilizar para cargar la
		 * informaci�n si no pod�is leer el fichero XML. SOLO EN ESE CASO
		 * 
		 * No hace falta un men�, carg�is los datos y sac�is los listados
		 */
		List<ParticipanteP2> lista = new ArrayList<>();

		try {
			// carga desde XML
			lista = cargaXML();
			verList(lista);

			// comparador nombre apellido
			Comparator<ParticipanteP2> cApe = (a, b) -> a.getApellido().compareTo(b.getApellido());
//			Comparator<ParticipanteP2> cNombre = (a,b) -> a.getNombre().compareTo(b.getNombre());
			lista.sort(cApe);
			System.out.println();
			System.out.println("***************LISTA ORDENADA POR APE-NOM***********");
			verList(lista);
			System.out.println("***************LISTA ORDENADA POR FECHA***********");
			// CALENDAR COMO SE USA PARA ORDENAR POR FECHAS.
			System.out.println("***************LISTA ORDENADA POR INSTANCIA***********");
			ordenarPorInstancia(lista);
			verList(lista);

			// orden Calendar ordenar

			// crear archivos pruebas
			archivosPruebas(lista);

			// crear participantes.dat archivo de objetos. Lectura y escritura de ois. s
			System.out.println("***************LISTA PARTICIPANTE .DAT***********");
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("participantes.dat"));
			oos.writeObject(lista);
			oos.close();
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("participantes.dat"));
			List<ParticipanteP2> aux = (List<ParticipanteP2>) ois.readObject();
			verList(aux);

		} catch (SAXException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DOMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// cargaSinXML si no pod�is leer los datos del fichero XML
		// cargaSinXML(lista);
	}

	private static void archivosPruebas(List<ParticipanteP2> lista) throws IOException {
		File f;
		borraFicheros(lista);
		for (ParticipanteP2 participanteP2 : lista) {
			f = cogerArchivo(participanteP2);
			escribirParticipante(f, participanteP2);

		}
		// FORMA SIN COMPARTAOR ORDENAR POR INSTANCIA
//		List<ParticipanteP2> listDepor = new ArrayList();
//		for (ParticipanteP2 participanteP2 : lista) {
//
//			f = cogerArchivo(participanteP2);
//			ordenarPorInstancia(lista);
//
//			if (participanteP2 instanceof EntrenadorP2)
//				escribirParticipante(f, participanteP2);
//			else {
//				listDepor.add(participanteP2);
//			}
//
//		}
//		for (ParticipanteP2 participanteP2 : listDepor) {
//			f= cogerArchivo(participanteP2);
//			escribirParticipante(f, participanteP2);
//		}
		
	}

	private static void ordenarPorInstancia(List<ParticipanteP2> lista) {
		Comparator<ParticipanteP2> tipo = (p1, p2) -> {
			return (p1 instanceof EntrenadorP2 && p2 instanceof DeportistaP2) ? -1
					: (p1 instanceof DeportistaP2 && p2 instanceof EntrenadorP2) ? 1 : p1.compareTo(p2);
		};
		lista.sort(tipo);
	}

	private static void escribirParticipante(File f, ParticipanteP2 participanteP2) throws IOException {
		FileWriter fw = new FileWriter(f, true);
		fw.write(participanteP2.toString() + "\n");
		fw.flush();
		fw.close();
	}

	private static File cogerArchivo(ParticipanteP2 participanteP2) throws IOException {
		File f;
		String prueba = participanteP2.getPrueba();
		if (Input.checkLinux()) {
			f = new File("files/" + prueba);
		} else {
			f = new File("files\\" + prueba);
		}
		if (!f.exists()) {
			f.createNewFile();
		}
		return f;
	}

	private static void borraFicheros(List<ParticipanteP2> lista) {
		File f;
		for (ParticipanteP2 participanteP2 : lista) {

			String prueba = participanteP2.getPrueba();
			if (Input.checkLinux()) {
				f = new File("files/" + prueba);

			} else {
				f = new File("files\\" + prueba);
			}
			f.delete();
		}
	}

	private static void verList(List<ParticipanteP2> lista) {
		for (ParticipanteP2 participanteP2 : lista) {
			if (participanteP2 instanceof DeportistaP2)
				System.out.println(participanteP2);
			if (participanteP2 instanceof EntrenadorP2)
				System.out.println(participanteP2);

		}
	}

	private static List<ParticipanteP2> cargaXML()
			throws SAXException, IOException, ParserConfigurationException, DOMException, ParseException {

		List<ParticipanteP2> lista = new ArrayList<>();

		// creamos el domFactory
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		File f;
		if (Input.checkLinux()) {
			f = new File("files/JJOOTokio2021.xml");
		} else {
			f = new File("files\\JJOOTokio2021.xml");
		}
		Document doc = dBuilder.parse(f);

		NodeList nListA = doc.getElementsByTagName("atleta");

		// recorremos los nodos de Atleta (deportistas) y los metemos en la lista
		for (int i = 0; i < nListA.getLength(); i++) {
			Node node = nListA.item(i);
			DeportistaP2 depAux = new DeportistaP2();
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element element = (Element) node;
				depAux.setPrueba(element.getElementsByTagName("prueba").item(0).getTextContent());
				depAux.setApellido(element.getElementsByTagName("apellido").item(0).getTextContent());
				depAux.setNombre(element.getElementsByTagName("nombre").item(0).getTextContent());
				depAux.setSexo(element.getElementsByTagName("sexo").item(0).getTextContent());

				// **Para tipo CALENDAR
//				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//				java.util.Date date = sdf.parse(element.getElementsByTagName("fecha").item(0).getTextContent());
//				Calendar cal = Calendar.getInstance();
//				cal.setTime(date);
//				depAux.setFecha_nac(cal);
				depAux.setFecha_nac(element.getElementsByTagName("fecha").item(0).getTextContent());

				depAux.setMarca(element.getElementsByTagName("marca").item(0).getTextContent());

				lista.add(depAux);
			}
		}
		// recogemos nodo entrenador
		NodeList nListE = doc.getElementsByTagName("entrenador");

		// recorremos los nodos de Atleta (deportistas) y los metemos en la lista
		for (int j = 0; j < nListE.getLength(); j++) {
			Node nodeE = nListE.item(j);
			EntrenadorP2 entreAux = new EntrenadorP2();

			if (nodeE.getNodeType() == nodeE.ELEMENT_NODE) {
				Element element = (Element) nodeE;
				entreAux.setPrueba(element.getElementsByTagName("prueba").item(0).getTextContent());
				entreAux.setApellido(element.getElementsByTagName("apellido").item(0).getTextContent());
				entreAux.setNombre(element.getElementsByTagName("nombre").item(0).getTextContent());
				entreAux.setNacionalidad(element.getElementsByTagName("nacionalidad").item(0).getTextContent());

				// **Para tipo CALENDAR
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//				java.util.Date date = sdf.parse(element.getElementsByTagName("fecha").item(0).getTextContent());
//				Calendar cal = Calendar.getInstance();
//				cal.setTime(date);
//				entreAux.setFecha_nac(cal);
				entreAux.setFecha_nac(element.getElementsByTagName("fecha").item(0).getTextContent());

				lista.add(entreAux);
			}
		}

		return lista;
	}

	public static void cargaSinXML(List<ParticipanteP2> lista) {
		/*
		 * SOLO HACE FALTA SI NO POD�IS LEER EL FICHERO XML Se trata de una matriz en la
		 * que por filas est�n los datos de cada participante. Hay de dos tipos. Unos
		 * tienen seis atributos y los otros cinco. Prueba, Apellido, Nombre, Sexo,
		 * Fecha nacimiento, Marca Prueba, Apellido, Nombre, Fecha nacimiento,
		 * Nacionalidad
		 * 
		 * Con los datos de la matriz se crean los objetos y se carga la lista
		 */
		String[][] datos = { { "60m", "RODR�GUEZ�SERRANO", "DANIEL", "M", "1995-01-01", "6.75" },
				{ "60m", "L�PEZ�BARRANCO", "SERGIO", "M", "1999-01-01", "6.86" },
				{ "400m", "HUSILLOS�DOMINGO", "�SCAR", "M", "1993-01-01", "46.22" },
				{ "400m", "GARC�A�CABRERA", "SAMUEL", "M", "1991-01-01", "47.02" },
				{ "400m", "BUA�DE�MIGUEL", "LUCAS", "M", "1994-01-01", "46.92" },
				{ "800m", "GARC�A�GARC�A", "MARIANO", "M", "1997-01-01", "1:47.63" },
				{ "800m", "S�NCHEZ-VALLADARES�GARC�A", "PABLO", "M", "1997-01-01", "1:48.43" },
				{ "800m", "DE�ARRIBA�L�PEZ", "�LVARO", "M", "1994-01-01", "1:49.99" },
				{ "1.500m", "G�MEZ�SANTIAGO", "JES�S", "M", "1991-01-01", "3:38.47" },
				{ "1.500m", "FONTES�GARC�A-BALIBREA", "IGNACIO", "M", "1998-01-01", "3:38.68" },
				{ "1.500m", "EL�KHAYAMI�EL�KOMIRY", "ABDERRAHMAN", "M", "1995-01-01", "3:49.34" },
				{ "3.000m", "MECHAAL�MECHAAL", "ADEL�", "M", "1990-01-01", "7:46.52" },
				{ "3.000m", "KATIR�EL�HAOUZI", "MOHAMED", "M", "1998-01-01", "7:49.72" },
				{ "3.000m", "GARC�A�GARRIDO", "GONZALO", "M", "1995-01-01", "7:59.09" },
				{ "60mv", "MART�NEZ�ECHARTE", "ASIER", "M", "2000-01-01", "7.61" },
				{ "60mv", "LLOPIS�DOM�NECH", "ENRIQUE", "M", "2000-01-01", "7.74" },
				{ "60mv", "SALORT�ASENSIO", "LU�S", "M", "1999-01-01", "7.97" },
				{ "60m", "P�REZ�RODR�GUEZ", "MAR�A�ISABEL", "F", "1993-01-01", "7.39" },
				{ "60m", "SEVILLA�L�PEZ-VIEJA", "PAULA", "F", "1997-01-01", "7.44" },
				{ "400m", "JIM�NEZ�HERN�NDEZ", "ANDREA", "F", "2001-01-01", "54.34" },
				{ "400m", "BOKESA�ABIA", "AAURI�LORENA", "F", "1988-12-12", "53.64" },
				{ "800m", "GARC�A�TENA", "DANIELA", "F", "2001-01-01", "2:04.14" },
				{ "1.500m", "P�REZ�MIGUEL", "MARTA", "F", "1993-01-01", "4:20.39" },
				{ "1.500m", "GUERRERO�PUIGDEVALL", "ESTHER", "F", "1990-01-01", "4:12.39" },
				{ "1.500m", "MU�OZ�MARQU�S", "�GUEDA", "F", "1999-01-01", "4:09.94" },
				{ "3.000m", "RODR�GUEZ�MONTERO", "LUC�A", "F", "1998-01-01", "8:53.90" },
				{ "3.000m", "GARC�A�ALONSO", "MARTA", "F", "1998-01-01", "9:02.00" },
				{ "3.000m", "FERN�NDEZ�DE�LA�GRANJA", "BLANCA", "F", "1992-01-01", "9:11.06" },
				{ "60mv", "ERRANDONEA�FERN�NDEZ�BARRENA", "TERESA", "F", "1994-01-01", "8.09" },
				{ "60mv", "JEREZ�CASTELLANOS", "CARIDAD", "F", "1991-01-01", "8.29" },
				{ "60mv", "BENACH�SOLE", "XENIA", "F", "2000-01-01", "8.22" },
				{ "Longitud", "DIAME�DIAME", "F�TIMA", "F", "1996-01-01", "6.57" },
				{ "Triple�Salto", "PELETEIRO�BRION", "ANA", "F", "1995-01-01", "14.52" },
				{ "Peso", "TOIMIL�FERN�NDEZ", "MAR�A�BEL�N", "F", "1994-01-01", "18.64" },
				{ "60m", "BOLT", "USAIN", "1986-08-21", "Jamaicana" },
				{ "400m", "PER�C", "MARIE-JOS�", "1968-05-09", "Francesa" },
				{ "800m", "COE", "SEBASTIAN", "1956-09-29", "Brit�nica" },
				{ "1.500m", "COE", "SEBASTIAN", "1956-09-29", "Brit�nica" },
				{ "3.000m", "KIPTANUI", "MOSES", "1970-10-01", "Keniata" },
				{ "60mv", "MORACHO TORRENTE", "JAVIER", "1957-08-18", "Espa�ola" },
				{ "Peso", "MART�NEZ", "MANUEL", "1974-12-07", "Espa�ola" },
				{ "Longitud", "DRECHSLER", "HEIKE", "1964-12-16", "Alemana" },
				{ "Triple Salto", "DRECHSLER", "HEIKE", "1964-12-16", "Alemana" } };

		// lista.add(new Clase (datos[][]));
	}

}
