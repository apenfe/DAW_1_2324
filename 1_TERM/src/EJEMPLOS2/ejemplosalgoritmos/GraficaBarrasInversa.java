package EJEMPLOS2.ejemplosalgoritmos;

public class GraficaBarrasInversa{
    public static void main(String[] args){
    
        int numeros[]={3,5,9,5,6,0,10,8,7};
        int aux;
        int max= Integer.MIN_VALUE;

     

        System.out.println();

        for(int i=1 ; i<(numeros.length) ; i++){

            if(numeros[i]>max){
                max=numeros[i];
            }
                    
            for(int j=0 ; j<(numeros.length)-i;j++){

                if(numeros[j] > numeros[j+1]){
                    aux=numeros[j];
                    numeros[j]=numeros[j+1];
                    numeros[j+1]=aux;

                }
            }
        }
        
        for(int i=0; i<(numeros.length);i++){
            System.out.print(numeros[i]+" ");
        }

        System.out.println();

               for(int i=0; i<(numeros.length);i++){
                for(int j=0; j<max;j++){

                    if(j< max-numeros[i]){
                    System.out.print(" ");

                    }else{
                     System.out.print("-");
                    }
        }
System.out.println();
        }

    }
}
