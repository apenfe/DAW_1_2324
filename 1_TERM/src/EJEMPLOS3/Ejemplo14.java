package EJEMPLOS3;

import java.util.Scanner;

public class Ejemplo14{

    public static void main(String[] args){

        System.out.println();

        int[]array=entradanumeros();

        mostrarnumeros(array);

        mostrarnumeros(ordenarnumeros(array));
      

    }

    public static int[] entradanumeros(){

        int array[]=new int[10];
        Scanner teclado= new Scanner(System.in);

        for (int i =0; i<10; i++){
            System.out.print("El numero "+(1+i)+ " es: ");
            array[i]=teclado.nextInt();
        }

        return array;
             
    }

    public static void mostrarnumeros(int[] array){

        for (int i=0; i<10; i++){
            System.out.print(array[i]+" ");
        }      

         System.out.println();  
      
    }

    public static int[] ordenarnumeros(int[] array){

        int aux;

        for(int i=1 ; i<(array.length) ; i++){ //burbuja normal
                    
            for(int j=0 ; j<(array.length)-i;j++){


                if(array[j] > array[j+1]){
                    aux=array[j];
                    array[j]=array[j+1];
                    array[j+1]=aux;

                }
            }
        }
        
      return array;
    }
}
