package TRES3;

/* OK
 * 
 * Ejercicio02.java
 *
 * Escribe un método llamado  palabrasCuatroLetras()que recibe una cadena de texto como parámetro y devuelve la
 * lista de palabras con al menos cuatro letras.
 * Se supondrá que una palabra está separada de otra por uno o más espacios en blanco, caracteres de tabulación
 * o caracteres de nueva línea.
 * Prueba exhaustivamente el método pedido desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 18/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio02{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        System.out.print("\nIntroduzca un texto a analizar: ");
        String cadena = teclado.nextLine().trim().toLowerCase();
        cadena= cadena.replaceAll("[\\t\\n]"," ");
        cadena= cadena.replaceAll("[^A-Za-zñÑáéíóúÁÉÍÓÚ\\s]","");

        System.out.print("\nLas palabras de 4 letras encontradas en el texto son: ");
        System.out.println(palabrasCuatroLetras(cadena));
        System.out.println();

    } 

    public static String palabrasCuatroLetras(String cadena){

        int contador=0;
        String palabras="";

        for(int i=0; i<cadena.length(); i++){

            if(cadena.charAt(i)==' '){
                contador=0;
            }else{
                
                contador++;
            }

            if(contador==4){

                if(i==cadena.length()-1){

                    for(int j=0; j<4;j++){
                        palabras+=cadena.charAt(i-3+j);
                    }

                    palabras+=" ";

                }else{

                    if(cadena.charAt(i+1)==' ' ){

                        for(int j=0; j<4;j++){
                            palabras+=cadena.charAt(i-3+j);
                        }
                        palabras+=" ";
                    }

                }
            }

            if(contador>4){
                continue;
            }

        }

        return palabras;
    }
    
    public static String palabrasCuatroLetras2(String frase){

        String[] palabras=frase.split("[ \n\t]");
        String lista="";

        for(int i=0; i<palabras.length;i++){
            if(palabras[i].length()>=4){
                lista+=palabras[i]+"\n";
            }
        }  

        return lista;
    }

}
