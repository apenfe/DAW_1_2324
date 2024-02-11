package EJEMPLOS3;

import java.util.Scanner;
import java.lang.Math;

public class Ejemplo06{

    public static void main(String[] args){ //public visibilidad, void tipo de retorno, main o multiplicacion es el identificador

        Scanner teclado= new Scanner(System.in);
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

            triangulo(lados[0],lados[1],lados[2]);
                
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

    public static void triangulo(double lado1, double lado2, double lado3){
        
            if(lado1 == lado2 && lado2 == lado3){
                System.out.println("\nSe trata de un triángulo equilátero.\n");
            }else if(lado1 != lado2 && lado2 != lado3){
                System.out.println("\nSe trata de un triángulo escaleno.\n");
            }else{
                 System.out.println("\nSe trata de un triángulo isósceles.\n");
            }
    }
}


