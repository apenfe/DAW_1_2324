package electrodomesticosPoo02;

public class Principal{
	
	public static void main(String[] args) {
		
		Electrodomestico generico = new Electrodomestico("Generico","ACME",2.4);
		Lavadora lavadora1 = new Lavadora("BALAY",120,5,true);
		Lavadora lavadora2 = new Lavadora("LG",4);
		
		System.out.println(generico.tipo);
		System.out.println(generico.toString());
		System.out.println("Consumo del generico en 3 horas: "+generico.getConsumo(3));
		System.out.println("El coste del consumo del generico en 3 horas: "+generico.getCosteConsumo(3,2));

		System.out.println(lavadora1.tipo);
		System.out.println(lavadora1.toString());
		System.out.println("Consumo del lavadora1 en 3 horas: "+lavadora1.getConsumo(3));
		System.out.println("El coste del consumo del generico en 3 horas: "+lavadora1.getCosteConsumo(3,2));
		
		System.out.println(lavadora2.tipo);
		System.out.println(lavadora2.toString());
		System.out.println("Consumo del lavadora2 en 3 horas: "+lavadora2.getConsumo(3));
		System.out.println("El coste del consumo del generico en 3 horas: "+lavadora2.getCosteConsumo(3,2));
		
	}
}