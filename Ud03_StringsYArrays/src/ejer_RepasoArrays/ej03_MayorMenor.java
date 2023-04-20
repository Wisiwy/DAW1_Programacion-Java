package ejer_RepasoArrays;

import java.util.Arrays;

import aUTILIDAD.Dibujo;

public class ej03_MayorMenor {

	public static void main(String[] args) {
		
		int[] vector = new int[20];
		Arrays.setAll(vector, i-> (int)(Math.random()*20));
		int may = 0; int men = vector[0];
		int mayposi = 0; int menposi = 0;
		
		for (int i = 0; i < vector.length; i++) {
			if (vector[i]>may) { 
				may = vector[i];
				mayposi = i;
			}
			if (vector[i]<men) {
				men=vector[i];
				menposi = i;
			}
		}
		Dibujo.pintarVector(vector);
		System.out.println();
		System.out.printf("Mayor: %2d [%02d] // Menor: %2d [%02d]",may,(mayposi+1),men,(menposi+1));
		
	}

}
