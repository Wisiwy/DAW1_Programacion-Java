package Ejer9;

import java.util.Arrays;
import java.util.Iterator;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//vector de personas
		Persona[] vector = new Persona[6];
		
		vector[0] = new Alumno(19,"Alejandro","45678912J",2231);
		vector[1] = new Persona(18,"Miguel","47178912J");
		vector[2] = new Profe(21,"Pedro","42778912J","Matemáticas");
		vector[3] = new Alumno(20,"Lucia","45678912J",2231);
		vector[4] = new Persona(20,"Carlota","78478912J");
		vector[5] = new Profe(19,"Teresa","43678912J","Valores");
		
		Arrays.sort(vector,null);
		
		
		for (int i = 0; i < vector.length; i++) {
			vector[i].imprimeDatos();
		}
		
		
	}

}
