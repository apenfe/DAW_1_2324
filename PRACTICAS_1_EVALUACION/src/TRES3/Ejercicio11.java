package TRES3;

/* OK
 * 
 * Ejercicio11.java
 *
 * Escribe un método que se llame obtenerPrimos() que recibe el límite superior de todos los números primos que se
 * quieren obtener. Devuelve un ArrayList con los números obtenidos.
 * Buscar información en Internet para "Criba de Eratóstenes"
 * Deben seguirse los principios y estilo del código limpio.
 *
 * Adrián Peñalver Fernández
 *
 * 20/11/2023
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio11{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int superior = 0;
        boolean check=true;

        do{

            System.out.print("\nA continuación inserte un valor de tope superior para busqueda de primos: ");

            do{
                try{
                    superior = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (Entero): ");
                }

            }while(check);
            check =true;

            if(superior<=1){
                System.out.print("\n\tEl número debe ser mayor que 1.\n");
            }

        }while(superior<=1);

        System.out.println("\nLos números primos serán: ");

        int[] primos= obtenerPrimos(superior);

        for(int i=0; i<primos.length; i++){
            System.out.print(primos[i]+" ");
        }
        System.out.println();

    }

    public static int[] obtenerPrimos(int superior){

        int[] naturales= new int[superior-1];

        for(int i=0; i<naturales.length; i++){ // 1º creo array naturales 19 tamaño
            naturales[i]=i+2;
        }

        int indice_actual=0;

        while(superior>=Math.pow(naturales[indice_actual],2)){ 

           for(int i= indice_actual+3; i<=superior; i++){ // 2º toma primer número no marcado, como primo

                if((i)%naturales[indice_actual]==0){//&& naturales[i]!=0
                    naturales[i-2]=0;
                }             
            }

                 for(int i=indice_actual+1; i<=naturales.length; i++){
      
                    if(naturales[i]!=0){
                        indice_actual=i;
                        
                        break;
               
                    }
                 }
        }

        indice_actual=0;

        for(int i=0; i<naturales.length; i++){
            
            if(naturales[i]!=0){
                indice_actual++;
            }
        }

        int[] primos= new int[indice_actual];

        indice_actual=0;

        for(int i=0; i<naturales.length; i++){
            
            if(naturales[i]!=0){
                
                primos[indice_actual]=naturales[i];
                indice_actual++;
            }
        }

        return primos;

    }
   
}
