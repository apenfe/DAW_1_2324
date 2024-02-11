package Moudev2022;

/*
 * Escribe un programa que se encargue de comprobar si un número es o no primo.
 * Hecho esto, imprime los números primos entre 1 y 100.
 */

public class primo04{
	
	public static void main(String[] args) {
		
		int num=4;
		
		if(primo(num)) {
			System.out.println("Es primo");
		}else {
			System.out.println("NO Es primo");
		}
		
		for(int i=0; i<=100; i++) {
			if(primo(i)) {
				System.out.println(i+" Es primo");
			}
		}
		
	}
	
	public static boolean primo(int num) {
		
		    if (num < 2) {
		        return false;
		    }

		    for (int i=2; i<num;i++) {
		        if (num % i == 0) {
		            return false;
		        }
		    }

		    return true;
	}

}