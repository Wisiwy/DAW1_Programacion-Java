package modelo;

public class Contacto {


		private String nom;
		private String ape;
		private Integer tlfn;
		
		public Contacto(String nom, String ape, Integer tlfn) {
			super();
			this.nom = nom;
			this.ape = ape;
			this.tlfn = tlfn;
		}
		
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getApe() {
			return ape;
		}
		public void setApe(String ape) {
			this.ape = ape;
		}
		public Integer getTlfn() {
			return tlfn;
		}
		public void setTlfn(Integer tlfn) {
			this.tlfn = tlfn;
		}

		@Override
		public String toString() {
			return "Contacto [nom=" + nom + ", ape=" + ape + ", tlfn=" + tlfn + "]";
		}
		
		
		
		
		
	

}
