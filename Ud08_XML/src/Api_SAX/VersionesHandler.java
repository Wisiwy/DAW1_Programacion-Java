package Api_SAX;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class VersionesHandler extends DefaultHandler {

	private Version version;
	// clase para construir los datos del XML a partir del lector
	private StringBuilder buffer = new StringBuilder();
	private ArrayList<Version> versiones = new ArrayList();

	public ArrayList<Version> getVersiones() {
		return versiones;
	}

	////// ************************
	// METODOS HEREDADOS DE "DefaultHandler"
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		switch (qName) {
		/*case "versiones":
			break;  **no lo empleamos en este caso*/
		case "version":
			version = new Version();
			versiones.add(version);
			double num = Double.parseDouble(attributes.getValue("numero")); 
			version.setNumero(num);
			break;
		case "nombre":
			buffer.delete(0, buffer.length());
			break;
		case "api":
			buffer.delete(0, buffer.length());
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		switch (qName) {
		/*case "versiones":
			break;  **no lo empleamos en este caso*/
		case "version":
			break;
		case "nombre":
			version.setNombre(buffer.toString());
			break;
		case "api":
			version.setApi(Integer.parseInt(buffer.toString()));
			break;
		}
	
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		buffer.append(ch, start, length);
	}

}
