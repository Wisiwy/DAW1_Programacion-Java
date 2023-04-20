package OBJETOS;

public class CuentaCorriente2 {
	
	private String numCuenta;
	private double saldo;
	private Cliente cliente;
	private static Integer numSig =1;
	
	
	
	
	public CuentaCorriente2(double cantidad, Cliente cliente) {

		this.saldo = cantidad;
		this.cliente = cliente;
		this.numCuenta = numSig+"";
		numSig++;
	}
	
	
	public void ingresaEfectivo(double cantidad) {
		saldo += cantidad;
	}
	

	public boolean retiraEfectivo(double cantidad) {
		
		if(saldo >= cantidad) {
			saldo -= cantidad;
			return true;
		}
		
		return false;
	}
	
	public String visualiza() {
		return String.format("%s - %-10s >> %.2f ", numCuenta,cliente.getNombre(),saldo);
	}


	public String getNumCuenta() {
		return numCuenta;
	}
	
	public int getPos() {
		return Integer.parseInt(numCuenta);
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	

}
