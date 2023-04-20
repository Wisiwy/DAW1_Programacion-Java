package comedor;


public class Ingrediente implements Comparable<Ingrediente> {
	private String nombre;
	private String porcion;
	private Double precio;

	public Ingrediente(String nombre, String porcion, double precio) throws ObjetoErroneo{
		setNombre(nombre);
		this.porcion = porcion;
		if (precio > 0.0) {
			this.precio = precio;
		} else {
			precio = 0.;
		}
		if (this.nombre == null) {
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

	public String getPorcion() {
		return porcion;
	}

	public void setPorcion(String porcion) {
		this.porcion = porcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		if (precio > 0.0) {
			this.precio = precio;
		}
	}

	@Override
	public String toString() {
		return "Ingrediente [nombre=" + nombre + ", porcion=" + porcion + ", precio=" + precio + "]";
	}

	@Override
	public int compareTo(Ingrediente o) {
		// TODO Auto-generated method stub
		return nombre.compareToIgnoreCase(o.nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Ingrediente)) {
			return false;
		}
		Ingrediente other = (Ingrediente) obj;
		if (nombre == null) {
			if (other.nombre != null) {
				return false;
			}
		} else if (!nombre.equalsIgnoreCase(other.nombre)) {
			return false;
		}
		return true;
	}

}
