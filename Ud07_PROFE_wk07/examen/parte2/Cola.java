package parte2;

import java.util.LinkedList;
import java.util.List;

public class Cola<T> {
	private List<T> cola;

	public Cola() {
		cola = new LinkedList<>();
	}
	
	public void anadir(T t) {
		cola.add(t);
	}
	
	public T sacar() {
		if (cola.size()==0) {
			return null;
		} 
		return cola.remove(0);
	}
	
	public int tamano() {
		return cola.size();
	}
	
	public String visualiza() {
		String salida = "";
		T t = sacar();
		while(t != null) {
			salida = salida + t.toString() + "\n";
			t = sacar();
		}
		return salida;
	}

	@Override
	public String toString() {
		return "Cola [cola=" + cola + "]";
	}
	
	
}
