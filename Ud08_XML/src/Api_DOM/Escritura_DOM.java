package Api_DOM;

import java.io.File;

import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Escritura_DOM {

	public static void main(String[] args) throws ParserConfigurationException, TransformerException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		//diferencia entre leer y escribir, se crea no se parse
		Document doc = db.newDocument();
		
		//raiz
		Element eRaiz= doc.createElement("VERSIONES");
		doc.appendChild(eRaiz);
		
		//definimos el nodo qeu contiene elementos
		Element eVer = doc.createElement("VERSION");
		eRaiz.appendChild(eVer);
		
		//definimos el atributo
		Attr aVer = doc.createAttribute("numero");
		aVer.setValue("10");
		eVer.setAttributeNode(aVer);
		
		//definimos elementos
		Element eNombre = doc.createElement("NOMBRE");
		eNombre.appendChild(doc.createTextNode("Andruino"));
		eVer.appendChild(eNombre);
		
		Element eApi = doc.createElement("API");
		eApi.appendChild(doc.createTextNode("142"));
		eVer.appendChild(eApi);
		
		//generar xml
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer t = tf.newTransformer();
		//**darle formato
		t.setOutputProperty(OutputKeys.INDENT,"yes");
		
		DOMSource source = new DOMSource(doc);
		StreamResult result = new StreamResult(new File("versiones_DOM.xml"));
		t.transform(source, result);
		
		
	}

}
