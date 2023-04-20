package Practica2_PilotosF1;

public class Marca {
	public String ranking;
	public String nom;
	public String escuderia;
	public String coche;
	public String circuito;
	public String anyo;
	public String velMedia;
	
	public Marca() {};
	
	public Marca(String ranking, String nom, String escuderia, String coche, String circuito, String año,
			String velMedia) {
		this.ranking = ranking;
		this.nom = nom;
		this.escuderia = escuderia;
		this.coche = coche;
		this.circuito = circuito;
		this.anyo = año;
		this.velMedia = velMedia;
	}
	/**
	 * @return the ranking
	 */
	public String getRanking() {
		return ranking;
	}
	/**
	 * @param ranking the ranking to set
	 */
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the escuderia
	 */
	public String getEscuderia() {
		return escuderia;
	}
	/**
	 * @param escuderia the escuderia to set
	 */
	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}
	/**
	 * @return the coche
	 */
	public String getCoche() {
		return coche;
	}
	/**
	 * @param coche the coche to set
	 */
	public void setCoche(String coche) {
		this.coche = coche;
	}
	/**
	 * @return the circuito
	 */
	public String getCircuito() {
		return circuito;
	}
	/**
	 * @param circuito the circuito to set
	 */
	public void setCircuito(String circuito) {
		this.circuito = circuito;
	}
	/**
	 * @return the año
	 */
	public String getAnyo() {
		return anyo;
	}
	/**
	 * @param anyo the año to set
	 */
	public void setAnyo(String anyo) {
		this.anyo = anyo;
	}
	

	/**
	 * @return the velMedia
	 */
	public String getVelMedia() {
		return velMedia;
	}
	/**
	 * @param velMedia the velMedia to set
	 */
	public void setVelMedia(String velMedia) {
		this.velMedia = velMedia;
	}
	
	@Override
	public String toString() {
		return String.format("%2s. %s - Vel.Media: %s \n \t Escuderia: %s \n \t Coche: %s \n \t Circuito: %s"
				+ "Año: %s ",ranking,velMedia,nom,escuderia, coche, circuito, anyo);
	}
	
	
	
}
