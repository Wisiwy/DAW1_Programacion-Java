package h3_ejer02_trenes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import aUtilidad.Dibujo;
import aUtilidad.Leer;

public class Main {
	public static void main(String[] args) {

		Tren t1 = new Tren("10:30", "Atocha", "Delicias");
		Tren t2 = new Tren("11:15", "Sans", "Giralda");
		Tren t3 = new Tren("12:45", "Canvalache", "Miraflores");

		// Listado de trenes.
		ArrayList<Tren> trenes = new ArrayList();
		trenes.add(t1);
		trenes.add(t2);
		trenes.add(t3);

		// Lista billetes
		ArrayList<Billete> billetes = new ArrayList();

		String[] menu = { "Venta billetes", "Anulacion Billetes", "Listado trenes" };
		int opc;
		do {

			Dibujo.titulo("MEJOR QUE RENFE");
			opc = Dibujo.menu(menu);
			switch (opc) {
			case 1: {
				Billete aux2 = ventaBillete(trenes);
				imprimBill(aux2);				
				// Meter b	illete en array
				billetes.add(aux2);	
				
				Dibujo.titulo("LISTA TRENES");
				for (Tren tren : trenes) {
					pintarTren(tren);
				}
				break;
				// Añadir billete a coleccion de billetes para ordenar.

			}
			case 2: { // ANULAR BILLETE
				// Recoger billete de vector
				Billete auxBill = elegirBillete(billetes);
				anularBillete(trenes, auxBill);
				billetes.forEach(a -> System.out.println(a));
				billetes.forEach(System.out::println);
				for (Tren tren : trenes) {
					pintarTren(tren);
				}
				break;
			}
			case 3: {
//				consultarTrenes();
//				consultarBilletes();
//					//ordnar billetes por ...

			}
			case 0: {
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);

			}
			System.out.println();
			System.out.println(
					"++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println();
		} while (opc != 0);

	}

	
	private static void imprimBill(Billete aux2) {
		System.out.println();
		System.out.print("|************************|");
		System.out.println(aux2);
		System.out.println("|************************|");
	}


	private static Billete elegirBillete(ArrayList<Billete> billetes) {
		// Pedir id de billete
		
		Dibujo.titulo("LISTA BILLETES");
		billetes.forEach(System.out::println);
		Integer idBill = Leer.leerIntPosi("Indica id de billete a borrar:");
		for (Billete billete : billetes) {
			if (billete.getNumBill() == idBill)
				return billete;
			else
				System.out.println("Id billete no existe");
		}
		return null;

	}

	private static void pintarTren(Tren auxTre) {
		
		System.out.println(auxTre);
		auxTre.pintarVagones();
	}

	private static void anularBillete(ArrayList<Tren> trenes, Billete auxBi) {
		// Pintar trentes : preguntar usuario trenes
		Tren auxTren = null;
		for (Tren tren : trenes) {
			if (auxBi.getNumTrenBill() == tren.getNumTren())
				auxTren = tren;
			}
		// Recoger el vagon del tren
		Vagon auxVag = auxTren.getVagonById(auxBi.getNumVagonBill());

		// Recoger num asiento billete y borrarlo
		auxVag.borrarAsiento(auxBi.getAsiento());
	}

	private static Billete ventaBillete(ArrayList<Tren> trenes) {
		// Crear billete
		Billete auxBill = new Billete();
		// Elegir tren con fecha.
		Tren auxTren = listarTrenes(trenes);
		System.out.println("Num tren elegido: " + auxTren.getNumTren());
		System.out.println();
		// Sumar asiento en vagon.
		// Coger vagon
		Vagon vagBill = auxTren.getVagon();
		// Asigno asiento y recogo billete.
		// Mirar si comprueba si los asientos de los vagones estan vacios.
		Integer numAsi = vagBill.sumarAsiento();
		// Poner elegir asiento, vagon y tren.
		// Set numtren y hora
		auxBill.setNumTrenBill(auxTren.getNumTren());
		auxBill.setHoraSal(auxTren.getHoraSal());
		auxBill.setNumVagonBill(vagBill.getNumVag());
		auxBill.setAsiento(numAsi);

		return auxBill;

	}

	/**
	 * Lista los trenes y devuelve el tren elegido <b>Return</b> Tren elegido
	 */
	private static Tren listarTrenes(ArrayList<Tren> trenes) {
		Integer opc1;
		Dibujo.titulo("Listado de Trenes");
		for (int i = 0; i < trenes.size(); i++) {
			System.out.println(i + " - " + trenes.get(i));
		}
		opc1 = Leer.leerIntRango("Elige tren: ", 0, trenes.size());

		return trenes.get(opc1);

	}

}
