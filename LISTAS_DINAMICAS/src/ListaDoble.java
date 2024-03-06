import dobleEnlazada.ListaDobleEnlazada;

public class ListaDoble{
	
	public static void main(String[] args){
		
		ListaDobleEnlazada<String> listaCompra = new ListaDobleEnlazada<>();
		
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		listaCompra.add("Cerveza");
		listaCompra.add("Brandy");
		listaCompra.add("comida");
		listaCompra.add("cosas");
		listaCompra.add("aqui");
		listaCompra.add(1, "Fruta");
		listaCompra.add(0, "Queso");
		listaCompra.add(4, "Verduras");
		listaCompra.remove("cosas");

		System.out.format("Los %d elementos de la lista de la compra son:\n",  listaCompra.size());
		
		for (int i = 0; i < listaCompra.size(); i++) {
			System.out.format("%s\n", listaCompra.get(i));
		}

	}
	
}