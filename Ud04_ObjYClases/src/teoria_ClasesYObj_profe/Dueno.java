package teoria_ClasesYObj_profe;

public class Dueno {
	
	private String nombre;
	private String apellido;
	private String tlfn;
	
	
	
	public Dueno(String nombre, String apellido, String tlfn) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tlfn = tlfn;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public String getTlfn() {
		return tlfn;
	}






	public void setTlfn(String tlfn) {
		this.tlfn = tlfn;
	}
	
	@Override
	public String toString() {
		return String.format("%12s, %-s -%s",apellido,nombre,tlfn); //formateado salida string
	}
	
	
//	
	
	

}
