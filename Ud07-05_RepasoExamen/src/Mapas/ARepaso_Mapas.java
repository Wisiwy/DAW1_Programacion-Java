package Mapas;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ARepaso_Mapas {

	public static void main(String[] args) {
		Map<Integer, String> mapa = new TreeMap();
		mapa.put(1, "Lunes"); //Añadir valores en TreeMap
		mapa.put(3, "Miercoles");
		mapa.put(2, "Martes");
		mapa.remove(2);
		String valor = mapa.get(2); //Acceder valor con key (clave)
	
		//**CONTAINS KEY
			//Verificar si el TreeMap tiene la clave. 
		if(mapa.containsKey(5))
			System.out.println("Valor de 5: "+mapa.get(5));
		else
			System.out.println("No existe clave");
		
		//**RECORRER MAPA
			//Iterator
		Iterator<Integer> it = mapa.keySet().iterator();
		while(it.hasNext()) {
			Integer clave = it.next(); //%Cuidado no usar dos .next() en mismo bucle. Avanza 2 %//
			valor = mapa.get(clave); //Recoge valor en la clave indicada. 
			System.out.println("Clave: " + clave + " Valor: "+ valor);
		}
			//ForEach con KeySet
		for (Integer key : mapa.keySet()) {
			System.out.printf("Clave: %d  Valor: %s \n",key,mapa.get(key));
		}
		
		
	}

}
