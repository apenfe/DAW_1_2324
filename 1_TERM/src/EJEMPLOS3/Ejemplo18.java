package EJEMPLOS3;

import java.util.Scanner;
import java.lang.Math;

public class Ejemplo18{

    public static   Scanner teclado = new Scanner(System.in);

    public static int[] array = new int[10];

    // crear como variable globaal un array de tamaño 10.
    // crear un metodo que solamente rellene el array global con numeros aleatorios, entre 1 y 20.
    // crear un metodo que reciba un número y compruebe si está o no dentro del array global, para devolver un true o false.

    public static void main(String[] args){
        
        System.out.print("Introduce un número entre 1 y 20: ");
        int numero= teclado.nextInt();
        
        rellenarArray();
        if(buscarNumero(numero)){
             System.out.print("El numero esta en el array");
        }else{
            System.out.print("El numero NO esta en el array");
        }
      

    }

    public static void rellenarArray(){
    
        for(int i= 0; i<array.length; i++){
            array[i]=(int)Math.random()*20+1;

        }
    }

     public static boolean buscarNumero(int numero){
        boolean bool= false;
        for(int i= 0; i<array.length; i++){
            if(array[i]==numero){
                bool=true;
            }

        }
        return bool;
    }
}
