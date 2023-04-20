package ejer3_alumno;

import java.util.*;

public class Pista {
	
	public static void main(String[] args) throws InterruptedException {
		
		int tope = 15;
		
		String semana[] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		
		
		Map<Integer,ArrayList<String>> mapa = new TreeMap();
		
		//número de tiradas -- 15
		//claves posibles del 1 -10
		
		for (int i = 1; i <= 15; i++) {
			
			System.out.println("\n\n--- Tirada: "+i);
			int key = (int)(Math.random()*10)+1;
			System.out.println("    clave: "+key);
			
			int d = (int)(Math.random()*semana.length);
			String dato = semana[d];
			
			System.out.println("     dato: "+dato);
			
			ArrayList<String> aux;
			if(mapa.containsKey(key)) {
				//si contiene la clave
				aux = mapa.get(key);
				System.out.println("    ++++ ya existe: aux "+aux+"]");
				Thread.sleep(2000);
			}else {
				aux = new ArrayList();
				System.out.println("    ---- instancio el array aux");
			}
			aux.add(dato);
			System.out.println("aux: "+aux);
			mapa.put(key, aux);
			Thread.sleep(3000);
			System.out.println("\n");
			for(Integer pos : mapa.keySet()) {
				
				System.out.println("Clave: "+pos);
				System.out.println("Valor: "+mapa.get(pos));
			}
			Thread.sleep(5000);
		}
		
		System.out.println("\n");
		for(Integer pos : mapa.keySet()) {
			
			System.out.println("Clave: "+pos);
			System.out.println("Valor: "+mapa.get(pos));
		}
		
		
		
	}

}
