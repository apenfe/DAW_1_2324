package examenes.examen_3;

import java.util.Scanner;

public class Supuesto3_2_repaso3{
	
	public static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int num=0;
		
		do {
			
			num = pedirInt("Inserte la altura: ");
			
			if(num<3||num>15) {
				
				System.out.println("LIMITES: 3 Y 15.");
				
			}
			
		}while(num<3||num>15);
		
		uno(num);
		dos(num);
		tres(num);
		tronco(num);
		
	}
	
	public static void uno(int num) {
		
		int maximo = (num*2)+1;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < maximo-i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i+i+1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}
	
	public static void dos(int num) {
		
		int maximo = (num*2)+1;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 1; j < maximo-i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i+i+3; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
	}

	public static void tres(int num) {
		
		int maximo = (num*2)+1;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 2; j < maximo-i ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < i+i+5; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}

	public static void tronco(int num) {
		
		int ancho=0;
		
		if(num<=7) {
			ancho=3;
		}else if(num>=8&&num<=10) {
			ancho=5;
		}else if(num>=11&&num<=15) {
			ancho=7;
		}
		
		int maximo = (num*2)+1;
		
		for (int i = 0; i < num; i++) {
			
			for (int j = 0; j < maximo-(ancho/2) ; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < ancho; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	
	}
	
	public static int pedirInt(String enunciado) {
		
		int num=0;
		
		do {
			
		System.out.print(enunciado);
		
			try {
				
				num = Integer.parseInt(teclado.nextLine().trim());
				break;
				
			}catch(Exception e) {
				System.out.println("ERROR - INTRODUCE UN ENTERO");
			}
			
		}while(true);
		
		return num;
		
	}
	
	
}