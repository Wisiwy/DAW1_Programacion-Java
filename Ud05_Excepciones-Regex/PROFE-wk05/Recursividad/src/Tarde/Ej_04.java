package Tarde;

public class Ej_04 {
	
	static String[] v = {"Bulbasaur","Squirtle","Mewtwo","Sudowoodo","Gengar"};
	
	public static void main(String[] args) {
		
		String pat = "Gengar";
		
		buscaRecursiva(0,pat);
		
	}
	
	public static void buscaRecursiva(int p, String patron) {
		
		//if(v[p].compareTo(patron)==0 || p == v.length) { //Falla por ordenarlo del revés
		if( p == v.length || v[p].compareToIgnoreCase(patron)==0 ) {
			
			if( p == v.length)
				System.out.println("No lo encunentro.");
			else 
				System.out.println("He encontrado "+patron+" en la posicion "+p+"/"+(v.length-1));
		/*if( p == v.length-1 || v[p].compareToIgnoreCase(patron)==0 ) {
			if(v[p].compareToIgnoreCase(patron)==0) 
				System.out.println("He encontrado "+patron+" en la posicion "+p+"/"+(v.length-1));
			else
				System.out.println("No lo encunentro.");*/
			
		}else {
			buscaRecursiva(p+1,patron);
		}
		
		
	}

}
