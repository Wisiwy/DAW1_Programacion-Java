package modelo;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

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
	public String fechaAdquisicion;

	public Libro() {
	};

	public Libro(List<String> strList) {
		this.setNum(Integer.parseInt(strList.get(0)));
		this.setTitulo(strList.get(1));
		this.setAutor(strList.get(2));

		
		//controlamo que el parseo se haga con algo
		this.setAnyo(Integer.parseInt(strList.get(3)));
		try {
			this.setAnyo(Integer.parseInt(strList.get(3)));
		} catch (NumberFormatException e) {
			if (strList.get(8) == "")
				this.setAnyo(0);
			else {
				System.err.println("Error de formato en id " + strList.get(0));
				this.setAnyo(0);
			}
		}

		this.setTematica(strList.get(4));
		this.setUbicacion(strList.get(5));
		this.setEditorial(strList.get(6));
		this.setIsbn(strList.get(7));
		try {
			this.setPaginas(Integer.parseInt(strList.get(8)));
		} catch (NumberFormatException e) {
			if (strList.get(8) == "")
				this.setPaginas(0);
			else {
				System.err.println("Error de formato en id " + strList.get(0));
				this.setPaginas(0);
			}
		}

		this.setEdad(strList.get(9));
		this.setObservaciones(strList.get(10));
		this.setFechaAdquisicion(strList.get(10));
	}

	public Libro(Integer num, String titulo, String autor, Integer año, String tematica, String ubicacion,
			String editorial, String iSBN, Integer paginas, String edad, String observaciones, String fechaAdquisicion)
			throws ParseException {
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
		return String.format("Id: %d .\t %s \n Autor: %s " + "\n Editorial: %s \t Año: %d" + "\n ISBN: %s"
				+ "\n Tematica: %s" + "\n Ubicacion: %s", num, titulo, autor,  editorial, anyo, isbn, tematica,
				ubicacion);
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

	public String getFechaAdquisicion() {
		return fechaAdquisicion;
	}

	public void setFechaAdquisicion(String fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}

}
