package TRES3;

/*
 * Ejercicio12.java
 *
 * Escribe un método que se llame mayorArea() que recibe una matriz rectangular de tamaño (n,m) con datos.
 * Devuelve la mayor cantidad de celdas contiguas encontradas con el mismo valor y que comparte al menos un lado.
 * Se muestra un ejemplo en el que hay un área formada por 13 elementos con el mismo valor 3:
 *
 *  1|3|2 2 2 4
 * |3 3 3|2 4 4 
 *  4|3|1 2|3 3| ---> 13
 *  4|3|1|3 3|1
 *  4|3 3 3|1 1
 *
 * Adrián Peñalver Fernández
 *
 * 22/11/2023
 */

import java.util.Scanner;

public class Ejercicio12{

    public static Scanner teclado = new Scanner(System.in);
    public static int maxcont; // inicialmente tenia un cont tambien

    public static void main(String[] args){

        int[][] matriz = {{1, 3, 2, 2, 3, 3},
                          {3, 3, 3, 2, 3, 4},
                          {4, 3, 1, 2, 3, 3},
                          {4, 3, 1, 3, 3, 1},
                          {4, 3, 3, 3, 1, 1}};

        System.out.println("\nLa matriz de estudio es: \n");
        imprimeMatriz(matriz);       

        System.out.print("\nLa mayor cantidad de celdas contiguas equipotenciales es: ");
        System.out.print(mayorArea(matriz)+".\n\n");

    } 


    public static int mayorArea(int[][]matriz){ /// MAYOR AREA (SE DEDICA A INVOCAR METODOS PARA RESOLVER EL EJERCICIO) ///

        int[] equipotenciales = buscarEquipotencial(matriz);
        int max=0;

        for(int i=0; i<equipotenciales.length; i++){

            if(analizarEquipotenciales(matriz,equipotenciales[i])>max){
                max=analizarEquipotenciales(matriz,equipotenciales[i]);
            }
        }
            
        return max;
    }


    public static int[] buscarEquipotencial(int[][]matriz){ /// BUSCAR EQUIPOTENCIAL (SE DEDICA A BUSCAR NUMEROS DIFERENTES EN MATRIZ DADA) ///

// LEER NUMEROS Y PONER EN STRING, SI SE ANALIZA EL STRING SE VE SI ESE NUMERO YA ESTABA O NO

        String numeros_totales = "";
        int aux=0, min=-1, cont=0;

        // METER NUMEROS EN STRING

        for(int i=0; i<matriz.length; i++){
         
            for(int j=0; j<matriz[0].length; j++){
                
                numeros_totales+=matriz[i][j];

            } 
        }
        
        //aqui combierto el string en un array de enteros.

        int total=matriz.length*(matriz[0].length);

        int[] enteros = new int[total];

        for(int i=0; i<numeros_totales.length(); i++){
        
            enteros[i]= Integer.parseInt(Character.toString(numeros_totales.charAt(i)));
           
        }

        // ORDENAR STRING DE NUMEROS

        for(int i=1 ; i<enteros.length; i++){
            for(int j=0 ; j<enteros.length-i; j++){

                if(enteros[j]>enteros[j+1]){

                    aux=enteros[j+1];
                    enteros[j+1]=enteros[j];
                    enteros[j]=aux;

                }
            }
        }

        for(int i=0; i<enteros.length; i++){

            if(enteros[i]>min){
                cont++;
            }

        }

        int[] numeros = new int[cont];

        min=-1;

        for(int i=0; i<numeros.length; i++){

            for(int j=0; j<enteros.length; j++){

                if(enteros[i]>min){
                        min=enteros[i];
                     numeros[i]=min;
                    
                    break;
                }
            }
        }
 
        return numeros;

    }


