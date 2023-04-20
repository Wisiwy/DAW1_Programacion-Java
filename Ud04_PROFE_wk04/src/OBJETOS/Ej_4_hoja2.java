package OBJETOS;

import Estaticos.Leer;
import Menu.Utilidad;

public class Ej_4_hoja2 {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"Crear Cuenta","Ingresar","Retirar","Ver Cuenta","Mostrar todas CUENTAS","Mostrar clientes con cuentas","Eliminar cuenta"};
		
		CuentaCorriente2[] cuentas = new CuentaCorriente2[100];
		Cliente[] clientes = new Cliente[100];
		
		
		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				
				mostrarClientes(clientes);
				
				String resp = Leer.leerCadena("�Existe el cliente? (s/n): ");
				
				Cliente cli = null;
				if(resp.compareToIgnoreCase("s")==0) {
					int pos = Leer.leerEntero("Posici�n: ");
					
					if(clientes[pos] != null)
						cli = clientes[pos];
					
				}else if(resp.compareToIgnoreCase("n")==0) {
					
					String nom = Leer.leerCadena("Nombre: ");
					
					cli = new Cliente(nom);
					addCliente(cli,clientes);
				}
				
				//String cli = Leer.leerCadena("cliente: ");
				if(cli != null) {
					int cant = Leer.leerEntero("cantidad: ");
					
					
					CuentaCorriente2 aux = new CuentaCorriente2(cant,cli);
					//int pos = Integer.parseInt(aux.getNumCuenta());
					int pos = aux.getPos();
					cuentas[pos] = aux;
					
					//aux.setCliente(cli);
//					cli.addCliente(aux);
					
				}
			}else if(o ==2) {
				int pos = Leer.leerEntero("num cuenta: ");
				
				if(cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: "); 
					cuentas[pos].ingresaEfectivo(cant);
				}
					
				
			}else if(o == 3) {
				
				int pos = Leer.leerEntero("num cuenta: ");
				
				if(cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: "); 
					if(cuentas[pos].retiraEfectivo(cant))
						System.out.println("Se ha retirado con exito");
					else
						System.out.println("Saldo insuficiente");
				}
			}else if(o ==4) {
				int pos = Leer.leerEntero("num cuenta: ");
				
				if(cuentas[pos] != null) {
					System.out.println(cuentas[pos].visualiza());
				}
			}else if(o == 5) {
				
				for (int i = 0; i < cuentas.length; i++) {
					if(cuentas[i] != null)
						System.out.println(cuentas[i].visualiza());
				}
			}else if(o == 6) {
				//mostrar todos los clientes con sus cuentas
				for (int i = 0; i < clientes.length; i++) {
					if(clientes[i] != null) {
						System.out.println(clientes[i]);
						CuentaCorriente2[] susCuentas = clientes[i].getCuentas();
						
						for (int j = 0; j < susCuentas.length; j++) {
							if(susCuentas[j] != null)
								System.out.println(susCuentas[j].visualiza());
						}
						
					}
				}
				
				/********************************************************/
				/*for (Cliente cli : clientes) {
					if(cli != null) {
						System.out.println(cli);
						//CuentaCorriente2[] susCuentas = cli.getCuentas();
						
						//for (CuentaCorriente2 cu : susCuentas) {
						for (CuentaCorriente2 cu : cli.getCuentas()) {
							if(cu != null)
								cu.visualiza();
						}
					}
				}*/
				
				
				
			}else if(o == 7) {
				int pos = Leer.leerEntero("num cuenta: ");
				
				if(cuentas[pos] != null) {
					cuentas[pos] = null;
				}
			}else if(o==0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
		
	}

	private static void addCliente(Cliente cli, Cliente[] clientes) {
		
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i] == null) {
				clientes[i] = cli;
				i=clientes.length;
			}
		}
		
	}

	private static void mostrarClientes(Cliente[] clientes) {

		/*for (Cliente cli : clientes) {
			if(cli != null)
				System.out.println(cli);
		}*/
		
		for (int i = 0; i < clientes.length; i++) {
			if(clientes[i] != null)
				System.out.printf("POS: %2d  Cliente: %s \n",i,clientes[i]);
		}
		
	}
	
	

}
