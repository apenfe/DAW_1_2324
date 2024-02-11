package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// muestra si un numero esta en el array y en que posiciones

import java.util.Scanner;

public class RefuerzoArray08{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);
    int num;

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

    System.out.print("\nIntroduce el número a buscar: ");
    num=teclado.nextInt();

    for(int i=0; i<10; i++){
        if(num==array[i]){
             System.out.println("El numero esta en la posicion: "+(num+1));
        }
    }
    }
}
