package parte2;

import java.util.Objects;

public class Medalla {
	
	private String pokemon;

	

	private int oro;
	private int plata;
	private int bronce;
	
	
	public Medalla(String pokemon) {
		this.pokemon = pokemon;
		oro=0;plata=0;bronce=0;
	}
	public String getPokemon() {
		return pokemon;
	}
	public void setPokemon(String pokemon) {
		this.pokemon = pokemon;
	}
	public int getOro() {
		return oro;
	}
	public void setOro(int oro) {
		this.oro = oro;
	}
	public int getPlata() {
		return plata;
	}
	public void setPlata(int plata) {
		this.plata = plata;
	}
	public int getBronce() {
		return bronce;
	}
	public void setBronce(int bronce) {
		this.bronce = bronce;
	}
	
	public void incOro() {
		this.oro = oro+1;
	}
	public void incPlata() {
		this.plata = plata+1;
	}
	public void incBronce() {
		this.bronce = bronce+1;
	}
	
	@Override
	public String toString() {
		return String.format("   %12s    %3d   %3d   %3d", pokemon,oro,plata,bronce);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medalla other = (Medalla) obj;
		return Objects.equals(pokemon, other.pokemon);
	}
	
	

	
	
	

}
