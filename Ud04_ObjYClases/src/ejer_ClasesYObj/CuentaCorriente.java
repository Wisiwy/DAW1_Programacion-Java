package ejer_ClasesYObj;

public class CuentaCorriente {
	private String numCuenta;
	private double saldo;
	private Cliente cliente;
//	numero suenta siguiente, static sera leido por todos los metodos de la clase
	private static Integer numSiguiente = 1;

	//Constructores no necesarios. 
	public CuentaCorriente() {
	};

	public CuentaCorriente(String numCuenta, double saldo, Cliente cliente) {
		this.numCuenta = numCuenta;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public CuentaCorriente(double cantidad, Cliente cliente) {
		this.numCuenta = numSiguiente.toString();
		numSiguiente++;
		this.saldo = cantidad;
		this.cliente = cliente;
	}

	public String getNumCuenta() {
		return numCuenta;
	}
	//crear una devolucion de la posicion de la nueva cuenta
	public int getPos() {
		return Integer.parseInt(this.numCuenta);
	}

	

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	@Override
	public String toString() {
		return "NªCuenta:" + numCuenta + "%n Cliente=" + cliente + "%n Saldo:" + saldo;
	}

	public void ingresaEfectivo(double cantidad) {
		this.saldo += cantidad;
	}

	
	public boolean retiraEfectivo(double cantidad) {
		boolean aux;
		if ((this.saldo -= cantidad) < 0) { // (saldo>=cantidad)
			this.saldo -= cantidad;
			aux = true; //return true;
		} else {
			aux = false; //return false
			System.err.println("No hay saldo suficiente en la cuenta.");
		}
		return aux;
	}
	public void visualizar() {
		System.out.println("-----------------------------");
		System.out.printf("Nº cuenta: %3s//",numCuenta);
		System.out.printf("Titular: %10s//",cliente.getNombre());
		System.out.printf("Saldo: %.2f euros//", saldo );
		System.out.println("-----------------------------");
		
		
	}

	public static Integer getNumSiguiente() {
		return numSiguiente;
	}

	public static void setNumSiguiente(Integer numSiguiente) {
		CuentaCorriente.numSiguiente = numSiguiente;
	}

}
