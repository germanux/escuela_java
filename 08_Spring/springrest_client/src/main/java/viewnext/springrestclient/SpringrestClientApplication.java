package viewnext.springrestclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringrestClientApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringrestClientApplication.class, args);

		System.out.println(">> Recogiendo usuarios");
		RestClient clienteRest = new RestClient();
		String jsonUsers = clienteRest.get("/users");
		System.out.println(">> Usuarios recogidos: \n  " + jsonUsers);
		String usuarioAEnviar = "{\n" + 
				"    \"id\": 6,\n" + 
				"    \"email\": \"enviado@desde.d\",\n" + 
				"    \"name\": \"Spring Rest Cl\",\n" + 
				"    \"age\": 50\n" + 
				"}";
		String jsonUserCreado = clienteRest.post("/users", usuarioAEnviar);
		System.out.println(">> Usuario creado: \n  " + jsonUserCreado);
	}
	/*public List<User> getTodosUsuarios() {
		
	}*/
}
