package Ejemplo5_Poli;


public class Profe extends Persona{
	
	private String asign;
	
	public Profe(int edad, String nombre, String dni, String asign) {
		super(edad, nombre, dni);
		this.asign = asign;
	}

	public String getAsign() {
		return asign;
	}

	public void setAsign(String asign) {
		this.asign = asign;
	}

	@Override
	public void imprimirDatos() {
		System.out.printf("Profe: %s Dni: %s Nombre: %s \n",asign,getDni(),getNombre());

	}
	
	

}
