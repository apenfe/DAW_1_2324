package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// • Solicitar al usuario enteros positivos (hasta que introduzca un 0) para buscarlos dentro del array
// • Para cada entero positivo el programa deberá imprimir si ese entero está o no en el array y en
//   qué posiciones está (deberá imprimir todas las posiciones en las que está)
// • El programa finalizará cuando se introduzca un 0

import java.util.Scanner;

public class RefuerzoArray09{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);
    int num=-1, cont=0;

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

while(num!=0){

System.out.print("\nIntroduce el número a buscar: ");
    num=teclado.nextInt();

    for(int i=0; i<10; i++){
        
        
        if(num==array[i]){
             System.out.println("El numero esta en la posicion: "+(num+1));
                cont++;
        }else if(i==9&&cont==0){
            System.out.println("No está. ");
        }
    }


}

 
    }
}
