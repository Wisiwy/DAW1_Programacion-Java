package ejer_StringsArrays;

import java.util.Arrays;

import aUTILIDAD.Leer;

public class Ejer20_password {

//	Realizar un m�todo para comprobar si un password es aceptable, el password se le pasar� como par�metro. 
//	Un password es aceptable si su tama�o es mayor que 2 y menor que 10.  Adem�s no puede contener ning�n 
//	espacio en blanco, y uno de los caracteres tiene que ser obligatoriamente uno de estos: #@$%&.
//	El m�todo devolver� un byte con la siguiente codificaci�n
//	 
//	0.- si es correcto
//	1.- si es menor de dos caracteres.
//	2.-  si es mayor de 10 caracteres.
//	3.-  si contiene espacios en blanco.
//	4.- si no contiene uno de los caracteres especiales.

	public static void main(String[] args) {

		String pass = "";
		

		pass = Leer.leerString("Introduzca Password:");
		
		byte[] a = new byte[5];
		if (pass.length() < 2)
			a[1] = 1;
		else if (pass.length() > 10)
			a[2] = 2;
		
		for (int i = 0; i < (pass.length()-1); i++) {
			if (pass.charAt(i) == ' ')
				a[3] = 3;			
			String check = "#@$%&";
			for (int j = 0; j < (check.length()-1); j++) {
				if (pass.charAt(i) != check.charAt(j)) 
					a[4]=4;
			}

		}
	System.out.println("Errores: " + Arrays.toString(a));
	//System.out.println("Error n�: " + a);
	}

}
