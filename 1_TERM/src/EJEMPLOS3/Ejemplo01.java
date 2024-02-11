package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo01{

    public static void main(String[] args){ //public visibilidad, void tipo de retorno, main o multiplicacion es el identificador

        Scanner teclado= new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int num = teclado.nextInt();

        multiplicacion(num);

        System.out.print("Introduzca otro número: ");
        num = teclado.nextInt();

        multiplicacion(num);
    }

    public static void multiplicacion(int numero){ //(int numero) lista de parametros formales, lo de dentro del metodo se llama cuerpo

        System.out.println("\nTabla de multiplicar del "+ numero+"\n"); //identificador + lista de parametros es = firma o signature

        for(int i=0; i<=10 ; i++){
            System.out.println("\t" + i + " x " + numero + " = " + (numero*i));
        }

    }

}
