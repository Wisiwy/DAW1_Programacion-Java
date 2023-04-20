package ejer_Examen;

import java.util.Arrays;

public class Cliente {

	private String nombre;
	private Integer tlfn;
	private Bicicleta[] listaBicis = new Bicicleta[100];
	private Integer id = 0;

	private static Integer sig = 1;

//-----------------CONSTRUCTORES
	public Cliente(String nombre, Integer tlfn) {
		this.id = sig;
		this.nombre = nombre;
		this.tlfn = tlfn;
		sig++;
	}

//-----------------GETTERS AND SETTERS

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

	public Bicicleta[] getListaBicis() {
		return listaBicis;
	}

	public void setListaBicis(Bicicleta bici) {
		for (int i = 0; i < this.listaBicis.length; i++) {
			if (this.listaBicis[i] == null) {
				this.listaBicis[i] = bici;
				i = this.listaBicis.length;
			}
			i++;
		}
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

//-----------------TO STRING

	@Override
	public String toString() {
		return String.format("%d - %s || Tlfn:%10d", this.id, nombre, tlfn);
	}

}
