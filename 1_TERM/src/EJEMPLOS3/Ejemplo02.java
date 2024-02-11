package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo02{

    public static void main(String[] args){ //public visibilidad, void tipo de retorno, main o multiplicacion es el identificador

        Scanner teclado= new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduzca su nombre: ");
        String apellido = teclado.nextLine();

        System.out.print("Introduzca su nombre: ");
        int edad = teclado.nextInt();

        mostrarInfo(edad,nombre,apellido);
    }

    public static void mostrarInfo(int numero, String name, String surname){ //(int numero) lista de parametros formales, lo de dentro del metodo se llama cuerpo

        System.out.println("\nSu nombre es: "+name+", su apellido es: "+surname+ " y su edad es de "+numero+" años.\n"); //identificador + lista de parametros es = firma o signature

    }

}
