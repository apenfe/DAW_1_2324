package EJEMPLOS3.excepciones;

import java.util.Scanner;

public class Excepcion03b{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        while(true){

            String menu = "\t   MENU\n---------------------------\n\t1- hacer x\n\t2- hacer y\n\t3- hacer z\n\t0- finalizar\n\nSeleccione una opcion: ";
            int numero= pedirInt(menu);

            if(numero==1){
                System.out.println("\npulsa 1");

            }else if(numero==2){
                System.out.println("\npulsa 2");

            }else if(numero==3){
                System.out.println("\npulsa 3");

            }else if(numero==0){
                System.out.println("FIN DEL PROGRAMA");
                return;

            }else{
                System.out.println("\nno valido");

            }

        }
    }

    public static int pedirInt(String enunciado){

        int numero;

        System.out.print(enunciado);
        
        try{

            numero= Integer.parseInt(teclado.nextLine().trim());

        }catch(Exception e){

            //System.out.println("error: "+e);

            numero= -1;

        }

        return numero;

    }

}

