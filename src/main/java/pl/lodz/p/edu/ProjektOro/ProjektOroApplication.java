package pl.lodz.p.edu.ProjektOro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class ProjektOroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektOroApplication.class, args);
	}

	@PostConstruct
	public void logAfterStart() {
		System.out.println("✅ Aplikacja wystartowała i działa!");
	}

}
