package OBJETOS;

import java.util.Iterator;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_01 {
	
	public static void main(String[] args) {
		
		Alumno[] alumnos = new Alumno[50];
		carga(alumnos);	
		//mostrarAlumnos(alumnos);
		boolean menu = true;
		String[] s = {"Ver todos","Ver nombre","Ver edad","Incrementa edad"};
		
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				mostrarAlumnos(alumnos);
			}else if(o == 2) {
				
				int pos = Leer.leerEntero("Seleccion(1-"+alumnos.length+"): ");
				alumnos[pos-1].imprimirNombre();
				
			}else if(o == 3) {
				
				//mostrarAlumnos(alumnos);
				int pos = Leer.leerEntero("Seleccion(1-"+alumnos.length+"): ");
				alumnos[pos-1].imprimirEdad();
				
			}else if(o == 4) {
				
				int pos = Leer.leerEntero("Seleccion(1-"+alumnos.length+"): ");
				alumnos[pos-1].incrementarEdad();
				
			}else if(o == 0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
				
	}
	
	public static void mostrarAlumnos(Alumno[] alumnos) {
		System.out.println();
		for (int i = 0; i < alumnos.length; i++) {
			//System.out.println(alumnos[i].imprimirNombre()+alumnos[i].imprimirEdad());
			System.out.printf(" %2d n: %-10s  e: %d %n",i,alumnos[i].getNombre(),alumnos[i].getEdad());
		}
		System.out.println();
	}

	public static void carga(Alumno[] a) {
		
		String[] nom = {"Mar�a","Mariano","Pedro","Vicky","Jose","Raul","Andr�s","Erica","Azucena","Andrea","Margarita","Marta","Camila","Rocio","Saturnino","Eustaquio","Eliseo"};
		
		for (int i = 0; i < a.length; i++) {
			
			int pos = (int) (Math.random()*nom.length);
			String nombre = nom[pos];
			int edad = (int) (Math.random()*6)+20;
			
			//Alumno al = new Alumno(nombre,edad);
			//a[i] = al;
			a[i] = new Alumno(nombre, edad);
			
		}
		
	
	}

}
