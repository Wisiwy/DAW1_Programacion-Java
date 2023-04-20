package H1_sencillos;

import java.util.Iterator;
import java.util.TreeMap;

public class Repaso {
	
	public static void main(String[] args) {
		
		
		TreeMap<Integer,String> mapa = new TreeMap();
		
		mapa.put(2, "Martes");
		mapa.put(5, "Viernes");
		mapa.put(1, "Lunes");
		mapa.put(3, "Miercoles");
		
		Iterator<Integer> it = mapa.keySet().iterator();
		while(it.hasNext()) {
			Integer clave = it.next();
			String valor = mapa.get(clave);
			System.out.printf("Clave: %2d Valor: %s \n",clave,valor);
		}
		
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s");
		mapa.put(4, "Jueves");
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s");
		mapa.put(5, "V13rn3s4");
		
		System.out.println();
		for(Integer c : mapa.keySet()) {
			String valor = mapa.get(c);
			System.out.printf("Clave: %2d Valor: %s \n",c,valor);
		}
		
		if(mapa.containsKey(3)) {
			String valor = mapa.get(3);
			System.out.println("Valor: "+valor);
			valor = valor.toUpperCase();
			System.out.println("Valor: "+valor);
			
			mapa.put(3, valor);
		}
		
		System.out.println();
		mapa.forEach((a,b)->System.out.printf("Clave: %2d Valor: %s \n",a,b));
		
	}

}
