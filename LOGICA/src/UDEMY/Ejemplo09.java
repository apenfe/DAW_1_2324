/* 
 * Ejemplo09.java
 *
 * Dados 2 arrays, devuelve uno con solo lo elementos comunes entre ambos.
 *
 * Adrián Peñalver Fernández
 *
 */
package UDEMY;
import java.util.Scanner;

public class Ejemplo09{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String []args){

        int[] array1 = {4,5,6,7};
        int[] array2 = {7,8,9,7,5};   
        
        System.out.print("\nLos elementos comunes son: "); 

        for(int i=0; i<elementosComunes(array1, array2).length;i++){
            System.out.print(elementosComunes(array1,array2)[i] + " ");
        }

        System.out.println("\n"); 

    }

    public static int[] elementosComunes(int[] array1, int[] array2){

        String numeros = "";
        boolean check=true;

        for(int i=0; i<array1.length; i++){

            for(int j=0; j<array2.length; j++){
            
                if(array1[i]==array2[j]){
                    
                    for(int k=0; k<numeros.length(); k++){
                        if(numeros.charAt(k)-'0'==array1[i]){
                            check=false;
                        }
                    }

                    if(check){
                        numeros=numeros+array1[i];
                    }

                    check=true;

                }

            }

        }

        int[] comunes = new int[numeros.length()];

        for(int i=0; i<comunes.length; i++){
            comunes[i]=numeros.charAt(i)-'0';
        }

        return comunes;
         
    }

}
