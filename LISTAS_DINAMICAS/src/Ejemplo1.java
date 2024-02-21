import listasDinamicas.ListaArray;

public class Ejemplo1{
	
	public static void main(String[] args) {
		
		ListaArray miLista = new ListaArray();
		
		System.out.println("Numero de elementos en la lista "+miLista.size());
		
		miLista.add("Hola");
		miLista.add("Que tal?");
		miLista.add("Mi nombre es david");
		miLista.add(2,"?");
		miLista.add(2.0);
		miLista.add(0,true);


		System.out.println("Numero de elementos en la lista "+miLista.size());
		System.out.println("true en posicion: "+miLista.indexOf(true));


		
	}
	
}