
import java.util.InputMismatchException;
import java.util.Scanner;

public class Leer {

	//Clase Leer que leerá diferentes tipos
	
	//Método leerEntero devuelve el entero leido
	//InputMismatchException
	//NumberFormatException
	public static int leerEntero(String str) {
		int valor=-1;
		String cadena;
		Scanner teclado = new Scanner(System.in);
		boolean error = true;
		
		//valor = teclado.nextInt();
		while(error) {
			try {
				System.out.print(str);
				cadena = teclado.nextLine();
				if(cadena.length() != 0) {
					//si la cadena NO esta vacia
					valor = Integer.parseInt(cadena);
				}	
				error = false;
				
			} catch (NumberFormatException e) {
				System.err.print("Error. No es un número.\n");
				error = true; //no haria  falta puesto que ya es true
			} catch (Exception e) {
				System.err.println("Error inesperado. "+ e.getMessage());
			}
		}
		
		
		//teclado.close();
		return valor;
	}
	public static int leerEntero(String str, String regex) {
		int valor=-1;
		String cadena;
		Scanner teclado = new Scanner(System.in);
		boolean error = true;
		
		if(regex==null){
			regex="^-?\\d+$";
		}
		//valor = teclado.nextInt();
		while(error) {
			try {
				System.out.print(str);
				cadena = teclado.nextLine();
				if(cadena.length() != 0) {
					//si la cadena NO esta vacia
					if(cadena.matches(regex)) {
						valor = Integer.parseInt(cadena);
						error = false;
					} else {
						System.err.print("Por favor, vuelva a intentarlo.\n");
						error = true;
					}
				} else {	
					error = false;
				}
				
			} catch (NumberFormatException e) {
				System.err.print("Error. No es un número.\n");
				error = true; //no haria  falta puesto que ya es true
			} catch (Exception e) {
				System.err.println("Error inesperado. "+ e.getMessage());
			}
		}
		
		
		//teclado.close();
		return valor;
	}
	
	public static double leerDouble(String str) {
		double valor = -1;
		boolean error = true;
		String cadena;
		Scanner teclado = new Scanner(System.in);

		//valor = teclado.nextDouble();
		while(error) {
			try {
				System.out.print(str);
				cadena =teclado.nextLine();
				if(cadena.length() != 0) {
					cadena = cadena.replace(',', '.');
					valor = Double.parseDouble(cadena);
				}
				error = false;
			} catch(NumberFormatException e) {//NumberFormatException
				System.err.println("Error NaN. "+e.getMessage());
			} catch(InputMismatchException e) {
				System.err.println("Error coma. "+e.getMessage());
			}
		}
		
		return valor;
	}
	
	public static String leerCadena(String str) {
		String valor;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print(str);
		valor = teclado.nextLine();

		return valor;
	}
	public static String leerCadena(String str, String regex) {
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
