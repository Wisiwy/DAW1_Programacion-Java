package ejer_StringsArrays;

import java.util.Scanner;

//Hacer un programa que pida dos nombres y te diga si son iguales.  
//Si son distintos los muestra ordenados.  
//Finalmente muestra los dos nombres en may�sculas y en min�sculas.
public class ejer12_nomOrden {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		//intro nombre1 (str)
		String str = " ";
		do {
			System.out.println("Introduce nombre1: ");
			str = teclado.nextLine();
			
			
			if (str == "" && str.length() == 80)
				System.err.println("Error, introduce otro texto.");
		} while (str == "" && str.length() == 100);
		
		//quitamos espacios
		str = str.replace(" ", "");
		
		//intro nombre2 (str2)
		String str2 = " ";
		do {
			System.out.println("Introduce nombre2: ");
			str2 = teclado.nextLine();
			if (str2 == "" && str2.length() == 80)
				System.err.println("Error, introduce otro texto.");
		} while (str2 == "" && str2.length() == 100);
		//quitamos espacios
		str2 = str2.replace(" ", "");
		
		//comparar y ordenar: Usar "compare to" para Strings
		if (str.compareTo(str2)>0) { //compareToIgnoreCase(n2) = ignorar mayus
			System.out.println(str2 + " " + str);
			System.out.println(str2.toUpperCase() +" " + str.toUpperCase());
			System.out.println(str2.toLowerCase() +" " + str.toLowerCase());
		}else if (str.compareTo(str2)<0) {
			System.out.println(str + " " + str2);			
			System.out.println(str.toUpperCase() +" " + str2.toUpperCase());
			System.out.println(str.toLowerCase() +" " + str2.toLowerCase());
		}else {
			System.out.println(str + " igual a " + str2);			
					}
		//mayusculas
			
		
	}

}
