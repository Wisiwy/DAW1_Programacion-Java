package modelo;

public class Usuario {
	
private String nombre;
private String pass;
public Usuario(String nombre, String pass) {
	super();
	this.nombre = nombre;
	this.pass = pass;
}


public Usuario(String[] data) {
	
	nombre = data[0];
	pass = data[1];
}


public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getPass() {
	return pass;
}


public void setPass(String pass) {
	this.pass = pass;
}

 



}
