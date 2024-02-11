package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// muestra el menor y el mayor

import java.util.Scanner;

public class RefuerzoArray04{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);
    int menor=Integer.MAX_VALUE, mayor= Integer.MIN_VALUE;

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

    for(int i=0; i<10; i++){
        if(array[i]<menor){
            menor=array[i];
        }
        if(array[i]>mayor){
            mayor=array[i];
        }
    }

        System.out.println("Mayor: "+mayor);
System.out.println("Menor: "+menor);


    }
}
