package Ejemplo2;

public class Ejemplo40 {
	
	/*
	 * Validar un código postal: Escribe una expresión regular que valide si una cadena es un código postal válido en un formato específico.
	 * 
	 * que tenga 5 dígitos, y que los números estén comprendidos entre 01000 y 52999.
	 * 
	 */
    
    public static void main(String[] args) {
        
        String texto= "01000";       
        String regex = "([0-5]{1}[1-2]{1}|0{1}1{1})([0-9]{3})";
        
        codigoPostal(texto,regex);
        
    }
    
    public static void codigoPostal(String texto, String regex) {
    	
    	if(texto.matches(regex)) {
    		System.out.println("Codigo postal verificado");
    	}else {
    		System.out.println("NO es un codigo postal verificado");
    	}
    	
    }
    
}