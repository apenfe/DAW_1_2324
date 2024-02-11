package TRES3;

/* OK
 * 
 * Ejercicio13.java
 *
 * Escribe un método que se llame bannerTexto() que recibe como parámetro un vector de cadenas de caracteres como las creadas con bannerLetra()
 * -de un ejercicio anterior- y devuelve una única cadena de caracteres con el resultado de concatenarlas adecuadamente formando un texto correcto.
 * Por ejemplo si se recibe la lista de cadenas correspondientes a las letras H, O, L y A;, la cadena devuelta, al imprimirla, daría:
 *
 *  H     H  OOOOOOO  L          AAA
 *  H     H  O     O  L         A   A 
 *  H     H  O     O  L        A     A
 *  HHHHHHH  O     O  L        A     A
 *  H     H  O     O  L        AAAAAAA     
 *  H     H  O     O  L        A     A
 *  H     H  OOOOOOO  LLLLLLL  A     A
 *
 * Se deben contemplar todas las letras del abecedario, excepto la Ñ.
 * Prueba exhaustivamente el método pedidos desde main().
 *
 * Adrián Peñalver Fernández
 *
 * 02/01/2024
 *
 */

import java.util.Scanner;

public class zejercicio13{

    public static   Scanner teclado = new Scanner(System.in);

    public static void main(String[] args){

        String palabra = "";
        boolean check = true;
        	
    		System.out.print("Escribe una palabra: ");
        	
        	do {
        		
        		try {
        			palabra=teclado.nextLine().trim();
        			check = false;
        		}catch(Exception e) {
        			System.out.println("ERROR, INTRODUCE UNA PALABRA.");
        		}
        		
        	}while(check);
        	
        System.out.println(bannerTexto(palabra));

    }

    public static String bannerTexto(String texto){
    	
    	texto=texto.toUpperCase();
    	
    	
    	int letras = texto.length();
    	String[] cadena=new String[letras];
    	String salida="";
    	
    	for(int i=0; i<texto.length();i++) {
    		
    		cadena[i]=bannerLetra(texto.charAt(i));
    		
    	}
    	
    	int cont=0;
    	
    	for(int altura=1; altura<=7; altura++) {
    		
    		for(int letra=1; letra<=letras; letra++) {
    			
    			for(int caracteres=cont; caracteres<cont+7; caracteres++) {
    	    		
    				salida+=cadena[letra-1].charAt(caracteres);
    				
    	    	}
    			
    			salida+=" ";
        		
        	}
    		
    		salida+="\n";
    		cont+=7;
    		
    	}
    	
    	return salida;
    	
    }  
    
