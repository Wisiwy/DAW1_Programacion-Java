import java.util.Scanner;

public class Dos {
	
	public static void main(String[] args) {
		
		
		double num = 0;
		try {
			Scanner t = new Scanner(System.in);
			System.out.print("Número: ");
			num = t.nextDouble();
		}catch(Exception e) {
			//System.out.println(e.getClass());
			//e.printStackTrace();
			System.err.println("dato no válido!");
		}
		
		System.out.println("He leido: "+num);
		
		
		
		System.out.println("Fin del programa!");
		
		
	}

}
