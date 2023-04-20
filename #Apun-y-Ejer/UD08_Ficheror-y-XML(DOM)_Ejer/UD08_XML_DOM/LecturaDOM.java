
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mr_sLiDe
 */
public class LecturaDOM {
    
    public static void main(String[] args) {
        File file = new File("versiones.xml");
        
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            
            // estos métodos podemos usarlos combinados para normalizar el archivo XML
            doc.getDocumentElement().normalize();
            
            // almacenamos los nodos para luego mostrar la
            // cantidad de ellos con el método getLength()
            NodeList nList = doc.getElementsByTagName("version");
            System.out.println("Número de versiones: " + nList.getLength());
            
            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) nNode;

                  System.out.println("\nVersion id: " + eElement.getAttribute("numero"));
                  System.out.println("Nombre: "
                              + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                  System.out.println("api: "
                              + eElement.getElementsByTagName("api").item(0).getTextContent());
                }
              }
            
          } catch(Exception e) {
            e.printStackTrace();
          }
    }
    
}
