import java.util.ArrayList;
import java.util.List;

public class Atleta {
	private String nombre;
	private String pais;
	private List<String> pruebas;
	private List<Double> tiempos;

	public Atleta(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
		pruebas = new ArrayList<>();
		tiempos = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public boolean anadeMarca(String prueba, double d) {
		if (prueba != null && !pruebas.contains(prueba) && d > 0.0) {
			pruebas.add(prueba);
			tiempos.add(d);
			return true;
		}
		return false;
	}

	public List<String> getPruebas() {
		return pruebas;
	}

	public List<Double> getTiempos() {
		return tiempos;
	}

	@Override
	public String toString() {
		String texto = "";
		for (int i = 0; i < pruebas.size(); i++) {
			String num = String.format("%4.2f", tiempos.get(i));
			texto = texto + "\n\t" + String.format(" %20s marca %5s", pruebas.get(i), num);
		}
		texto = texto.replace(',',':');
		return "Atleta :nombre=" + nombre + ", pais=" + pais + texto;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Atleta)) {
			return false;
		}
		Atleta other = (Atleta) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equals(other.nombre)) {
			return false;
		}
		if (pais == null) {
			if (other.pais != null) {
				return false;
			}
		} else if (!pais.equals(other.pais)) {
			return false;
		}
		return true;
	}

	
}
