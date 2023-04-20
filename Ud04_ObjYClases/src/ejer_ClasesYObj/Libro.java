package ejer_ClasesYObj;

public class Libro {

	private String titulo;
	private Autor autor;
	private Double precio;
	private Integer cantidad = 0;

//--------------CONSTRUCTORES-----------
	public Libro(String titulo, Autor autor, Double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}

	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
//--------------GETERS & SETERS-----------

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	@Override

//--------------TO STRING-----------
	
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	public void setTitulo(String leerString) {
		this.titulo = leerString;
	}

	public void setAutor(Autor autaux) {
		// TODO Auto-generated method stub
		this.autor = autaux;
	}

}
