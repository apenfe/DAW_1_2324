package EJEMPLOS2;

import java.util.Scanner;


public class EjemploWhile02{
    
    public static void main(String[] args){
        Scanner teclado=new Scanner(System.in);
        System.out.println("\nInicio del programa");
        System.out.println("");

        System.out.print("\n Tabla de multiplicar: ");
        int numero= teclado.nextInt();
        int contador =0;

        while(contador<=10){

            System.out.println(numero +" x "+ contador +" = "+(contador*numero));
            contador ++;
        }
         
       
        System.out.println("\nFinal del programa");
        System.out.println(""); 
    }
}
