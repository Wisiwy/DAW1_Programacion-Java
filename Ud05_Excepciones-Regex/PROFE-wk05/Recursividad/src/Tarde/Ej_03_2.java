package Tarde;

public class Ej_03_2 {
	
	static String[] v = {"Bulbasaur","Squirtle","Mewtwo","Sudowoodo","Gengar"};
	
	public static void main(String[] args) {
		
		recorrerVector(v.length-1);
	}
	
	public static void recorrerVector(int p) {
		
		
		if(p == 0) {
			System.out.println(v[p]);
		}else {
			System.out.println(v[p]);
			recorrerVector(p-1);
		}
		
		
	}

}
