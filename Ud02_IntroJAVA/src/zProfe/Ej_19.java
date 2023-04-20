package zProfe;

import java.util.Scanner;

public class Ej_19 {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Valor: ");
		int num=scanner.nextInt();
		
		System.out.print("El inverso de " + num + " es: ");
		
		int cociente;
		do {
			cociente = num/10;
			int resto = num%10;
			System.out.print(resto);
			
			if(cociente < 10)
				System.out.println(cociente);
			else
				num = cociente;
			
		}while(cociente >= 10);
		
	}
	

}
