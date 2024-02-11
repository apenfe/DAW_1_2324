package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo04{

    public static void main(String[] args){ //public visibilidad, void tipo de retorno, main o multiplicacion es el identificador

        Scanner teclado= new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String nombre = teclado.nextLine();

        System.out.print("Introduzca su nombre: ");
        String apellido = teclado.nextLine();

        System.out.print("Introduzca su edad: ");
        int edad = teclado.nextInt();

        mostrarInfo(edad,nombre,apellido);
    }

    public static void mostrarInfo(int numero, String name, String surname){ //(int numero) lista de parametros formales, lo de dentro del metodo se llama cuerpo

            System.out.print("\nSu nombre es: "+name+", su apellido es: "+surname); //identificador + lista de parametros es = firma o signature
            comprobarEdad(numero);
        

    }

    public static void comprobarEdad(int numero){ 

        if(numero<0){
           
            System.out.print(" (Edad no valida)");
        }else{
           System.out.print(" y su edad es de "+numero+" años.");
        }

    }

}
