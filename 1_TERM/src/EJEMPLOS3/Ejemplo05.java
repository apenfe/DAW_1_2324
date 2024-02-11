package EJEMPLOS3;

import java.util.Scanner;
import java.lang.Math;

public class Ejemplo05{

    public static void main(String[] args){ //public visibilidad, void tipo de retorno, main o multiplicacion es el identificador

        Scanner teclado= new Scanner(System.in);
        int lado = -1;

            while(lado<=0){
            System.out.print("Inserte un número entero para el tamaño del lado: ");
            lado = teclado.nextInt();
            
            if(lado<=0){
                System.out.println("Inserte un número entero positivo. \n");
            }
        }

        cuadrado(lado);
    }

    public static void cuadrado(int lado){
        
        System.out.println();

        for(int i=1; i<=lado; i++){

            for(int j=1; j<=lado; j++){

                if(i==1 || i==lado){

                    System.out.print("* ");

                }else{

                    if(j==1 || j==lado){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
            }

            System.out.println();            
        }
    }
}
