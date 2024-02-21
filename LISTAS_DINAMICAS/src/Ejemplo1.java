import listasDinamicas.ListaArray;

public class Ejemplo1{
	
	public static void main(String[] args){
		ListaArray listaCompra = new ListaArray();
		listaCompra.add("Leche");
		listaCompra.add("Miel");
		listaCompra.add("Aceitunas");
		listaCompra.add("Cerveza");
		listaCompra.remove("Aceitunas");
		listaCompra.add(1, "Fruta");
		listaCompra.add(0, "Queso");
		listaCompra.add(4, "Verduras");

		System.out.format("Los %d elementos de la lista de la compra son:\n",  listaCompra.size());
		for (int i = 0; i < listaCompra.size(); i++) {
		System.out.format("%s\n", listaCompra.get(i));
		}
		System.out.format("¿Hay pan en la lista? %b", listaCompra.contains("Pan"));
		}

	
}