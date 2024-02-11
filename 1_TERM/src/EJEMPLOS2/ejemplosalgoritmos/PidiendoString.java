package EJEMPLOS2.ejemplosalgoritmos;

import java.util.Scanner;

public class PidiendoString{ 
    public static void main(String[] args){

        String texto[];
        String aux;
        Scanner teclado= new Scanner(System.in);
        System.out.print("Cuantos textos desea? ");
        int cantidad= teclado.nextInt();
        teclado.nextLine();
        texto= new String[cantidad];    

        for(int i=0; i<cantidad; i++){
            System.out.print("Introduzca el texto nº " + (i+1) + " :");
            texto[i]=teclado.nextLine().trim(); //elimino huecos en blanco
        }

        for(int i=1 ; i<(texto.length) ; i++){ //burbuja normal
                    
            for(int j=0 ; j<(texto.length)-i;j++){
        
                if(texto[j].compareToIgnoreCase(texto[j+1]) > 0){ // facil
                    aux=texto[j+1];
                    texto[j+1]=texto[j];
                    texto[j]=aux; 
                }
            }
        }
        
        for(int i=0; i<(texto.length);i++){
            System.out.print(texto[i]+" ");
        }

        System.out.println();
    }
}
