package parte2;

import java.util.Objects;

public class Medalla {
	
	private String pais;
	private int oro;
	private int plata;
	private int bronce;
	
	public Medalla(String pais) {
		super();
		this.pais = pais;
		oro=0;plata=0;bronce=0;
	}
	
	
	public void incOro() {
		oro++;
	}
	public void incPlata() {
		plata++;
	}
	public void incBronce() {
		bronce++;
	}
	
	

	@Override
	public String toString() {
		return String.format("%-16s %4d %4d %4d", pais, oro,plata,bronce);
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
		return Objects.equals(pais, other.pais);
	}


	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
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
	
	
	
	
	
	

}
