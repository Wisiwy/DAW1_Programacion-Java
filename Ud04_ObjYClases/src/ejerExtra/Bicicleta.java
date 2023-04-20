package ejerExtra;

public class Bicicleta {

	private String modelo;
	private Integer platos;
	private Integer pinones;
	private String rueda;
	private double precio;
	private Cliente propietario = null;

	public Bicicleta() {
		
	}
	public Bicicleta(String modelo, Integer platos, Integer pinones, String rueda, double precio) {
		this.modelo = modelo;
		this.platos = platos;
		this.pinones = pinones;
		this.rueda = rueda;
		this.precio = precio;
		this.propietario = null;
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

	@Override
	public String toString() {
		return "Bicicleta [modelo=" + modelo + ", platos=" + platos + ", pinones=" + pinones + ", rueda=" + rueda
				+ ", precio=" + precio + ", propietario=" + propietario + "]";
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

	public String getRueda() {
		return rueda;
	}

	public void setRueda(String rueda) {
		this.rueda = rueda;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Cliente getPropietario() {
		return propietario;
	}

	public void setPropietario(Cliente propietario) {
		this.propietario = propietario;
	}

	

}
