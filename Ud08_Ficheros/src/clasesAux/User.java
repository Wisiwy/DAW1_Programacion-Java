package clasesAux;

import java.io.Serializable;

public class User implements Serializable {
	
	public int id;
	public String nom;
	public transient String pass; //esconde el dato en el archivo 
	
	
	public User(int id, String nom, String pass) {
		this.id = id;
		this.nom = nom;
		this.pass = pass;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	

}
