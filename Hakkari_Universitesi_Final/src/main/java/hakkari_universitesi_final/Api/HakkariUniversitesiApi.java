package hakkari_universitesi_final.Api;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController               
@RequestMapping("/ders")     
public class HakkariUniversitesiApi {
	
	/**
	 * http://localhost:8080/ders/listele
	 */
	
	@GetMapping("/listele")   
	public List<Ders> listele() {		
		return DersVeriServisi.derslerigetir();
	} 
	
	@PostMapping("/ekle")
	public Ders ekle(@RequestBody Ders ders) {
		DersVeriServisi.dersEkle(ders);
		return ders;
	}
	
	@GetMapping("/ekle2")
	public Ders dersekle(
			@RequestParam String ders,
			@RequestParam String kredi) {
		Ders Ders = new Ders(ders, kredi);
		DersVeriServisi.dersEkle(Ders);
		return Ders;
	}
}
