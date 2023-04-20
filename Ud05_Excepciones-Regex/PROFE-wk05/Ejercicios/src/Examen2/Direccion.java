package Examen2;

public class Direccion {

	private String calle;
	private String numero;
	private String codigo;
	private String ciudad;
	private String poblacion;
	
	public Direccion(String calle, String numero, String codigo, String ciudad, String poblacion) {
		super();
		this.calle = calle;
		this.numero = numero;
		this.codigo = codigo;
		this.ciudad = ciudad;
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return String.format("%s, %s\n%s %s\n%s", calle,numero,codigo,ciudad,poblacion);
	}
	
	
	
	
}
