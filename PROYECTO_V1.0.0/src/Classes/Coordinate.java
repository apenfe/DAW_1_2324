package Classes;

/*
 * Coordinate.java
 * 
 * Clase Coordinate:
 * 
 * Dado que para obtener el camino entre el inicio y el final se compone de una colección de 
 * pares de coordenadas "i" y "j", se debe crear una clase en la que almacenar los pares de 
 * coordenadas y, adicionalmente, la "dirección" hacia el siguiente movimiento (izquierda, 
 * derecha, arriba o abajo).
 * 
 * Se deben crear los atributos necesarios para que se puedan crear objetos de este tipo de clase.
 * 
 * Adrián Peñalver
 * 27/02/2024
 */

public class Coordinate{
	
	private int x;
	private int y;
	private char direction;
	
	public Coordinate(int x, int y) {
		
		this.x=x;
		this.y=y;
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public char getDirection() {
		return direction;
	}

	public void setDirection(char direction) {
		this.direction = direction;
	}
	
}