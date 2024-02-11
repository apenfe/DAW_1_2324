package TRES3;

/* OK
 * 
 * Ejercicio07.java
 *
 * Escribe cuatro métodos que se llamen secuenciaNaturalIntA(), secuenciaNaturalIntB(), secuenciaNaturalIntC() 
 * y secuenciaNaturalIntD().
 * Cada método recibe respectivamente un valor que representa el lado de una matriz cuadrada de tamaño N; deben
 * rellenar el corespondiente array según los patrones del gráfico adjunto. Devuelven respectivamente la matriz
 * generada.
 *
 * La secuencia natural es 1, 2, 3 ... N.
 * 
 * Prueba los métodos pedido desde main().
 * Hay que utilizar dos bucles anidados y manipular los índices de manera que las secuencias de ejecución 
 * produzcan los patrones de distribución indicados.
 *      Para el caso d) se puede aplicar la siguiente estrategia:
 *      A partir de la posición [0][0] hay que bajar N veces.
 *      A continuación, se pasa a la derecha N-1 veces, luego sube N-1 veces, luego a la izquierda N-2 veces,
 *      luego hacia abajo N-2 veces, etc. Cada vez que se mueve un paso se produce un número de la secuencia
 *      natural 1, 2, 3, ..., NxN.
 *
 * Adrián Peñalver Fernández
 *
 * 21/11/2023
 *
 */

import java.util.Scanner;

public class zejercicio07{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int tamano = 0;
        boolean check = true;
        
        do {
        	
    		System.out.print("Indica el tamaño: ");
        	
        	do {
        		
        		try {
        			tamano=Integer.parseInt(teclado.nextLine().trim());
        			check = false;
        		}catch(Exception e) {
        			
        		}
        		
        	}while(check);
        	
        	check=true;
        	
        	if(tamano<=0) {
        		System.out.println("El tamaño debe ser mayor que 0.");
        	}
        	
        }while(tamano<=0);
        
        int[][] matriz = new int[tamano][tamano];
        
        matriz = secuenciaNaturalIntA(tamano);
        imprimir(matriz);
        matriz = secuenciaNaturalIntB(tamano);
        imprimir(matriz);
        matriz = secuenciaNaturalIntC(tamano);
        imprimir(matriz);
        matriz = secuenciaNaturalIntD(tamano);
        imprimir(matriz);

    }
    
    public static void imprimir(int[][]matriz){

    	for(int i=0; i<matriz.length;i++) {
    		for(int j=0; j<matriz[0].length;j++) {
        		System.out.print(matriz[i][j]+" ");
        	}
    		
    		System.out.println();
    	}
    	
    	System.out.println();
        
    } 

    public static int[][] secuenciaNaturalIntA(int tamano){
    	
    	//1 5 9  13
    	//2 6 10 14
    	//3 7 11 15
    	//4 8 12 16
    	
    	int[][] matriz = new int[tamano][tamano];
    	int cont=1;
    	
    	for(int j=0; j<matriz.length;j++) {
    		for(int i=0; i<matriz[0].length;i++) {
        		matriz[i][j]=cont;
        		cont ++;
        	}
    	}
    	
    	return matriz;
    }  

    public static int[][] secuenciaNaturalIntB(int tamano){
    	
    	//1 8 9  16
    	//2 7 10 15
    	//3 6 11 14
    	//4 5 12 13
    	
    	int[][] matriz = new int[tamano][tamano];
    	int cont =1;
    	
    	for(int columna=0; columna<matriz.length;columna++) {
    		
    		if(columna%2==0) {
    			
    			for(int fila=0; fila<matriz[0].length;fila++) {
            		matriz[fila][columna]=cont;
            		cont ++;
            	}
    			
    		}else {
    			
    			for(int fila=matriz[0].length-1; fila>=0;fila--) {
            		matriz[fila][columna]=cont;
            		cont ++;
            	}
    			
    		}
    		
    	}
       
    	return matriz;
    }  

    public static int[][] secuenciaNaturalIntC(int tamano){
    	        
    	//7 11 14 16  
    	//4  8 12 15  
    	//2  5  9 13  
    	//1  3  6 10  
    	
    	int[][] matriz = new int[tamano][tamano];
    	int cont = 1;
    	int iter = tamano-1;
    	
    	for(int diagonal= 1; diagonal<=tamano+(tamano-1);diagonal++) {
    		
    		if(diagonal<=tamano) {
    			
    			for(int altura= tamano-diagonal; altura<=tamano-1;altura++) {
    				
        			for(int ancho= 0; ancho<diagonal;ancho++) {
        	    		
        				if(altura==ancho+iter) {
        					
        					matriz[altura][ancho]=cont;
                    		cont ++;
                    		
        				}
        				
        	    	}
            	}
    			
    			iter--;
    			
    		}else {
    			
    			if(iter==-1) {
    				iter=1;
    			}else {
    				iter++;
    			}
    		
    			
    			for(int altura= 0; altura<=tamano-1-iter;altura++) {
    				
        			for(int ancho = iter; ancho<=tamano-1;ancho++) {
        	    		
        				if(altura==ancho-iter) {
        					
        					matriz[altura][ancho]=cont;
                    		cont ++;
                    		
        				}
        				
        	    	}
        			
            	}
    			
    		}
    			
    	}
      
    	return matriz;
    }  

    public static int[][] secuenciaNaturalIntD(int tamano){
    	
    	//1 12 11 10
    	//2 13 16  9
    	//3 14 15  8
    	//4  5  6  7
    	
    	int[][] matriz = new int[tamano][tamano];
    	int cont = 1;
    	int iniciopar=0,finpar=tamano;
    	int finimpar=0;
    	
    	for(int i=0; i<=tamano-1;i++) {
    		matriz[i][0]=cont;
    		cont ++;
    	}
    	
    	for(int iter=1; iter<=tamano-1;iter++) {
    		
    		if(iter%2!=0) {
    			
    			iniciopar++;
    			finpar--;
    			
    			for(int ancho = iniciopar; ancho<=finpar;ancho++) {
    				matriz[tamano-iniciopar][ancho]=cont;
    	    		cont ++;
    			}
    			
    			for(int alto = tamano-1-iniciopar; alto>tamano-2-finpar;alto--) {
    				matriz[alto][tamano-iniciopar]=cont;
    	    		cont ++;
    			}
    			
    		}else {
    			
    			finimpar++;
    			
    			for(int ancho = tamano-1-finimpar; ancho>=finimpar;ancho--) {
    				matriz[finimpar-1][ancho]=cont;
    	    		cont ++;
    			}
    			
    			for(int alto = finimpar; alto<=tamano-1-finimpar;alto++) {
    				matriz[alto][finimpar]=cont;
    	    		cont ++;
    			}
    			
    		}
    		
    	}

    	return matriz;
    }  
}
