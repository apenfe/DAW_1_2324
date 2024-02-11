package TRES3;

/* OK
 * 
 * Ejercicio04.java
 *
 * Escribe un método llamado tipoTriangulo() que recibe tres valores como parámetros, comprueba si forman un
 * triangulo.
 * Hay que tener en cuenta que:
 * Devuelve el nombre del tipo de triángulo que formarían (isósceles, equilátero, escaleno) o la palabra ERROR.
 * Para comprobar si forman un triangulo se utiliza el método esTriangulo().
 * El método esTriangulo() comprueba si tres valores recibidos como argumentos formarían un triangulo.
 * Devuelve true o false.
 * Prueba exhaustivamente los métodos pedidos desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 18/11/2023
 *
 */

import java.util.Scanner;

public class Ejercicio04{

    public static Scanner teclado = new Scanner(System.in);

    public static void main(String [] args){

        double[] lado= new double[3];
        boolean check=true;

        for(int i=0; i<3; i++){
           
            System.out.print("Introduzca el "+(i+1)+"º lado del triangulo: ");
 

            do{
              
                try{
                    lado[i] = Double.parseDouble(teclado.nextLine().trim());
                    check =false;
                }catch(Exception e){
                    System.out.print("\nERROR --- > Introduzca un dato válido. (DOUBLE con coma O IN): ");
                }

            }while(check);
            check =true;

        }
        
        System.out.println("\nEl triángulo es de tipo: "+tipoTriangulo(lado[0],lado[1],lado[2]));

    } 

    public static String tipoTriangulo(double a, double b, double c){

        String triangulo = "";

        if(esTriangulo(a,b,c)){

            if(a==b && b==c){
                triangulo+="equilátero";
            }else if(a!=b && b!=c){
                triangulo+="escaleno";
            }else{
                triangulo+="isósceles";
            }

        }else{
            triangulo+="ERROR";
        }

        return triangulo;
    }

    public static boolean esTriangulo(double a, double b, double c){

        boolean bool;
        
        if(a<=0||b<=0||c<=0){

            bool=false;

        }else{
            
            if((a+b)<=c||(a+c)<=b||(c+b)<=a){
                bool=false;
            }else{
                bool=true;
            }

        }
        
        return bool;
    }

}
