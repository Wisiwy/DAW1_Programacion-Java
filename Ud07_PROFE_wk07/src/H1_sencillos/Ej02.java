package H1_sencillos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Ej02 {
	public static void main(String[] args) {
		LinkedHashSet<String> ls = new LinkedHashSet();
		HashSet<String> hs = new HashSet();
		TreeSet<String> ts = new TreeSet();
		String[] s = {"este","montaña", "letra ", "bajo", "frio ","bajo "," bajo "," aleatorio"};
		
		int aleatorio = (int)(Math.random()*s.length);
		
		System.out.println("Se van a generar "+aleatorio+" datos");
		for (int i = 0; i < aleatorio; i++) {
			int num = (int)(Math.random()*s.length);
			
			System.out.printf("%s * ", s[num]);
			
			ls.add(s[num]);
			hs.add(s[num]);
			ts.add(s[num]);
		}
		
		System.out.println("\n\nValores de objHashSet");
		for (String lista : hs) {
			System.out.print(lista+" ");
		}
		
		System.out.println("\nValores de objLinkHashSet");
		for (String lista : ls) {
			System.out.print(lista+" ");
		}
		
		System.out.println("\nValores de objTreeSet");
		for (String lista : ts) {
			System.out.print(lista+" ");
		}
		
		System.out.print("\n\nValores de HashSet: "+hs);
		System.out.print("\nValores de LinkHashSet: "+ls);
		System.out.print("\nValores de TreeSet: "+ts);
	}
}
