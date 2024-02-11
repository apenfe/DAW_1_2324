package DOS2;

/* Ejercicio06.java
 *
 * Escribe un programa simple que escriba todos los múltiplos de 3 comprendidos entre 1 y 3000.
 * Opcionalmente, haz variantes en el mismo programa, resolviendolo con diferentes tipos de bucles; incluso utilizando break y continue. 
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 09/10/23
 */

public class Ejercicio06{
    public static void main(String[] args){
        
        for(int i= 1; i<=3000; i++){ // version for normal

            if(i%3==0){
                System.out.println("El número: "+i+", es múltiplo de 3.");
            }

        }

        for(int i= 3; i<=3000; i+=3){ // version for con salto de 3 en 3

            if(i%3==0){
                System.out.println("El número: "+i+", es múltiplo de 3.");
            }

        }

            int i=0;

        do{ //version do while

            if(i%3==0){
                System.out.println("El número: "+i+", es múltiplo de 3.");
            }

            i++;

        }while(i<=3000);

         i=0;

        while(i<=3000){ //version while

            if(i%3==0){
                System.out.println("El número: "+i+", es múltiplo de 3.");
            }

            i++;
        }
    
         i=0;

        while(i<=3000){ //version while con continue
            
            if(i%3!=0){
                i++;
                continue;
            }else{
                System.out.println("El número: "+i+", es múltiplo de 3.");
            }
            i++;
        }

    }
} 
