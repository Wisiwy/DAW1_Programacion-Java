
public class Split {
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		String str = "rojo;amarillo-verde_azul";
		
		String[] parte = str.split("[-:._;]");
		
		for (int i = 0; i < parte.length; i++) {
			System.out.println(i+" -- "+parte[i]);
		}
		
		
		str = "esto es un ejemplo de como funciona split";
		String [] cadenas = str.split("(e[s|m])|(pl)");
		for(int i = 0; i<cadenas.length; i++){
			System.out.println(i+" -- "+cadenas[i]);
		}
		
		
	}

	
	
	
	
	
	
}
