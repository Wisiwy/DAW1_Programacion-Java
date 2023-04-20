package otros_ejer04_ordenacion;

public class Persona {

	private String nom;
	private Integer altura;
	private Integer edad;

	public Persona(String nom, Integer altura, Integer edad) {
		this.nom = nom;
		this.altura = altura;
		this.edad = edad;
	}

	public Persona() {

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		altura = altura;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		edad = edad;
	}

	@Override
	public String toString() {
		return String.format("%-7s: %3d cm, %2d anyos", nom, altura, edad);
	}

	public int compareTo(Persona p) {
		if (this.getAltura() != p.getAltura())
			return this.getAltura() - p.getAltura();
		else
			return 0;
	}
	public int compareToEdad(Persona p) {
		if (this.getEdad() != p.getEdad())
			return this.getEdad() - p.getEdad();
		else
			return 0;
	}

}
