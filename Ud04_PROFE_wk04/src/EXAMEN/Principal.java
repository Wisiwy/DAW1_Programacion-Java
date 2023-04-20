package EXAMEN;

import Estaticos.Leer;

public class Principal {
	
	public static void main(String[] args) {
		
		
		int valor = Leer.leerEntero("Valor de altura: ");
		
		int num1=(valor * 2) /2;
		int num2=num1+1;
		int num3=(valor * 2) /2;
		int num4=num3+1;
		
		for (int fila = 1; fila <= valor; fila++) {
			for (int col = 1; col <= valor*2; col++) {
				if(num1 == col || num2 == col || num3 == col || num4 == col)
					System.out.print("*");
				else
					System.out.print(" ");
				
				
			}
			System.out.println();
			num1--;
			num2--;
			num3++;
			num4++;
		}
		
		//System.out.printf("%d %d %d %d",num1,num2,num3,num4);
		
	}

}
