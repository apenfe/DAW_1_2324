package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo19{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        String texto = "el examen no era para tanto";
        int numero =15;
       
        mostrar(texto);   // esto es sobrecargar un metodo
        mostrar(numero);

    }

    public static void mostrar(String texto){
    
        System.out.println("el texto es: "+ texto);
        
    }

    public static void mostrar(int numero){
    
        System.out.println("el numero es: "+ numero);
        
    }

   
}
