package ng.com.createsoftware.schoolfact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SchoolfactApplication {

	@GetMapping("/home")
	public String homePage(){
		return "This is an app about school facts";
	}

	public static void main(String[] args) {
		SpringApplication.run(SchoolfactApplication.class, args);
	}

}
