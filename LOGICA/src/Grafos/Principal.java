package Grafos;

public class Principal{

    public static int maxcont; // inicialmente tenia un cont tambien

    public static void main(String[] args){

        //int[][] matriz = Archivo.cargar("laberintodificil.txt");
        int[][] matriz = Archivo.crearLaberinto(false);

        System.out.println("\nEl laberinto de estudio es: ");
       // Laberinto.imprimeMatriz(matriz);   
        Laberinto.imprimeLaberinto(matriz,'#',' ');       

        Archivo.crearArchivo("prueba.txt");
        Archivo.guardar(matriz,"prueba.txt");
    } 

   
}
