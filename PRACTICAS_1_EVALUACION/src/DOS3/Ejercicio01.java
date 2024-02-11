package DOS3;

/* Ejercicio01.java
 *
 * Escribe un programa simple que:
 * Lea tres números.
 * Comprueba que los números son correctos tomados esos número como medidas de los lados de un triángulo; 
 * sino muestra un mensaje de error. (La suma de dos cualquiera de los lados debe ser mayor que el tercero). 
 * Indique el tipo de triángulo que formarían (isósceles, equilátero, escaleno).
 * Pregunte si se quiere volver a repetir tecleando S ó N para hacerlo. Si no se teclea S o N debe insistir.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 16/10/23
 */

import java.util.Scanner;

public class Ejercicio01{
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        double lados[]= new double[3];
        boolean check= true;
        String respuesta;

        do{
            do{

                for(int i=0; i<3; i++){
                    System.out.print("Intruduzca el lado "+(i+1)+" : ");
                    lados[i]=teclado.nextDouble();
                }

                if(lados[0]!=0 && lados[1]!=0 && lados[2]!=0){

                    if((lados[1]+lados[2])<=lados[0] || (lados[0]+lados[2])<=lados[1] || (lados[1]+lados[0])<=lados[2]){ 
                        System.out.println("\nLa suma de dos de los lados no puede ser igual o menor al tercero.\n");
                    }else{
                        check=false;
                    }

                }else{
                    System.out.println("\nLos lados no pueden ser 0.\n");
                }
                
            }while(check);

            if(lados[0] == lados[1] && lados[1] == lados[2]){
                System.out.println("\nSe trata de un triángulo equilátero.\n");
            }else if(lados[0] != lados[1] && lados[1] != lados[2]){
                System.out.println("\nSe trata de un triángulo escaleno.\n");
            }else{
                 System.out.println("\nSe trata de un triángulo isósceles.\n");
            }
                
            teclado.nextLine();
            do{
              
                System.out.print("¿Desea repetir el proceso? S-N: ");
                respuesta= teclado.nextLine();
                
                if(respuesta.trim().equalsIgnoreCase("n")==true){
                    return;
                }else if(respuesta.trim().equalsIgnoreCase("n")!=true && respuesta.trim().equalsIgnoreCase("s")!=true){
                    System.out.println("Debe pulsar S o N \n");
                }else{
                    System.out.println();
                    check=true;
                    break;
                }
            }while(true);
            

        }while(respuesta.trim().equalsIgnoreCase("s")==true);

    }
}
