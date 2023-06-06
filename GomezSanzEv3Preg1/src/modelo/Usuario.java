package modelo;

import java.sql.ResultSet;
import java.util.List;

public class Usuario {
	
	private String nom;
	private ResultSet rutas;
	private float distTotal;
	private Integer ascensoTotal;
	
	
	public Usuario(String nom) {
		this.nom = nom;
		
	}


	@Override
	public String toString() {
		return String.format("%10s, %10.2f, %10d",nom,distTotal,ascensoTotal);
	}


	public ResultSet getRutas() {
		return rutas;
	}


	public void setRutas(ResultSet rutas) {
		this.rutas = rutas;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public float getDistTotal() {
		return distTotal;
	}


	public void setDistTotal(float distTotal) {
		//realizar con el resultado de las rutas.
		
		this.distTotal = distTotal;
	}


	public Integer getAscensoTotal() {
		return ascensoTotal;
	}


	public void setAscensoTotal(Integer ascensoTotal) {
		this.ascensoTotal = ascensoTotal;
	}
	
	

}
