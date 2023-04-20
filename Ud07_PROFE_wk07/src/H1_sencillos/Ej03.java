package H1_sencillos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ej03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> Datos = new ArrayList();
		LinkedList<Integer> Datos2 = new LinkedList();
		
		int datosR = (int)(Math.random()*10);
		
		System.out.println("Se van a generar "+datosR+" datos");
		for (int i = 0; i < datosR; i++) {
			int num = (int)(Math.random()*16);
			System.out.printf("%2d * ", num);
			Datos.add(num);
			Datos2.add(num);
		}
		System.out.println("\n\nValores de ArrayList");
		for (Integer lista : Datos) {
			System.out.print(lista+" ");
		}
		
		System.out.println("\nValores de LinkedList");
		for (Integer lista2 : Datos2) {
			System.out.print(lista2+" ");
		}
		System.out.println();
		System.out.println("Valores de ArrayList:"+Datos.toString());
		System.out.println("Valores de linkedList:"+Datos2.toString());

		
		
		

	}
}
