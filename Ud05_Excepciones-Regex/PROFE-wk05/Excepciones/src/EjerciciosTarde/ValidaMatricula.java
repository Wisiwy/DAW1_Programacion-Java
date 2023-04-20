package EjerciciosTarde;

public class ValidaMatricula {
	
	
	public static void main(String[] args) {
		
		
		String mat = "1234gFG";
		
		
		if(mat.matches("[0-9]{4}[A-Z]{3}")) {
			System.out.println("Coincide");
		}else
			System.out.println("No es valida");
	}

}
