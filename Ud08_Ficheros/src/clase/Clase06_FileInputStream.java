package clase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Clase06_FileInputStream {

	public static void main(String[] args) {

			//**FileOutput escritura
		try (FileOutputStream fos = new FileOutputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\binario1.dat");
			FileInputStream fis = new FileInputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\binario1.dat")){
			String str ="La calse de 1 Daw escribe ficheros binario";
			//vector de byte[]
			byte[] dato = str.getBytes(); //hemos convertido cadena en 0 y 1. 
			fos.write(dato);
			fos.flush(); //Guardar la escritura
			fos.close();
			
			//**FileInput lectura
			int valor = fis.read(); //un entero ocupa un byte
			while(valor != -1) {
				System.out.println((char)valor);
				valor = fis.read();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
