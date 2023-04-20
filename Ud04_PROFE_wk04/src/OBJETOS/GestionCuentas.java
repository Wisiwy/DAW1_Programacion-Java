package OBJETOS;

import java.util.Iterator;

import Estaticos.Leer;
import Menu.Utilidad;

public class GestionCuentas {

	public static void main(String[] args) {
		boolean menu = true;
		String[] s = { "Crear Cuenta", "Ingresar", "Retirar", "Visualizar", "Ver todas CUENTAS",
				"VER TODAS Cuentas Cliente", "Eliminar cuenta" };

		CuentaCorriente[] cuentas = new CuentaCorriente[100];
		Cliente[] clientes = new Cliente[100];

		// cargar(clientes)

		do {

			int o = Utilidad.menu(s);

			if (o == 1) {

				mostrarClientes(clientes);

				System.out.println();
				String resp = Leer.leerCadena("�Existe el cliente? (s/n): ");

				Cliente cli = null;
				if (resp.compareToIgnoreCase("s") == 0) {
					int pos = Leer.leerEntero("Posicion: ");
					cli = clientes[pos];
				} else if (resp.compareToIgnoreCase("n") == 0) {
					String nombre = Leer.leerCadena("Nombre: ");
					cli = new Cliente(nombre);
//					addCliente(cli,clientes);
				}

				// String cli = Leer.leerCadena("Cliente: ");
				double sal = Leer.leerDouble("saldo: ");

				CuentaCorriente aux = new CuentaCorriente(sal, cli);
				// int pos = Integer.parseInt(aux.getNumCuenta());
//				int pos = aux.getNumCuenta();
//				cuentas[pos] = aux; //colocamos la cuenta en la posicion que nos diga su id

				aux.setCliente(cli); // asignamos ese cliente a la cuenta
//				cli.addCuenta(aux); //a�adimos la cuenta al cliente

			} else if (o == 2) {

				int pos = Leer.leerEntero("NumCuenta: ");

				if (cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: ");
					cuentas[pos].ingresaEfectivo(cant);
				}

			} else if (o == 3) {

				int pos = Leer.leerEntero("NumCuenta: ");

				if (cuentas[pos] != null) {
					double cant = Leer.leerDouble("cantidad: ");
					if (cuentas[pos].retiraEfectivo(cant)) {
						System.out.println("se retira el dinero.");
					} else {
						System.out.println("no se puede retirar");
					}
				}

			} else if (o == 4) {

				int pos = Leer.leerEntero("NumCuenta: ");

				if (cuentas[pos] != null)
					cuentas[pos].visualiza();

			} else if (o == 5) {

				/*
				 * for (int i = 0; i < cuentas.length; i++) { if(cuentas[i] != null)
				 * cuentas[i].visualiza(); }
				 */
				System.out.println(" -------------------------------");
				System.out.printf("| %3s | %12s | %8s |\n", "id", "cliente", "saldo");
				System.out.println(" -------------------------------");
				for (CuentaCorriente c : cuentas) {
					if (c != null)
						c.visualiza();
				}
				System.out.println(" -------------------------------");
			} else if (o == 6) {

				for (Cliente cli : clientes) {
					if (cli != null) {
						System.out.println(cli.toString());
//						CuentaCorriente[] cuentasCli = cli.getCuentas();
//						for (CuentaCorriente cuenta : cuentasCli) {
//							if(cuenta != null)
//								cuenta.visualiza();
//						}
					}
				}

			} else if (o == 7) {
				int pos = Leer.leerEntero("NumCuenta: ");

				if (cuentas[pos] != null)
					cuentas[pos] = null;

			} else if (o == 0) {
				menu = false;
			} else {
				System.err.println("Error. dato no valido.");
			}

		} while (menu == true);

		System.out.println("Salgo del programa.");
	}

	private static void mostrarClientes(Cliente[] clientes) {

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null)
				System.out.printf("POS: %d --- Cliente: %s \n", i, clientes[i]);
		}

	}

//	private static void a�adirCliente(Cliente cli, Cliente[] clientes) {
//		
//		for (int i = 0; i < clientes.length; i++) {
//			
//			if(clientes[i] == null) {
//				clientes[i] = cli;
//				i=clientes.length;
//			}
//		}
////		
//	}
}

