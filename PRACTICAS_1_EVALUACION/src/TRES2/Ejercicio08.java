package TRES2;

/* 
 * Ejercicio08.java
 *
 * Escribe un método que se llame trianguloTexto() que reciba un número entero como parámetro y devuelva una 
 * cadena de caracteres con el texto formateado de una pirámide de asteriscos.
 * Por ejemplo si se introduce el 6, la cadena devuelta, al imprimirla, daría:
 *                     *
 *
 *                    ***
 *
 *                   *****
 *
 *                  *******
 *
 *                 *********
 *
 *                ***********
 *
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio08{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que tamaño desea su piramide? ");
        int numero = teclado.nextInt();
        
        while(numero<=0){
            System.out.println("\nEl número debe ser mayor o igual a 1.");
            System.out.print("\tIngrese otro número: ");
            numero=teclado.nextInt();
        }

        System.out.print(trianguloTexto(numero));
        
    }

    public static String trianguloTexto(int numero){   

         int max = numero+(numero-1);
         String triangulo="";

         triangulo=triangulo+"\n";
    
         for(int i=1; i<=numero; i++){

            triangulo=triangulo+"\t";

            for(int j=1;j<=max;j++){
                    
                    if(j<(((max-1)/2)+1)-i+1 || j>(((max-1)/2)+1)+i-1){

                        triangulo=triangulo+" ";

                    }else{

                        triangulo= triangulo+"*";

                    }                      
            }

        triangulo= triangulo + "\n\n";

        }
    
        return triangulo;
        
    }
}
