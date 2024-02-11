/**
 * Supuesto1_3.java
 * Se pide un decimal y se hará una función u otra en función a unos rangos establecidos.
 * Adrián Peñalver Fernández 06/10/2023
 */
package examenes.examen_1;
import java.util.Scanner;
import java.lang.Math;

public class Supuesto1_3 {
    public static void main(String args[]) {     
        Scanner teclado = new Scanner(System.in);

        System.out.print("A continuación introduzca un número decimal: ");
        double numero = teclado.nextDouble();

        if(numero>=1 && numero <=4){

            int i=(int)Math.ceil(numero);
            System.out.println("\nNúmero entre 1 y 4, se realiza potencia de "+numero+" elevado a " + i);
            System.out.println(Math.pow(numero,i));
          
        }else if(numero>=5 &&  numero <=10){

            System.out.println("\nNúmero entre 5 y 10, se multuplica "+numero+" x 2");
            System.out.println(numero*2);

        }else if(numero>10 &&  numero <20){


            int i=(int)Math.floor(numero);
            System.out.println("\nNúmero mayor que 10 y menor que 20, se realiza la suma de "+numero+ " + "+ i);
            System.out.println(numero+i);

        }else if(numero>=25 &&  numero <30){

            System.out.println("\nNúmero mayor o igual que 25 y menor que 30, se realiza la multiplicacion de "+numero+ " x 3,1416");
            System.out.println(numero*3.1416);

        }else{

            System.out.println("\nNúmero fuera de los rangos, se realiza la division de "+numero+ " /  "+" 10");
            System.out.println(numero/10);            

        }
        
    }
}

