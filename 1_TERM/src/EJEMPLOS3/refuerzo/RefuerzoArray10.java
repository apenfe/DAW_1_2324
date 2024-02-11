package EJEMPLOS3.refuerzo;

// lee 10 enteros e intruducelos en el array 1 a 1
// Solicitar al usuario enteros positivos (hasta que introduzca un -1) de posiciones
// • Para cada entero positivo el programa deberá imprimir el contenido del array en esa posición
// • El programa finalizará cuando se introduzca un -1


import java.util.Scanner;

public class RefuerzoArray10{
    public static void main(String[] args){

    int array[]=new int[10];
    Scanner teclado=new Scanner(System.in);
    int num=0, cont=0;

    for(int i=0; i<10; i++){
        System.out.print("Introduce el número "+(i+1)+" : ");
        array[i]=teclado.nextInt();
    }

while(num>-1&&num<=9){

System.out.print("\nIntroduce el número a buscar: ");
    num=teclado.nextInt();

    if(num>-1&&num<=9){
System.out.println("El numero en la posicion: "+(num)+" es: "+array[num]);
}

 
     
    }




 
    }
}
