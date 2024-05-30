package ejemplo19b;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

public class DAO{
	
	public String apiURL = "https://api.api-ninjas.com/v1/weather?city="; 
	public String apiKEY = "K++CSICL0v9SI2akvcmkZg==8vnQVDbewcJxPRQY"; 
	
	public Weather peticion(String ciudad) {
		
		apiURL += ciudad;
		
		// crear cliente http
		
		HttpClient cliente = HttpClient.newHttpClient();
		
		// crear la solicitud http con la cabecera X-API-KEY
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiURL)).header("X-Api-Key", apiKEY).GET().build();
		
		try {
			
			HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
			
			if(response.statusCode() == 200) {
				
				// craer el mapper para convertir el json a un objeto de java
				ObjectMapper objectMapper = new ObjectMapper();
				
				Weather tiempo = objectMapper.readValue(response.body(), Weather.class);
				
				return tiempo;
				
			}
			
		} catch (Exception e) {
			
			System.err.println("error: "+e);
			
		}
		
		return null;
		
	}
	
}