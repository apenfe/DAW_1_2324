package EJEMPLOS2.ejemplosalgoritmos;

public class GraficaBarrasVertical{
    public static void main(String[] args){
    
        int numeros[]={3,5,8,5,6,1,11,2,7,12,13};
        int aux, max=0;

     

        System.out.println();

       for(int i=1 ; i<(numeros.length) ; i++){
                    
            for(int j=0 ; j<(numeros.length)-i;j++){

                if(numeros[j]>max){
                    max=numeros[j];
                }

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

               for(int i=0; i<=max;i++){ // debe de ser el tamaño del numero mayor

                for(int j=0; j<numeros.length;j++){

                    if(numeros[j]>max-i){//numeros.length-i
                        System.out.print("* ");

                    }else if(numeros[j]==max){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
        }
System.out.println();
        }

    }
}
