package ejer_ClasesYObj;

public class Cliente {

	private int id;
	private String nombre;
	private static int numSig = 1001; // Empieza en 1001 porque nos apetece
	private CuentaCorriente[] cuentas = new CuentaCorriente[10]; // Las cuentas corrientes que tiene el cliente.

	public Cliente(String nombre) {
		this.nombre = nombre;
		this.id = numSig;
		numSig++;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public CuentaCorriente[] getCuentas() {
		return cuentas;
	}

	public void anadirCuenta(CuentaCorriente c) {
		for (int i = 0; i < cuentas.length; i++) {
			if (cuentas[i] == null) {
				cuentas[i] = c;
				i = cuentas.length; // mandarle salir del bucle.
			}
		}

	}

	@Override
	public String toString() {
		//return "Cliente [id=" + id + ", nombre=" + nombre + "]"; ----ORIGNAL ECLIPSE
		return String.format("%4d - %-15s",id,nombre); //-----string.format: Formatea el string
	}
	
	
	

}
