package Examen;

public class Direccion {

	private String calle;
	private Integer num;
	private Integer cp;
	private String ciudad;
	private String poblacion;
	
	
	public Direccion(String calle, int num, int cp, String ciudad, String poblacion) {
		this.calle = calle;
		this.num = num;
		this.cp = cp;
		this.ciudad = ciudad;
		this.poblacion = poblacion;	}
//	--------------GETTER SNDD SEETTTERSSS


	


	public String getCalle() {
		return calle;
	}


	public void setCalle(String calle) {
		this.calle = calle;
	}


	public Integer getNum() {
		return num;
	}


	public void setNum(Integer num) {
		this.num = num;
	}


	public Integer getCp() {
		return cp;
	}


	public void setCp(Integer cp) {
		this.cp = cp;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getPoblacion() {
		return poblacion;
	}


	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}


//	-------------- To STRING
	@Override
	public String toString() {
		return String.format("%s, %d \n %5d %s \n %s",this.calle,this.num,this.cp,this.ciudad,this.poblacion);
	}
	
	
	
	
	
	
}
