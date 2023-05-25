package modelo;

public class Ruta {
	
	private Integer id;
	private String nombre;
	private String nivel;
	private String tiempo;
	private float distancia;
	private float velocidad;
	private Integer ascenso;
	private Integer descenso;
	
	public Ruta(Integer id, String nombre, String nivel, String tiempo, float distancia, float velocidad,
			Integer ascenso, Integer descenso) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nivel = nivel;
		this.tiempo = tiempo;
		this.distancia = distancia;
		this.velocidad = velocidad;
		this.ascenso = ascenso;
		this.descenso = descenso;
	}

	public Ruta(String[] data) {
		this.id = Integer.parseInt(data[0]);
		this.nombre = data[1];
		this.nivel = data[2];
		this.tiempo = data[3];
		this.distancia = Float.parseFloat(data[4]);
		this.velocidad = Float.parseFloat(data[5]);
		this.ascenso = Integer.parseInt(data[6]);
		this.descenso = Integer.parseInt(data[7]);
		
//		float velMedia = Float.parseFloat(arrayStr[3].replace(',', '.').substring(0,7));
		//.Split(" ")[0] = para coger el la primera parte tras separa por espacio
		//replace(".","") - Para quitar el punto por el espacio vacio
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	public float getDistancia() {
		return distancia;
	}

	public void setDistancia(float distancia) {
		this.distancia = distancia;
	}

	public Integer getAscenso() {
		return ascenso;
	}

	public void setAscenso(Integer ascenso) {
		this.ascenso = ascenso;
	}

	public Integer getDescenso() {
		return descenso;
	}

	public void setDescenso(Integer descenso) {
		this.descenso = descenso;
	}

	@Override
	public String toString() {
		return "Ruta [id=" + id + ", nombre=" + nombre + ", nivel=" + nivel + ", tiempo=" + tiempo + ", distancia="
				+ distancia + ", velocidad=" + velocidad + ", ascenso=" + ascenso + ", descenso=" + descenso + "]";
	}
	
	
	
	
	

}
