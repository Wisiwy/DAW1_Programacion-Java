package ejer_ClasesYObj;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Ej01_Alumno_Main {

	public static void main(String[] args) {
		
		Dibujo.titulo("ALUMNOS");
//		Creamos y llenamos array de Alumnos.
		Alumno lista[] = new Alumno[3];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = new Alumno();
			lista[i].setNombre(Leer.leerString("Intro nombre alumno["+(i+1)+"]: ")); 
			lista[i].setApellido(Leer.leerString("Intro apellido alumno["+(i+1)+"]: ")); 
			lista[i].setEdad(Leer.leerInt("Intro edad alumno["+(i+1)+"]: ")); 
			System.out.println();
			
		}
//		Pintamos array. 
		for (int i = 0; i < lista.length; i++) {
			System.out.printf ("%02d -%s %n",i,lista[i].toString());
		}
		System.out.println();
		
//		Selecionamos y cambiamos parametros alumno elegido.
		int select = Leer.leerInt("Elige alumno a cambiar: ");
		
		for (int i = 0; i < lista.length; i++) {
			lista[select].setNombre(Leer.leerString("Nuevo nombre:" ));
			lista[select].setApellido(Leer.leerString("Nuevo apellido:" ));
			lista[select].setEdad(Leer.leerInt("Nueva edad:" ));
			
			i = lista.length;
			
		}
		
		for (int i = 0; i < lista.length; i++) {
			System.out.printf ("%02d-%s.%n",i,lista[i].toString());
		}
		System.out.println();
		

		
		
		
	}
	
	
}
