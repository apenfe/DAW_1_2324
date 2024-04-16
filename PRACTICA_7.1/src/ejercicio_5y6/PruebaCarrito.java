package ejercicio_5y6;

public class PruebaCarrito{
	
	public static void main(String[] args) {
		
		Carrito carro = new Carrito();
		Bebida fanta = new Bebida("fanta",2);
		Bebida vodka = new Bebida("vodka",1,1234,23);
		
		carro.addCarrito(vodka);
		carro.addCarrito(fanta);
		
		System.out.println(carro.toString());
		
	}
	
}