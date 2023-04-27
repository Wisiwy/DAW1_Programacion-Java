
public abstract class Producto {
	private String nombre;

	public Producto(String nombre) throws ObjetoErroneo {
		setNombre(nombre);
		if (nombre == null) {
			throw new ObjetoErroneo();
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && nombre.trim().length() > 0) {
			this.nombre = nombre;
		}
	}

	@Override
	public String toString() {
		return " " + nombre;
	}

}
