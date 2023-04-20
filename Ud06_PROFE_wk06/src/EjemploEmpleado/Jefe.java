package EjemploEmpleado;

public class Jefe extends Empleado{
	
	private String dpto;
	private String tituloUni;
	
	public Jefe(String nombre, double sueldo, String dpto, String tituloUni) {
		super(nombre, sueldo);
		this.dpto = dpto;
		this.tituloUni = tituloUni;
	}

	public String getDpto() {
		return dpto;
	}

	public void setDpto(String dpto) {
		this.dpto = dpto;
	}

	public String getTituloUni() {
		return tituloUni;
	}

	public void setTituloUni(String tituloUni) {
		this.tituloUni = tituloUni;
	}
	
	public void imprimirDepartamento() {
		System.out.printf("  Departamento: %s \n",dpto);
	}
	
	public void imprimirTitulo() {
		System.out.printf("  Titulo: %s \n",tituloUni);
	}
	
	public void imprimirTodoJefe() {
		this.imprimirTodo();
		this.imprimirDepartamento();
		this.imprimirTitulo();
		
	}

	
}
