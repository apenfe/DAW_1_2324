
import listasEnlazadas.ListaEnlazada;

public class Ejemplo3{
	
	public static void main(String[] args){
		
		ListaEnlazada<Articulo> articulos = new ListaEnlazada<Articulo>();	
			
		articulos.add(new Articulo("sder", "Television", 234.5));
		articulos.add(new Articulo("sdr", "Radio", 23.5));
	
		for (int i = 0; i < articulos.size(); i++) {
			
			System.out.println(articulos.get(i).toString());
			
		}
		
	}
	
}

class Articulo{
	
	String codigo;
	String nombre;
	double precio;
	
	public Articulo(String codigo, String nombre, double precio) {
		
		this.codigo=codigo;
		this.nombre=nombre;
		this.precio=precio;
		
	}
	
	public String toString() {
		
		return "codigo= "+codigo+". Nombre= "+nombre;
		
	}
}