package polimorfismo;

public class Ejemplo3{
	
	public static void main(String[] args) {
		
		Perro pancho = new Perro("pancho",7,"macho");
		System.out.println("perro");
		pancho.ladrar();
		pancho.dormir();
		pancho.mear();
		System.out.println();
		
		Chiuaua rata = new Chiuaua("zaira",8,"hembra",5);
		System.out.println("chiuahua");
		rata.ladrar();
		rata.dormir();
		rata.mear();
		System.out.println();
		
		SanBeernardo betoben = new SanBeernardo("Betoben",20,"macho","grueso");
		System.out.println("san bernardo");
		betoben.ladrar();
		betoben.dormir();
		betoben.mear();
		System.out.println();
		
	}
	
}