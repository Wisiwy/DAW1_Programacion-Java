package Examen;

public class Ej_01_2 {
	
	public static void main(String[] args) {
		
		
		//introduce un número:
		int num = 5;
		int filas = (num*2)-1;
		
		
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < num; j++) {
				
				
				if(j<i)
					System.out.print("  ");
				
				if(i==j || i-5 == 5-num)
					System.out.println("**");
				
			}
			
		}
		
	}

}
