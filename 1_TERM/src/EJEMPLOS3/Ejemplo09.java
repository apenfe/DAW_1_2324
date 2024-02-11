package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo09{

    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);

        System.out.print("\tLado a triangulo: ");
        int a = teclado.nextInt();

        System.out.print("\tLado a triangulo: ");
        int b = teclado.nextInt();

        System.out.print("\tLado a triangulo: ");
        int c = teclado.nextInt();

        System.out.println();

        boolean check = triangle(a,b,c);
        System.out.println(check);

    }

    public static boolean triangle(int a, int b, int c){


        if(a<=0||b<=0||c<=0){
            return false;         
        }
        if(((a+b)<=c)&&((c+b)<=a)&&((a+c)<=b)){
            return false;

        }
        
        return true;
        
    }
}

