package ejer_ClasesYObj;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Ej04_CuentaCorriente {

	public static void main(String[] args) {

//		Rellenar cuentas[]
		int aux = Leer.leerInt("Cuantas cuentas quieres crear: ");

		// ---------MENU----------
		String[] opciones = { "Crear nueva cuenta", "Ingresar en cuenta", "Retirar de cuenta ", "Visualizar cuenta",
				"Visualizar todas las cuentas" };

//		 Vector Array lista
		CuentaCorriente[] cuentas = new CuentaCorriente[100];
		Cliente[] clientes = new Cliente[100];
		boolean menu = true;
		do {
			int o = Dibujo.menu(opciones);

			if (o == 1) {

				// Diferencias si existe cliente o no existe.
				mostrarClientes(clientes);
				String resp = Leer.leerString("Existe el cliente? (s/n): ");
				Cliente cli = null;

//				Si EXISTE cliente
				if (resp.compareToIgnoreCase("s") == 0) {
//					cogemos la posicion del cliente existente
					int pos = Leer.leerInt("Posicion: ");
					cli = clientes[pos];

//				Si  NO EXISTE cliente
				} else if (resp.compareToIgnoreCase("n") == 0) {
//					Creamos el cliente, no existente
					cli = new Cliente(Leer.leerString("Nombre cliente: "));
//					añadirlo en el vector
				}

				// Crear nueva cuenta en cliente o nuevo o de la posicion elegida
				double sal = Leer.leerDouble("Saldo:");
				CuentaCorriente aux2 = new CuentaCorriente(sal, cli); // Cuenta AUX para trabajar

				// Cogemos la posicion donde ira el nuevo objeto aux
				int pos = aux2.getPos();// cogemos la posicion de la cuenta corriente bnueva que hallamos creado
				cuentas[pos] = aux2; // cogemos la posicion del vector de cuentas
				aux2.setCliente(cli); // asignamos ese cliente a la cuenta
				cli.anadirCuenta(aux2); // añadimos la cuenta al cliente

//					------------RAUL: Mi manera-------------
//					for (int i = 0; i < cuentas.length; i++) {
//						cuentas[CuentaCorriente.getNumSiguiente()] = new CuentaCorriente(Leer.leerDouble("Saldo inicial: "), Leer.leerString("Nombre titular: "));
//					}
// ----------------INGRESAR EFECTIVO
			} else if (o == 2) { 
				int pos = Leer.leerInt("num cuenta: ");
				if (cuentas[pos] != null) { // Si el numero de cuenta no esta vacio
					cuentas[pos].ingresaEfectivo(Leer.leerDouble("Ingreso: "));
				}

// ----------------RETIRAR EFECTIVO
			} else if (o == 3) {
				int pos = Leer.leerInt("num cuenta: ");
				if (cuentas[pos] != null) {
					if (cuentas[pos].retiraEfectivo(Leer.leerDouble("Retirar: ")))
						;
					System.out.println("Se retira dinero. ");
				} else
					System.out.println("Se retira dinero. ");

// ----------------VISUALIZAR UNA CUENTA
			} else if (o == 4) {
				int pos = Leer.leerInt("num cuenta: ");
				if (cuentas[pos] != null) {
					cuentas[pos].visualizar();
				}
				
//---------------VISUALIZAR TODAS LAS CUENTAS
			} else if (o == 5) {

				for (int i = 0; i < cuentas.length; i++)
					if (cuentas[i] != null)
						cuentas[i].visualizar();
//				foreach

				for (CuentaCorriente c : cuentas) {
					if (c != null)
						c.visualizar();
				}
//-------------VISUALIZAR TODAS CUENTAS CLIENTE
			} else if (o == 6) {
				for (Cliente cli : clientes) {
					if (cli != null) {
						System.out.println(cli.toString());
						//recogemos las cuentas del cliente
						CuentaCorriente[] cuentasCli = cli.getCuentas();
						//Recorremos las cuentas
						for (CuentaCorriente cuenta : cuentasCli) {
							if (cuenta!=null)
								cuenta.visualizar();
						}
					}
				}
				
				
			} else if (o == 7) {
			} else if (o == 0) {
				menu = false;
			} else
				System.err.println("Error. Dato no valido");
		} while (menu == false);

	}

	private static void mostrarClientes(Cliente[] clientes) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] != null) 
			
			System.out.printf("POS: %d ---- Cliente: %s %n",i,clientes[i].toString());
		}

	}

	private static void anadirCliente(Cliente cli, Cliente[] clientes) {
		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i] == null) {
				clientes[i] = cli;
				i = clientes.length;
			}

		}
	}

}
