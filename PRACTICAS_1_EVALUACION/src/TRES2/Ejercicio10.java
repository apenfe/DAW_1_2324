package TRES2;

/* 
 * Ejercicio10.java
 * 	
 * Escribe un método que se llame rombo2() que reciba un número entero como parámetro y devuelva una cadena de
 * caracteres con el texto formateado de un rombo de asteríscos.
 * Prueba el método pedido desde main().
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio10{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        System.out.print("¿De que tamaño desea su rombo? ");
        int numero = teclado.nextInt();
        
        while(numero<=0||numero%2==0){

            if(numero<=0){
            
                System.out.println("\nEl número debe ser mayor o igual a 1.");
                System.out.print("\tIngrese otro número: ");
                numero=teclado.nextInt();

            }else{
            
                System.out.println("\nEl número debe ser impar.");
                System.out.print("\tIngrese otro número: ");
                numero=teclado.nextInt();

            }
            
        }

        System.out.print(rombo2(numero));
    }

    public static String rombo2(int numero){ 

        String texto="";  

        System.out.println();
    
        for(int i=1; i<=numero; i++){

            texto= texto+"\t";

             for(int j=1;j<=numero;j++){

                if(i<=((numero-1)/2)){
                    
                    if(j<(((numero-1)/2)+1)-i+1 || j>(((numero-1)/2)+1)+i-1){

                        texto= texto+" ";

                    }else{

                        texto= texto+"*";

                    }
                    
                }else if(i>=((numero-1)/2)+2){

                    if(j<(((numero-1)/2)+1)-(numero-i) || j>(((numero-1)/2)+1)+(numero-i)){

                        texto= texto+" ";

                    }else{

                        texto= texto+"*";

                    }

                }else{

                   texto= texto+"*";

                }            
        }

        texto= texto+"\n\n";

        }
return texto;
    }

        
  }

