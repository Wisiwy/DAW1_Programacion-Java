package modelo;

import java.sql.Date;

public class Libro {
	public Integer num;
	public String titulo;
	public String autor;
	public Integer anyo;
	public String tematica;
	public String ubicacion;
	public String editorial;
	public String isbn;
	public Integer paginas;
	public String edad;
	public String observaciones;
	public Date fechaAdquisicion;

	public Libro() {
	};

	public Libro(Integer num, String titulo, String autor, Integer año, String tematica, String ubicacion,
			String editorial, String iSBN, Integer paginas, String edad, String observaciones, Date fechaAdquisicion) {
		super();
		this.num = num;
		this.titulo = titulo;
		this.autor = autor;
		this.anyo = año;
		this.tematica = tematica;
		this.ubicacion = ubicacion;
		this.editorial = editorial;
		isbn = iSBN;
		this.paginas = paginas;
		this.edad = edad;
		this.observaciones = observaciones;
		this.fechaAdquisicion = fechaAdquisicion;
	}
	

	@Override
	public String toString() {
		return String.format("Id:%d.\t %s \n Autor: %s "
				+ "\n Editorial: %s \t Año: %d"
				+ "\n ISBN: %ss"
				+ "\n Tematica: %s"
				+ "\n Ubicacion: %s",num, titulo, autor, anyo,editorial, isbn,tematica,ubicacion);
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Integer getAnyo() {
		return anyo;
	}

	public void setAnyo(Integer año) {
		this.anyo = año;
	}

	public String getTematica() {
		return tematica;
	}

	public void setTematica(String tematica) {
		this.tematica = tematica;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getISBN() {
		return isbn;
	}

	public void setISBN(String iSBN) {
		isbn = iSBN;
	}

	public Integer getPaginas() {
		return paginas;
	}

	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

}
