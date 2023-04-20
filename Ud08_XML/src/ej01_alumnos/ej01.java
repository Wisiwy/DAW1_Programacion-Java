package ej01_alumnos;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ej01 {

	/**
	 * Leer el archivo alumnos.xml y sacar el listaod de alumnos formateado.
	 * 
	 * @throws SAXException
	 * @throws ParserConfigurationException
	 * @throws IOException
	 */
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		SAXParser saxParser = saxParserFactory.newSAXParser();

		File f = new File("alumnos.xml");
		AlumnosHandler handler = new AlumnosHandler();

		saxParser.parse(f, handler);

		ArrayList<Alumno> alumnos = handler.getAlumnos();

		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}

	}

}
