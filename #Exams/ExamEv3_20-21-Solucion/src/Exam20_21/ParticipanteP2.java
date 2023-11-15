package Exam20_21;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class ParticipanteP2 implements Serializable, Comparable<ParticipanteP2> {
	private String nombre;
	private String apellido;
	private String fecha_nac;


	public ParticipanteP2() {
	}

	public ParticipanteP2(String nombre, String apellido, String fecha_nac) throws ObjetoErroneo {
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

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		if (fecha_nac != null) {
			this.fecha_nac = fecha_nac;
		}
	}

	@Override
	public  String toString() {
//		SimpleDateFormat sdf = new SimpleDateFormat("dd - MM - yyyy");
//		return "nombre: " + nombre + " " + apellido + ", fecha nacimiento:" + sdf.format(fecha_nac.getTime());
		return "nombre: " + nombre + " " + apellido + ", fecha nacimiento:" + fecha_nac;

	}

	public int compareTo(ParticipanteP2 p) {
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
