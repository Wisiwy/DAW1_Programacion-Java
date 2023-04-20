package Estaticos;


import java.util.Scanner;

public class Leer {

	//Clase Leer que leerá diferentes tipos
	
	//Método leerEntero devuelve el entero leido
	public static int leerEntero(String str) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		valor = teclado.nextInt();
		
		//teclado.close();
		return valor;
	}
	
	public static double leerDouble(String str) {
		
		double valor;
		String valorSTR;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		//valor = teclado.nextDouble();
		valorSTR = teclado.next();
		if(valorSTR.indexOf(".") > 0) {
			valorSTR.replace(".", ",");
		}
		valor = Double.parseDouble(valorSTR);

		return valor;
	}
	
	public static String leerCadena(String str) {
		
		String valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		valor = teclado.nextLine();

		return valor;
	}
	
	public static boolean esPrimo(int num) {
		boolean valor = false;
		
		if ((num%2 !=0 && num%3 !=0 && num%5 != 0) || (num == 2 || num == 3 || num == 5) )
			valor = true;
		
		return valor;
	}
	
	public static int miFactorial(int num) {
		int valor = 0;
		
		if (num > 0) {
			valor = 1;
			for(int i=1;i<=num;i++)
				valor = valor * i;
		}
		
		return valor;
	}
	
	public static void tablaMultiplicar(int num) {
		System.out.println("Tabla de multiplicar de "+num);
		for(int i=1;i<=10;i++) {
			System.out.printf("%4d x %02d = %3d\n",num,i,(num*i));
		}
			
	}
	
	public static double miMedia(double[] vector) {
		double valor = 0.0, suma = 0.0;
		
		for(int i=0;i<vector.length;i++) {
			suma = suma + vector[i];
		}
		
		valor = suma / vector.length;
				
		return valor;
	}
	
	public static int miBusca(double[] vector, double nota) {
		int valor = -1;
		boolean encontrado = false;
		
		for(int i=0;i<vector.length;i++) {
			//if(vector[i] == nota && encontrado == false) {
			if(vector[i] == nota && !encontrado) {
				valor = i+1;
				encontrado = true;
			}
				
		}
						
		return valor;
	}

}
