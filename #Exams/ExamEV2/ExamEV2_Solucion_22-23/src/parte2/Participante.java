package parte2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Participante {
	
	private String equipo;
	private String loc;
	private String ligas;
	private double puntos;
	private Set<String> pok;
	
	



	public Participante(String equipo, String loc, String ligas, double puntos, Set<String> pok) {
		super();
		this.equipo = equipo;
		this.loc = loc;
		this.ligas = ligas;
		this.puntos = puntos;
		this.pok = new LinkedHashSet(pok);
	}


	public String getEquipo() {
		return equipo;
	}


	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public String getLigas() {
		return ligas;
	}


	public void setLigas(String ligas) {
		this.ligas = ligas;
	}


	public double getPuntos() {
		return puntos;
	}


	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	public Set<String> getPok() {
		return pok;
	}


	@Override
	public String toString() {
		return String.format("   %22s %4.2f ", equipo, puntos);
	}
	
	
}
