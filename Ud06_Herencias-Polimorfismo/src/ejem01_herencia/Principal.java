package ejem01_herencia;

public class Principal {
	
	public static void main(String[] args) {
		Empleado e = new Empleado("Raul",900);
		e.imprimeTodo();
		
		
		
		Jefe j = new Jefe("Gabi",2000,"Finanzas","Magisterio");
		j.imprimirJefe();
	}

}
