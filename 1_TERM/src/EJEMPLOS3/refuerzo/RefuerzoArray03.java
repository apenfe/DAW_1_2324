package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// muestra los pares, luego los impares

import java.util.Scanner;

public class RefuerzoArray03{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

    for(int i=0; i<10; i+=2){
        System.out.println("El número en posicion "+(i)+", es: "+array[i]);
    }

    for(int i=1; i<10; i+=2){
        System.out.println("El número en posicion "+(i)+", es: "+array[i]);
    }


    }
}
