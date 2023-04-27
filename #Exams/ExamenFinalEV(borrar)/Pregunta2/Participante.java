import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Participante implements Serializable, Comparable<Participante> {
	private String nombre;
	private String apellido;
	private Calendar fecha_nac;


	public Participante() {
	}

	public Participante(String nombre, String apellido, Calendar fecha_nac) throws ObjetoErroneo {
		setNombre(nombre);
		setApellido(apellido);
		setFecha_nac(fecha_nac);
		if (isNull()) {
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		if (apellido != null && apellido.trim().length() > 0) {
			this.apellido = apellido;
		}
	}

	public Calendar getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(Calendar fecha_nac) {
		if (fecha_nac != null) {
			this.fecha_nac = fecha_nac;
		}
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
		return "nombre: " + nombre + " " + apellido + ", fecha nacimiento:" + sdf.format(fecha_nac.getTime());
	}

	public int compareTo(Participante p) {
		if (p != null) {
			if (apellido.compareToIgnoreCase(p.apellido) != 0) {
				return apellido.compareToIgnoreCase(p.apellido);
			} else {
				return nombre.compareToIgnoreCase(p.nombre);
			}
		}
		return -1;
	}

	public boolean isNull() {
		if (nombre == null || apellido == null || fecha_nac == null) {
			return true;
		}
		return false;
	}
	
	public String getPrueba() {
		return null;
	}
}
