package clase;

import java.io.File;
import java.io.IOException;

public class Clase02_File {

	public static void main(String[] args) {

		
//		Crear carpeta y 2 archivos en su interior. Visualizar contendido carpeta
		File f1 = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\Clase02_dir1");
		
		if(!f1.exists())
			f1.mkdir();		
		
		System.out.println("------RUTAS------");
		System.out.println("Path: " + f1.getPath());
		System.out.println("Absolute: " + f1.getAbsolutePath());
		System.out.println("Parent: " + f1.getParent());
		System.out.println();
		
		File f2 = new File(f1.getPath()+"\\archivo1");
		File f3 = new File(f1.getPath()+"\\archivo2");
		
		if(f2.exists())
			f2.delete();
		if(f3.exists())
			f3.delete();
		
		try {
			
			f2.createNewFile();
			System.out.println("Archivo creado correctamente. ");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			f3.createNewFile();
			System.out.println("Archivo creado correctamente. ");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] cont = f1.list();
		System.out.println(cont.length);
		for (int i = 0; i < cont.length; i++) {
			System.out.println(cont[i]);
		}
		
	// ----------------SOLUCION PROFE-------------
		//generar archivo con bucle
		for (int i = 0; i < 20; i++) {
			String nombre = String.format("%s\\archivo_%3d",f1.getPath(),i );
			File f4 = new File(nombre);
			
			if(!f4.exists())
			try {
				f4.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		//Fisualizar contentido (files)
		if(f1.isDirectory()) {
			File[] lista = f1.listFiles();
			for (File file : lista) {
				System.out.println(file.getParent() + "--"+file.getName());
			}
		}
		
		//Crear archivo desde el padre
		File carpeta = new File ("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\carpeta2");
		File a1 = new File(carpeta, "archivo1.txt"); //padre, nombre del final ruta
			//al crear file solamente indicamos la ruta
		carpeta.mkdir();
		try {
			a1.createNewFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Delete 
			//necesidad de borrar el contenido de la carpeta antes de borrar
			//carpeta vacia se puede borrar y archivo //carpeta con algo dentro no
		
		
		
		
		
	}

}
