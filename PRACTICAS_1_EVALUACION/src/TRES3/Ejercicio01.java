package TRES3;

/* OK
 * 
 * Ejercicio01.java
 *
 * Escribe un método llamado fibonacci() utilizando programación por contrato que reciba un entero y devuelva el
 * valor que le corresponde en la sucesión de Fibonacci.
 *
 * El método fibonacci() calcula su valor de la siguiente manera:
 * Si el número recibido es un 1, la sucesión vale 1; si es un 2, la sucesión vale 2.
 * Para los sucesivos términos, se obtienen sumando los dos términos anteriores.
 * Por ejemplo, para el término 5 el valor es la suma del término para n=4 más el término para n=3.
 * Prueba el método pedido desde main(). Hay que tener en cuenta que en la programación por responsabilidades
 * main() es la responsable de llamar a fibonacci() con valores válidos.
 *
 * Adrián Peñalver Fernández
 *
 * 17/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio01{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        int numero=-1;
        boolean check=true;

         do{

            System.out.print("\nIntroduzca un numero entro positivo para saber el término equivalente de la serie de fibonacci: ");

            do{
                try{
                    numero = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (Entero): ");
                }

            }while(check);
            check =true;

            if(numero<0){
                System.out.println("\n\tEl número debe ser mayor que 0.\n");
            }

        }while(numero<0);    


        System.out.println("\nEl valor correspondiente de la serie de fibonacci para el "+numero+" es: "+fibonacci(numero)+"\n");

    }
     
    public static int fibonacci(int numero){

        int n1=0, n2=1;
        int suma=0;

        if(numero==0){
            return 1;
        }else{

            for(int i=1; i<=numero; i++){

                suma=n1+n2;
                n1=n2;
                n2=suma;

            }

        }
            
        return suma;

    }

}
