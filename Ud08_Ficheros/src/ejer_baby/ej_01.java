package ejer_baby;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej_01 {

	public static void main(String[] args) {

		/*
		 * 1)Crea un fichero de txt con el nombre y contendio que tú quieras. Después,
		 * crea una aplicación que lea este fichero de txt carácter a carácter y muestre
		 * su contenido por pantalla sin espacios. Por ejemplo, si un fichero tiene el
		 * siguient txt "Mi nombre es Daniel", deberá mostrar "MinombreesDaniel"*
		 */

		File f = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\babyEj01");
		try {
			f.createNewFile();
			FileWriter fw = new FileWriter(f);
			fw.write("Mi Nombre es Raul Gomez Sanz");
			fw.close();

			FileReader fr = new FileReader(f);
			int dato = fr.read();
			
//			while (dato != -1) {
//				
//				if((char)dato == 32)
//					dato=fr.read();
//				else {
//					System.out.print((char) dato);
//					dato = fr.read();
//				}
//
//			}
			
			String buff = "";
			while (dato != -1) {
				if((char)dato != 32)
					buff+=(char)dato;
				dato = fr.read();
			}
			System.out.println(buff);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
