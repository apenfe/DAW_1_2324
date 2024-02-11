/* 
 * 
 * SupuestoPractico2.java
 *
 * Un programa que pida el número de línea de altura de una figura, la cual es rectángular, y mandará ese número como parámetro a un método
 * llamado "figura", el cual devolverá un String con la figura rectángular.
 *   
 *   La figura deberá respetar una longitud en espacios por su izquierda de acuerdo a los siguiente rangos:
 *        Altura entre 3 y 6 --> 5 espacios
 *        Altura entre 7 y 12 --> 7 espacios
 *        Altura entre 13 y 15 --> 9 espacios
 *   La figura deberá respetar una anchura de caracteres de acuerdo a los siguiente rangos:
 *        Altura entre 3 y 5 --> 3 caracteres
 *        Altura entre 6 y 8 --> 5 caracteres
 *        Altura entre 9 y 12 --> 7 caracteres
 *        Altura entre 13 y 15 --> 9 caracteres
 *
 * Adrián Peñalver Fernández
 *
 * 01/12/2023
 *
 */
package examenes.supuesto_examen_3;
import java.util.Scanner;

public class SupuestoPractico2{

    public static Scanner teclado = new Scanner(System.in);
    public static String simbolo = "*";

    public static void main(String [] args){

        System.out.print("\nIntroduzca el número de linea de altura de la figura: ");
        int altura = Integer.parseInt(teclado.nextLine().trim());

        System.out.println(figura(altura));


    } 

    public static String figura(int altura){

        String dibujo="";
        int ancho=0;

        if(altura<3||altura>15){
            dibujo="ERROR";
        }else{

            for(int i=1; i<=altura; i++){

                if(altura>=3&&altura<=6){
                    dibujo+="     ";
                }else if(altura>=7&&altura<=12){
                    dibujo+="       ";
                }else if(altura>=13&&altura<=15){
                    dibujo+="         ";
                }

                 if(altura>=3&&altura<=5){
                    ancho=3;
                 }else if(altura>=6&&altura<=8){
                    ancho=5;
                 }else if(altura>=9&&altura<=12){
                    ancho=7;
                 }else if(altura>=13&&altura<=15){
                    ancho=9;
                 }
                
                for(int j=1; j<=ancho; j++){

                            dibujo+=simbolo;
                        
                }
                dibujo+="\n";
            }
           
        }

        return dibujo;
    }

}
