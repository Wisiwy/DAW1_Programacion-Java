package Examen;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class GomezSanaEx4 {

	public static void main(String[] args) {

	Dibujo.titulo("CREAR PERSONAS");
	
//	-----------------ALE POR SI QUIERES INTRODUCIRLOS TU MISMO. pERDIDA DE TIEMPO
//	System.out.println("Como te llamas: ");
//	Datos dataux = new	Datos(Leer.leerString("Nombre: "),Leer.leerString("Ape1: "),Leer.leerString("Ape2: ")) ;
//		
//	System.out.println("Donde vives?: ");
//	Direccion direcaux = new Direccion (Leer.leerString("Calle: "),Leer.leerInt("Num: "),Leer.leerInt("CP: "),Leer.leerString("Ciudad: "),Leer.leerString("Poblacion: ")) ;
//	
	String nom = "daniel";
	String ape1 = "val";
	String ape2 = "Perez";
	
	Datos dat1 = new Datos(nom, ape1, ape2);
	Datos dat2 = new Datos("Jorge", "Guti", "Madre");
	System.out.println(dat1.toString());
	
	Direccion dir1 = new Direccion("C/El olivo", 25, 50004,"Zaragoza","Zaragoza" );
	Direccion dir2 = new Direccion("C/El abedul", 35, 50204,"Soria","Soria" );
	
	Persona per1 = new Persona(dat1,dir1);
	Persona per2 = new Persona(dat2,dir2);
	
	
	System.out.println(dat1.toString());
	System.out.println(dir1.toString());
	System.out.println();
	System.out.println(dat2.toString());
	System.out.println(dir2.toString());
	}
	
	
}
