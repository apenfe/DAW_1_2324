package examenes.examen_3;

import java.util.Scanner;

/* 
 
La sección del tronco tendrá una anchura inicial de tres caracteres por línea cuando la altura no sea superior 
a siete alturas de tamaño; a partir de ahí, la anchura aumentará dependiendo de la altura. Los rangos son:

para una altura de hasta 7 --> 3 caracteres de ancho
entre 8 y 10 de altura --> 5 caracteres de ancho
entre 11 y 15 de altura --> 7 caracteres de ancho
 
Un ejemplo de salida de su ejecución para un tamaño 5 sería la siguiente:

            *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
          * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
        * * * * *
      * * * * * * *
    * * * * * * * * *
  * * * * * * * * * * *
* * * * * * * * * * * * *
          * * *
          * * *
          * * *
          * * *
          * * *
 */

public class Repaso3_2{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int i = pedirNumero();
		seccionUno(i);
		seccionDos(i);
		seccionTres(i);
		Tronco(i);
			
	}
	
	public static int pedirNumero(){

        boolean check=true;
        int numero=0;

        while(numero<3||numero>15){

             System.out.print("Seleccione una cantidad de lineas entre 3 y 15: ");

            while(check){

                try{
                    numero = Integer.parseInt(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                            System.out.print("ERROR-- INTRODUCE UN ENTERO: ");
                }

            }

            check=true;

             if(numero<3||numero>15){
                System.out.println("El valor debe estar entre 3 y 15");
                }else{
                    break;
                }

        }

        return numero;
	}
	
	public static void seccionUno(int num){
		
		int maxanch=((num*2)+3)*2;
		
		for(int i=0; i<num; i++) {
			
			for(int j=1; j<(maxanch/2)-1-i; j++) { //espacios
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1+(i+1-1); j++) { //**
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void seccionDos(int num){

		int maxanch=((num*2)+3)*2;
		
		for(int i=0; i<num; i++) {
			
			for(int j=2; j<(maxanch/2)-1-i; j++) { //espacios
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1+(i+1-1)+2; j++) { //**
				System.out.print("*");
			}
			System.out.println();
		}

	}
	
	public static void seccionTres(int num){

		int maxanch=((num*2)+3)*2;
		
		for(int i=0; i<num; i++) {
			
			for(int j=3; j<(maxanch/2)-1-i; j++) { //espacios
				System.out.print(" ");
			}
			
			for(int j=0; j<i+1+(i+1-1)+4; j++) { //**
				System.out.print("*");
			}
			System.out.println();
		}
	}
	       
	public static void Tronco(int num){
		
		int ancho=0;
		int maxanch=((num*2)+3);
		
		if(num<=7) {
			ancho=3;
		}else if(num<=8&&num<=10) {
			ancho=5;
		}else if(num<=11&&num<=15) {
			ancho=7;
		}
		
		for(int i=0; i<num; i++) {
					
			for(int j=1; j<= ancho+(maxanch/2)+1; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<= ancho; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	       
	}
}