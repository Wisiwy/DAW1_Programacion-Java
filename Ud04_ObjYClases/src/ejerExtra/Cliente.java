package ejerExtra;

import java.util.Arrays;

public class Cliente {
	private String nombre;
	private Integer tlfn;
	private Bicicleta[] lista = null;
	private int id;
	private static int sig;

	public Cliente(String nombre, Integer tlfn) {
		this.nombre = nombre;
		this.tlfn = tlfn;
		this.lista = null;
		this.id = sig;
		sig++;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tlfn=" + tlfn + ", lista=" + Arrays.toString(lista) + ", id=" + id
				+ "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getTlfn() {
		return tlfn;
	}

	public void setTlfn(Integer tlfn) {
		this.tlfn = tlfn;
	}

	public Bicicleta[] getLista() {
		return lista;
	}

	public void setLista(Bicicleta[] lista) {
		this.lista = lista;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	

}
