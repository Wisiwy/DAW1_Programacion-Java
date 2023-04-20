package ejer3_alumno;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {

		String nombre[] = { "Armando", "Alejandro", "Adrian", "Bernardo", "Bartolo", "Beatriz", "Cristina", "Carmen",
				"Celia", "Daniel", "David", "Elisa", "Emma", "Fernando", "Genaro", "Helena", "Itciar", "Jorge",
				"Kasandra", "Leonardo", "Miriam", "Noelia", "Pablo", "Quique", "Rosa", "Tania" };
		String apellido[] = { "Aranda", "Bellido", "Cerezo", "Diaz", "Edelweis", "Ferandez", "Gutierrez", "Hernandez",
				"Ibarra", "Jimenez", "K", "Lopez", "Martinez", "Noguero", "Ordoñez", "Perez", "Quilez", "Rodriguez",
				"Sanz", "Tolosana", "Ubrique", "Velez", "Zoilo" };

		/// Parte 1//ArrayList con 50 alumnos
		List<Alumno> lista = new ArrayList();
		for (int i = 0; i < 50; i++) {
			int nom = (int) (Math.random() * nombre.length);
			int ape = (int) (Math.random() * apellido.length);
			int ape2 = (int) (Math.random() * apellido.length);
			int nota1 = (int) (Math.random() * 11);
			int nota2 = (int) (Math.random() * 11);
			int nota3 = (int) (Math.random() * 11);

			lista.add(new Alumno(nombre[nom], apellido[ape], apellido[ape2], nota1, nota2, nota3));
		}

		lista.forEach(System.out::println);

		// Parte 2
		// Mapas de notas
		Map<Integer, ArrayList<Alumno>> nota1 = new TreeMap();
		Map<Integer, ArrayList<Alumno>> nota2 = new TreeMap();
		Map<Integer, ArrayList<Alumno>> nota3 = new TreeMap();

		// Parte 3

		// Nota 1
		for (Alumno alumno : lista) {

			Integer clave1 = alumno.getNota1();

			ArrayList<Alumno> valor1;
			if (nota1.containsKey(clave1)) {
				valor1 = nota1.get(clave1);
				System.out.println("Ya existe la clave:" + valor1);
			} else {
				valor1 = new ArrayList();
				System.out.println("Se crea el valor. ");
			}
			valor1.add(alumno);
			nota1.put(clave1, valor1);

		}

		for (Integer pos : nota1.keySet()) {

			System.out.println("Nota: " + pos);
			//System.out.println("Valor: " + nota1.get(pos));
			ArrayList<Alumno> aux = nota1.get(pos);
			for (Alumno a : aux) {
				System.out.printf("   %10s, %10s %10s \n",a.getNombre(),a.getApellido1(),a.getApellido2());
			}
		}
/*
		// Nota 2
		for (Alumno alumno : lista) {

			Integer clave2 = alumno.getNota2();

			ArrayList<Alumno> valor2;
			if (nota2.containsKey(clave2)) {
				valor2 = nota2.get(clave2);
				System.out.println("Ya existe la clave:" + valor2);
			} else {
				valor2 = new ArrayList();
				System.out.println("Se crea el valor. ");
			}
			valor2.add(alumno);
			nota2.put(clave2, valor2);

		}

		for (Integer pos : nota2.keySet()) {

			System.out.println("Clave: " + pos);
			System.out.println("Valor: " + nota2.get(pos));
		}

		// Nota 3
		for (Alumno alumno : lista) {

			Integer clave3 = alumno.getNota3();

			ArrayList<Alumno> valor3;
			if (nota3.containsKey(clave3)) {
				valor3 = nota3.get(clave3);
				System.out.println("Ya existe la clave:" + valor3);
			} else {
				valor3 = new ArrayList();
				System.out.println("Se crea el valor. ");
			}
			valor3.add(alumno);
			nota3.put(clave3, valor3);

		}

		for (Integer pos : nota3.keySet()) {

			System.out.println("Clave: " + pos);
			System.out.println("Valor: " + nota3.get(pos));
		}
*/
		// Recorrer lista alumnos

		System.out.println("\n\nLe toca a: " + ((int) (Math.random() * 13) + 1));

	}

}
