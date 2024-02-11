/* 
 * 
 * SupuestoPractico3.java
 *
 *	DECIMAL A BINARIO
 *	BINARIOS A DECIMAL
 *
 * Adrián Peñalver Fernández
 *
 * 01/12/2023
 *
 */
package examenes.supuesto_examen_3_repaso1;

public class SupuestoPractico3{


    public static void main(String [] args){

        System.out.println(binarioDecimal("0111011"));
        System.out.println();
        System.out.println(decimalBinario(54));

    }
    
    public static int binarioDecimal(String binario) {
    	
    	int sol=0;
    	
    	for(int i=0; i<binario.length();i++) {
    		
    		if(binario.charAt(i)=='0') {
    			
    		}else {
    			sol+=(int)Math.pow(2, binario.length()-1-i);
    		}
    		
    	}
    	
    	return sol;
    	
    }
    
    public static String decimalBinario(int decimal) {
    	
    	String sol="";
    	String salida="";
    	
    	do {
    		
    		if(decimal%2==0) {
    			
    			decimal=(decimal)/2;
    			sol+=0;
    			
    		}else {
    			decimal=(decimal)/2;

    			sol+=1;
    			
    		}	
    		
    	}while(decimal>=1);
    	
    	for (int i = sol.length()-1; i>=0; i--) {
			salida+=sol.charAt(i);
		}

    	return salida;
    	
    }

  

}
