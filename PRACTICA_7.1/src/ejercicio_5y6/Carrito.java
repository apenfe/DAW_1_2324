package ejercicio_5y6;

import java.util.ArrayList;

public class Carrito{
	
	public ArrayList<Producto> productos;
	
	public Carrito() {
		
		this.productos = new ArrayList<Producto>();
		
	}
	
	public void addCarrito(Producto p) {
		
		productos.add(p);
		
	}
	
	public String toString() {
		
		String salida = "";
		salida += "Lista de la compra: \n";
		double total = 0;
		
		for (int i = 0; i < productos.size(); i++) {
			
			salida+=productos.get(i).toString()+"\n";
			total += productos.get(i).getPrecio();
			
		}
		
		salida += "\nPrecio total: "+total;
		
		return salida;
		
	}
	
}