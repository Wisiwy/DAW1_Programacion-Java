package clase;

import java.io.*;

public class Clase07_DataInputStream {

	public static void main(String[] args) {

		
		//DataOutput	escritura
		
			try {
				DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\binarioData.dat"));
																					//se le puede pasar un input o una cadena
				//write diferente para cada tipo de dato
				dos.writeInt(23);
				dos.writeUTF("Sophia");
				dos.writeInt(2000);
				
				dos.close();
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
																			
			//DataInput		lectura
			
			try {
				DataInputStream dis = new DataInputStream(new FileInputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\binarioData.dat"));
				
				//*****IMPORTANTE conocer la estructura de los datos escritos para saber como leerlos despues. 
				System.out.println("Edad: " + dis.readInt());
				System.out.println("Nombre: " + dis.readUTF());
				System.out.println("Year: " + dis.readInt());
			
			
			} catch (EOFException e) {
				System.err.println("Ya no hay mas datos.");
			} catch (FileNotFoundException e) { 
				e.printStackTrace();
			} catch (IOException e) { //exception de lectura y escritura
				e.printStackTrace();
			}
		
	}

}
