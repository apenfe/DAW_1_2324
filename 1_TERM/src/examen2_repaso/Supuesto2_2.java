/*
 * Supuesto2_2.java
 *
 * Adrián Peñalver Fernández
 *
 * 03/11/2023
 *
 *dado un array de enteros hacer una figura de que si es 0 sea el centro, positivos a la derecha
 *y negativos a la izquierda
 *si esta fuera del rango max y minimo dado, porner fuera de rango
 *
 *11	FUERA DE RANGO
9	          |********* 
8	          |********  
-7	   *******|          
6	          |******    
5	          |*****     
4	          |****      
3	          |***       
2	          |**        
1	          |*         
0	          |          
-1	         *|          
-2	        **|          
-33	FUERA DE RANGO
-4	      ****|          
-5	     *****|          
0	          |          
-7	   *******|          
-8	  ********|          
6	          |******    
-10	**********|          

 */
package examen2_repaso;


public class Supuesto2_2{
	
	public static final int MAXIMO = 20;
	public static final int MINIMO = -20;

    public static void main(String [] args){
    	
    	int[] numeros = {2,3,0,1,1,34,-6,-20,20,19,-19};
    	
    	for (int i = 0; i < numeros.length; i++) {
    		
    		System.out.print(numeros[i]+" ->\t");
    		if(numeros[i]>MAXIMO||numeros[i]<MINIMO) {
				System.out.print("FUERA DE RANGO\n");
				continue;
			}
    		
    		for (int j = MINIMO; j <=MAXIMO; j++) {
    			
    			if(j<0) {
    				
    				if(numeros[i]>j) {
    					System.out.print(" ");
    				}else {
    					System.out.print("*");
    				}
    				
    			}else if(j>0) {
    				
    				if(numeros[i]<j) {
    					System.out.print(" ");
    				}else {
    					System.out.print("*");
    				}
    				
    			}else {
    				System.out.print("|");
    			}
  	
    		}
    		
    		System.out.println();
			
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    
    }
}
