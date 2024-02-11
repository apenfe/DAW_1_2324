package EJEMPLOS3;

import java.util.Scanner;   // ver porque falla

public class Ejemplo10{

    public static void main(String[] args){

        int a= entrada();
        int b= entrada();
        int c= entrada();

        System.out.println();

        boolean check = triangle(a,b,c);
        if(check){
            System.out.println(type(a,b,c));
        }else{
            System.out.println("No es valido");
        }

    }

    public static boolean triangle(int a, int b, int c){


        if(a<=0||b<=0||c<=0){
            return false;         
        }
        if(((a+b)<=c)||((c+b)<=a)||((a+c)<=b)){
            return false;

        }
        
        return true;
        
    }

    public static String type(int a, int b, int c){


        if(a==b && b==c){
            return "Equilatero";         
        }else if(a!=b && b!=c && a!=c){
            return "Escaleno";
        }else{
            return "Isosceles";
        }
        
    }

    public static int entrada(){

        Scanner teclado= new Scanner(System.in);

        System.out.print("\tLado triangulo: ");
        int numero = teclado.nextInt();

       //teclado.close();

        return numero;
        
        
    }
}

