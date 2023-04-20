package comedor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Comedor {

	public static void main(String[] args) {

		List<Plato> platos = new ArrayList<>();
		List<Ingrediente> ingredientes = new ArrayList<>();
		List<Mesa> clientes = new ArrayList<>();
		Set<Plato> carta = new TreeSet<>();
		crea(platos, ingredientes);// Crea seis platos
		int pos;
		while (carta.size() < 6) {// Confecciona la carta con los platos existentes
			pos = (int) (Math.random() * platos.size());
			carta.add(platos.get(pos));
		}
		String[] MENU = { "Salir", "Alta de ingrediente", "Alta de plato", "Alta mesa", "Factura de mesa",
				"Asignar ingredientes al plato" };
		int opcion = -1;
		while (opcion != 0) {// Menu de opciones
			switch (opcion) {
			case 1:
				creaIngrediente(ingredientes);
				break;
			case 2:// Crea un plato pero no participa en la carta
				creaPlato(platos);
				break;
			case 3:
				creaComanda(clientes, carta);
				break;
			case 4:
				cobraMesa(clientes);
				break;
			case 5:
				asignaIngredientePlato(platos, ingredientes);
				break;
			}
			opcion = Leer.menu(MENU);
		}
	}

	private static void asignaIngredientePlato(List<Plato> platos, List<Ingrediente> ingredientes) {
		Plato plato1;
		for (int i = 0; i < platos.size(); i++) {
			System.out.println(i + platos.get(i).toString());
		}
		int k = -1;
		while (k < 0 || k >= platos.size()) {
			k = Leer.entero("escoge el plato");
		}
		plato1 = platos.get(k);
		for (int i = 0; i < ingredientes.size(); i++) {
			System.out.println(i + ingredientes.get(i).toString());
		}
		k = -1;
		while (k < 0 || k >= ingredientes.size()) {
			k = Leer.entero("escoge el ingrediente");
		}
		int cantidad = Leer.entero("Cantidad del ingrediente " + ingredientes.get(k).getNombre());
		plato1.anadeIngrediente(ingredientes.get(k), cantidad);
	}

	private static void cobraMesa(List<Mesa> clientes) {
		int pos;
		int j;
		clientes.forEach(System.out::println);// Veo las mesas
		pos = -1;
		pos = Leer.entero("Elige el n�mero de mesa para factura");
		for (j = 0; j < clientes.size(); j++) {
			if (clientes.get(j).getMesa() == pos) {
				System.out.println(clientes.get(j).imprimirCuenta());// Factura para cobrar
				clientes.remove(j);// Borro la mesa tras cobrarla
				break;
			}
		}
		if (j == clientes.size()) {
			System.out.println("La mesa no existe");
		}
	}

	private static void creaComanda(List<Mesa> clientes, Set<Plato> carta) {
		Plato plato1;
		Plato plato2;
		Iterator<Plato> it;
		Mesa m;
		int pos;
		pos = 0;
		for (Plato plato : carta) {// Veo la carta
			System.out.println(pos + " " + plato.imprime());
			pos++;
		}
		it = carta.iterator();// Elijo primer plato
		selecciona(it, "Primer plato");
		plato1 = it.next();
		it = carta.iterator();// Elijo segundo plato
		selecciona(it, "Segundo plato");
		plato2 = it.next();
		m = new Mesa(plato1, plato2);// Creo la mesa
		clientes.add(m);// a�ado la mesa a clientes
	}

	private static void creaPlato(List<Plato> platos) {
		Plato plato1;
		String nombre_plato = Leer.cadena("nombre del plato");
		try {
			plato1 = new Plato(nombre_plato);
			if (platos.contains(plato1)) {
				System.out.println("El plato ya existe");
			} else {
				platos.add(plato1);
			}
		} catch (ObjetoErroneo e) {
			System.out.println("No se pudo crear el plato");
		}
	}

	private static void creaIngrediente(List<Ingrediente> ingredientes) {
		Ingrediente ing;
		String nombre = Leer.cadena("nombre del ingrediente");
		String porcion = Leer.cadena("tipo de unidades de la porci�n");
		Double precio = Leer.doble("importe de la porci�n");
		try {
			ing = new Ingrediente(nombre, porcion, precio);
			if (ingredientes.contains(ing)) {
				System.out.println("El ingrediente ya existe");
			} else {
				ingredientes.add(ing);
			}
		} catch (ObjetoErroneo e) {
			System.out.println("No se pudo crear el ingrediente");
		}
	}

	private static void selecciona(Iterator<Plato> it, String texto) {
		int pos;
		int i;
		pos = -1;
		while (pos < 0 || pos > 5) {
			pos = Leer.entero(texto);
		}
		i = 0;
		while (it.hasNext() && i < pos) {
			it.next();
			i++;
		}
	}

	public static void crea(List<Plato> platos, List<Ingrediente> ingredientes) {
		try {
			ingredientes.add(new Ingrediente("Arroz", "10 gramos", 0.1));
			ingredientes.add(new Ingrediente("Huevo", "unidad", 0.13));
			ingredientes.add(new Ingrediente("Tomate frito", "1 decilitro", 0.05));
			ingredientes.add(new Ingrediente("Aceite", "1 decilitro", 0.4));
		} catch (ObjetoErroneo e) {
			System.out.println("No se crearon ingredinetes");
			;
		}
		try {
			Plato plato = new Plato("Arroz a la cubana");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			plato.anadeIngrediente(ingredientes.get(1), 1);
			plato.anadeIngrediente(ingredientes.get(2), 2);
			plato.anadeIngrediente(ingredientes.get(3), 1);
			platos.add(plato);
			plato = new Plato("Arroz tres delicias");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			plato.anadeIngrediente(ingredientes.get(1), 1);
			plato.anadeIngrediente(ingredientes.get(2), 1);
			platos.add(plato);
			plato = new Plato("Arroz blanco");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			plato.anadeIngrediente(ingredientes.get(3), 1);
			platos.add(plato);
			plato = new Plato("Arroz con leche");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			platos.add(plato);
			plato = new Plato("Arroz a la cubana2");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			plato.anadeIngrediente(ingredientes.get(1), 2);
			plato.anadeIngrediente(ingredientes.get(2), 2);
			plato.anadeIngrediente(ingredientes.get(3), 1);
			platos.add(plato);
			plato = new Plato("Arroz a la cubana3");
			plato.anadeIngrediente(ingredientes.get(0), 5);
			plato.anadeIngrediente(ingredientes.get(1), 3);
			plato.anadeIngrediente(ingredientes.get(2), 3);
			plato.anadeIngrediente(ingredientes.get(3), 1);
			platos.add(plato);
		} catch (ObjetoErroneo e) {
			System.out.println("No se crearon platos");
		}
	}
}
