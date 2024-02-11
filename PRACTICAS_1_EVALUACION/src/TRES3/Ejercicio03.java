package TRES3;

/* OK
 * 
 * Ejercicio03.java
 *
 * Escribe un método llamado muestraCuadrado() que muestra un cuadrado en modo texto.
 *
 * Hay que tener en cuenta que:
 * El método recibe un número para el tamaño del lado y un carácter para utilizarlo en el contorno del cuadrado.
 * El algoritmo utilizado debe formatear todo sobre una sola cadena de texto que será devuelta.
 * Prueba exhaustivamente el método pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 18/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio03{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        int lado=0;
        boolean check= true;
        char contorno=' ';

        do{

            System.out.print("Introduzca un numero entro positivo para el lado del cuadrado: ");

            do{
                try{
                    lado = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (Entero): ");
                }

            }while(check);
            check =true;

            if(lado<=0){
                System.out.println("\n\tEl número debe ser mayor que 0.\n");
            }

        }while(lado<=0);

        do{

            System.out.print("Introduzca un caracter para el contorno del cuadrado: ");

            do{
                try{
                    contorno = teclado.nextLine().charAt(0);
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un CHAR válido: ");
                }

            }while(check);
            check =true;

            if(contorno==' '||contorno=='\t'){
                System.out.println("\n\tEl CHAR no puede ser tabulador, ni espacio.\n");
            }

        }while(contorno==' '||contorno=='\t');
        
        System.out.println();
        System.out.println(muestraCuadrado(lado,contorno));

    } 

    public static String muestraCuadrado(int lado, char contorno){

        String cuadrado = "";

            for(int i=1; i<=lado; i++){

                for(int j=1; j<=lado; j++){

                    if(j==1||j==lado||i==1||i==lado){
                        cuadrado+=contorno+" ";
                    }else{
                        cuadrado+="  ";
                    }

                }

                cuadrado+="\n";
            }
        
        return cuadrado;
    }

}
