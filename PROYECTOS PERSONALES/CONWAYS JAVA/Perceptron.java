import java.util.Scanner;
import java.util.Random;

public class Perceptron {

    public static void main(String[] args){

        //Tabla de la verdad (X1,X2,Y1)
        int[][] tablav = {{1, 1, 1}, {1, -1, -1}, {-1, 1, -1}, {-1, -1, -1}};

        System.out.println("\nInicializar pesos:\n");
        double w1 = new Random().nextDouble() / 2.5;//valores proximos a 0
        double w2 = new Random().nextDouble() / 2.5;
        double θ = -0.4;

        double y = 0;
        boolean debug= true;

        final double E = 0.6; //Factor de aprendizaje // es una constante    

        System.out.println("w1: " + w1);
        System.out.println("w2: " + w2);
        System.out.println("θ: " + θ);

        System.out.println("\nIniciando fase de aprendizaje puerta logica OR...\n");

        int i = 0;
        int cont = 1;
        while (i < tablav.length && cont < 100) {
            y = Math.tanh((tablav[i][0] * w1) + (tablav[i][1] * w2) + (-1 * θ));

            if(debug){
                System.out.println("y= "+y);
            }
            y = (y >= θ) ? 1 : -1; // cambia a 1 o menos 1 si cumple condicion
            System.out.println("Entrada[" + tablav[i][0] + "," + tablav[i][1]
                    + "]) Valor esperado[" + tablav[i][2]
                    + "] Salida[" + (int) y + "]");
            if (y == tablav[i][2]) {
                i++;
            } else {
                System.out.println("Valor esperado difiere de la salida. Hay que reajustar pesos...");
                //Ajuste de pesos
                w1 = w1 + 2 * E * tablav[i][2] * tablav[i][0];
                w2 = w2 + 2 * E * tablav[i][2] * tablav[i][1];
                θ = θ + 2 * E * tablav[i][2] * (-1);

                System.out.println("\nAjuste de pesos (" + cont + "):");
                System.out.println("w1: " + w1);
                System.out.println("w2: " + w2);
                System.out.println("θ: " + θ + "\n");
                cont++;
                i = 0;
            }
        }

        if (cont <= 9999) {
            System.out.println("\nFase de aprendizaje terminado con exito ");
            System.out.println("\nResultados:");
            System.out.println("w1: " + w1);
            System.out.println("w2: " + w2);
            System.out.println("θ: " + θ);
            System.out.println("\nIniciando fase de testeo...");
            System.out.println("Introduce Entrada 1 (X1): ");
            Scanner leerX1 = new Scanner(System.in);
            double x1 = Double.parseDouble(leerX1.next());

            System.out.println("Introduce Entrada 2 (X2): ");
            Scanner leerX2 = new Scanner(System.in);
            double x2 = Double.parseDouble(leerX2.next());

            y = Math.tanh((x1 * w1) + (x2 * w2) + (-1 * θ));
            y = (y >= θ) ? 1 : -1;

            System.out.println("\nSalida: " + (int)y);
        } else {
            System.out.println("\nFase de aprendizaje ha fallado\n");
        }




    }
}