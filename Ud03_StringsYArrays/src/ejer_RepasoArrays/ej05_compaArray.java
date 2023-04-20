package ejer_RepasoArrays;

import java.util.Arrays;

import aUTILIDAD.Dibujo;

public class ej05_compaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vect1 =new int[5];
		int[] vect2 =new int[5];
		
		Arrays.setAll(vect1, i->(int)(Math.random()*5));
		Arrays.setAll(vect2, i->(int)(Math.random()*5));
		Dibujo.pintarVector(vect1);
		System.out.println();
		Dibujo.pintarVector(vect2);
		
		int cont=0;
		for (int i = 0; i < vect1.length; i++) {
			cont=0;
			for (int j = 0; j < vect2.length; j++) {
				if (vect1[i] == vect2[j])
					cont++;					
			}
			System.out.printf("%n Elemento %d : %d veces. ",(i+1),cont);
		}
		
	}

}
