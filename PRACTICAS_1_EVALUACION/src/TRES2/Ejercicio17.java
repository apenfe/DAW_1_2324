package TRES2;

/* 
 * Ejercicio17.java
 * 	
 * Escribe un método que se llame indiceAfabetico() que recibe una palabra como texto. Devuelve un array (vector)
 * de números conteniendo la posición que le corresponde a cada letra de la palabra recibida según el alfabeto
 * español.
 * Prueba el método pedido desde main().
 * Se puede resolver con un vector de char que contenga todos las letras ordenadas del alfabeto español y dos 
 * bucles for anidados (uno para las letras de la palabra y otro para el array del alfabeto). Tambien se pueden
 * utilizar las propiedades de los sistemas de codificación ASCII o unicode.
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio17{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("\nA continuación debe escribir una palabra en español: ");
        String palabra = teclado.nextLine();

        System.out.println();

        for(int i=0; i<indiceAfabetico(palabra).length;i++){

            System.out.println("\tLa letra \""+(palabra.charAt(i))+"\" corresponde a la posición \""+ (indiceAfabetico(palabra)[i]+1) +"\" del abecedario.");

        }

        System.out.println();

    }

    public static int[] indiceAfabetico(String texto){ 

        texto= texto.trim().toLowerCase();
  
        char[] abc ={'a','b','c','d','e','f','g','h','i','j','k','l','m','n',
                        'ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
        int[] orden = new int[texto.length()];

        for(int i = 0 ; i < texto.length(); i++){

            for(int j = 0 ; j < abc.length ; j++){

                if(texto.charAt(i)==abc[j]){
                    orden[i]=j;
                }

            }

        }

        return orden;
        
    }
        
  }
