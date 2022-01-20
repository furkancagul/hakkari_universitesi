package hakkari_universitesi_final.Api;

import java.util.List;
import java.util.ArrayList;

public class DersVeriServisi {
	
	private static final List<Ders> DERSLER = new ArrayList<>();
	static {
		DERSLER.add(new Ders("Bilgisayar Programlama","6"));
		DERSLER.add(new Ders("Yönlendirilmiş Çalışma","4"));
		DERSLER.add(new Ders("Matematik","2"));
		DERSLER.add(new Ders("İngilizce","3"));
		DERSLER.add(new Ders("Grafik Tasarım","5"));
		DERSLER.add(new Ders("Web Tasarım","4"));
	}
	
	public static List<Ders> derslerigetir() {
		return DERSLER;
	}
	public static void dersEkle(Ders ders) {
		DERSLER.add(ders);
	}
}
