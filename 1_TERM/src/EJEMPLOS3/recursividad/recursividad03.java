package EJEMPLOS3.recursividad;

public class recursividad03{

    public static void main(String [] args){

        int[] numeros={5,2,3,7,8,3,2,2};

        mergesort(numeros, 0, numeros.length-1);

        for(int i=0; i<numeros.length; i++){
            System.out.print(numeros[i]+" ");

        }
        
    }

    public static void mergesort(int[] numeros, int inicio, int fin){

        if(inicio<fin){

        int centro = (inicio+fin)/2;

        mergesort(numeros, inicio, centro);
        mergesort(numeros, centro+1, fin);

        merge(numeros, inicio, centro, fin);

        }

    }

    public static void merge(int[] numeros, int inicio, int centro, int fin){

        int i, j, k;
        int[] auxArray=new int[numeros.length];

        for(i=0; i<auxArray.length; i++){
            auxArray[i]= numeros[i];
        }

        i=inicio;
        j=centro+1;
        k=inicio;

        while(i<=centro && j<= fin){

            if(auxArray[i]<=auxArray[j]){
                numeros[k++]=auxArray[i++];
            }else{
                numeros[k++]=auxArray[j++];
            }

        }

        while(i<=centro){   ///

            numeros[k++]=auxArray[i++];
        }

    }
 
}
