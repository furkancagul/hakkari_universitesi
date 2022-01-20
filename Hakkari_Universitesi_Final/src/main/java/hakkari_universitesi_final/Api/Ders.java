package hakkari_universitesi_final.Api;

public class Ders {
	//Ders ve kredi 
	private String Ders;
	private String Kredi;
	
		public Ders(String ders, String kredi) {
		super();
		this.Ders = ders;
		this.Kredi = kredi;
	}

		public String getDers() {
			return Ders;
		}

		public String getKredi() {
			return Kredi;
		}
	
	
	
}
