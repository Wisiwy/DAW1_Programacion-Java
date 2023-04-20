package comedor;

import java.util.LinkedList;
import java.util.List;

public class Plato implements Comparable<Plato> {
	private String nombre_plato;
	List<Ingrediente> ingredientes;
	List<Integer> porciones;
	private static String ing2;

	public Plato(String nombre_plato) throws ObjetoErroneo {
		setNombre_plato(nombre_plato);
		ingredientes = new LinkedList<>();
		porciones = new LinkedList<>();
		if (this.nombre_plato == null) {
			throw new ObjetoErroneo();
		}
	}

	public String getNombre_plato() {
		return nombre_plato;
	}

	public void setNombre_plato(String nombre_plato) {
		if (nombre_plato != null && nombre_plato.trim().length() > 0) {
			this.nombre_plato = nombre_plato;		
		}
	}

	public List<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public List<Integer> getPorciones() {
		return porciones;
	}

	public boolean anadeIngrediente(Ingrediente ing, int cantidad) {
		if (ing != null) {
			if (!ingredientes.contains(ing)) {
				if (cantidad > 0) {
					ingredientes.add(ing);
					porciones.add(cantidad);
					return true;
				}
			} else {
				if (cantidad > 0) {
					int k = ingredientes.indexOf(ing);
					porciones.set(k, cantidad);
					return true;
				}
			}
		}
		return false;
	}

	public boolean quitaIngrediente(Ingrediente ing) {
		int pos;
		if ((pos = ingredientes.indexOf(ing)) != -1) {
			ingredientes.remove(pos);
			porciones.remove(pos);
			return true;
		}
		return false;
	}

	public double sacarPrecio() {
		double precioTotal = 1.0;// Coste fijo
		for (int i = 0; i < ingredientes.size(); i++) {
			precioTotal = precioTotal + ingredientes.get(i).getPrecio() * porciones.get(i);
		}
		return precioTotal;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Plato)) {
			return false;
		}
		Plato other = (Plato) obj;
		if (nombre_plato == null) {
			if (other.nombre_plato != null) {
				return false;
			}
		} else if (!nombre_plato.equalsIgnoreCase(other.nombre_plato)) {
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Plato o) {
		return nombre_plato.compareToIgnoreCase(o.nombre_plato);
	}

	@Override
	public String toString() {
		ing2 = "";
		ingredientes.forEach((a) -> ing2 = ing2 + ", " + a.getNombre());
		return "Plato [nombre_plato=" + nombre_plato + ", ingredientes=" + ing2 + ", porciones=" + porciones
				+ String.format(" %7.2f", sacarPrecio()) + "]";
	}

	public String imprime() {
		String ingString = "\n\t";
		ing2 = "";
		ingredientes.forEach((a) -> ing2 = ing2 + ", " + a.getNombre());
		return "nombre del plato=" + nombre_plato + String.format(" precio : %6.2f ", sacarPrecio()) + "\n\t"
				+ ing2.substring(2);
	}

}
