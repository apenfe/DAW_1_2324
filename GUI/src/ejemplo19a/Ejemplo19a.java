package ejemplo19a;

import java.net.URI;
import java.net.http.*;
import java.util.Scanner;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Ejemplo19a{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("Introduce una ciudad: ");
		
		String ciudad = teclado.nextLine();
		
		String apiURL = "https://api.api-ninjas.com/v1/weather?city="+ciudad;
		String apiKEY = "K++CSICL0v9SI2akvcmkZg==8vnQVDbewcJxPRQY";
		
		// crear cliente http
		
		HttpClient cliente = HttpClient.newHttpClient();
		
		// crear la solicitud http con la cabecera X-API-KEY
		
		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiURL)).header("X-Api-Key", apiKEY).GET().build();
		
		try {
			
			HttpResponse<String> response = cliente.send(request, HttpResponse.BodyHandlers.ofString());
			
			//ver codigo de estado
			
			System.out.println("Codigo de estado: "+response.statusCode());
			
			if(response.statusCode() == 200) {
				
				// craer el mapper para convertir el json a un objeto de java
				ObjectMapper objectMapper = new ObjectMapper();
				
				Weather tiempo = objectMapper.readValue(response.body(), Weather.class);
				
				System.out.println();
				System.out.println("El tiempo en "+ciudad);
				System.out.println("Temperatura actual: "+tiempo.temp);
				System.out.println("Temperatura maxima: "+tiempo.max_temp);
				System.out.println("Temperatura minima: "+tiempo.min_temp);
				
			}else {
				System.err.println("error en la solicitud");
			}
			
		} catch (Exception e) {
			
			System.err.println("error: "+e);
			
		}
		
	}
	
}