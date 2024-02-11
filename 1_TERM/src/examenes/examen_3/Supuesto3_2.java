/*
  Supuesto3_2.java
  Adrián Peñalver Fernández  
  11/12/2023
*/ 

package examenes.examen_3;
import java.util.Scanner;

public class Supuesto3_2{

    public static Scanner teclado= new Scanner(System.in);

    public static void main(String[] args){

        int numero = pedirNumero();

        seccionUno(numero);
        seccionDos(numero);
        seccionTres(numero);
        tronco(numero);

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


    public static void seccionUno(int numero){

  
        int maximo = 2*numero+3;

        for(int i=1; i<=numero; i++){
System.out.println();

            for(int j=1; j<=maximo; j++){

                if(j<(((maximo-1)/2)+1)-i+1||j>(((maximo-1)/2)+1)+i-1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
    

        }

    }

   public static void seccionDos(int numero){


        int maximo = 2*numero+3;

        for(int i=1; i<=numero; i++){

            System.out.println();

            for(int j=1; j<=maximo; j++){

                if(j<=(((maximo-1)/2)+1)-i-1||j>=(((maximo-1)/2)+1)+i+1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
  

        }
           

    }

    public static void seccionTres(int numero){

        int maximo = 2*numero+3;

        for(int i=1; i<=numero; i++){

            System.out.println();

            for(int j=1; j<=maximo; j++){

                if(j<=(((maximo-1)/2)+1)-i-2||j>=(((maximo-1)/2)+1)+i+2){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
  

        }

           

    }


    public static void tronco(int numero){

        int ancho=0;

        if(numero<=7){
            ancho=3;
        }else if(numero>7&&numero<=10){
            ancho=5;
        }else if(numero>10&&numero<=15){
            ancho=7;
        }


         int maximo = 2*numero+3;

         for(int i=1; i<=numero; i++){

            System.out.println();

            for(int j=1; j<=maximo; j++){

                if(j<(((maximo-1)/2)+1)-((ancho-1)/2)||j>(((maximo-1)/2)+1)+((ancho-1)/2)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }

            }
  

        }

           

    }



}
