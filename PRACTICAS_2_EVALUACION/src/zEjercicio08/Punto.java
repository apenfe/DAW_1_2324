package zEjercicio08;

/* 
 * Punto.java
 * APF - 10-01-2024
 * 
 */

public class Punto{
	
	private double x;
	private double y;
	
	public Punto() {
		
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
		
		if(x>0&&y>0) {
			return "PRIMER CUADRANTE";
			
		}else if(x==0&&y==0) {
			return "ORIGEN";

		}else if(x<0&&y<0) {
			return "TERCER CUADRANTE";

		}else if(x>0&&y<0) {
			return "SEGUNDO CUADRANTE";
			
		}else if(x<0&&y>0) {
			return "CUARTO CUADRANTE";
			
		}else if(x==0&&y>0) {
			return "EJE Y POSITIVO";
			
		}else if(x==0&&y<0) {
			return "EJE Y NEGATIVO";
			
		}else if(x>0&&y==0) {
			return "EJE X POSITIVO";
			
		}else if(x<0&&y==0) {
			return "EJE X NEGATIVO";
			
		}else {
			return "ERROR";
			
		}
		
	}
	
	public double distancia() {
		
		double distanciaCuadrado = Math.pow(x, 2)+ Math.pow(y, 2);
		return Math.sqrt(distanciaCuadrado);
		
	}
	
	public void changePunto(double x, double y) {
		
		this.x=x;
		this.y=y;
	
	}
	
	public String getPunto() {
		
		return "La coordenada X es: "+x+", la coordenada Y es: "+y;
		
	}
	
	public void moverA1() {
		
		if(cuadrante().equals("PRIMER CUADRANTE")) {
			
		}else {
			
			if(x!=0&&y!=0) {
				
				this.x=Math.abs(x);
				this.y=Math.abs(y);

			} else if(x==0 && y==0) {
				
				return;
				
			} else if((x==0&&y!=0)||(x!=0&&y==0)) {
				
				this.x= Math.sqrt((Math.pow(distancia(), 2)/2));
				this.y = x;
			}
			
			
		}
		
		
	}
	
}