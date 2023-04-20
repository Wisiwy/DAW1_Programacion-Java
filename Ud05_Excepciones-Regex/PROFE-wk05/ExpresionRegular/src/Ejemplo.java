
public class Ejemplo {
	
	public static void main(String[] args) {
		
		String dato="01:16:21";
		String patron = Expresiones.getH12();
		
		if(dato.matches(patron))
			System.out.println("Coincide!!");
		else
			System.out.println("Algo no va bien.");
		
		
	}

}
