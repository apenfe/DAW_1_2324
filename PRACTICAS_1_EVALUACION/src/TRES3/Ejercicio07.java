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

public class Ejercicio07{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int tamano=0;
        boolean check= true;

        do{

            System.out.print("\nA continuación inserte un tamaño de matriz: ");

            do{
                try{
                    tamano = Integer.parseInt(teclado.nextLine().trim()); 
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (Entero): ");
                }

            }while(check);
            check =true;

            if(tamano<=0){
                System.out.println("\n\tEl número debe ser mayor que 0.\n");
            }

        }while(tamano<=0);

        int[][] matrizA = secuenciaNaturalIntA(tamano);
        int[][] matrizB = secuenciaNaturalIntB(tamano);
        int[][] matrizC = secuenciaNaturalIntC(tamano);
        int[][] matrizD = secuenciaNaturalIntD(tamano);

        System.out.println();
        System.out.println("\tSecuencia natural A:\n");
        for(int i=0; i<tamano; i++){
            System.out.print("\t\t"); 
            for(int j=0; j<tamano; j++){

                System.out.print(matrizA[i][j]+"  ");

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\tSecuencia natural B:\n");
        for(int i=0; i<tamano; i++){
            System.out.print("\t\t"); 
            for(int j=0; j<tamano; j++){

               System.out.print(matrizB[i][j]+"  ");

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\tSecuencia natural C:\n");
        for(int i=0; i<tamano; i++){
            System.out.print("\t\t"); 
            for(int j=0; j<tamano; j++){

                System.out.print(matrizC[i][j]+"  ");

            }
            System.out.println();
        }
        System.out.println();

        System.out.println("\tSecuencia natural D:\n");
        for(int i=0; i<tamano; i++){
            System.out.print("\t\t"); 
            for(int j=0; j<tamano; j++){

                System.out.print(matrizD[i][j]+"  ");

            }
            System.out.println();
        }

    }

    public static int[][] secuenciaNaturalIntA(int tamano){

        int[][] matriz = new int[tamano][tamano];
        int cont=1;

        for(int fila=1; fila<=tamano; fila++){

            for(int columna=1; columna<=tamano; columna++){

                matriz[columna-1][fila-1]= cont;
                cont ++;           

            }

        }
        
        return matriz;
    }  

    public static int[][] secuenciaNaturalIntB(int tamano){

        int[][] matriz = new int[tamano][tamano];
        int cont=1;

        for(int columna=1; columna<=tamano; columna++){

            if(columna%2==0){

                for(int i=tamano; i>=1; i--){
                   
                    matriz[i-1][columna-1]=cont;
                    cont++;
                }

            }else{

                for(int i=1; i<=tamano; i++){
                   
                    matriz[i-1][columna-1]=cont;
                    cont++;
                }

            }

        }

        return matriz;

        
    }  

    public static int[][] secuenciaNaturalIntC(int tamano){

        int[][] matriz = new int[tamano][tamano];
        int cont=1;

        for(int iteracion=1; iteracion<=tamano+(tamano-1); iteracion++){ //2

            if(iteracion<=tamano){
        
                for(int fila=tamano-iteracion+1; fila<=tamano; fila++){ //3 hasta 4

                    for(int columna=1; columna<=iteracion; columna++){ // 1 hasta 2

                        if(fila == columna+tamano-iteracion){ 

                            matriz[fila-1][columna-1]=cont;
                            cont++; 

                        }else{
            
                            continue;

                        }

                    }

                }

            }else{

                for(int fila=1; fila<=tamano; fila++){ //fin falta

                    for(int columna=1; columna<=tamano; columna++){ // inicio falta

                        if(columna == fila+iteracion-tamano){ // modificar condicion

                            matriz[fila-1][columna-1]=cont;
                            cont++; 

                        }else{
            
                            continue;

                        }

                    }

                }

            }

        }

        return matriz;
    }  
// ------------------------------------------------DDDDDDDDDDDDD-----------------------------------------------
    public static int[][] secuenciaNaturalIntD(int tamano){

        int[][] matriz = new int[tamano][tamano];
        int cont=1;

        for(int i=0 ; i<tamano; i++){ // Fila inicial
            matriz[i][0]=cont;
            cont++;
        }

        int contador= tamano-1;
        int limite=0, limite2 = 0;

        while(contador>=1){

            // derecha y arriba   ------- 1º

                for(int columna = tamano-contador-limite ;columna<tamano-limite ;columna++){

                        matriz[contador+limite][columna]=cont;
                        cont++;                      
                }

                for(int fila = tamano-2-limite ;fila>=0+limite ;fila--){   
        
                    matriz[fila][contador+limite]=cont;  
                    cont++;       
                }

                limite++;
                contador--;

            // izquierda y abajo  ----- 2º // inicio bloque completo
 

               for(int columna = tamano-2-limite2 ;columna>=limite2+1 ;columna--){  // 4 a 1 para tamano 6 ----- luego 3 a 2

                        matriz[limite2][columna]=cont;
                        cont++;                      
                }

                for(int fila =limite2+1 ;fila<=tamano-2-limite2 ;fila++){   // 1 a 4 para tamano 6 ----- luego 3 a 2
        
                    matriz[fila][limite2+1]=cont;  
                    cont++;                   
                }

                limite2++; // cuidado con este.   final bloque completo
                contador--; // este si hay que dejarlo para la primera parte
        }

        return matriz;
    }  
}
