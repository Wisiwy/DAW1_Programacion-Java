package teoria_StringsArrays;

import java.util.Scanner;

public class TecladoNext {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		/************************ENTENDER EL TECLADO************************/
		
		System.out.println("Numero: ");
		int i1 = Integer.parseInt(teclado.nextLine());
		System.out.println(i1);
		//ignora el String recoge solo el int. 
		
		System.out.println("nombre1: ");
		String n1 = teclado.next();
		//coge hasta el primer espacio, deja residuo buffer
		
		
		System.out.println("nombre2: ");
		String n3 = teclado.nextLine();
		//Recoge todo el buffer si no esta vacio lo usa. Si meto un enter lo guarda 
		//Usarlo siempre para asegurar vaciar el buffer. Limpia buffer
		
		System.out.println("nombre3: ");
		int n4 = teclado.nextInt();
		//nest int recoge el entero (int), deja residuo buffer
		
		//intro nombre1 (str)
	}

}
