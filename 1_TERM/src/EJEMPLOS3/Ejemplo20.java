package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo20{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int importe1 = 20;
        double importe2 = 55.90;
        String importe3 = "33.33";

        System.out.println("el iva de "+importe1+" es "+ calcularIVA(importe1));
        System.out.println("el iva de "+importe2+" es "+ calcularIVA(importe2));
        System.out.println("el iva de "+importe3+" es "+ calcularIVA(importe3));
       

    }

    public static double calcularIVA(int importe){
    
        int iva = 21;

        return ((double)importe*iva)/100;
         
    }

    public static double calcularIVA(double importe){
    
        int iva = 21;

        return ((double)importe*iva)/100;
        
    }

    public static double calcularIVA(String importe){
    
        int iva = 21;

        double importe1= Double.parseDouble(importe);

        return ((double)importe1*iva)/100;
        
    }
   

   
}
