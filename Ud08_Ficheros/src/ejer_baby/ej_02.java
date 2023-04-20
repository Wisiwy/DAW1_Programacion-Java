package ejer_baby;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ej_02 {

	/*
	 * Escribe un programa Java que inicialice cuantro objeto sde tipo File: dos que
	 * hagan referencia a ficheros, que uno exista y otro no, y los otros dos a
	 * directorios, que uno exista y el otro no. El programa debe averiguar si
	 * existen dichos ficheros o directorios, independientemente de que sean una
	 * cosa o la otra. También debe averigua para cada objeto que exista si es un
	 * fichero o directorio. Al ahora de viasualizar el nombre del fichero o
	 * directorio prueba a usar los diferentes métodos get que ofrece la clase File
	 * pa la diferencia que hay entre cada uno de ellos
	 * 
	 * getPath, getParent, getAbsolutePatch, getName
	 */

	public static void main(String[] args) {

		File f1 = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\baby-Ej02\\a1.txt");
		File f2 = new File(".\\Files\\baby-Ej02\\a2.txt");
		File f3 = new File("D:\\1DAW_FP\\Programación\\DAW_Programacion-Java\\Ud08_Ficheros\\Files\\baby-Ej02\\d1");
		File f4 = new File(".\\Files\\baby-Ej02\\d2");

		List<File> filesList = new ArrayList();
		filesList.add(f1);
		filesList.add(f2);
		filesList.add(f3);
		filesList.add(f4);
		for (File file : filesList) {
			String name = file.getName();
			if (file.exists()) {
				System.out.println("El archivo " + name + " existe en la ruta " + file.getPath());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getAbsolutePath());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getParent());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getName());
				
				if (file.isDirectory())
					System.out.println(name + " es un directorio.");
				else if (file.isFile())
					System.out.println(name + " es un archivo.");
				else
					System.out.println("No sabemos lo que es. ");

			} else {
				System.out.println("El archivo " + name + " existe en la ruta " + file.getPath());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getAbsolutePath());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getParent());
				System.out.println("El archivo " + name + " existe en la ruta " + file.getName());
			}
			

			System.out.println();
		}

	}

}
