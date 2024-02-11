package Simulacro01repaso;

import java.util.Scanner;

public class Entrada{
	
	public static Scanner teclado = new Scanner(System.in);
	public static final String ERROR ="ERROR.";
	
	public static int pedirInt(String enunciado) {
		
		System.out.print(enunciado);
		int num=0;
		boolean check=true;
		
		do {
			
			try {
				
				num=Integer.parseInt(teclado.nextLine().trim());
				check=false;
				
			}catch(Exception e) {
				System.out.println(ERROR);
			}
			
		}while(check);
		
		return num;
	}
	
	public static String pedirTexto(String enunciado) {
		
		System.out.print(enunciado);
		String text="";
		boolean check=true;
		
		do {
			
			try {
				
				text=teclado.nextLine().trim();
				check=false;
				
			}catch(Exception e) {
				System.out.println(ERROR);
			}
			
		}while(check);
		
		return text;
		
	}
}