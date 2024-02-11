package DOS2;

/* Ejercicio11.java
 *
 * Escribe un programa simple que muestre un menú que permita realizar las operaciones de sumar, restar, multiplicar, dividir y terminar.
 * El menú debe ejecutarse en un bucle continuo controlando la opción terminar del menú.
 * Las operaciones serán siempre de dos operandos.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 10/10/23
 */

import java.util.Scanner;

public class Ejercicio11{
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        boolean exit = true;
        int eleccion;
        double a = 0, b = 0;

        do{
        
            System.out.println("A continuación debe seleccionar una de estas opciones: \n");
            System.out.println("\tSuma (a+b)--> 1");
            System.out.println("\tResta (a-b)--> 2");
            System.out.println("\tMultiplica (a*b)--> 3");
            System.out.println("\tDivide (a/b)--> 4");
            System.out.println("\tTerminar--> 5");
            System.out.print("\n¿Cual es su elección?  ");
            eleccion = teclado.nextInt();

            if(eleccion>=1 && eleccion<=4){
                System.out.print("¿Cual es el primer operando? \'a\' ");
                a = teclado.nextDouble();
                System.out.print("¿Cual es el segundo operando? \'b\' ");
                b = teclado.nextDouble();
            }
            
            switch(eleccion){

                case 1:

                    System.out.println("\nLa suma: " + a + " + " + b + " = " + (a+b));
                    System.out.println();
                   
                    break;

                case 2:

                    System.out.println("\nLa resta: " + a + " - " + b + " = " + (a-b));
                    System.out.println();
                    
                    break;

                case 3:

                    System.out.println("\nLa multiplicación: " + a + " x " + b + " = " + (a*b));
                    System.out.println();
                    
                    break;

                case 4:

                    if(b==0){
                        System.out.println("\nEl segundo operando \'b\' no puede ser 0.\n");
                        System.out.println();
                    }else{
                        System.out.println("\nLa división: " + a + " / " + b + " = " + (a/b));
                        System.out.println();
                    }
                    
                    break;

                case 5:

                    System.out.println("\nFin del programa.");
                    exit=false;
                    break;

                default:

                    System.out.println("\nDebe seleccionar una opción válida, entre 1 y 5.\n");
                    System.out.println();
                  
            }

        }while(exit);
  
    }
}  
