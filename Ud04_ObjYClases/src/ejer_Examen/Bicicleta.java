package ejer_Examen;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Bicicleta {

	private String modelo;
	private Integer platos;
	private Integer pinones;
	private String ruedas;
	private double precio;
	private Cliente cliente;

//	-----------CONSTRUCTORES
	public Bicicleta() {
	};

	public Bicicleta(String modelo, Integer platos, Integer pinones, String ruedas, double precio) {
		this.modelo = modelo;
		this.platos = platos;
		this.pinones = pinones;
		this.ruedas = ruedas;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getPlatos() {
		return platos;
	}

	public void setPlatos(Integer platos) {
		this.platos = platos;
	}

	public Integer getPinones() {
		return pinones;
	}

	public void setPinones(Integer pinones) {
		this.pinones = pinones;
	}

	public String getRuedas() {
		return ruedas;
	}

	public void setRuedas(String ruedas) {
		this.ruedas = ruedas;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	

	// -----------TO STRING-----------
	@Override
	public String toString() {
		return String.format("%s // %d,%d // %s : %.2f €.", modelo, platos, pinones, ruedas, precio);
	}

	// -------MODIFICAR BICI-----------
	public void moficarBici() {

		int opt;
		do {

			String[] menu = { "Modelo", "Plato", "Pinones", "Ruedas" };
			opt = Dibujo.menu(menu);

			switch (opt) {
			case 1:
				this.modelo = Leer.leerString("Nuevo modelo:");
				break;
			case 2:
				this.platos = Leer.leerInt("Nuevos platos:");
				break;
			case 3:
				this.pinones = Leer.leerInt("Nuevos pinones:");
				break;
			case 4:
				this.ruedas = Leer.leerString("Nuevas ruedas:");
				break;

			default:
				break;
			}
		} while (opt != 0);
	}

}
