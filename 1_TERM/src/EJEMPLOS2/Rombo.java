package EJEMPLOS2;

import java.util.Scanner;

public class Rombo{
    public static void main(String []args){

    Scanner teclado= new Scanner(System.in);
    int alto=0;

    System.out.print("Cual es el alto deseado? ");
    alto = teclado.nextInt(); //impar

    int max= alto;
   
    
        for(int i=1; i<=alto; i++){

             for(int j=1;j<=max;j++){

                if(i<=((alto-1)/2)){
                    
                    if(j<(((max-1)/2)+1)-i+1 || j>(((max-1)/2)+1)+i-1){

                        System.out.print(" ");

                    }else{

                        System.out.print("*");

                    }
                    
                }else if(i>=((alto-1)/2)+2){

                    if(j<(((max-1)/2)+1)-(max-i) || j>(((max-1)/2)+1)+(max-i)){

                        System.out.print(" ");

                    }else{

                        System.out.print("*");

                    }

                }else{

                   System.out.print("*");

                }            
        }

        System.out.println();

        }

    }
}
