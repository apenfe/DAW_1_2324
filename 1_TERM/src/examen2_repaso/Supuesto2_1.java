/*
 * Supuesto2_1.java
 *
 * Adrián Peñalver Fernández
 *
 * 03/11/2023
 * 
 * inrtroducir numeros enteros positivos, ver cual es el mayor y el menor, decir cuantos se han metido
 * si se quiere salir, solo puede ser pulsando t, pero como minimo se deben de introducir 3 numeros validos
 *
 */


package examen2_repaso;

import java.util.Scanner;

public class Supuesto2_1{
	
	public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){
    	
    	int min = Integer.MAX_VALUE;
    	int max = Integer.MIN_VALUE;
    	int total=0;
    	
    	do {
    		
    		System.out.println("Introduce un numero: ");
    		int num= teclado.nextInt();
    		
    		if(num!=0) {
    			
    			System.out.println("NUMERO VALIDO ");
    			total++;
    			
    			if(num<min) {
    				
    				min=num;
    				
    			}if(num>max) {
    				
    				max=num;
    				
    			}
    			
    		}else {
    			teclado.nextLine();
    			System.out.print("NUMERO 0, DESEA CONTINUAR? T para si ");
    			String respuesta = teclado.nextLine();
    			
    			if(respuesta.equalsIgnoreCase("t")&&total>3) {
    				break;
    			}else {
    				System.out.println("Debe introducir al menos tres valores apropiados");
    			}

    		}
    		
    	}while(true);
    	
    	System.out.println("Maximo: "+max);
    	System.out.println("Minimo: "+min);
    	System.out.println("Numeros introducidos: "+total);
 

    }
}
