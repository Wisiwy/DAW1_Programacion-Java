package clase;

import java.io.File;
import java.io.IOException;

public class Clase01_File {

	public static void main(String[] args) {

		File f1 = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\CarpetaRaul"); // directorio
		File f2 = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\Fichero2"); // archivo

		// crea "CarpetaRaul" en esa ruta.

		// _________Si F1 no existe directorio lo crea________________________
		if (f1.exists()) { // comprobar si existe la ruta.
			System.out.println("Existe la ruta: " + f1.getPath());
			f1.delete(); // borra el fichero f1.
		} else {
			System.out.println("No se encuentra:" + f1.getPath());
			if(f1.mkdir()) //devuelve false si no se ha creado 
				System.out.println("Creado correctamente.");
			else
				System.out.println("No se puede crear.");
			
		}

		// _________Si F2 no existe directorio lo crea________________________

		if (f2.exists()) {
			System.out.println("Existe la ruta:  " + f2.getPath());
		} else {
			System.out.println("La ruta " + f2.getPath() + " no se encuentra");
		
			try {
				if(f2.createNewFile())
					System.out.println("Archivo creado corectamente");; // crea un fichero sin extension, la extension da pista de lo que es no es
									// obligatoria.
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
	}

}
