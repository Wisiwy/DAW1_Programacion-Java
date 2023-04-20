package OBJETOS;

import java.util.Arrays;

public class Cliente {
	
	private Integer numCli;
	private String nombre;
	//private String apellido;
	
	private static Integer cliNext = 1001;
	private CuentaCorriente2[] cuentas = new CuentaCorriente2[10];
	
	
	public Cliente(String nombre) {

		this.nombre = nombre;
		
		this.numCli = cliNext;
		cliNext++;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getNumCli() {
		return numCli;
	}


	public CuentaCorriente2[] getCuentas() {
		return cuentas;
	}
	
	public void addCuenta(CuentaCorriente2 cuen) {
		
		for (int i = 0; i < cuentas.length; i++) {
			if(cuentas[i] == null) {
				cuentas[i] = cuen;
				i=cuentas.length;
			}
		}
		
	}


	@Override
	public String toString() {
		//return "Cliente [numCli=" + numCli + ", nombre=" + nombre + ", cuentas=" + Arrays.toString(cuentas) + "]";
		return String.format(" %4d - %-15s",numCli, nombre );
	}
	
	
	
	
	
	
	

}
