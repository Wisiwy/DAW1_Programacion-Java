package parte2;



import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

public class Pokemon {
	private String equipo;
	private String localidad;
	private List<String> ligas;
	private Set<String> pokemon;
	private List<Double> puntos;

	public Pokemon(String nombre, String loc) {
		this.equipo = nombre;
		this.localidad = loc;
		ligas = new ArrayList<>();
		pokemon = new LinkedHashSet<>();
		puntos = new ArrayList<>();
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String nombre) {
		this.equipo = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String loc) {
		this.localidad = loc;
	}

	public boolean anadeMarca(String liga, double p) {
		if (liga != null && !ligas.contains(liga) && p > 0.0) {
			ligas.add(liga);
			puntos.add(p);
			return true;
		}
		return false;
	}

	public List<String> getLigas() {
		return ligas;
	}
	
	public Set<String> getPokemon() {
		return pokemon;
	}
	
	public void setPokemon(Set<String> s) {
		pokemon = s;
	}

	public List<Double> getPuntos() {
		return puntos;
	}

	@Override
	public String toString() {
		String texto = "";
		for (int i = 0; i < ligas.size(); i++) {
			String num = String.format("%4.2f", puntos.get(i));
			texto = texto + "\n\t" + String.format(" %20s puntuación: %5s", ligas.get(i), num);
		}
		texto = texto.replace(',','.');
		String sPoke = "\t\nPokemon: ";
		for (String s : pokemon) {
			sPoke += s + " - ";
		}
		sPoke = sPoke.substring(0, sPoke.length()-3);
		return "Equipo :nombre=" + equipo + ", localidad=" + localidad + sPoke + texto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(equipo, localidad);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(equipo, other.equipo) && Objects.equals(localidad, other.localidad);
	}


	

	
}
