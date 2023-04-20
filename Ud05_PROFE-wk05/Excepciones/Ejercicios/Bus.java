package Ejercicios;

public class Bus {
	
	private int capacidad = 0;
	private int capacidad_max;
	private int id;
	
	
	public Bus(int id, int capacidad_max) {
		this.id = id;
		this.capacidad_max = capacidad_max;
	}


	public int getCapacidad() {
		return capacidad;
	}


	/*public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}*/
	
	public void incrementa() throws NoPlace {
		if(this.capacidad == this.capacidad_max)
			throw new NoPlace();
		else
			this.capacidad++;
	}
	
	public void decrementa() throws Invalid {
		if(this.capacidad == 0)
			throw new Invalid();
		else
			this.capacidad--;
	}


	public int getCapacidad_max() {
		return capacidad_max;
	}


	public int getId() {
		return id;
	}


	@Override
	public String toString() {
		return String.format(" --> BUS(%d): pasajeros (%d/%d)\n", id,capacidad,capacidad_max);
	}
	
	
	
	
	
	
	

}
