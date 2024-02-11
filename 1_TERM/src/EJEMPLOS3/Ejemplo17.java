package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo17{

    public static   Scanner teclado = new Scanner(System.in);

    public static final String NOMBRE="Adrián";
    public static final String CORREO="adrian1414@hotmail.es";
    public static final int HORA_NORMAL = 15;
    public static final int HORA_EXTRA = 22;
    public static final int LIMITE = 35;

    // crear un metodo que reciba un entero como parametro correspondiente a las horas tarbajadas, y devuelva el sueldo correspondiente
    // teniendo en cuenta que cada hora se paga a 15 euros hasta el limite de 35 horas; las siguinetes horas se pagan a 22 euros.

    public static void main(String[] args){
        
        System.out.print("Cuantas horas has trabajado? ");
        int horas= teclado.nextInt();
        
        System.out.println();
        System.out.println("Cobrará: "+calcularSalario(horas)+" €.");
        System.out.println("Trabajador: " + NOMBRE + ", Coreo: "+ CORREO);
      

    }

    public static int calcularSalario(int numero){
           
        if(numero<=LIMITE){

            numero=numero*HORA_NORMAL;

        }else{

            numero=((numero-LIMITE)*HORA_EXTRA)+(LIMITE*HORA_NORMAL);

        }

        return numero;

    }
}
