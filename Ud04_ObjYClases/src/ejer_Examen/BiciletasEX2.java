package ejer_Examen;

import aUtilidad.Dibujo;
import aUtilidad.Leer;
import aUtilidad.Vali;

public class BiciletasEX2 {

//	----LISTADOS INICIALES------

//	clientes
	static Cliente clientes[] = new Cliente[100];
//	bicicletas
	static Bicicleta bicicletas[] = new Bicicleta[100];

	public static void main(String[] args) {

//Rellenar clientes
		clientes[0] = new Cliente("Miguel Indurain", 676234123);
		clientes[1] = new Cliente("Shakira", 665234111);
		clientes[2] = new Cliente("Joane Somarriba", 664212278);
//Rellenar bicis
		bicicletas[0] = new Bicicleta("Mountain BK1", 3, 2, "llantas anti-pinchazo de 40 radios y aros dobles", 345.23);
		bicicletas[1] = new Bicicleta("Carretera M1", 4, 3, "camara anti-pinchazo de 36 radios y aros dobles", 280.56);
		bicicletas[2] = new Bicicleta("Pista P3", 3, 3, "Lenticulares", 470.66);
		bicicletas[3] = new Bicicleta("Pasio S2", 2, 2, "30 radios aro simple", 180.20);
		bicicletas[4] = new Bicicleta("Iniciacion", 1, 1, "24 radios aro simple", 80.12);
		bicicletas[5] = new Bicicleta("Carretera M2", 3, 2, "camara anti-pinchazo de 36 radios y aros simples", 210.23);

//		--------------------MENU------------------
		int o;
		do {
			Dibujo.titulo("TIENDA RAULES BICIS");
			String[] menu = { "Crear cliente", "Crear bicicleta", "Modificar bicicleta", "Vender bicicleta",
					"Listado bicicletas sin vender", "LIstado bicicletas vendidas", "Listado clientes" };
			o = Dibujo.menu(menu);
			switch (o) {
			case 1:
				System.out.println("||CREAR CLIENTE||");
				crearCliente();
				mostrarClientes(clientes);

				break;
			case 2:
				mostrarBicis(bicicletas);
				crearBici();
				mostrarBicis(bicicletas);
				break;
			case 3:
//			modificar bici
				mostrarBicis(bicicletas);
				bicicletas[Leer.leerInt("Que bici quieres modi?")].moficarBici();

				System.out.println("Bici modificada");

				break;
			case 4:
//			vender bicicleta

//				ELigo la bici y la guardo en opt
				mostrarBicis(bicicletas);
				System.out.println("--------------------------");
				int opt = Leer.leerInt("Que bici quieres vender: ");
				opt--;
//				Eligo cliente para vendersela.
				mostrarClientes(clientes);
				int opt2 = Leer.leerInt("A quien se la vendes:");
				opt2--;
				System.out.println("--------------------------");

				Cliente aux = clientes[opt2];
				bicicletas[opt].setCliente(aux);
				clientes[opt2].setListaBicis(bicicletas[opt]);

				break;
			case 5:
				mostrarBicis(bicicletas);
				break;
			case 6:
				mostrarBicisVendidas(bicicletas);
				break;
			case 7:
				mostrarClientes(clientes);
				break;

			default:
				break;
			}

		} while (o != 0);

//		System.out.println(clientes[1].toString());
//		for (int i = 1; i < clientes.length; i++) {
//		clientes[i].toString();
//	}

	}

//---------------METODOS-------------------------------
	// crear bicicleta
	public static void crearBici() {
		System.out.println("Crear bici: ");
		System.out.println("-------------------");
		for (int i = 0; i < bicicletas.length; i++) {
//			pedir datos nueva bicicleta
			if (bicicletas[i] == null) {
				String modelo = Leer.leerString("Intro modelo: ");
				Integer platos = Leer.leerInt("Intro num platos: ");
				Integer pinones = Leer.leerInt("Intro num pinones: ");
				String ruedas = Leer.leerString("Intro tipo ruedas: ");
				double precio = Leer.leerDouble("Intro predio ");
				Bicicleta biciaux = new Bicicleta(modelo, platos, pinones, ruedas, precio);
				bicicletas[i] = biciaux;
				i = bicicletas.length;
			}

		}

	}

	// crear cliente
	public static void crearCliente() {
		System.out.println("Crear cliente: ");
		System.out.println("-------------------");
		for (int i = 0; i < clientes.length; i++) {
//			pedir datos nuevo cliente
			if (clientes[i] == null) {
				String nombre = Leer.leerString("Intro nombre: ");
				Integer tlfn;
				String tlfnaux = null;
				do {
					tlfnaux = Leer.leerString("Intro tlfn");
					if ((!Vali.esNum(tlfnaux)) || (tlfnaux.length() != 9))
						System.err.println("Intro num de 9 cifras.");
				} while ((!Vali.esNum(tlfnaux)) || (tlfnaux.length() != 9));
				tlfn = Integer.parseInt(tlfnaux);
				Cliente clienteaux = new Cliente(nombre, tlfn);
				clientes[i] = clienteaux;
				i = clientes.length;
			}
		}
	}

	// Mostrar clientes

	public static void mostrarClientes(Cliente[] listado) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null) {
				System.out.println(listado[i].toString());

				for (int j = 0; j < listado[i].getListaBicis().length; j++) {
					if (listado[i].getListaBicis()[j] != null) {
						System.out.printf("\t ");
						System.out.println(listado[i].getListaBicis()[j].toString());

					}

				}
			}
		}

	}

	public static void mostrarBicis(Bicicleta[] listado) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null && listado[i].getCliente() == null) {
				System.out.printf(" [%d] %s \n", (i + 1), listado[i].toString());
			}
		}
	}

	private static void mostrarBicisVendidas(Bicicleta[] listado) {
		for (int i = 0; i < listado.length; i++) {
			if (listado[i] != null && listado[i].getCliente() != null) {
				System.out.printf("%s // Propietario: %s \n", listado[i].toString(),
						listado[i].getCliente().getNombre());
			}
		}
	}

}
