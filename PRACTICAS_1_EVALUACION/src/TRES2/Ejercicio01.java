package TRES2;

/* 
 * Ejercicio01.java
 *
 * Escribe un programa para calcular los salarios semanales de empleados a los que se les paga 15 euros 
 * por hora hasta el limite de las 35 horas. Cada hora por encima de 35 se considerará extra y se paga a 22 €.
 * El programa pide las horas del trabajador, realiza el calculo, muestra el resultado y vuelve a pedir otro 
 * si se quiere seguir. El salario que se le debe pagar se calcula utilizando un método especializado llamado
 * calcularSalario().
 * El método  calcularSalario() recibe las horas como parámetro y devuelve el sueldo que corresponde.
 * 
 * Adrián Peñalver Fernández
 * 
 * 04/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio01{

    public static   Scanner teclado = new Scanner(System.in);

    public static final int HORA_NORMAL = 15;
    public static final int HORA_EXTRA = 22;
    public static final int LIMITE = 35;

    public static void main(String[] args){

        while(true){

            System.out.println();
            System.out.print("¿Cuantas horas has trabajado? ");
            int horas= teclado.nextInt();
        
            System.out.println();
            System.out.println("Cobrará: "+calcularSalario(horas)+" €.");
        
            teclado.nextLine();
            System.out.print("\n¿Desea volver a hacer el calculo? - Pulse S para confirmar: ");
            String respuesta = teclado.nextLine();

            if(respuesta.trim().equalsIgnoreCase("s")==false){
                return;
            }

        }

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
