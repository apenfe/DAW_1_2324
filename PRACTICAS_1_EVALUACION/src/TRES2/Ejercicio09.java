package TRES2;

/* 
 * Ejercicio09.java
 * 	
 * Escribe un programa que calcule las soluciones de una ecuación de segundo grado de la forma ax2 + bx + c = 0.
 * Se utilizará una variable de clase como variable global para el discriminante; de esta forma estará accesible
 * por los dos métodos: main() y evaluarDiscriminante().
 * Se utilizará un método llamado evaluarDiscriminante() que recibirá los coeficientes a, b, c como parámetros.
 * Calculará el discriminante d =  b2 - 4ac y lo guardará, evaluará su resultado y finalmente devolverá uno de 
 * los  siguientes códigos:     b2 = 4ac
 *
 *  1, si a = 0 la ecuación es degenerada.
 *  2, si el discriminante d > 0  la ecuación tiene dos raíces reales.
 *  3, si el discriminante d = 0  la ecuación tiene una raíz real.
 *  4, si el discriminante d < 0 la ecuación tiene dos raíces complejas de la forma: x + yi y x - yi
 *
 * Hay que saber que:
 * Las soluciones de la ecuación vienen dadas por:
 *  X1 = -b / 2a + sqrt(b2 - 4ac)) / 2a
 *  X2 = -b / 2a - sqrt(b2 - 4ac)) / 2a
 *
 * Para algunos valores de a, b, y c se producirá un error debido a que el discriminante:  b2 - 4ac  toma valor
 * negativo, lo que indica que no hay raíces reales sino complejas.
 *  Si d >= 0 hay dos raíces reales.
 *  Si d < 0 hay dos raíces complejas de la forma: x + yi y x - yi
 * 
 * Adrián Peñalver Fernández
 * 
 * 06/11/2023
 *
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio09{

    public static Scanner teclado = new Scanner(System.in);
    public static double discriminante;

    public static void main(String[] args){

        double valores[] ={0,0,0};
        String letras[] ={"a","b","c"};
        double x1, x2, x, y;

        System.out.println();

        for(int i=0; i<=2;i++){

            System.out.print("\tIngrese el valor de "+letras[i]+": ");
            valores[i]= teclado.nextDouble();

        }
        
        System.out.println("\nEcuación de segundo grado de tipo: "+valores[0]+"x² + " + valores[1] + "x + "+valores[2]+ " = 0.");

        if(evaluarDiscriminante(valores[0],valores[1],valores[2])==1){

                System.out.println("\nEcuación degenerada 0/0."+"\n");
            
        }else if(evaluarDiscriminante(valores[0],valores[1],valores[2])==2){
            
            x = -(valores[1]/(2*valores[0]));   
            y = Math.sqrt(discriminante)/(2*valores[0]);
            x1 = x + y;
            x2 = x - y;

            System.out.println("\nLa solución x1 = "+x1);
            System.out.println("\nLa solución x2 = "+x2+"\n");

        }else if(evaluarDiscriminante(valores[0],valores[1],valores[2])==3){
          
                System.out.println("\nExiste una unica raiz de solucion (-c/b)= " + (-valores[2]/valores[1])+"\n");

        }else{

            System.out.println("\nSoluciones complejas.");
            System.out.println("\nb² - 4ac < 0 -----> " + valores[1] + "² - 4 x " + valores[0] + " x " + valores[2] + " = " + discriminante+"\n");
   
        }  

    }  

    public static int evaluarDiscriminante(double a, double b, double c){   


        discriminante = Math.pow(b,2)-(4 * a * c);

        if(discriminante < 0){

            return 4;        

        }else if(discriminante == 0){

            return 3; 
                  
        }else{

            if(a==0){

            return 1;
            }else{
                return 2; 

            }
            
          

        }
        
    }
}
