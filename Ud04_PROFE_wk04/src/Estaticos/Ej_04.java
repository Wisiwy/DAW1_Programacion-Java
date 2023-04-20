package Estaticos;

import java.util.Iterator;

public class Ej_04 {
	
	public static void main(String[] args) {
		
		
		String str = Leer.leerCadena("Introduce num: ");
		
		if(Utilidad.esNum(str)) {
			
			int num = Integer.parseInt(str);
			
			if(num > 0) {
				System.out.print("\n primos: ");
				for(int i=1 ; i <= num ; i++) {
					if(Utilidad.esPrimo(i))
						System.out.print(i+" ");
				}
			}
			
		}
		
	}

}
