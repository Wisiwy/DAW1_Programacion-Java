package ejer_Estaticos;

import aUtilidad.Leer;

public class Ej04_listaPrimos {

	public static void main(String[] args) {
		
		System.out.println("------LISTA DE PRIMOS------");
		System.out.println("---------------------------");
		
		int n = Leer.leerIntPosi("Intro n�:");
		listaPri(n);
		
	}

	private static void listaPri(int n) {
		int div = 2;
		while (n > 1) {
			if (n%div==0){
				//Con simbolo negativo alineo a la izq
				System.out.printf(" %3d | %-2d \n",n, div); 
				n = n / div;				
			}else {
				div++;
			}

		}
		System.out.printf(" %3d | %-2d \n",n, div);
		
		
	}

}
