package TRES3;

import java.util.ArrayList;

/* OK
 * 
 * Ejercicio11.java
 *
 * Escribe un método que se llame obtenerPrimos() que recibe el límite superior de todos los números primos que se
 * quieren obtener. Devuelve un ArrayList con los números obtenidos.
 * Buscar información en Internet para "Criba de Eratóstenes"
 * Deben seguirse los principios y estilo del código limpio.
 *
 * Adrián Peñalver Fernández
 *
 * 02/01/2024
 *
 */

import java.util.Scanner;

public class zejercicio11{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int limite = 0;
        boolean check = true;
        
        do {
        	
    		System.out.print("Indica el limite superior: ");
        	
        	do {
        		
        		try {
        			limite=Integer.parseInt(teclado.nextLine().trim());
        			check = false;
        		}catch(Exception e) {
        			System.out.println("ERROR, INTRODUCE UN ENTERO");
        		}
        		
        	}while(check);
        	
        	check=true;
        	
        	if(limite<=0) {
        		System.out.println("El tamaño debe ser mayor que 0.");
        	}
        	
        }while(limite<=0);
        
        ArrayList<Integer> primos = obtenerPrimos(limite);
        
        System.out.println("Los numeros primos son: ");
        for(int i=0; i<primos.size(); i++) {
        	System.out.print(primos.get(i)+", ");
        }

    }

    public static ArrayList<Integer> obtenerPrimos(int superior){
    	
    	ArrayList<Integer> primos = new ArrayList<Integer>();
    	int[] naturales = new int[superior+1];
    	
    	for(int i=0; i<=superior ;i++ ) {
    		naturales[i]=i;
    	}
    	
    	int actual=2;
    	
    	//primos.add(actual);
    	
    	do {
    		
    		for(int i=actual+1; i<=superior; i++) {
    			
    			if(naturales[i]%actual==0&&naturales[i]!=0) {
    				naturales[i]=0;
    			}
    			
    		}
    		
    		tacha: for(int j=actual+1; j<=superior;j++) {
    			
    			if(naturales[j]!=0) {
    				actual=naturales[j];
    				//primos.add(actual);
    				break tacha;
    				
    			}
    		}
    		
    		//System.out.println(naturales[actual]);
    		
    	}while(superior>=Math.pow(naturales[actual],2));
    	
    	for(int j=2; j<=superior;j++) {
			
			if(naturales[j]!=0) {
				primos.add(j);
			}
		}

    	return primos;
    }  
   
}
