package EJEMPLOS2.ejemplosalgoritmos;

import java.util.Scanner;

public class EjemploDoWhile01{ 
    public static void main(String[] args){

        double nota;
        Scanner teclado= new Scanner(System.in);
        String respuesta;

        while(true){
       
            do{
            
                System.out.print("Inserte una nota con decimales entre 0 y 10: ");
                nota=teclado.nextDouble();

                if(nota<0 || nota>10){
                    System.out.println("Nota no valida inserte numero entre 0 y 10.");
                }

            }while(nota<0 || nota>10);

            if(nota>=9){
                System.out.println("Sobresaliente");

            }else if(nota>=7 && nota<9){
                System.out.println("Notable");

            }else if(nota>=6 && nota<7){
                System.out.println("Suficiente");

            }else if(nota>=5 && nota<6){
                System.out.println("Bien");

            }else{
                System.out.println("Suspenso");
            }
            teclado.nextLine();  
            
            do{
                System.out.print("\tDesea intruducir una nueva nota? S-N: ");
                respuesta = teclado.nextLine();   
                System.out.println();
               
                if(respuesta.trim().equalsIgnoreCase("s")==true){
                    break;
                }else if(respuesta.trim().equalsIgnoreCase("n")==true){
                    return;
                }else{
                   System.out.println("\tDebe introducir N o S..."); 
                }

            }while(respuesta.trim().equalsIgnoreCase("s")!=true||respuesta.trim().equalsIgnoreCase("n")!=true);      
        }
    }
}
