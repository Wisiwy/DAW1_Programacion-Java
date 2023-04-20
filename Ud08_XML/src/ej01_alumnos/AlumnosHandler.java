package ej01_alumnos;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class AlumnosHandler extends DefaultHandler {

	private Alumno alumno;
	private StringBuilder buffer = new StringBuilder();
	private ArrayList<Alumno> alumnos = new ArrayList();

	/**
	 * @return the alumnos
	 */
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	///////////////////
	// Metodos heredados de "DefaultHandler"

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch (qName) {
		case "alumno":
			alumno = new Alumno();
			alumnos.add(alumno);
			alumno.setId(Integer.parseInt(attributes.getValue("id")));
			break;
		case "nombre":
		case "edad":
			buffer.delete(0, buffer.length());

			break;

		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {

		switch (qName) {
		case "alumno":
			break;
		case "nombre":
			alumno.setNombre(buffer.toString());
			break;
		case "edad":
			alumno.setEdad(Integer.parseInt(buffer.toString()));
			break;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		buffer.append(ch, start, length);
	}

}
