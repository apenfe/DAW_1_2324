package EJEMPLOS2;

import java.util.Scanner;

public class rectangulo{
public static void main(String []args){
    Scanner teclado= new Scanner(System.in);
    int alto, ancho;

    System.out.print("Cual es el alto deseado? ");
    alto = teclado.nextInt();
    System.out.print("Cual es el ancho deseado? ");
    ancho = teclado.nextInt();

System.out.println();

    for (int i=1; i<=alto; i++){
        for(int j=1; j<=ancho; j++){
            if(i==1||i==alto||j==1||j==ancho){
                System.out.print("* ");
            }else{
                System.out.print("  ");
            }

        }
        System.out.println();
    }


System.out.println();
}


}
