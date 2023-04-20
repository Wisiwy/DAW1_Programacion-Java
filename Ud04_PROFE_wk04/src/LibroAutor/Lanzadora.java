package LibroAutor;

import Estaticos.Leer;
import Menu.Utilidad;
import OBJETOS.TragaBolas;

public class Lanzadora {
	
	public static void main(String[] args) {
		
		boolean menu = true;
		String[] s = {"crear Libro","crear Autor","Modificar Libro","Modificar Autor","Ver Libros","Ver Autores"};
		
		Libro[] libros = new Libro[100];
		Autor[] autores = new Autor[100];


		do {
			
			int o = Utilidad.menu(s);
			
			if(o == 1) {
				//crear libros
				mostrarAutores(autores);
				System.out.println(" 00 - CREAR NUEVO.\n");
				
				int pos = Leer.leerEntero("Autor: ");
				
				Autor aut = null;
				if(pos == 0) {
					//creamos autor
					String nom = Leer.leerCadena("Nombre: ");
					String ema = Leer.leerCadena("Email: ");
					String gen = Leer.leerCadena("Género(m/f): ");
					
					aut = new Autor(nom,ema,gen);
					insertarAutor(aut,autores);
					
				}else {
					//utilizamos autor
					if(autores[pos-1] != null)  /////////////////CUIDADO!!!
						aut = autores[pos-1];
				}
				
				if(aut != null) {
				
					String titulo = Leer.leerCadena("Título: ");
					Double precio = Leer.leerDouble("Precio: ");
					
					Libro lib = new Libro(titulo,aut, precio);
					insertarLibro(lib,libros);
				}
			}else if(o ==2) {
				//creamos autor
				String nom = Leer.leerCadena("Nombre: ");
				String ema = Leer.leerCadena("Email: ");
				String gen = Leer.leerCadena("Género(m/f): ");
				
				Autor aut = new Autor(nom,ema,gen);
				insertarAutor(aut,autores);
				
				
			}else if(o == 3) {
				
			}else if(o == 4) {
				//modificar autor
				mostrarAutores(autores);
				
				int pos = Leer.leerEntero("\nAutor: ");
				
				if(autores[pos-1] != null) {
					
					String nombre = Leer.leerCadena("Nombre("+autores[pos-1].getNombre()+"): ");
					
					if(nombre.length() > 0)
						autores[pos-1].setNombre(nombre);
					
					String mail = Leer.leerCadena("Email("+autores[pos-1].getEmail()+"): ");
					
					if(mail.length() > 0)
						autores[pos-1].setEmail(mail);
					
					String gen = Leer.leerCadena("Género("+autores[pos-1].getGenero()+"): ");
					
					if(gen.length() > 0)
						autores[pos-1].setGenero(gen);
					
				}
				
				
			}else if(o == 5) {
				mostrarLibros(libros);
			}else if(o == 6) {
				mostrarAutores(autores);
			}else if(o==0) {
				menu = false;
			}else {
				System.err.println("Error. dato no valido.");
			}
			
		}while(menu==true);
		
		System.out.println("Salgo del programa.");
		
	}



	private static void insertarLibro(Libro lib, Libro[] libros) {

		for (int i = 0; i < libros.length; i++) {
			if(libros[i] == null) {
				libros[i] = lib;
				i = libros.length;
			}
		}
		
	}

	private static void insertarAutor(Autor aut, Autor[] autores) {

		for (int i = 0; i < autores.length; i++) {
			if(autores[i] == null) {
				autores[i] = aut;
				i=autores.length;
			}
		}
		
	}

	private static void mostrarAutores(Autor[] autores) {

		System.out.println();
		for (int i = 0; i < autores.length; i++) {
			if(autores[i] != null)
				System.out.printf(" %02d - %-15s %-15s \n",(i+1),autores[i].getNombre(),autores[i].getEmail());
		}
		
	}
	
	private static void mostrarLibros(Libro[] libros) {
		System.out.println();
		for (int i = 0; i < libros.length; i++) {
			if(libros[i] != null)
				System.out.println(libros[i].toString());
		}
		
	}

}
