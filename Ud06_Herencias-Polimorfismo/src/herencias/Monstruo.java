package herencias;

public abstract class Monstruo {

private int id;
private static int next = 100;
private String nombre;
private int vida;


public abstract void ataque();
public abstract void defensa();

public void mostrar() {
	System.out.printf("%s, vida: %3d",nombre,vida);
}


public Monstruo( String nombre, int vida) {
	this.id = next;
	next+=10;
	this.nombre = nombre;
	this.vida=vida;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public static int getNext() {
	return next;
}


public static void setNext(int next) {
	Monstruo.next = next;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getVida() {
	return vida;
}
public void setVida(int vida) {
	this.vida = vida;
}





}
