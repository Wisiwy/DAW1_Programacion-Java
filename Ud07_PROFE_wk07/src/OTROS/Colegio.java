package OTROS;


import java.util.HashMap;

public class Colegio {

	private HashMap<String , Integer> n;

	public Colegio() {
		super();
		this.n = new HashMap<>();
	}
	
	public void addAlumno(String k) {
		k=k.toUpperCase();
		int aux =0;
		if (n.containsKey(k)) {
			aux = n.get(k);				
		}
		aux++;
		n.put(k, aux);

		
	}
	
	public void showAll() {
		//this.n.forEach((k,v)->System.out.printf("%15s %02d \n",k,v));
		for(String k : n.keySet())
			System.out.printf("%15s %02d \n",k,n.get(k));
	}
	
	public void showNacionalidad(String k) {
		k=k.toUpperCase();
		if (n.containsKey(k)) {
			System.out.printf("%15s %02d \n",k,n.get(k));		
		}
		
		
	}
	public int cuantos() {
		int num=n.size();
		
		return num;
		
	}
	public void borra() {
		n.clear();
	}
}
