package Examen;

public class Ej_01_1 {
	
	public static void main(String[] args) {
		
		//introduce un num:
		int num = 6;
		
		
		
		//primera parte:
		for (int fila = 0; fila < num; fila++) {
			//espacios
			for (int j = 0; j < fila; j++) {
				System.out.print("  ");
			}
			System.out.println("**");
		}
		
		//segunda parte:
		for (int fila = 0; fila < num-1; fila++) {
			//espacios
			for (int j = num-2; j > fila; j--) {
				System.out.print("  ");
			}
			System.out.println("**");
		}
		
	}
	
	
	

}