    public static void imprimeMatriz(int[][]matriz){ /// IMPRIME MATRIZ (SE DEDICA A IMPRIMIR MATRICES M*N) ///

        for(int i=0; i<matriz.length; i++){
            System.out.print("\t");
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");
            } 
            System.out.println();
        }
    }


    public static int[][] genControl(int[][]matriz){ /// GEN CONTROL (CREA MATRICES M*N Y LA PONE A 0) ///

// hacer este metodo, debo recibir matriz y crear otra igual con todos los valores a 0

        int[][] control = new int[matriz.length][matriz[0].length];

        for(int i=0; i<control.length; i++){
    
            for(int j=0; j<control[0].length; j++){
                control[i][j]=0;
            } 
          
        }

        return control;

    }


    public static int analizarEquipotenciales(int[][]matriz, int equipotencial){ /// ANALIZAR EQUIPOTENCIALES (ANALIZA LOS EQUIPOTENCIALES RECIBIDOS) ///
       
        int[][] control = genControl(matriz);
        int maximo=-1, cont=0; // cuando este dato salga debo volver a crear otro max para ver todos los numeros analizados y dar el maximo real de todos.    
        
        for(int i=0; i<matriz.length; i++){
            
            for(int j=0; j<matriz[0].length; j++){

                if(matriz[i][j]==equipotencial && control[i][j]==0){ // en este if debe permanecer hasta que no se acabe de analizar todas casillas adjuntas.

                    control[i][j]=equipotencial; 
                    cont++; // sera visible para el resto? y el numero 3?
                    
                    maxcont=-1;
                    analizaAdyacentes(matriz,control,i,j,equipotencial,cont);//creo que no me da un cambio de cont
                    cont=maxcont;
                    
                    if(cont>maximo){
                        maximo=cont;
                    }

                    cont=0;
                    maxcont=-1;

                }
            }   
        }
        
        return maximo;
    }

    
    public static void analizaAdyacentes(int[][]matriz, int[][] control, int fila, int columna, int equipotencial, int cont){ /// ANALIZAR ADYACENTES (ANALIZA LAS CASILLAS ADYACENTES Y LAS SUMA) ///

        int[] candidatos = new int[8];

        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {

            // Verificar y mostrar el valor superior si existe
            if (fila - 1 >= 0) {

                if(matriz[fila - 1][columna]==equipotencial && control[fila - 1][columna]==0){
                    candidatos[0]=fila-1;
                    candidatos[1]=columna;
                    cont++;
                    control[fila-1][columna]=equipotencial;
                    
                }else{
                    candidatos[0]=-1;
                    candidatos[1]=-1;
                }

            } else {

                candidatos[0]=-1;
                candidatos[1]=-1;
    
            }

            // Verificar y mostrar el valor lateral izquierdo si existe
            if (columna - 1 >= 0) {
               // System.out.println("Valor lateral izquierdo: " + matriz[fila][columna - 1]);

                if(matriz[fila][columna-1]==equipotencial && control[fila][columna-1]==0){
                    candidatos[2]=fila;
                    candidatos[3]=columna-1;
                    cont++;
                    control[fila][columna-1]=equipotencial;
                    
                }else{
                    candidatos[2]=-1;
                    candidatos[3]=-1;
                }

            } else {
                
                candidatos[2]=-1;
                candidatos[3]=-1;
            }

            // Verificar y mostrar el valor lateral derecho si existe
            if (columna + 1 < matriz[0].length) {
               // System.out.println("Valor lateral derecho: " + matriz[fila][columna + 1]);

                if(matriz[fila][columna+1]==equipotencial && control[fila][columna+1]==0){
                    candidatos[4]=fila;
                    candidatos[5]=columna+1;
                    cont++;
                    control[fila][columna+1]=equipotencial;
                    
                }else{
                    candidatos[4]=-1;
                    candidatos[5]=-1;
                }

            } else {
                
                candidatos[4]=-1;
                candidatos[5]=-1;
            }

            // Verificar y mostrar el valor inferior si existe
            if (fila + 1 < matriz.length) {
                //System.out.println("Valor superior: " + matriz[fila + 1][columna]);

                if(matriz[fila+1][columna]==equipotencial && control[fila+1][columna]==0){
                    candidatos[6]=fila+1;
                    candidatos[7]=columna;
                    cont++;
                    control[fila+1][columna]=equipotencial;
                    
                }else{
                    candidatos[6]=-1;
                    candidatos[7]=-1;
                }

            } else {
                
                candidatos[6]=-1;
                candidatos[7]=-1;
            }
        }else{
           // System.out.println("ERROR");
        }

        for(int i=0; i<8; i+=2){

            if(candidatos[i]==-1){ // si candidatos[i]!=
                continue;
            }else{

                if(cont>maxcont){
                    maxcont=cont;
                }

               analizaAdyacentes(matriz,control,candidatos[i],candidatos[i+1],equipotencial,cont); //cuidado, aqui debo pasar la fila y columna absoluta del candidato;   
            }

        }

    }
   
}
