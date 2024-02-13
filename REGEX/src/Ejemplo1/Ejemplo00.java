package Ejemplo1;

public class Ejemplo00 {
	public static void main(String[] args) {
		System.out.println("Inicio del programa\n");
		
		Punto p1 = new Punto(3,8);
		
		System.out.println("Punto actual:");
		System.out.println(p1);

		System.out.println("\nFin del programa");
	}
}

class Punto{
	public int x,y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "Punto["+this.x+","+this.y+"]";
	}
}