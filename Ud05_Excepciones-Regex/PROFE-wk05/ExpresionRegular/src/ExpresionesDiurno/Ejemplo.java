package ExpresionesDiurno;

public class Ejemplo {
	
	public static void main(String[] args) {
		
		
		String dato = "05:56:09";
		String patron = Expresiones.getH24();
		
		if(dato.matches(patron))
			System.out.println("Coincide!!");
		else
			System.out.println("Algo va mal.");
		
		
		
		
	}

}
