package ejer_baby;

import java.io.*;

public class ej_04_DataInput {

	public static void main(String[] args) {
		/*
		 * Escribir un program que guarde y lea 3 datos. 
		 * La estructura deber ser id, usuario, passwor(int,String,String)
		 */
		
		
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\ej_04_binData.dat"));
			dos.writeInt(4312);
			dos.writeUTF("RaulG");
			dos.writeUTF("password12");
			dos.flush();
			
			dos.close();
			
			//Leer los datos 
			DataInputStream dis = new DataInputStream(new FileInputStream("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Binarios\\ej_04_binData.dat"));
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
		
		}catch(EOFException e){
			System.err.println("Fin de fichero. No mas datos");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
