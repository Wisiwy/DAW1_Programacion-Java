package h2_ejer5_filas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import aUtilidad.Dibujo;

public class MainFilas {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> f1 = new ArrayList<Integer>();
		List<Integer> f2 = new ArrayList<Integer>();
		List<Integer> f3 = new ArrayList<Integer>();
		List<Integer> f4 = new ArrayList<Integer>();
		List<Integer> f5 = new ArrayList<Integer>();
		List<List<Integer>> ofi = new ArrayList<List<Integer>>();
//		f1.add(0);
//		f2.add(0);
//		f3.add(0);
//		f4.add(0);
//		f5.add(0);
		ofi.add(f1);
		ofi.add(f2);
		ofi.add(f3);
		ofi.add(f4);
		ofi.add(f5);

//		 * Empieza bucle 5 horas
		Dibujo.titulo("OFICINA 5 VENTANILLLAS");
		for (int i = 1; i < 301; i++) {

			// INSERTAMOS UNA TAREA CADA 5 MIN
			if ((i == 1) || (i % 5 == 0)) {
				System.out.println();
				System.out.println("*********************");
				System.out.println("Min: " + i);
				System.out.println("*********************");
				InsertarTarea(AsignarCola(ofi));
			}
			if (i % 15 == 0) {
				System.out.println();
				System.out.println("*********************");
				System.out.println("Min: " + i);
				System.out.println("*********************");

				for (List<Integer> list : ofi) {
					Dibujo.monigote(list.size());
					System.out.print("Fila: " + MedirCola(list) + "// \n");
					if (list.size() > 0) {
						for (Integer tarea : list) {
							System.out.printf("%2dmin ", tarea);
						}
					}
					System.out.println();
				}
				System.out.println();
			}
			for (List<Integer> list : ofi) {
				if (list.size() > 0) {
//					System.out.println(list.get(list.size()-1));
					int aux = list.get(list.size() - 1);
					aux--;
//					System.out.println("Aux--: " + (aux));
					if (aux <= 0)
						list.remove(list.size() - 1);
					else
						list.set(list.size() - 1, aux);
					aux = 0;
				}

			}
			System.out.println(ofi);
			Thread.sleep(500);
		}

//PREGUNTA: como sacar el indice de donde estoy iterando con foreach o iterador (IndexOf se complica)

	}

	private static void ExtraerTarea() {

	}

	/**
	 * Inserta una tarea en la lista proporcionada
	 * 
	 * @param list
	 */
	private static void InsertarTarea(List<Integer> list) {

		Integer aux = (int) (Math.random() * 100);
		if ((0 <= aux) && (aux < 60)) {
			list.add(0, 30);
			System.out.printf("Tarea de %2d min.\n", 30);
		} else if ((60 <= aux) && (aux < 85)) {
			list.add(0, 40);
			System.out.printf("Tarea de %2d min.\n", 40);
		} else {
			list.add(0, 60);
			System.out.printf("Tarea de %2d min.\n", 60);
		}

	}

	private static List<Integer> AsignarCola(List<List<Integer>> ofiaux) {
		Comparator<List<Integer>> comp = (a, b) -> a.size() - b.size();
		ofiaux.sort(comp);
		// Devuelve la lista a la que tenemos que añadir la sig tarea
		return ofiaux.get(0);
	}

	/**
	 * 
	 * @param fila
	 * @return el tamaño de la cola en ese momento
	 */
	private static Integer MedirCola(List<Integer> fila) {
		return fila.size();
		//Medir el numero de minutos. 
	}

	/**
	 * 
	 * @param lista donde quitar minuto de la primerafila
	 * @return boolean true si la primera tarea se acaba
	 */
	private static void ServirCola(List<Integer> list) {

	}

}

////**LISTA DE PRUEBA
//f1.add(2);
//f1.add(11);
//f2.add(2);
//f2.add(22);
//f2.add(32);
//f3.add(3);
//f4.add(4);
//f5.add(5);
//ofi.add(f1);
//ofi.add(f2);
//ofi.add(f3);
//ofi.add(f4);
//ofi.add(f5);
//
////Imprimir filas de ofician
//for (List<Integer> fila : ofi)
//System.out.println(fila);
//System.out.println();
//
//System.out.print("Que tipo de tarea inserto: ");
//int aux = InsertarTarea();
//System.out.println(aux);
//AsignarCola(ofi).add(aux);
//
//int aux2 = InsertarTarea();
//System.out.println(aux2);
//AsignarCola(ofi).add(aux2);
//
//AsignarCola(ofi).add(InsertarTarea());
//for (List<Integer> fila : ofi)
//System.out.println(fila);
//
//System.out.println();

//
//******PROBATINA ORDENAR POR HASCODE
//El hascode cambia cada vez que intro un dato a la la fila . 
//private static int MedirCola() {
//Comparator<List<Integer>> comp = (a, b) -> a.size() - b.size();
//ofi.sort(comp);
//
//Iterator<List<Integer>> it = ofi.iterator();
//while (it.hasNext())
//System.out.printf("Fila: %d tareas. \n", it.next().size());
//return ofi.get(0).hashCode();
//
//}