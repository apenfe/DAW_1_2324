/*
 * Supuesto2_2.java
 *
 * Adrián Peñalver Fernández
 *
 * 03/11/2023
 *
 */
package examenes.examen_2;
public class Supuesto2_2{

    public static void main(String [] args){
    
        int[] array= {11,9,8,-7,6,5,4,3,2,1,0,-1,-2,-33,-4,-5,0,-7,-8,6,-10};
        final int MAX = 10, MIN = -10;
        final char SIGNO ='*';

        for(int i=0; i<array.length; i++){

            if(array[i]<MIN || array[i]>MAX){

                System.out.println(array[i]+"\tFUERA DE RANGO");
                continue;

            }else{

                System.out.print(array[i]+"\t");

            }  

            for(int j = MIN ; j<= MAX ; j++){
            
                if(array[i]<0 && j>=array[i] && j<0){

                    System.out.print(SIGNO);

                }else if(array[i]>0 && j<=array[i] && j>0){

                    System.out.print(SIGNO);

                }else if(j==0){

                        System.out.print("|");

                }else{

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
