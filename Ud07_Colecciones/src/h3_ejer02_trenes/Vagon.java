package h3_ejer02_trenes;

import java.util.ArrayList;
import java.util.List;

public class Vagon {

	private List<Integer> asientos;
	private static Integer cont = 1;
	private Integer numVag;
	private boolean ocupado = false;

	public Vagon() {
		this.asientos = new ArrayList();
		this.numVag = cont;
		cont++;
		this.asientos.add(0, numVag);
		// Inicializo a 0 los 10 (1-11) asiento.
		for (int i = 1; i <= 10; i++) {
			this.asientos.add(0);
		}
		this.ocupado = false;

	}
	
	/**
	 * Si tiene 0 en los asientos devueve falso. Todavia sitio
	 * 
	 * @return numero asiento vagon
	 */

	public Integer sumarAsiento() {
		// convierte el 0 en 1 ocupado.
		Integer numAsi = 0;
		for (int i = 1; i < 11; i++) {
			if (this.asientos.get(i) == 0) {
				this.asientos.set(i, 1);
				numAsi = i;
				break;
			} else {
				// Si los encuentra todos a 1 devolver vagon ocupado
				ocupado = true;
				System.out.println("El tren se ha ocupado");
			}
		}
		System.out.println("Tu número asiento es: " + numAsi);
		System.out.println();
		return numAsi;
	}
	
	
	
	
	
	public void borrarAsiento(Integer asiento) {
		this.asientos.set(asiento, 0);
	}

	public void setNumVag(Integer numVag) {
		this.numVag = numVag;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public Integer getNumVag() {
		return numVag;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public List<Integer> getAsientos() {
		return asientos;
	}

	public void setAsientos(List<Integer> asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		String salida = "ID: " + asientos.get(0) + " -- ";
		for (int i = 0; i < 11; i++) {
			salida += asientos.get(i);
		}

		return salida;
	}

}
