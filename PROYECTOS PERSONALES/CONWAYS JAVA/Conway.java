
import java.util.Scanner;
import java.lang.Math;

public class Conway{

    public static void main(String[] args){ 
        Scanner teclado = new Scanner(System.in);

        System.out.print("Bienvenido al juego de la vida de Conway's");
        System.out.print("¿Cuantas filas y columnas desea utilizar para construir su universo? ");
        int filas = teclado.nextInt();
        teclado.close();
       
        int contador=0;
        int suma;
        int columnas = filas;
        int[][] zepa = new int[filas][columnas];
        int[][] zepanew = new int[filas][columnas]; // Crea una nueva matriz para zepanew

        for (int i =0; i<filas; i++){
             for (int j =0; j<columnas; j++){
                double celula=(Math.random()*1);
                if (celula<0.92){
                    zepa[i][j]=0;
                }
                else{
                    zepa[i][j]=1;
                }
        }

        }

        imprimirzepa(zepa,contador,filas,columnas);
        
        for (int i = 0; i < filas; i++) {

                for (int j = 0; j < columnas; j++) {
                    zepanew[i][j] = zepa[i][j];
                }
        }
                
        while(contador<5){

            for (int i = 1; i < filas-1; i++) { 

                for (int j = 1; j < columnas-1; j++) {
                
                            if(zepa[i][j]==1){
                                suma=-1;
                            }
                            else{
                                suma=0;
                            }

                            for ( int a = i-1; a < i+2; a++) { 

                                for (int b = j-1; b < j+2; b++) {

                                        suma=suma+zepa[a][b]; 
                                }
                            }

                    if(zepa[i][j]==0 && suma==3){
                        zepanew[i][j]=1;
                    }
                    else if (zepa[i][j]==1 && (suma<2 || suma>3)){
                        zepanew[i][j]=0;
                    }
                    else{
                        zepanew[i][j]=zepa[i][j]  ;
                    }            
                }
            }

            contador=contador+1;
           
            imprimirzepa(zepanew,contador,filas,columnas);

            for (int i = 0; i < filas; i++) {

                for (int j = 0; j < columnas; j++) {
                    zepa[i][j] = zepanew[i][j];
                }
            }
        }
    }

        static void imprimirzepa(int[][] a,int b, int c, int d){

            System.out.println("Generación: "+b);
            for (int i = 0; i < c; i++) { 

                for (int j = 0; j < d; j++) {

                    if(a[i][j]==1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

}