    public static String bannerLetra(char letra){
    	
         String salida="";

             if(letra=='A'){

                 String fila1="  AAA  ";
                 String fila2=" A   A ";
                 String fila3="A     A";
                 String fila4="A     A";
                 String fila5="AAAAAAA";
                 String fila6="A     A";
                 String fila7="A     A";

                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;
                 
             }else if(letra=='B'){
                 
                 String fila1="BBBBBB ";
                 String fila2="B     B";
                 String fila3="B     B";
                 String fila4="BBBBBB ";
                 String fila5="B     B";
                 String fila6="B     B";
                 String fila7="BBBBBB ";
                 
                
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='C'){

                 String fila1=" cccccc";
                 String fila2="c      ";
                 String fila3="c      ";
                 String fila4="c      ";
                 String fila5="c      ";
                 String fila6="c      ";
                 String fila7=" cccccc";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='D'){

                 String fila1="DDDDD  ";
                 String fila2="D    D ";
                 String fila3="D     D";
                 String fila4="D     D";
                 String fila5="D     D";
                 String fila6="D    D ";
                 String fila7="DDDDD  ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='E'){

                 String fila1="EEEEEEE";
                 String fila2="E      ";
                 String fila3="E      ";
                 String fila4="EEEEEEE";
                 String fila5="E      ";
                 String fila6="E      ";
                 String fila7="EEEEEEE";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='F'){

                 String fila1="FFFFFFF";
                 String fila2="F      ";
                 String fila3="F      ";
                 String fila4="FFFFF  ";
                 String fila5="F      ";
                 String fila6="F      ";
                 String fila7="F      ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='G'){

                 String fila1=" GGGGG ";
                 String fila2="G     G";
                 String fila3="G      ";
                 String fila4="G      ";
                 String fila5="G   GGG";
                 String fila6="G     G";
                 String fila7=" GGGGG ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='H'){

                 String fila1="H     H";
                 String fila2="H     H";
                 String fila3="H     H";
                 String fila4="HHHHHHH";
                 String fila5="H     H";
                 String fila6="H     H";
                 String fila7="H     H";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='I'){

                 String fila1="IIIIIII";
                 String fila2="   I   ";
                 String fila3="   I   ";
                 String fila4="   I   ";
                 String fila5="   I   ";
                 String fila6="   I   ";
                 String fila7="IIIIIII";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='J'){

                 String fila1="JJJJJJJ";
                 String fila2="      J";
                 String fila3="      J";
                 String fila4="      J";
                 String fila5="JJ    J";
                 String fila6="J    J ";
                 String fila7=" JJJJ  ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='K'){

                 String fila1="K     K";
                 String fila2="K    K ";
                 String fila3="K   K  ";
                 String fila4="KKKK   ";
                 String fila5="K   K  ";
                 String fila6="K    K ";
                 String fila7="K     K";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='L'){

                 String fila1="L      ";
                 String fila2="L      ";
                 String fila3="L      ";
                 String fila4="L      ";
                 String fila5="L      ";
                 String fila6="L      ";
                 String fila7="LLLLLLL";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='M'){

                 String fila1="M      M";
                 String fila2="MM    MM";
                 String fila3="M M  M M";
                 String fila4="M  MM  M";
                 String fila5="M      M";
                 String fila6="M      M";
                 String fila7="M      M";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='N'){

                 String fila1="N     N";
                 String fila2="NN    N";
                 String fila3="N N   N";
                 String fila4="N  N  N";
                 String fila5="N   N N";
                 String fila6="N    NN";
                 String fila7="N     N";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='O'){

                 String fila1=" OOOOO ";
                 String fila2="O     O";
                 String fila3="O     O";
                 String fila4="O     O";
                 String fila5="O     O";
                 String fila6="O     O";
                 String fila7=" OOOOO ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='P'){

                 String fila1="PPPPP  ";
                 String fila2="P    P ";
                 String fila3="P     P";
                 String fila4="P    P ";
                 String fila5="PPPPP  ";
                 String fila6="P      ";
                 String fila7="P      ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='Q'){

                 String fila1=" QQQQQ ";
                 String fila2="Q     Q";
                 String fila3="Q     Q";
                 String fila4="Q     Q";
                 String fila5="Q   Q Q";
                 String fila6="Q    QQ";
                 String fila7=" QQQQQ ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='R'){

                 String fila1=" RRRRR ";
                 String fila2="R     R";
                 String fila3="R     R";
                 String fila4="RRRRRR ";
                 String fila5="R   R  ";
                 String fila6="R    R ";
                 String fila7="R     R";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='S'){

                 String fila1=" SSSSS ";
                 String fila2="S     S";
                 String fila3="S      ";
                 String fila4="  SS   ";
                 String fila5="    SS ";
                 String fila6="S     S";
                 String fila7=" SSSSS ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='T'){

                 String fila1="TTTTTTT";
                 String fila2="   T   ";
                 String fila3="   T   ";
                 String fila4="   T   ";
                 String fila5="   T   ";
                 String fila6="   T   ";
                 String fila7="   T   ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='U'){

                 String fila1="U     U";
                 String fila2="U     U";
                 String fila3="U     U";
                 String fila4="U     U";
                 String fila5="U     U";
                 String fila6=" U   U ";
                 String fila7="  UUU  ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='V'){

                 String fila1="V     V";
                 String fila2="V     V";
                 String fila3="V     V";
                 String fila4="V     V";
                 String fila5=" V   V ";
                 String fila6="  V V  ";
                 String fila7="   V   ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='W'){

                 String fila1="W     W";
                 String fila2="W     W";
                 String fila3="W  W  W";
                 String fila4="W  W  W";
                 String fila5="  W W ";
                 String fila6=" W   W ";
                 String fila7="W     W";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='X'){
         
                 String fila1="X     X";
                 String fila2=" X   X ";
                 String fila3="  X X  ";
                 String fila4="   X   ";
                 String fila5="  X X  ";
                 String fila6=" X   X ";
                 String fila7="X     X";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='Y'){

                 String fila1="Y     Y";
                 String fila2=" Y   Y ";
                 String fila3="  Y Y  ";
                 String fila4="   Y   ";
                 String fila5="   Y   ";
                 String fila6="   Y   ";
                 String fila7="   Y   ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else if(letra=='Z'){

                 String fila1="ZZZZZZZ";
                 String fila2="     Z ";
                 String fila3="    Z  ";
                 String fila4="   Z   ";
                 String fila5="  Z    ";
                 String fila6=" Z     ";
                 String fila7="ZZZZZZZ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }else{
                 
                 String fila1="       ";
                 String fila2="       ";
                 String fila3="       ";
                 String fila4="       ";
                 String fila5="       ";
                 String fila6="       ";
                 String fila7="       ";
                 
                 return salida + fila1 + fila2 + fila3 + fila4 + fila5 + fila6 + fila7;

             }
    }  
   
}