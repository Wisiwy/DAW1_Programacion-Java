package zProfe;

public class Ej_20 {
	
	
	public static void main(String[] args) {
		
		int num= 8;
		
		if(esPrimo(num)==true) {
			System.out.println("Es primo");
		}else {
			System.out.println("No es primo");
		}
	}
	
	public static boolean esPrimo(int num) {
		
		for(int n=2 ; n<num ; n++) {
			if(num%n==0) {
				return false;
			}
		}
		return true;
	}
	
	

}
