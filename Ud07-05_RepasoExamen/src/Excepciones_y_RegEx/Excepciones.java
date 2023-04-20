package Excepciones_y_RegEx;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {

		// **Intro LETRA o repite**//
		double dato = 0;
		boolean pedir = true;
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.println("Numero: ");
				dato = t.nextDouble(); // Pide dato y si es marcamos a false
				pedir = false; // Se ha cumplido y cambiamos para salir whili
			} catch (InputMismatchException e) {
				// Si intro otro que no doble la excepcion es lanzada y la recoge catch
				System.out.println("No es un num double" + e.getMessage());
			}
		} while (pedir); // Mientras pedir true

		//**Pedir 5 VECES o hasta numero no valido**//
		int suma = 0;
		int cont = 0;
		do {
			try {
				Scanner t = new Scanner(System.in);
				System.out.println("Numero: ");
				dato = t.nextDouble();
				suma+=dato;
				cont++; //Aumentamos contador al 6 sale while.
			} catch (Exception e) {
				// Si intro otro que no doble la excepcion es lanzada y la recoge catch
				System.out.println("No es un num double" + e.getMessage());
				System.out.println("Suma hasta ahora: " + suma);
				cont = 6; // Igualamos a 6 para salir.
			}
		} while (cont<6); 
		
		
		//**EXCEPCION PERSONALIZADA y en clase Persona definimos cuando ose tira (en .setEdad < 0)
		PersonaExc p;
		try {
			p = new PersonaExc("Raul", -5); //En Persona se define si es negativa lanza excepcion
		} catch (EdadMalExceptionPersonalizada e) {
			System.out.println(e.getMessage());		}
		
		
		//**EXCEPCION con MENSAJE PERSONALIZADO: Comprueba longitud 
		boolean com = false;
		do {
			try {
				System.out.println("Intro una cadena: ");
				Scanner t = new Scanner(System.in);
				String cad = t.nextLine();
				compruebaLongitud(cad);
				com = true;
			} catch (StringTooLongException e) {
				System.err.println(e.getMessage());

			}
		} while (com == false);
		
		
		
	}

	
	private static void compruebaLongitud(String cad) throws StringTooLongException {
		if (cad.length() < 2)
			//Construimos el mensaje de la excepción con la cadena metida por usuario y 
			//el mensaje de la razon.
			throw new StringTooLongException(cad, "es menor de 2"); 
	}
}
