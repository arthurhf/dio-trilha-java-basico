package dio.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(servers = {@Server(url ="/", description = "Default Server URL")})
@SpringBootApplication
public class ProjetoBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoBootcampApplication.class, args);
	}

}
