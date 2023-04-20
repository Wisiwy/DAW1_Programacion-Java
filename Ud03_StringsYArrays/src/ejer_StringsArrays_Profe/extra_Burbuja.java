package ejer_StringsArrays_Profe;

import java.util.Arrays;

public class extra_Burbuja {
	
	public static void main(String[] args) {
		
		
		int[] vector = {5,3,4,2,1};
		int[] v2 = Arrays.copyOf(vector, 2);
		System.out.println(Arrays.toString(v2));
		int[] v3 = Arrays.copyOfRange(vector, 2, 5);
		System.out.println(Arrays.toString(v3));
		
		int[] v4 = new int[5];
		Arrays.fill(v4,3);
		System.out.println(Arrays.toString(v4));
		
		int[] v5 = new int[5];
		Arrays.setAll(v5, (i)->(int)(Math.random()*100));
		System.out.println(Arrays.toString(v5));
		
		
		
		
		
		//pintaVector(vector);
		
		System.out.println(Arrays.toString(vector));
		Arrays.sort(vector);
		System.out.println(Arrays.toString(vector));
		//pintaVector(vector);
		
		
		/*for (int veces = 0; veces < vector.length-1; veces++) {
			
		
			//ordenar vector
			//*******************************************
			for (int i = 0; i < vector.length-1; i++) {
				
				if(vector[i] > vector[i+1]) {
					//intercambio de valores
					int aux = vector[i];
					vector[i] = vector[i+1];
					vector[i+1] = aux;
				}
			}
			
			
			System.out.println("Veces: "+(veces+1));
			pintaVector(vector);
			//********************************************
		
		}*/
	}
	
	public static void pintaVector(int[] v) {
				
		System.out.println("  ---- ");
		for (int i = 0; i < v.length; i++) {
			System.out.printf(" | %2d | \n",v[i]);
			System.out.println("  ---- ");
		}
		
		System.out.println("\n\n");
	}

}
