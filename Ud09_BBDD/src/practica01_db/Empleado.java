package practica01_db;

public class Empleado {

	private Integer ID_empleado;
	private static Integer cont = 10;
	private String nom;
	private String ape;
	private Integer ID_Localidad;
	private Integer telefono;
	private String direc;
	private Integer sueldo;
	private Integer antiguedad;

	public Empleado(String nom, String ape, Integer iD_Localidad, Integer telefono, String direc, Integer antiguedad, Integer sueldo) {
		this.ID_empleado = cont;
		cont = +10;
		this.nom = nom;
		this.ape = ape;
		ID_Localidad = iD_Localidad;
		this.telefono = telefono;
		this.direc = direc;
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}

	public Integer getID_empleado() {
		return ID_empleado;
	}

	public void setID_empleado(Integer iD_empleado) {
		ID_empleado = iD_empleado;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public Integer getID_Localidad() {
		return ID_Localidad;
	}

	public void setID_Localidad(Integer iD_Localidad) {
		ID_Localidad = iD_Localidad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDirec() {
		return direc;
	}

	public void setDirec(String direc) {
		this.direc = direc;
	}
	public Integer getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(Integer sueldo) {
		this.sueldo = sueldo;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	@Override
	public String toString() {
		return "Empleado [ID_empleado=" + ID_empleado + ", nom=" + nom + ", ape=" + ape + ", ID_Localidad="
				+ ID_Localidad + ", telefono=" + telefono + ", direc=" + direc + ", antiguedad=" + antiguedad + "]";
	}


}
