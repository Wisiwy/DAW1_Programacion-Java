package Api_SAX;

import java.io.*;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Lectura_SAX {
	
	//no se debe exhar un "throws" pero para no emborronar 
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		//instancia el SAX parser que llera el XML
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		
		SAXParser saxParser = saxParserFactory.newSAXParser();
		
		//para keer beceustanis 2 cosas:
			//1.archivo
		File f = new File("versiones.xml");
			//2.manejador ("handler")
		VersionesHandler handler = new VersionesHandler();
		
		saxParser.parse(f, handler);
		
		//coger la lista creada en el handler
		ArrayList<Version> versiones = handler.getVersiones();

		for (Version version : versiones) {
			System.out.println(version);
		}
		
	}

}
