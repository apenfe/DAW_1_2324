package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// muestralos

import java.util.Scanner;

public class RefuerzoArray01{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

    for(int i=0; i<10; i++){
        System.out.println("El número en posicion "+(i+1)+", es: "+array[i]);
    }


    }
}
