package clase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Clase05_BufferedReader {

	public static void main(String[] args) {

		File f = new File ("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\Buffered");
		try {
			FileReader fr = null;
			fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr); //Le pasamos un FileReader. El buffer leera linea a linea
				String linea = br.readLine();
				
				while (linea != null) {
					System.out.println(linea);
					linea = br.readLine(); //lee la siguiente linea.
				}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
		
	}

}
