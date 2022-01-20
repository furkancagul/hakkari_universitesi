package hakkari_universitesi_final.Api;


import org.junit.jupiter.api.Test;

class HakkariUniversitesiApiTest {

	@Test
	public void testListele() {
		//On Kosul
		String Ders = "Ders";
		String Ders2 = "Ders2";
		String Ders3 = "Ders";
		String Ders4 = "Ders2";
		//Kontrol
		equals("Ders,Ders2,Ders3,Ders4");
		
	}

	@Test
	public void testEkle() {
		//On Kosul
		String Ders ="Ders Başarılı Eklenmiştir";
		//Kontrol
		equals("Ders Başarıyla Eklendi");
		
	}

}
