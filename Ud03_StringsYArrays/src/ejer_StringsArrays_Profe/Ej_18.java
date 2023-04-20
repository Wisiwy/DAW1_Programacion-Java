package ejer_StringsArrays_Profe;

import aUTILIDAD.Leer;

public class Ej_18 {
	
	public static void main(String[] args) {
		
		int cont =0, rondas = 10;
		for (int i = 1; i <= rondas; i++) {
			
			int n1 = (int) (Math.random()*9)+1;
			int n2 = (int) (Math.random()*9)+1;
			
			//System.out.printf("Ronda %d: %2d x %2d = ",i,n1,n2);
			System.out.println("Ronda "+i);
			
			int resp;
			
			resp = Leer.leerInt(String.format(" %2d x %2d = ",n1,n2));
			
			if(resp == (n1*n2))
				cont++;
			else
				do {
					resp = Leer.leerInt(String.format(" %2d x %2d = ",n1,n2));
				}while(resp != (n1*n2));
			
			System.out.println();
			
		}
		
		System.out.printf("Tu puntuaci�n: %d/%d",cont,rondas);
	}

}
