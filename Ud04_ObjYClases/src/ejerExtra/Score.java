package ejerExtra;

public class Score {
private String nombre;
private int puntuacion;


public Score() {
	
}

public Score(String nombre, int puntuacion) {
	this.nombre = nombre;
	this.puntuacion = puntuacion;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getPuntuacion() {
	return puntuacion;
}

public void setPuntuacion(int puntuacion) {
	this.puntuacion = puntuacion;
}

@Override
public String toString() {
	return nombre + "-----------" + puntuacion + ".";
}













}


//comparar nombre con lo que pones e ir a ese espacio del 
//vector para setear la puntuacion
