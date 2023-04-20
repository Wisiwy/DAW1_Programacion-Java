package h2_ejer01;

import java.util.ArrayList;
import java.util.List;

public class Pila {
	
	
	
	
	
	private List<Integer> pila ;
		
	public Pila() {
		this.pila = new ArrayList();
	}
	
	
	public void apilarCima(int d){
		
//		this.pila.add((pila.size(), d);
		this.pila.add(0, d); //PROFE
	};
	

	
	
	
	public int desapilarCima() {
		
//		this.pila.remove((pila.size()-1)); //YO
		if (pila.size() > 0 ) {
			int dato = pila.get(0);
			pila.remove(0);
			return dato;
		}else 
			return -1; //devuelve un error, no hay elementos
		
	};
	public int numElementos() {
		return this.pila.size();
	};
	
	
	public void visualiza() {
//		for (Integer i: pila) {
//			System.out.println(lista);
//		}  //YO
		System.out.println("------");
		for (Integer num : pila) {
			System.out.printf("| %2d |\n ------ \n ",num);
		}
		System.out.println("------");
		
		
	}
}
