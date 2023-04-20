package h2_ejer5_version2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Oficina {

	ArrayList<Cola> ofi;

	/**
	 * Genera una oficina con el numero de colas ingresado
	 * 
	 * @param num
	 */
	public Oficina(Integer num) {
		// Ya te crea con el numero de objetos Colas indicados.
		ofi = new ArrayList(num);
	}
	
	public void pintarOfi() {
		
	}

	public void servirCola() {
		for (Cola it : ofi) {
		}
	}
	
	public Cola asignarCola() {
		
		Cola aux = null;
		for (int i = 0; i < ofi.size(); i++) {
			 aux = ofi.get(i);
			for (int j = 0; j < ofi.size(); j++) {
				Cola aux2 = ofi.get(j);
				if (aux2.size() <= aux.size()) {
					aux=aux2;
				}
			}
			
		}	
		return aux;
		
	}
	

}
