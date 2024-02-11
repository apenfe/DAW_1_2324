import java.util.Scanner;

public class Sudoku{

    public static void main(String[] args){ 

        Scanner teclado = new Scanner(System.in); 

        int check=0;
        int opcion;
        int iteraciones=0;
        int contador=0;
        int valor=0;
        boolean debug = false;
        boolean debug2 = true;
        int []vector ={1,2,3,4,5,6,7,8,9};
        int [][]A = new int[3][3];
        int [][]B = new int[3][3];
        int [][]C = new int[3][3];
        int [][]D = new int[3][3];
        int [][]E = new int[3][3];
        int [][]F = new int[3][3];
        int [][]G = new int[3][3];
        int [][]H = new int[3][3];
        int [][]I = new int[3][3];

        int[][] sudoku = {{9, 0, 0, 0, 5, 1, 7, 3, 0},
                          {1, 0, 7, 3, 9, 8, 2, 0, 5},
                          {5, 0, 0, 0, 7, 6, 0, 9, 1},
                          {8, 1, 0, 7, 2, 4, 3, 5, 0},
                          {2, 0, 0, 1, 6, 5, 0, 0, 7},
                          {4, 7, 5, 9, 8, 3, 0, 1, 2},//4 o 6 la casilla 05 inicialmente 0
                          {0, 2, 1, 5, 3, 7, 0, 0, 0},
                          {7, 5, 8, 6, 4, 9, 1, 2, 3},
                          {3, 9, 0, 8, 1, 2, 5, 7, 0},};


        System.out.println("El Sudoku a resolver será el siguiente: ");
        System.out.println("--------------------------------------------");
                for (int a = 0; a < 9; a++) { 
                    for (int b = 0; b < 9; b++) {

                        if(sudoku[a][b]==0){
                            System.out.print(" " + " " + " | ");
                        }else{
                            System.out.print(" " + sudoku[a][b] + " | ");   
                        }
                    }
                    System.out.println(" ");System.out.println("--------------------------------------------");
                }
        
        System.out.println("\nLos Sudokus poseen diferentes niveles de dificultad: ");
        System.out.println("MUY FACIL, FACIL, INTERMEDIO, DIFICIL Y MUY DIFICIL\n");
        System.out.println("Para resolver el propuesto, se utilizaran varias tecnicas de resolución.");
        System.out.println("Al final de la tecnica seleccionada, se mostrará el resultado si se ha solucionado.");
        System.out.println("En caso contrario se volverá a abrir el menú para seleccionar un metodo mejorado.\n");
        System.out.println("Presione \"Enter\" para continuar...\n");
        teclado.nextLine();
        System.out.println("Elija una de las opciones: \n");
        System.out.println("1 - Algoritmo unico oculto ");
        System.out.println("2 - Algoritmo dos ocultos ");
        System.out.println("3 - Ayuda manual ");
        System.out.println("4 - INFO ");
        System.out.println("5 - EXIT \n");
        System.out.print("Escriba una opción del 1 al 5: ");
        opcion = teclado.nextInt();
        System.out.print(" ");

if(opcion==1){
while(iteraciones<30 || (check==405)){

                for (int a = 0; a < 3; a++) { 
                    for (int b = 0; b < 3; b++) {
                        A[a][b]=sudoku[a][b];

                        if(debug){
                            System.out.println(A[a][b]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 0; a < 3; a++) { 
                    for (int b = 3; b < 6; b++) {
                        B[a][b-3]=sudoku[a][b];

                        if(debug){
                            System.out.println(B[a][b-3]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 0; a < 3; a++) { 
                    for (int b = 6; b < 9; b++) {
                        C[a][b-6]=sudoku[a][b];

                        if(debug){
                            System.out.println(C[a][b-6]+" indice: "+a+b);
                        }
                    }     
                }
                for (int a = 3; a < 6; a++) { 
                    for (int b = 0; b < 3; b++) {
                        D[a-3][b]=sudoku[a][b];

                        if(debug){
                            System.out.println(D[a-3][b]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 3; a < 6; a++) { 
                    for (int b = 3; b < 6; b++) {
                        E[a-3][b-3]=sudoku[a][b];

                        if(debug){
                            System.out.println(E[a-3][b-3]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 3; a < 6; a++) { 
                    for (int b = 6; b < 9; b++) {
                        F[a-3][b-6]=sudoku[a][b];

                        if(debug){
                            System.out.println(F[a-3][b-6]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 6; a < 9; a++) { 
                    for (int b = 0; b < 3; b++) {
                        G[a-6][b]=sudoku[a][b];

                        if(debug){
                            System.out.println(G[a-6][b]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 6; a < 9; a++) { 
                    for (int b = 3; b < 6; b++) {
                        H[a-6][b-3]=sudoku[a][b];

                        if(debug){
                            System.out.println(H[a-6][b-3]+" indice: "+a+b);
                        }
                    }
                }
                for (int a = 6; a < 9; a++) { 
                    for (int b = 6; b < 9; b++) {
                        I[a-6][b-6]=sudoku[a][b];

                        if(debug){
                            System.out.println(I[a-6][b-6]+" indice: "+a+b);
                        }
                    }
                }

                

                for (int i = 0; i < 9; i++) { 
                    for (int j = 0; j < 9; j++) {

                        if((sudoku[i][j])==0){
                    
                                for (int a = 0; a < 9; a++){
                                    if(sudoku[i][a]!=0){ // filas
                                        valor = sudoku[i][a];
                                        vector[valor-1] =0;
                                    }

                                    if(debug2){
                                    
                                    System.out.println(" valor -1 "+(valor-1));
                                    System.out.println(vector[a]+" vector filas, posicion: "+a+"casilla"+i+j);
                                    }
                                }
                                for (int b = 0; b < 9; b++){
                                    if(sudoku[b][j]!=0){ // columnas
                                        valor = sudoku[b][j];
                                        vector[valor-1] =0;
                                    }
                                }

                                // DE LA (A) A LA (C)
                                if (i<=2){ // submatriz_1
                                    if(j<=2){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(A[a][b]!=0){
                                                    valor = A[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                    else if(j>=6){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(C[a][b]!=0){
                                                    valor = C[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }else{
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(B[a][b]!=0){
                                                    valor = B[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                // DE LA (G) A LA (I)
                                else if (i>=6){
                                    if(j<=2){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(G[a][b]!=0){
                                                    valor = G[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                    else if(j>=6){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(I[a][b]!=0){
                                                    valor = I[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }else{
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(H[a][b]!=0){
                                                    valor = H[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                // DE LA (D) A LA (F)
                                else{
                                    if(j<=2){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(D[a][b]!=0){
                                                    valor = D[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                    else if(j>=6){
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(F[a][b]!=0){
                                                    valor = F[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }else{
                                        for (int a = 0; a < 3; a++){
                                            for (int b = 0; b < 3; b++){
                                                if(E[a][b]!=0){
                                                    valor = E[a][b];
                                                    vector[valor-1] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                
                                for (int a = 0; a < 9; a++){
                                    if((vector[a])!=0){
                                        contador++;
                                        valor = a+1;
                                    }
                                }
                                //System.out.println(" vector: ");
                                //System.out.println(" contador: "+ contador);
                                
                                if(contador==1){
                                    sudoku[i][j]=valor;
                    
                                }

                                contador=0;
                                
                                for (int a = 0; a < 9; a++){
                                    vector[a]=(a+1);
                                        
                                    }
                                
                                
                                // DESPUES DE ESTO DEBO COMPROBAR SI EL VALOR DEL SUDOKU AUMENTA, EN CASO NEGATIVO, COMENZAR LA SEGUNDA FASE, QUE TENGA DOS OPCIONES




                        }
                    }        
                } 
                
                for (int a = 0; a < 9; a++) { 
                  for (int b = 0; b < 9; b++) {
                        check=check+sudoku[a][b];
                    }   
                }

                if(debug2){
                        System.out.println("CHECK "+check);
                        System.out.println("Iteracion "+iteraciones);
                        }

                iteraciones= iteraciones + 1;
                check=0;
            }
            }
else if(opcion==2){
System.out.println("En desarrollo...");
} 
else if(opcion==3){
System.out.println("En desarrollo...");
}
else if(opcion==4){
System.out.println("En desarrollo...");
}  
else if(opcion==5){

System.out.println("¿Está seguro que desea salir del programa?");
System.out.println("1 - SI");
System.out.println("2 - NO");
opcion = teclado.nextInt();
    if(opcion==1){
        return;
    }
    else if(opcion==2){
    System.out.println("En desarrollo...");
    }
    else{
    System.out.println("Seleccione una opcion valida.");
    }
}
else{
    System.out.println("Opción no válida, por favor selecciones una opción entre 1 y 5.");
} 
            System.out.println("Sudoku resuelto. Nº de iteraciones: "+ iteraciones);
                System.out.println("\n--------------------------------------------");
                for (int a = 0; a < 9; a++) { 
                    for (int b = 0; b < 9; b++) {

                        if(sudoku[a][b]==0){
                            System.out.print(" " + " " + " | ");
                        }else{
                            System.out.print(" " + sudoku[a][b] + " | ");   
                        }
                    }
                    System.out.println(" ");System.out.println("--------------------------------------------");
                }
      
                







    }
}
    



