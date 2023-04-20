package teoria;

import Estaticos.Leer;

public class Ej {
	
	public static void main(String[] args) {
		
		
		
		
		int num;
		
		do {
			num = Leer.leerEntero("num: ");
			
			if(num <= 0)
				System.out.println("introduce un numero positivo");
			
		}while(num <= 0);
	}

}
