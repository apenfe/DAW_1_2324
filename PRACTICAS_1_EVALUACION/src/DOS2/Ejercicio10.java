package DOS2;


/* Ejercicio10.java
 *
 * Escribe un programa simple que pida tres valores reales a, b, c 
 * Calcule las soluciones reales x1 y x2 de una ecuación de segundo grado de la forma ax2 + bx + c = 0.
 * Las soluciones de la ecuación vienen dadas, de forma general, por:
 * x1 = -b / 2a + sqrt(b2 - 4ac) / 2a
 *
 * x2 = -b / 2a - sqrt(b2 - 4ac) / 2a
 *
 * Para algunos valores de a, b, y c se producirá un error debido a que el discriminante:  b2 - 4ac  toma valor negativo, lo que indica que no hay raíces reales sino complejas.
 * Se debe tener en cuenta que:
 *
 * Si a = 0 y b = 0 la ecuación es degenerada.
 * Si a = 0 y b ≠ 0 existe una raíz única con valor –c / b.
 *
 * En los demás casos, siendo el discriminante d =  b2 - 4ac
 * Si d >= 0  hay dos raíces reales x1 y x2
 * x1 = x + y
 *
 * x2 = x - y
 *
 * siendo:
 *
 * x = -b / 2a
 *
 * y = sqrt(b2 - 4ac) / 2a
 *
 * Si d < 0 hay dos raíces complejas x1 y x2
 * x1 = x + yi
 *
 * x2 = x - yi
 *
 * siendo:
 *
 * x = -b / 2a
 *
 * y = sqrt(b2 - 4ac) / 2a
 *
 * i es la unidad imaginaria sqrt(-1)
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 10/10/23
 */

import java.util.Scanner;
import java.lang.Math;

public class Ejercicio10{
    public static void main(String[] args){

        Scanner teclado= new Scanner(System.in);
        double valores[] ={0,0,0};
        String letras[] ={"a","b","c"};
        double x1, x2, x, y, d;

        for(int i=0; i<=2;i++){
            System.out.print("Ingrese el valor de "+letras[i]+": ");
            valores[i]= teclado.nextDouble();
        }
        
        System.out.println("\nEcuación de segundo grado de tipo: "+valores[0]+"x² + " + valores[1] + "x + "+valores[2]+ " = 0.");

        if(valores[0]==0){

            if(valores[1]==0){
                System.out.println("\nEcuación degenerada 0/0.");
                return;
            }else{
                System.out.println("\nExiste una unica raiz de solucion (-c/b)= " + (-valores[2]/valores[1]));
                return;
            }
        }

        d= Math.pow(valores[1],2)-(4 * valores[0] * valores[2]);

        if(d<0){

            System.out.println("\nSoluciones complejas.");
            System.out.println("\nb² - 4ac < 0 -----> " + valores[1] + "² - 4 x " + valores[0] + " x " + valores[2] + " = " + d );
            

        }else{
            
            x = -(valores[1]/(2*valores[0]));   
            y = Math.sqrt(d)/(2*valores[0]);
            x1 = x + y;
            x2 = x - y;

            System.out.println("\nLa solución x1 = "+x1);
            System.out.println("\nLa solución x2 = "+x2);

        }

    }
}  
