package ejem05_polimorfismo;


public class Profe extends Persona {
	public String asignatura;

	public Profe(String nombre, Integer edad, Integer dni, String asignatura) {
		super(nombre, edad, dni);
		this.asignatura = asignatura;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
@Override	
public void imprimirDatos() {
		
		System.out.printf("Nombre: %-10s |Edad: %2d| Dni: %10d | Asignatura: %10s \n",this.getNombre(),this.getEdad(),this.getDni(),this.asignatura);
	}

}
