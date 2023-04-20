
import java.io.File;
import java.lang.Object;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr_sLiDe
 */
public class EscrituraDOM {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.newDocument();

            // definimos el elemento raíz del documento
            Element eRaiz = doc.createElement("Versiones");
            doc.appendChild(eRaiz);

            // definimos el nodo que contendrá los elementos
            Element eVersion = doc.createElement("version");
            eRaiz.appendChild(eVersion);

            // atributo para el nodo version
            Attr attr = doc.createAttribute("numero");
            attr.setValue("10");
            eVersion.setAttributeNode(attr);

            // definimos cada uno de los elementos y le asignamos un valor
            Element eNombre = doc.createElement("nombre");
            eNombre.appendChild(doc.createTextNode("Adruito"));
            eVersion.appendChild(eNombre);

            Element eApi = doc.createElement("api");
            eApi.appendChild(doc.createTextNode("25"));
            eVersion.appendChild(eApi);

            // clases necesarias finalizar la creación del archivo XML
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            //lo pongo bonito insertando saltos de línea al final de cada línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            //Añadir 3 espacios delante, en función del nivel de cada nodo
            //transformer.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT, "3");
            
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("ejercicio3.xml"));

            transformer.transform(source, result);
          } catch(Exception e) {
            e.printStackTrace();
          }
    }
    
}
