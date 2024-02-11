/*
 * Supuesto2_1.java
 *
 * Adrián Peñalver Fernández
 *
 * 03/11/2023
 *
 */
package examenes.examen_2;
import java.util.Scanner;

public class Supuesto2_1{

    public static void main(String [] args){
    
        Scanner teclado = new Scanner(System.in);
        int numero=0, cont=0;
        String respuesta = "t";
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        while(true){

            System.out.print("Inserte un número entero: ");
            numero = teclado.nextInt();

            if(numero==0){

                teclado.nextLine();

                System.out.print("\nEl programa terminará. Si desea continuar pulse \"T\" ");
                respuesta= teclado.nextLine();

                if(respuesta.trim().equalsIgnoreCase("T") && cont>=2){

                    break;

                }else if(respuesta.trim().equalsIgnoreCase("T") && cont<2){

                    System.out.println("\tNo podrá terminar el programa hasta introducir al menos 2 valores válidos. \n");

                }else{

                    System.out.println("\tContinue introduciendo números. \n");

                }
   
            }else{

                cont++;

                if(numero<min){

                    min=numero;

                }

                if(numero>max){

                    max=numero;

                }

            }

        }

        System.out.println("\nFinal del programa, el mayor número es "+max+" y el menor número es "+min);
        System.out.println("\tSe han introducido un total de: "+cont+" números.\n");

    }
}
