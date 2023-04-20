package Tarde;

public class Ej_03_1 {
	
	static String[] v = {"Bulbasaur","Squirtle","Mewtwo","Sudowoodo","Gengar"};
	
	public static void main(String[] args) {
		
		recorrerVector(0);
	}
	
	public static void recorrerVector(int p) {
		
		
		if(p == v.length-1) {
			System.out.println(v[p]);
		}else {
			System.out.println(v[p]);
			recorrerVector(p+1);
		}
		
		
	}

}
