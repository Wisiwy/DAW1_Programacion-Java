package otros_ejer01_HashMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Colegio {

	private Map<String, Integer> nacionalidades;

	public Colegio() {

		this.nacionalidades = new TreeMap();
	};

	public void addAlumno(String nacionalidad) throws ExceptionVacio {

		if (nacionalidad == "")
			throw new ExceptionVacio();

		if (nacionalidades.containsKey(nacionalidad)) {
			Integer cont = nacionalidades.get(nacionalidad);
			cont++;
			nacionalidades.put(nacionalidad, cont);
		} else {
			nacionalidades.put(nacionalidad, 1);
		}

	}

	public void showAll() {
//"key" es el iterador de la colleccion de la clave que coge con el key set. 
		for (String key : nacionalidades.keySet()) {
//			key = nacionalidad// nacionalidades.ge(key): valor integer
			System.out.printf("%20s - %02d alumnos. \n", key, nacionalidades.get(key));
		}
	}

	public void showNacionalidad(String nacionalidad) {
		if (nacionalidades.containsKey(nacionalidad))
			// nacionalidades.ge(key): valor integer
			System.out.println(nacionalidad + ">>->>" + nacionalidades.get(nacionalidad));
	}

	public int cuantos() {
		System.out.println("Colegio con: " + nacionalidades.size());
		return nacionalidades.size();
	}

	public void borra() {
		// borra todos los datos de mapa
		nacionalidades.clear();
		for (String key : nacionalidades.keySet()) {
			// Hace lo mismo que el clear
			nacionalidades.remove(key);
		}
	}

}
