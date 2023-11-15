package Exam20_21;

public class AtletaP1 {
	private String nom;
	private String ape;
	private String sexo;
	private String fecha_nac;
	private String prueba;
	private String marca;

	public AtletaP1() {
	}

	public AtletaP1(String nom, String ape, String sexo, String fecha_nac, String prueba, String marca) {
		super();
		this.nom = nom;
		this.ape = ape;
		this.sexo = sexo;
		this.fecha_nac = fecha_nac;
		this.prueba = prueba;
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Atleta [nom=" + nom + ", ape=" + ape + ", sexo=" + sexo + ", fecha_nac=" + fecha_nac + ", prueba="
				+ prueba + ", marca=" + marca + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getApe() {
		return ape;
	}

	public void setApe(String ape) {
		this.ape = ape;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getPrueba() {
		return prueba;
	}

	public void setPrueba(String prueba) {
		this.prueba = prueba;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

}
