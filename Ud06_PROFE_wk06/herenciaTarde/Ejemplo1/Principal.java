package Ejemplo1;

import java.util.Iterator;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Empleado e = new Empleado("Raúl",900);
		e.imprimeTodo();
		
		
		Jefe j = new Jefe("Gabi",2000,"Finanzas","Magisterio");
		j.imprimeJefe();
		j.imprimeTodo();
		
		
		Empleado[] vec = new Empleado[5];
		vec[0] = new Empleado("Santi",900);
		vec[1] = new Jefe("Alejandro",2000,"Finanzas","Magisterio");
		vec[2] = new Empleado("Santi",900);
		vec[3] = new Jefe("Rania",2000,"Finanzas","Magisterio");
		vec[4] = new Empleado("Luis",900);
		
		for (int i = 0; i < vec.length; i++) {
			vec[i].imprimeTodo();
		}
		
	}

}
