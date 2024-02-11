package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// muestra la suma y multiplicacion de todos

import java.util.Scanner;

public class RefuerzoArray05{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);
    int multi=1, sum=0;

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

    for(int i=0; i<10; i++){
        sum=sum+array[i];
        multi=multi*array[i];
    }

        System.out.println("Suma: "+sum);
System.out.println("Multiplicacion: "+multi);


    }
}
