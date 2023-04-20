package H1_sencillos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ej01 {
	
	public static void main(String[] args) {
		
		LinkedHashSet<Integer> listanueva = new LinkedHashSet();
		HashSet<Integer> listanumeros = new HashSet();
		TreeSet<Integer> otralista = new TreeSet();
		
		int aleatorio = (int)(Math.random()*20);
		
		System.out.println("Se van a generar "+aleatorio+" datos");
		for (int i = 0; i < aleatorio; i++) {
			int num = (int)(Math.random()*16);
			
			System.out.printf("%2d * ", num);
			
			listanueva.add(num);
			listanumeros.add(num);
			otralista.add(num);
		}
		
		System.out.println("\n\nValores de objHashSet");
		for (Integer lista : listanumeros) {
			System.out.print(lista+" ");
		}
		
		System.out.println("\nValores de objLinkHashSet");
		for (Integer lista : listanueva) {
			System.out.print(lista+" ");
		}
		
		System.out.println("\nValores de objTreeSet");
		for (Integer lista : otralista) {
			System.out.print(lista+" ");
		}
		
		System.out.print("\n\nValores de HashSet: "+listanumeros);
		System.out.print("\nValores de LinkHashSet: "+listanueva);
		System.out.print("\nValores de TreeSet: "+otralista);
	}
}
