package wk_07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class EjemploMap {
	
	public static void main(String[] args) {
		
		Map<Integer,String> mapa = new HashMap();
		//Map<Integer,String> mapa = new TreeMap();
		
		
		mapa.put(1, "Lunes");
		mapa.put(5, "Viernes");
		mapa.put(3, "Miercoles");
		mapa.put(2, "Martes");
		mapa.put(4, "Jueves");
		mapa.put(6, "Domingo");
		
		mapa.remove(6);
		
		if(mapa.remove(4, "dfgsd"))
			System.out.println("Se ha eliminado el jueves.");
		
		//recorrer el mapa
		Iterator<Integer> it = mapa.keySet().iterator();
		while(it.hasNext()) {
			int clave = it.next();
			System.out.println(mapa.get(clave));
		}
		
		if(mapa.containsKey(4)) {
			mapa.remove(4);
		}
		
		
		Iterator<Integer> it2 = mapa.keySet().iterator();
		while(it2.hasNext()) {
			Integer clave = it2.next();
			String valor = mapa.get(clave);
			System.out.println(clave+" -- "+valor);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
