package EJEMPLOS2;

import java.util.Scanner;

// un programa que sume 5 numeros enteros y guarde la suma, si es menor de 25, debe indicar ese motivo y volver a pedir los 5 numeros hasta que la suma se ade al menos 25

public class EjemploWhile04{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("\nInicio del programa");
        System.out.println("");

        int suma =0;

        while(suma<25){

            for(int i=0; i<5; i++){

                System.out.print("Inserte numero "+(i+1)+" : ");
                suma+=teclado.nextInt();

            }
            if(suma<25){
                System.out.println("La suma es menor de 25, debe introducir numeros mayores.\n");
                suma=0;
            }
 

        }
         

        System.out.println("\nFinal del programa");
        System.out.println(""); 
    }
}
