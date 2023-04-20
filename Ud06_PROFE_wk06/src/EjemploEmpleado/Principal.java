package EjemploEmpleado;

public class Principal {
	
	public static void main(String[] args) {
		
		
		//instanciar un objeto Empleado y sacar datos
		
		Empleado e1 = new Empleado("Diego",2000) ;
		
		e1.imprimirNombre();
		e1.imprimirSueldo();
		e1.imprimirTodo();
		
		Jefe e2 = new Jefe("Alejandro",2000, "Informatica", "Ingenieria Informatica") ;
		
		e2.imprimirTodoJefe();
		
		
	}

}
