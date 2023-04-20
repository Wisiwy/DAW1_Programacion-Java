package h1_ejer_E_S;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		/**
		 * 1. Pide el nombre, después pide el apellido y al final saluda en una sola
		 * línea. (BufferedReader y Scanner)
		 */
		// creamos fichero con nombre
		File fnom = new File("/home/molossguay/Documents/Pro_wk_bajar-y-borrar/Ud08_Ficheros/Fichers/01_NomYApe.txt");
		if (fnom.exists()) {
			System.out.println("El archivo ya existe. Ruta: " + fnom.getAbsolutePath());
			// borrar el contenido del archivo existente
			try {
				FileWriter erase = new FileWriter(fnom);
				erase.write(' ');
				erase.flush();
				erase.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				fnom.createNewFile();
				System.out.println("Archivo creado correctamente. ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		//////////////////////////
		// escribimos, leemos y mostramos por pantalla .
		try {
			// filewriter creamos
			FileWriter fw = new FileWriter(fnom);

			// ejercicio 01 - nombre y saludo
			fw.write("Raul \n Hernandez \n Hola buenos dias \n ");
			fw.write("1,3,6,7,2,3");

			fw.flush();
			fw.close();
			// ejercicos 02 - numeros iguales

			// *******varios write no saltan de linea
			// leemos el contenido y lo mostramos por pantalla
			FileReader fr = new FileReader(fnom);
			BufferedReader br = new BufferedReader(fr);
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

		////////////
		// leemos por teclado
//		Scanner t = new Scanner(System.in);
//		System.out.println("Nombre:"); 
//		String nom = t.nextLine();
//		System.out.println("Apellido:"); 
//		String ape = t.nextLine();
//		System.out.println("Hola soy "+ nom + ape+ ". ¡Feliz Navidad");

		/**
		 * 2. Pedir dos números y decir si son iguales o distintos. (BufferedReader y
		 * Scanner)
		 */

		// buffered writer
		FileWriter fw = abrirWriter(fnom);
		try {
			fw.write("1,3,6,7,2,3");
			// fw.write(2);
			// fw.write("6");
			// fw.write(7);
			// fw.write(2);
			fw.flush();
		
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		///////////
		// buffered reader
		System.out.println("/////////////////////////////////////");
		BufferedReader br = abrirReader(fnom);
		br = saltasLineas(br, 3);
		String nums;
		try {
			nums = br.readLine();
			System.out.println(nums);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	
		List<Integer> numList = new ArrayList();
		try {
			while ((nums = br.readLine()) != null) {
				
				System.out.println(nums);
				String[] numsArray = nums.split(",");
				for (int i = 0; i < numsArray.length; i++) {
					numList.add(Integer.parseInt(numsArray[i]));
				}
				
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(numList);
	}

	private static FileWriter abrirWriter(File fnom) {
		FileWriter fw = null;
		try {
			fw = new FileWriter(fnom);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return fw;
	}

	private static BufferedReader saltasLineas(BufferedReader br, int i) {
		for (int j = 0; j < i; j++) {
			try {
				br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return br;
	}

	private static BufferedReader abrirReader(File fnom) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fnom));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return br;
	}

}
