/* 
 * Ejercicio03.java
 *
 * Dada una palabra, buscarla en una frase y devolver cuantas veces aparece.
 * La frase y la palabra deben ser parametros de una funcion.
 *
 * Funcion coincidencias acepta palabra y texto, devuelve entero con nº coincidencias
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;



public class Ejercicio03{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        System.out.print("Introduzca una frase: ");
        String frase = teclado.nextLine().trim().toLowerCase();
        System.out.println();  

        System.out.print("Introduzca una palabra a buscar en la frase: ");
        String palabra = teclado.nextLine().trim().toLowerCase();
        System.out.println();        
              
        System.out.println(coincidencias(frase, palabra)); 

    }

    /*
     *   1º contar palabras
     *   2º crear array con tamaño palabras
     *   2.1 limpiar palabras
     *   3º meter palabras en array
     *   4º ver si palabra es igual a la buscada, una a una.
     */

    public static int coincidencias(String frase, String palabra){

        int cont=0;

        frase=frase.replaceAll("[^a-zA-Z0-9\\s]", ""); // limpiar todo excepto los espacios

        for(int i=0 ; i<frase.length()-palabra.length(); i++){ // contar palabras

                if(frase.charAt(i)==palabra.charAt(0)){

                    for(int j=0; j<palabra.length();j++){
                        
                        if(frase.charAt(i+j)!=palabra.charAt(j)){
                            break;
                        }else{

                            if(j==palabra.length()-1 && frase.charAt(i+j+1)==' '){
                            
                                cont++;

                            }

                        }

             
                    }

                }else{

                    continue;

                }
        }
           
        return cont;
    }

}
