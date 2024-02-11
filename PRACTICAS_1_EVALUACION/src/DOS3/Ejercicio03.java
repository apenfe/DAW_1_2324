package DOS3;

/* Ejercicio03.java
 *
 * Escribe un programa simple que calcule el valor de un término determinado de la sucesión de Fibonacci .
 * La sucesión infinita de números naturales de Fibonacci  es:  0,1,1,2,3,5,8,13,21,34,55,89,144,233,377…
 * La sucesión comienza con los números 0 y 1, y a partir de estos, “cada término es la suma de los dos anteriores”, es la relación de recurrencia que la define.
 *
 * Para hacer el programa hay que tener en cuenta que:
 * Se debe pedir el número del término para calcular su valor. El primer término, n=0; vale  0, para n=4, vale 3. Sólo debe admitir números positivos, y cero
 * Para cualquier término de la sucesión, se determina sumando los dos términos anteriores. Por ejemplo para n=5 el valor sería el valor del término n=4 más el término n=3.
 * Se debe mostrar el valor del término correspondiente, no toda la serie hasta ese término.
 *
 * Autor: Adrián Peñalver Fernández
 *
 * 17/10/23
 */

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int num1=-1, n1=1, n2=1, sum=0;

        while(num1<0){

            System.out.print("Introduzca el número del termino de la serie Fibonacci que desea calcular: ");
            num1 = teclado.nextInt();
    
            if(num1<0){
                System.out.println("Introduce números mayores o igual que 0. \n");
            }

        }

        if(num1==0){
            System.out.println("El término n="+num1+", es: 0");
        }else if(num1==1){
            System.out.println("El término n="+num1+", es: 1");
        }else if(num1==2){
            sum=1;
            System.out.println("El término n="+num1+", es: "+sum);
        }else{
            for(int i=3; i<=num1; i++){

                sum=n1+n2;
                if(i==num1){
                    break;
                }
                n2=n1;
                n1=sum;
             }
             
             System.out.println("El término n= "+num1+", es la suma del término n-1= "+n1+" y el término n-2= "+n2+" = "+sum);

        }
    }
}
