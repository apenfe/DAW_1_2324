package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo21{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        int importe1 = 20;
        double importe2 = 55.90;
        String importe3 = "33.33";
        double iva1 = 21.00, iva2 = 18.00, iva3 = 10.00;
        int iva4 = 21, iva5 = 18, iva6 = 10;
        String iva7 ="21", importe4="23.5";

        System.out.println("El iva de " +importe1+ " es " + calcularIVA(importe1));
        System.out.println("El iva de " +importe2+ " es " + calcularIVA(importe2));
        System.out.println("El iva de " +importe3+ " es " + calcularIVA(importe3));
        System.out.println();

        System.out.println("El iva de " +importe1+ " es " + calcularIVA(importe1,iva1));
        System.out.println("El iva de " +importe2+ " es " + calcularIVA(importe2,iva2));
        System.out.println("El iva de " +importe3+ " es " + calcularIVA(importe3,iva3));
        System.out.println();

        System.out.println("El iva de " +importe1+ " es " + calcularIVA(importe1,iva4));
        System.out.println("El iva de " +importe2+ " es " + calcularIVA(importe2,iva5));
        System.out.println("El iva de " +importe3+ " es " + calcularIVA(importe3,iva6));
        System.out.println();

         System.out.println("El iva de " +importe1+ " es " + calcularIVA(importe1,iva7));
        System.out.println("El iva de " +importe2+ " es " + calcularIVA(importe2,iva7));
        System.out.println("El iva de " +importe4+ " es " + calcularIVA(importe4,iva7));
        System.out.println();
       
    }

//-----------------------------------------------------------------------

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

//-----------------------------------------------------------------------

     public static double calcularIVA(int importe , double iva){

        return ((double)importe*iva)/100;
         
    }

    public static double calcularIVA(double importe, double iva){     

        return ((double)importe*iva)/100;
        
    }

    public static double calcularIVA(String importe, double iva){  
       
        double importe1= Double.parseDouble(importe);

        return ((double)importe1*iva)/100;
        
    } 

//-----------------------------------------------------------------------

     public static double calcularIVA(int importe , int iva){

        double ivaconvertido = (double)iva;

        return ((double)importe*ivaconvertido)/100;
         
    }

    public static double calcularIVA(double importe, int iva){   

        double ivaconvertido = (double)iva; 

        return ((double)importe*ivaconvertido)/100;
        
    }

    public static double calcularIVA(String importe, int iva){  
       
        double importe1= Double.parseDouble(importe);
        double ivaconvertido = (double)iva;

        return ((double)importe1*ivaconvertido)/100;
        
    } 

//-----------------------------------------------------------------------

    public static double calcularIVA(int importe , String iva){

        double ivaconvertido = Double.parseDouble(iva);

        return ((double)importe*ivaconvertido)/100;
         
    }

    public static double calcularIVA(double importe, String iva){   

        double ivaconvertido = Double.parseDouble(iva);

        return ((double)importe*ivaconvertido)/100;
        
    }

    public static double calcularIVA(String importe, String iva){  
       
        double importe1= Double.parseDouble(importe);
        double ivaconvertido = Double.parseDouble(iva);

        return ((double)importe1*ivaconvertido)/100;
        
    } 
}
