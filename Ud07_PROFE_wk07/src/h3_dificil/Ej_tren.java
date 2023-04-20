package h3_dificil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

public class Ej_tren {
	
	
	public static void main(String[] args) {
		
		
		Tren t1 = new Tren("16:35","Delicias (Zaragoza)","Atocha (Madrid)");
		t1.anadeVagon();
		t1.anadeVagon();
		
		t1.pintar();
		
		t1.venderBillete();
		
		
		//Anular
			//Pintar trenes
			//preguntar al usuario de que tren quiere borrar  --dato1
			
			//pintamos el tren
			//preguntar al usuario de que vagón               --dato2
		
			//pintamos el vagon
			//preguntar al usuario que asiento es             --dato3
		
			//estacion.get(dato1).getVagones(dato2).get(dato3)
			//estacion.get(dato1).getVagones(dato2).anular(dato3)
		
		//Anular String  numBillete -> 00100203
		//String numBillete = "00100203";
		//String dato1 = numBillete.substring(0,3);
		//System.out.println("dato1: "+dato1);
		
		//Anular int
		
		
		//array
		/*ArrayList<Tren> estacion = new ArrayList();
		estacion.add(t1);
		
		//set
		HashSet<Tren> estacion2 = new HashSet();
		estacion2.add(t1);
		
		//map
		TreeMap<Integer,Tren> estacion3 = new TreeMap();
		estacion3.put(t1.getNumTren(), t1);*/
		
		
 	}
	
	

}
