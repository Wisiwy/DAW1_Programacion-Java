package clase;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Clase03_FileReaderWriter {

	public static void main(String[] args) {

		
		File f = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\fw");
		try {
		//******FILEWRITER: permite escribir en un archivo. *******
			FileWriter fw = new FileWriter(f); //tambien vale meterle la ruta. 
			
				//***METODOS PRINCIPALES FILEWRITER***
				fw.write("Esta es la clase vespertino . Mi primer fw.write");
				fw.write(65); //numero asci "A"
				
				fw.flush();//guardado, limpieza de buffer. De vez en cuando por seguridad. 
				fw.close(); //guarda y cierra el flujo datos.
				
				fw = new FileWriter(f); //abrir flujo de datos
				fw = new FileWriter(f,true); //Constructor(file, boolean append) true añade al final, false sobreescribe	
				fw.close();
		
		//****FILEREADER apuntador 
			FileReader fr = new FileReader(f); //Crea un apuntador señala donde leeemo, del fichero.
				//***METODOS PRINCIPALES FILEWRITER***
				int dato = fr.read();//fr.read te devuelve -1 si es el final del archivo
									//devuelve int num asci del character
				
				while(dato!=-1) {
					System.out.println((char)dato); //casteamos del dato al char
					dato = fr.read();
				}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
