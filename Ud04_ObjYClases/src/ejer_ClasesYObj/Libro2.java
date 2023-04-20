package ejer_ClasesYObj;

import java.util.Iterator;

import aUtilidad.Leer;

public class Libro2 {

	private String titulo;
	private Autor[] autores = new Autor[100];
	private Double precio;
	private Integer cantidad = 0;

//--------------CONSTRUCTORES-----------
	public Libro2(String titulo, Autor autor, Double precio) {
		this.titulo = titulo;
		this.precio = precio;

		for (int i = 0; i < this.autores.length; i++) {
			if (autores[i] == null) {
				autores[i] = autor;
				i = autores.length;
			}

		}

	}

	public Libro2(String titulo, Autor autor, Double precio, Integer cantidad) {
		this.titulo = titulo;
		for (int i = 0; i < this.autores.length; i++) {
			if (autores[i] == null) {
				autores[i] = autor;
				i = autores.length;
			}

		}
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

	
	public Autor[] getAutores() {
		return autores;
	}

	@Override

//--------------TO STRING-----------

	public String toString() {
		return String.format("Titulo: %s. \n Autores:\n%t %s.\n %4d.2f.\n Cantidad:: %d.", titulo, autores, precio,
				cantidad);
	}

	public void setTitulo(String leerString) {
		this.titulo = leerString;
	}

	public void setAutor(Autor autaux) {
		for (int i = 0; i < autores.length; i++) {
			if(autores[i] == null)
				autores[i] = autaux;
		}
	}

//--------------VISUALIZAR AUTORES ARRAY-----------
	private static void visualizarAutor(Autor[] autores) {
		for (int i = 0; i < autores.length; i++) {
			if (autores[i] != null) {
				System.out.printf("%3d - %s \n", (i + 1), autores[i].toString());
			}
		}

	}

}
