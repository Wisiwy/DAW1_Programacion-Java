package ejer_StringsArrays_Profe;

import aUTILIDAD.Leer;

public class Ej_17 {
	
	public static void main(String[] args) {
		
		//int[][] frac = new int[2][3];
		//int[][] frac = {{1,2,8},{2,4,8}};
		int[][] frac = new int[2][3];
		pedir_datos(frac);
		//int[][] frac = {{3,4,0},{6,5,0}};
		
		String op = Leer.leerString("Operacion (+,-,*,/): ");
		//System.out.println(op);
		
		operar(frac,op);
		
		resultado(frac,op);
		
		System.out.println();
		simplifica(frac);
		resultado(frac,op);
	}
	
	private static void pedir_datos(int[][] frac) {

		for (int f = 0; f < frac.length; f++) {
			System.out.println("fraccion: "+(f+1));
			frac[0][f]= Leer.leerInt("numerador: ");
			frac[1][f]=	Leer.leerInt("denominador: ");	
		}
		
	}

	private static void operar(int[][] frac, String op) {
		
		if(op.compareTo("/") == 0) {
			System.out.println("division");
			frac[1][2] = frac[1][0] * frac[0][1];
			frac[0][2] = frac[0][0] * frac[1][1];
		} else if(op.compareTo("*") == 0) {
			System.out.println("multiplicacion");
			frac[1][2] = frac[1][0] * frac[1][1];
			frac[0][2] = frac[0][0] * frac[0][1];
		}else if(op.compareTo("+") == 0) {
			System.out.println("suma");
			frac[1][2] = frac[1][0] * frac[1][1];
			frac[0][2] = (frac[1][2]/frac[1][0]*frac[0][0])+(frac[1][2]/frac[1][1]*frac[0][1]);
		}else if(op.compareTo("-") == 0) {
			System.out.println("resta");
			frac[1][2] = frac[1][0] * frac[1][1];
			frac[0][2] = (frac[1][2]/frac[1][0]*frac[0][0])-(frac[1][2]/frac[1][1]*frac[0][1]);
		}else {
			System.out.println("No se ha podido hacer la operacion.");
		}
		
	}

	public static void resultado(int[][] f, String op) {
		
		if(op.compareTo("/") == 0)
			op=":";
		
		System.out.printf("    %2d    %2d     %2d  \n",f[0][0],f[0][1],f[0][2]);
		System.out.printf("   ---- %s ---- %s ---- \n",op,"=");
		System.out.printf("    %2d    %2d     %2d  \n",f[1][0],f[1][1],f[1][2]);
		
	}
	
	
	public static void simplifica(int[][] f) {
		
		int cont = 2;
		
		do {
			if(f[0][2]%cont ==0 && f[1][2]%cont==0) {
				f[0][2]=f[0][2]/cont;
				f[1][2]=f[1][2]/cont;
			}else {
				cont++;
			}
		}while(f[1][2] >= cont);
	
	}
	
	

}
