package ejer_Estaticos_profe;

import java.util.Iterator;

import aUtilidad.Leer;
import aUtilidad.Vali;


public class Ej_04 {
	
	public static void main(String[] args) {
		
		
		String str = Leer.leerString("Introduce num: ");
		
		if(Vali.esNum(str)) {
			
			int num = Integer.parseInt(str);
			
			if(num > 0) {
				System.out.print("\n primos: ");
				for(int i=1 ; i <= num ; i++) {
					if(Vali.esPrimo(i))
						System.out.print(i+" ");
				}
			}
			
		}
		
	}

}
