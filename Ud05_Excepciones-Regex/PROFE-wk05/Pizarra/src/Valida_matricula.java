
public class Valida_matricula {
	
	
	public static void main(String[] args) {
		
		
		
		String mat = "1233gGH";
		
		if(mat.matches("[0-9]{4}[A-Z]{3}"))
			System.out.println("matricula válida");
		else
			System.out.println("invalida");
		
	}

}
