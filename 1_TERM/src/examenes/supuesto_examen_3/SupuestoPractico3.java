/* 
 * 
 * SupuestoPractico3.java
 *
 *
 * Adrián Peñalver Fernández
 *
 * 01/12/2023
 *
 */
package examenes.supuesto_examen_3;
import java.util.Scanner;
import java.lang.Math;

public class SupuestoPractico3{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        System.out.println(decimalbinario(23));
        System.out.println(binariodecimal(100));

    } 

    public static String decimalbinario(int decimal){
        
        String binario="";

        do{
        
            if(decimal%2!=0){
                decimal=(decimal-1)/2;
                binario+="1";
            }else{
                decimal=decimal/2;
                binario+="0";
            }

        }while(decimal>=1);
        
        return binario;
    }

    public static int binariodecimal(int binario){

        String binarios =""+binario;
        int decimal=0;

        for(int i= binarios.length()-1; i>=0 ;i--){
            if(binarios.charAt(i)-'0'==0){
                continue;
            }else{
                decimal+=(int)Math.pow(2,i-1);//o mas 1
            }
        }
        
        return decimal;
    }

}
