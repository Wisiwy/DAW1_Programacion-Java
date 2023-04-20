package zProfe;

import java.util.Scanner;

public class Ej_08 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		boolean menu = true;
		
		while(menu) {
			
			System.out.println("Menu:   ");
			System.out.println("-------------------------\n");
			
			System.out.println("  1 - Horas a Segundos");
			System.out.println("  2 - Segundos a Horas");
			System.out.println("  0 - Salir");
			System.out.print("\n Opcion: ");
			
			int valor = teclado.nextInt();
			
			if(valor == 1) {
				//horas a segundos
				int h,m,s;
				
				System.out.print("Dame horas: ");
				h=teclado.nextInt();
				
				System.out.print("Dame minutos: ");
				m=teclado.nextInt();
				
				System.out.print("Dame segundos: ");
				s=teclado.nextInt();
				
				//h=h*60;
				//h=h*60*60;
				//m=m*60;
				
				System.out.println(h+" : "+m+" : "+s);
				System.out.println("La cantidad total en segundos es "+(s+m*60+h*3600));
				
			}else if (valor == 2) {
				//segundos a horas
				System.out.println("CALCULA TUS HORAS A PARTIR DE SEGUNDOS");
				
				System.out.print("�Cu�ntos segundos me das? ");
				int total=teclado.nextInt();
				
				
				int min=total/60;
				int seg=total%60;
				
				if (min>59) {
					int hor=min/60;
					min=min%60;
				
					System.out.println("Esto es lo mismo que decir "+ hor+" horas, "+min+" minutos y "+seg+" segundos");
				} else {
				
					System.out.println("Esto es lo mismo que decir "+min+" minutos y "+seg+" segundos");
				}
			}else if (valor == 0){
				System.out.println("Salir del programa");
				menu = false;
			}else {
				System.err.println("Opcion no valida.");
			}
			
		}
	
	teclado.close();
	}//fin del main

}
