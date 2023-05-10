package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstDayJpaBasicApplication {
	public static void main(String[] args) {
		System.out.println("Data base connection successfully.");
		SpringApplication.run(FirstDayJpaBasicApplication.class, args);
	}
}
