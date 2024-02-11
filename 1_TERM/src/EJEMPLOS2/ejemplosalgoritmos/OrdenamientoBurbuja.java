package EJEMPLOS2.ejemplosalgoritmos;

public class OrdenamientoBurbuja{
    public static void main(String[] args){
    
        int numeros[]={3,5,9,5,6,0,90,80,69};
        int aux;

        for(int i=1 ; i<(numeros.length) ; i++){
                    
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
    }
}
