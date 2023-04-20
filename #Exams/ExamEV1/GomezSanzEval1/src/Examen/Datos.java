package Examen;

public class Datos {
	
	private String nom;
	private String ape1;
	private String ape2;
	private String usuario;
	
	
//	------------------CONSTRUCTOR
	

	public Datos(String leerString, String leerString2, String leerString3) {
		this.nom = leerString;
		this.ape1 = leerString2;
		this.ape2 = leerString3;
		this.usuario = String.format("%3s.%3s",nom,ape1);	}
	
//	------------------GETTER SETTERS



	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getApe1() {
		return ape1;
	}


	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}


	public String getApe2() {
		return ape2;
	}


	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
//	------------------TO STRING
	
	public String toString() {
		return String.format("%s \n %s %s %s",usuario, nom, ape1, ape2);
	}
	
	
	

}
