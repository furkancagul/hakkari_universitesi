package hakkari_universitesi_final.Api;


import org.junit.jupiter.api.Test;

class DersVeriServisiTest {

	

	@Test
	public void testDerslerigetir() {
		//On Kosul
		String Ders = "Ders";
		String Ders2 = "Ders2";
		String Ders3 = "Ders3";
		String Ders4 = "Ders4";
		//Konrol
		equals("Ders,Ders2,Ders3,Ders4");
	}


	@Test
	public void testDersEkle() {
		//On Kosul
		String Ders ="Ders Başarılı Eklenmiştir";
		//Kontrol
		equals("Ders Başarıyla Eklendi");
	}

}
