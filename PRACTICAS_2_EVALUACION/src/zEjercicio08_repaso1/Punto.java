package zEjercicio08_repaso1;

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
		
		if(x==0&&y==0) {
			
			return "ORIGEN";
			
		}else if(x>0&&y>0) {
			
			return "1º";
			
		}else if(x<0&&y<0) {
			
			return "3º";
			
		}else if(x>0&&y<0) {
			
			return "2º";
			
		}else if(x<0&&y>0) {
			
			return "4º";
			
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
	
	public double distanciaOrigen() {
		
		return Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2));	
		
	}
	
	public double distanciaOtroPunto(Punto a) {
		
		return Math.sqrt(Math.pow(y-a.getY(), 2)+Math.pow(x-a.getX(), 2));	
		
	}
	
	public void changePunto(double x, double y) {
		
		setX(x);
		setY(y);
	
	}
	
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}

	public void moverA1() {
		
		if(x==0&&y==0) {
			System.out.println("NO SE PUEDE, ESTÁ EN EL ORIGEN.");
		}
		
		if(!(x>0&&y>0)) {
			
			if(x!=0&&y!=0) {
				
				this.x=Math.abs(x);
				this.y=Math.abs(y);
				
			}else {
				
				double distancia = distanciaOrigen();
				
				this.x= Math.sqrt((Math.pow(distancia, 2)/2));
				this.y = x;
				
				
			}
			
		}
		
	
		
		
	}
	
}