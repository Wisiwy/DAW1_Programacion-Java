package aUtilidad;

import java.util.Arrays;

public class Dudas {

//	----------------CLASES---------------
//	Crear una id autoincremental:
	
//	Definir una id y un num sig que auto incremente
	private String nombre;
	private String tlfn;
	private Integer id;
	private static Integer sig;
	
//	En el constructor igualar el id a sig e incrementar sig
	public Dudas(String nombre, String tlfn) {
		this.nombre = nombre;
		this.tlfn = tlfn;
		this.id = sig;
		sig++;
	}
	
//	-----------------------------VALIDACION DE UN DOMINIO DETERMINADO EN UNA ENTRADA INTEGER
	
//	Integer tlfn;
//	String tlfnaux = null;
//	do {
//		tlfnaux = Leer.leerString("Intro tlfn");
//		if ((!Vali.esNum(tlfnaux)) || (tlfnaux.length() != 9))
//			System.err.println("Intro num de 9 cifras.");
//	} while ((!Vali.esNum(tlfnaux)) || (tlfnaux.length() != 9));
//	tlfn = Integer.parseInt(tlfnaux);

//	-----------------------------MATH RANDOM
//	Arrays.setAll(v5, (i) -> (int) (Math.random() * 100));  ///numero random del 1 al 100 
	
//	Arrays.setAll(vect1, i->(int)(Math.random()*5));  // castea a int y luego lo multiplica por 5 (random del 1-5)

}
