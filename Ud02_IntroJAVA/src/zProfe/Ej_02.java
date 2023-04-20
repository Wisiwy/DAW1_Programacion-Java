package zProfe;

import java.util.Scanner;

public class Ej_02 {
	public static void main(String[] args) {
		
		
		//positivo, cero o negativo
		Scanner teclado = new Scanner(System.in);
		
		//pido datos
		System.out.print("Introduce num: ");
		int num = teclado.nextInt();
		
		
		//////////////////////////
		if( num > 0) {
			System.out.println("Es positivo");
		}
		
		if( num == 0) {
			System.out.println("Es cero");
		}
		
		if( num < 0) {
			System.out.println("Es negativo");
		}
		////////////////////////////
		
		if( num > 0) {
			System.out.println("Es positivo");
		}else {
			
			if( num == 0) {
				System.out.println("Es cero");
			}else {
				System.out.println("Es negativo");
			}
			
		}
		
		/////////////////////////
		
		if( num > 0) {
			System.out.println("Es positivo");
		}else if( num == 0) {
			System.out.println("Es cero");
		}else {
			System.out.println("Es negativo");
		}
		
		teclado.close();
	}

}
