/*Escriba un programa que calcule la 
cantidad total de segundos a partir de horas,
minutos y segundos pedidos al usuario.*/
package Repaso;
import java.util.*;

public class Ej_05 {
	
	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
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
		
		teclado.close();
	}

}
