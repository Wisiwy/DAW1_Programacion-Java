package OBJETOS;

public class CuentaCorriente {
	
	private String numCuenta;
	private double saldo;
	private Cliente cliente;
	private static Integer numSig =1;
	
	
	
	
	
	
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public CuentaCorriente(double sal, Cliente cli) {
		this.saldo = sal;
		this.cliente = cli;
		this.numCuenta = numSig+"";
		numSig++;	}


	


	public Cliente getCliente() {
		return cliente;
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
		return String.format("%s - %-10s >> %.2f ", numCuenta,cliente,saldo);
	}


	public String getNumCuenta() {
		return numCuenta;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	
	

}
