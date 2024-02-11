package Tarea3_1;

public class Utils{
	
	public static String tipoTriangulo(double a, double b, double c) {
		
		if(esTriangulo(a,b,c)) {
			
			if(a==b && b==c) {
				
				return "EQUILATERO";
				
			}else if(a!=b && b!=c) {
				
				return "ESCALENO";
				
			}else {
				
				return "ISOSCELES";
				
			}
			
		}else {
			
			return "ERROR";
			
		}
		
	}
	
	public static boolean esTriangulo(double a, double b, double c) {
		
		if(a<=0 || b<=0 || c<=0) {
			
			return false;
			
		}else {
			
			if(a>=(b+c)||b>=(a+c)||c>=(b+a)) {
				
				return false;
				
			}
			
			return true;
			
		}
		
	}
	
	public static int masFrecuenteInt(int[] enteros) {
		
		int cont = 0, max=0, moda=0;
		
		for (int i = 0; i < enteros.length; i++) {
			
			cont=0;
			
			for (int j = 0; j < enteros.length; j++) {
				
				if(enteros[i]==enteros[j]) {
					
					cont ++;
					
				}
				
			}
			
			if(cont>max) {
				
				max=cont;
				moda=enteros[i];
				
			}
			
		}
		
		return moda;
		
	}
	
	public static int buscarInt(int[] enteros, int valor) {
		
		for (int i = 0; i < enteros.length; i++) {
				
			if(enteros[i]==valor) {
				
				return i;
				
			}
			
		}
		
		return -1;
		
	}
	
}