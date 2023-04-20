package ejerExtra;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class ApellidosEx2 {

	public static void main(String[] args) {

//		INICIAR CLASES

		Cliente[] clientes = new Cliente[100];
		Bicicleta[] bicicletas = new Bicicleta[100];

//		Rellenar vectro CLIENTE
		clientes[1] = new Cliente("Miguel Indurain", 676234123);
		clientes[2] = new Cliente("Shakira", 665234111);
		clientes[3] = new Cliente("Joane Somarriba", 664212278);

//		Rellenar vectro BICICLETAS
		bicicletas[1] = new Bicicleta("Mountain BK1", 3, 2, "llantas antipinchazos 50 radios aros dobles", 345.23);
		bicicletas[2] = new Bicicleta("Carreter M1", 4, 3, "camara antipinchazos 36 radios aros dobles", 345.23);
		bicicletas[3] = new Bicicleta("Pista P3", 3, 3, "lenticulares", 345.23);
		bicicletas[4] = new Bicicleta("Paseo S2", 2, 2, "radios aro simple", 345.23);
		bicicletas[5] = new Bicicleta("Iniciacion", 1, 1, "radios aro simple", 345.23);
		bicicletas[6] = new Bicicleta("Carretera M2", 3, 2, "camara antipinchazos 36 radios aros simples", 345.23);

		
//		--------------MENU------------------
		
		String[] opc = {"Crear cliente", "Crear bicicleta", "Modificar bicicleta","Vender bicicleta", "Bicis no vendidas", "Bicis vendidas", "Lista clientes"};
		int o = Dibujo.menu(opc);
		
//		Hora2 miHora = new Hora2();  Objeto si no es null se rellana
		boolean menu = true;
		do {
			
			if (o == 1) {
				//mirar posibles validaciones
				rellenarCliente(clientes);
				
			} else if (o == 2) {
				rellenarBici(bicicletas);

			} else if (o == 3) {
				 String[] subopc = { "Modificar modelo.", "Modificar platos.", "Modificar pinones.", "Tipos de ruedas.", "Opc5","Opc6" };
//					int o = Dibujo.menu(subopc);

//					Hora2 miHora = new Hora2();
//					boolean menu = true;
					do {

						if (o == 1) {
							
						} else if (o == 2) {
							

						} else if (o == 3) {
							
						} else if (o == 0) {
							menu = false;
						} else
							System.err.println("Error. Dato no valido");
					} while (menu == false);
				
			} else if (o == 4) {
//				if (miHora != null) {
					

			} else if (o == 5) {
//				if (miHora != null) {
					
			} else if (o == 6) {

			} else if (o == 0) {
				menu = false;
			} else
				System.err.println("Error. Dato no valido");
		} while (menu == false);
		
		

	}

//	Rellena una bici en primer puesto vacio
	private static void rellenarBici(Bicicleta[] bicicletas) {
		for (int i = 0; i < bicicletas.length; i++) {
			if (bicicletas[i].getModelo() == null) {
				bicicletas[i].setModelo(Leer.leerString("Intro modelo bici: "));
				bicicletas[i].setPlatos(Leer.leerInt("Intro platos: "));
				bicicletas[i].setPinones(Leer.leerInt("Intro pinyones: "));
				bicicletas[i].setRueda(Leer.leerString("Intro modelo rueda: "));
				bicicletas[i].setPrecio(Leer.leerDouble("Intro precio: "));
				i = bicicletas.length;
			}
		}
	}

//	Rellena una cliente en primer puesto vacio
	private static void rellenarCliente(Cliente[] clientes) {
		String nom = Leer.leerString("Nombre cliente: ");
		Integer tlfn = Leer.leerInt("Tlfn cliente: ");

		for (int i = 0; i < clientes.length; i++) {
			if (clientes[i].getNombre() == null) {
				clientes[i] = new Cliente(nom, tlfn);
				i = clientes.length;
			}
		}

	}

}
