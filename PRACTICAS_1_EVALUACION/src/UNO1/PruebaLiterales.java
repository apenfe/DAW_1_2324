package UNO1;

/**
 * PruebaLiterales.java
 * Programa de prueba de literales validos en Java.
 * apf - 2023.09.20
 */


public class PruebaLiterales {
    public static void main(String[] args){

        double _alpha = -11.1;
        String palabra_0 = "cañón";
        double Nbytes = +521.6; // El positivo es redundante, pero es aceptado.
        int qué_dices = 0b101010; // Se trata de notacion binaria. Es posible usar B o b.
        // int cañón = \xFE; // Se trata de notacion hexadecimal mal expresada y con un simbolo "\" ilegal para esta.
        int cañón = 0xFE; // Solución.
        // int Return = XGA; // Se trata de un número en base hexadecimal mal expresado y con una letra G no válida.
        int Return = 0XFA; // Solución. Es posible usar X o x.
        char palabra_1 = 'a';
        //String palabra_2 = ab"c; // Solo se aceptan "" si va una al inicio y otra al final.
        String palabra_2 = "abc"; // Solución.
        String palabra_3 = "abc;";
        String palabra_4 = "true";
        double cuanto = -88.28;
        int cuantos = 0377; // Se trata de una número en base octal.
        double pinkpante = 1.26;
        float pinkpanter = 1.26f;
        int num = 1234;
        String palabra_5 = "a";
        //int Número=xF2E; // Es una notación en hexadecimal mal expresada. debe ser: "0x..."
        int Número = 0xF2E; // Solución.
        //String palabra_6 = "abc; // Solo se aceptan "" si va una al inicio y otra al final.
        String palabra_6 = "abc"; // Solución.
        String palabra_7 = "abc'";
        //boolean café = True; // Un booleano solo puede ser expresado en minúsculas.
        boolean café = true; // Solución.
        double While = .3e27;
        int num1 = 9999;
        double cosa = 5E-002; // La notación exponencial se representa con una E o e.
        char d2 = '\n';
        double _de_muchos = .567;
        //char letra = 'abc'; // Un caracter debe ser individual. Si es más de uno, se trata de un String.
        String letra = "abc"; // Solución.
        int dado = 0xf;
        //String palabra_8 = "abc'; // Solo se aceptan "" si va una al inicio y otra al final.
        String palabra_8 = "abc'"; // Solución.
        //String palabra_9 = "abc""; // Además no se pueden poner " dentro de otras.
        String palabra_9 = "abc"; // Solución.
        boolean inta = false;
        //double cadena2 = 23e2.3; // Los exponentes deben de ser enteros, nunca decimales.
        double cadena2 = 23e23; // Solución.
        //int mesa3 = 099; // Se trata de un numero de base octal mal expersado, ya que no puede tener el 9.
        int mesa3 = 077; // Solución.
        int __if = 0xFE;
        String palabra_10 = "while";
        int _CapriChoso_= 0xFFFE;
        double Hoja35 = 02.45;
        // String palabra_11 = ""abc""; // Además no se pueden poner " dentro de otras.
        String palabra_11 = "abc"; // Solución.
        char ed = '\\';
     
    }

}
