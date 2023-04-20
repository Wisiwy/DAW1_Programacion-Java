package ejer_RepasoArrays;

import java.util.Arrays;

public class ej01_media {

	public static void main(String[] args) {

		int vect[] = new int[20];

		Arrays.setAll(vect, (i) -> (int) (Math.random() * 20) - 10);

		for (int i = 0; i < vect.length; i++) {
			System.out.print(vect[i] + ", ");
		}
		int med = media(vect);

		System.out.println("--------------------------");
		System.out.println("La media de todo es:" + med);
		System.out.println("--------------------------");
		// superiors, inferiores.
		int[] sup = new int[20];
		int[] inf = new int[20];
		int[] igu = new int[20];
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] > med) {
				sup[i] = vect[i];
			} else if (vect[i] < med) {
				inf[i] = vect[i];
			} else
				igu[i] = vect[i];
		}
//		Imprimer vectores con sup, inf e igual
		System.out.print("-SUPERIORES A LA MEDIA: ");
		for (int i = 0; i < sup.length; i++) 
			System.out.print(sup[i] + ", ");
		System.out.println();
		System.out.print("-INFERIORES A LA MEDIA: ");
		for (int i = 0; i < inf.length; i++) 
			System.out.print(inf[i] + ", ");
		System.out.println();
		System.out.print("-IGUALES A LA MEDIA: ");
		for (int i = 0; i < igu.length; i++)
			System.out.print(igu[i] + ", ");		
		
		
	}

	private static int media(int[] vect) {
		int med = 0;
		for (int i = 0; i < vect.length; i++) {
			med += vect[i];
		}
		return med = med / vect.length;
	}

}
