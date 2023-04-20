package expresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TesteoPatrones {

	public static void main(String[] args) {
		String dato = "";
		String patron = Patrones.getH24();
		
		if(dato.matches(patron)) //Que el string dato matchea 
			System.out.println("Valido!!");
		else
			System.err.println("Patron No valido!!!");


		
	}

	
	
}
