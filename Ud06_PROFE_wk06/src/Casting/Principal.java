package Casting;

import EjemploEmpleado.Empleado;

public class Principal {
	
	public static void main(String[] args) {
		
		
		Empleado e = new Empleado("Diego",2000) ;
		Coche c = new Coche(23);
		
		pintaDatos(e);
		pintaDatos(c);
	
	}

	private static void pintaDatos(Object obj) {
		
		if(obj instanceof Empleado) {
			Empleado e = (Empleado) obj;
			e.imprimirTodo();
		}else {
			System.out.println("No autorizado");
		}
		
	}

}
