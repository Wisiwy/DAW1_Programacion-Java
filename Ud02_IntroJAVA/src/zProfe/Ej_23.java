package zProfe;

import java.util.Scanner;

public class Ej_23 {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Valor: ");
		int tope=scanner.nextInt();
		
		
		
		for(int fila=1 ; fila <=tope ; fila++) {
			for(int col=1 ; col <= tope ; col++) {
				System.out.print(" *");
				//System.out.print(" "+cont);
				//System.out.printf(" f:%2d c:%2d ",fila,col);
				
			}
			System.out.println();
		}
		
	}
}
