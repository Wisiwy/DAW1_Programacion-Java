package h2_tarde;

import java.util.ArrayList;
import java.util.List;

public class Pila {
	
	
	private List<Integer> pila;

	public Pila() {
		pila = new ArrayList();
	}
	
	public void apilar(int dato) {
		
		//pila.add(dato);
		pila.add(0, dato);
	}
	
	public int desapilar() {
		
		//pila.get(pila.size()-1);
		if(pila.size() > 0) {
			int dato = pila.get(0);
			pila.remove(0);
			return dato;
		}else {
			return -1;
		}
			
	}
	
	public int numElem() {
		return pila.size();
	}
	
	public void visualiza() {
		System.out.println("------");
		for(int num : pila) {
			System.out.printf("| %2d |\n------\n",num);
		}
		System.out.printf("      Hay %d elementos\n\n",numElem());
		
	}
	
	public int cima() {
		return pila.get(0);
	}
	
	
	
	
	

}
