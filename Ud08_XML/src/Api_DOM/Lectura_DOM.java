package Api_DOM;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.*;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Lectura_DOM {
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(new File("versiones.xml"));
		
		//normalizar el documento
		doc.getDocumentElement().normalize(); //identar el documento, dejarlo apañado
		
		NodeList nList = doc.getElementsByTagName("version"); //recoge todas las estructuras de version.
		System.out.println("Hay "+nList.getLength()+" elementos.");
		for (int i = 0; i < nList.getLength(); i++) {
			
			Node node = nList.item(i); //recogemos los nodes de la lista
			
			 if(node.getNodeType()==Node.ELEMENT_NODE) { //coger el node y castearlo a elemento
				 Element element= (Element) node;
				 System.out.println("\nVersion id= " + element.getAttribute("numero"));
				 System.out.println("Nombre: " + element.getElementsByTagName("nombre").item(0).getTextContent());
				 System.out.println("Nombre: " + element.getElementsByTagName("api").item(0).getTextContent());
			 }
		}
		
		
	}


}
