package comedor;


public class Mesa {
	private static int mesaSig = 1;
	private static double servicio = 2.0;
	private Integer mesa;
	private Plato plato1;
	private Plato plato2;

	public Mesa(Plato plato1, Plato plato2) {
		mesa = mesaSig;
		mesaSig++;
		this.plato1 = plato1;
		this.plato2 = plato2;
	}

	public Plato getPlato1() {
		return plato1;
	}

	public void setPlato1(Plato plato1) {
		this.plato1 = plato1;
	}

	public Plato getPlato2() {
		return plato2;
	}

	public void setPlato2(Plato plato2) {
		this.plato2 = plato2;
	}

	public static int getMesaSig() {
		return mesaSig;
	}

	public Integer getMesa() {
		return mesa;
	}

	public static double getServicio() {
		return servicio;
	}

	public static void setServicio(double servicio) {
		Mesa.servicio = servicio;
	}

	public double sacarCuenta() {
		return (plato1 == null ? 0.0 : plato1.sacarPrecio()) + (plato2 == null ? 0.0 : plato2.sacarPrecio()) + servicio;
	}

	public String imprimirCuenta() {
		return "Mesa : " + mesa + "\n   plato1=" + (plato1 == null ? "" : plato1.imprime()) + "\n"
				+ (plato2 == null ? "" : plato2.imprime()) + String.format("\n\t\t precio total %7.2f", sacarCuenta());
	}

	@Override
	public String toString() {
		return "Mesa [mesa=" + mesa + ", plato1=" + plato1 + ", plato2=" + plato2 + sacarCuenta() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Mesa)) {
			return false;
		}
		Mesa other = (Mesa) obj;
		if (mesa == null) {
			if (other.mesa != null) {
				return false;
			}
		} else if (!mesa.equals(other.mesa)) {
			return false;
		}
		return true;
	}

}
