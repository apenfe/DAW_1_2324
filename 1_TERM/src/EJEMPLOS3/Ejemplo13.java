package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo13{

    public static void main(String[] args){

        System.out.println();

        //int array[]=entradanumeros();
        mostrarnumeros(entradanumeros());
      

    }

    public static int[] entradanumeros(){

        int array[]=new int[10];
        Scanner teclado= new Scanner(System.in);

        for (int i =0; i<10; i++){
            System.out.print("El numero "+(1+i)+ " es: ");
            array[i]=teclado.nextInt();
        }

        return array;
        
      
    }

    public static void mostrarnumeros(int[] array){

        for (int i=0; i<10; i++){
            System.out.print(array[i]+" ");
        }        
      
    }
}
