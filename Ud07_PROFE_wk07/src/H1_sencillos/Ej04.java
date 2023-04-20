package H1_sencillos;

import java.util.*;

public class Ej04 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList();
		LinkedList<String> list2 = new LinkedList();

		String[] n = { "este", "montaña", "letra ", "bajo", "frio ", "bajo ", " bajo ", " aleatorio" };

		int ale = (int) (Math.random() * n.length);

		System.out.println("Se van a generar " + ale + " datos.");

		for (int i = 0; i < ale; i++) {
			int num = (int) (Math.random() * n.length);

			System.out.printf("%s * ", n[num]);

			list.add(n[num]);
			list2.add(n[num]);

		}

		System.out.println("\n\n Valores de objArrayList:");
		for (String s : list) {
			System.out.print(s + " ");

		}

		System.out.println("\n\n Valores de objLinkedList:");
		for (String s2 : list2) {

			System.out.print(s2 + " ");
		}
		System.out.println();
		System.out.print("\nValores de objArrayList:"+list);
		System.out.println();
		System.out.print("Valores de objArrayList:"+list2);
		System.out.println();
		System.out.println(":)");

	}
}
