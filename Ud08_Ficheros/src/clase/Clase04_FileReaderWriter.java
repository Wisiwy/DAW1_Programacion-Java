package clase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Clase04_FileReaderWriter {

	public static void main(String[] args) {
		File f = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\Clase03_LineaALinea.txt");
		try {
			FileReader fr = new FileReader(f);
			try {
			int dato = fr.read();
				while(dato != -1 ) {
					 dato = fr.read();
					if ((char)dato == 10) {
						System.out.println();
					}else
					System.out.print((char)dato);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// ----------------SOLUCION PROFE-------------

				//() copiar de wk profe
		
		
	}

}
