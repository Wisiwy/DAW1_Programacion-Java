package Repaso;

import java.util.Scanner;

public class Ej_06 {
	
	public static void main(String[] args) {
		
		Scanner teclado=new Scanner (System.in);
		
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
		teclado.close();
	}

}
