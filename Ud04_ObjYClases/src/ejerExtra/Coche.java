package ejerExtra;

public class Coche {
	private String marca;
	private String modelo;
	private String matricula;

	public Coche(String marca, String modelo, String matricula) {
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return String.format("%-10s || %-10s || Matricula: %8s ",marca,modelo, matricula);
		}
}