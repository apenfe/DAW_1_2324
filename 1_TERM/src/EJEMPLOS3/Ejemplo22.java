package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo22{

    public static   Scanner teclado = new Scanner(System.in); //variable global

    public static void main(String[] args){

        System.out.print("Introduce el número: ");
        int numero1 = pedirInt();

        int numero2 = pedirInt("introduce el número: ");

        imprimirInt(numero1);
        imprimirInt(numero2);
       
    }

//-----------------------------------------------------------------------

    public static int pedirInt(){
    
        int respuesta = Integer.parseInt(teclado.nextLine());
        return respuesta;
         
    }

    public static int pedirInt(String texto){
    
        System.out.print(texto);
        int respuesta = Integer.parseInt(teclado.nextLine());
        return respuesta;
        
    }

     public static void imprimirInt(int numero){
    
        System.out.println("numero: "+numero);
        
    }
}
