package Ejercicio04;

/* 
 * Punto.java
 * APF - 10-01-2024
 * 
 */

public class Punto{
	
	public double x;
	public double y;
	
	public Punto() {
		x=0;
		y=0;
	}
	
	public Punto(double x, double y) {
		this.x=x;
		this.y=y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
public String cuadrante() {
		
		if(x==0 && y==0) {
			
			return "Origen";
			
		}else if(x>0 && y>0) {
			
			return "1º Cuadrante";
			
		}else if(x>0 && y<0) {
			
			return "2º Cuadrante";
			
		}else if(x<0 && y<0) {
			
			return "3º Cuadrante";
			
		}else if(x<0 && y>0) {
			
			return "4º Cuadrante";
			
		}else if(x==0 && y>0) {
			
			return "Eje y positivo";
			
		}else if(x==0 && y<0) {
			
			return "Eje y negativo";
			
		}else if(x>0 && y==0){
			
			return "Eje x positivo";
			
		}else {
			
			return "Eje x negativo";
			
		}
		
	}
	
}