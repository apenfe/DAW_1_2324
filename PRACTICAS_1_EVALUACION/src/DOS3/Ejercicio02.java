package DOS3;

/* Ejercicio02.java
 *
 * Escribe un programa simple que escriba todos los números primos comprendidos en un intervalo.
 * Hay que tener en cuenta que:
 * Un número es primo si sólamente es divisible por sí mismo y por la unidad.
 * El cero no es primo.
 * El uno es primo.
 * El operador módulo proporciona el resto de la división entera; si un número es primo, sólo dará cero con él mismo y con el uno.
 * Documenta el programa con comentarios aclaratorios adicionales si se considera necesario.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 16/10/23
 */

import java.util.Scanner;

public class Ejercicio02{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        int intervalo[]= new int[2];
        boolean check = true, primo=true;
        int cont=0;
        
            do{ // ELECCIÓN DE INTERVALO CORRECTO

                for(int i=0; i<2; i++){
                    System.out.print("Intruduzca el "+(i+1)+"º número del intervalo: ");
                    intervalo[i]=teclado.nextInt();
                }

                if(intervalo[0]<0 || intervalo[1]<0){
                    System.out.println("Los números deben de ser enteros mayores o iguales a 0.\n");

                }else{
                    
                    if(intervalo[0]<intervalo[1]){
                        check=false;
                    }else{
                        System.out.println("El primer número debe ser menor que el segundo.\n");
                    } 
                }
                
            }while(check); 

            // CALCULO DE NUMEROS PRIMOS
                
                System.out.println();

                for(int i=intervalo[0]; i<=intervalo[1]; i++){ 

                    primo=true;

                    if(i<=2 && i!=0){

                        cont ++;
                        System.out.println(cont+"º Número primo: "+i);

                    }else{

                        if(i%2==0){
                            continue;

                        }else{

                            if(i%1==0 && i%i==0){

                                for(int j=2; j<=i-1; j++){

                                        if(i%j==0){
                                            primo=false;
                                        }    
                                 }
          
                                 if(primo){
                                     cont ++;
                                     System.out.println(cont+"º número primo: "+i);
                                 }
      
                            } 
                        }
                 }
            }
              
    }
}
