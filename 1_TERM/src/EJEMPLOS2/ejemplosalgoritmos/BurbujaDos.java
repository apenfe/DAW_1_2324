package EJEMPLOS2.ejemplosalgoritmos;

public class BurbujaDos{
    public static void main(String[] args){
    
        int numeros[]={3,4,9,5,0,90,80,69};
        int aux;

        
        for(int i=0; i<(numeros.length);i++){
            System.out.print(numeros[i]+" ");
        }

        System.out.println();


         for(int i=0 ; i<numeros.length; i++){
                            
                    for(int j=i ; j<numeros.length;j++){

                        if(numeros[i] > numeros[j]){
                            aux=numeros[i];
                            numeros[i]=numeros[j];
                            numeros[j]=aux;

                        }
                    }
                }
                
                for(int i=0; i<(numeros.length);i++){
                    System.out.print(numeros[i]+" ");
                }

                System.out.println();
            }
}
