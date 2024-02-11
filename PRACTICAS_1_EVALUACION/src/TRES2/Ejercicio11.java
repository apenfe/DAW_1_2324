package TRES2;

/* REVISAR
 * Ejercicio11.java
 * 	
 * Escribe un método que se llame contarIntConsecutivos() que recibe un vector de enteros. Devuelve cuantos
 * valores -entre sus elementos- están ordenados. Si  todos los elementos son diferentes devuelve 0.
 * Por ejemplo: {3, 5, 3, 4, 5, 5, 4} devolvería 3.
 * Prueba el método pedido desde main().
 * Recorriendo los datos de izquierda a derecha, empezando por el segundo elemento hay que comprobar si es 
 * secuencia del anterior. Se puede utilizar un contador iniciado en 1 que se incrementa al comprobarse que un
 * elemento es consecutivo -en orden- con el anterior. Cada vez que se inicia nueva secuencia hay que guardar 
 * el  valor del contador en una variable auxiliar con el máximo alcanzado.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio11{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que tamaño desea el array? ");
        int tamano = teclado.nextInt();

        int[] array=new int[tamano];

        for(int i=0; i<array.length; i++){
            System.out.print("Introduzaca el término "+(i+1)+": ");
            array[i] = teclado.nextInt();
        }
        
        System.out.println("\nEl número máximo de números consecutivos en el array es: "+contarIntConsecutivos(array)+"\n");
    }

    public static int contarIntConsecutivos(int[] enteros){ 

        int numero=1, count=0, max=0;
                                             
        for(int i=1 ; i<enteros.length; i++){ // {3, 5, 3, 4, 5, 5, 4} devolvería 3.
            
            if(enteros[i] == enteros[i-1]+1){

               numero++;
              
            }else if(enteros[i] != enteros[i-1]+1){

                if(numero==1){

                }else{

                    count=count+numero;
                    if(numero>max){
                        max=numero;
                    }
                    
                    numero=1;

                }

            }

        }

        if(numero >1){

            count=count+numero;
            if(numero>max){
                        max=numero;
                    }
          
        }
        
        return max;
    }
        
  }

