package Moudev2022;

/*
 * Crea un programa que comprueba si los paréntesis, llaves y corchetes
 * de una expresión están equilibrados.
 * 
 * - Equilibrado significa que estos delimitadores se abren y cieran
 *   en orden y de forma correcta.
 *   
 * - Paréntesis, llaves y corchetes son igual de prioritarios.
 *   No hay uno más importante que otro.
 *   
 * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
 * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
 */

public class expresionEquilibrada11{
	
	public static void main(String[] args) {
		
		String expresion1 = "{ [ a * ( c + d ) ] - 5 }";
		String expresion2 = "{ a * ( c + d ) ] - 5 }";
		
		if(balanceada(expresion1)) {
			System.out.println("Expresion 1 balanceada.");
		}else {
			System.out.println("Expresion 1 NO balanceada.");
		}
		
		if(balanceada(expresion2)) {
			System.out.println("Expresion 2 balanceada.");
		}else {
			System.out.println("Expresion 2 NO balanceada.");
		}
		
	}
	
	public static boolean balanceada(String expresion) {
		
		expresion=expresion.trim().toLowerCase();
		expresion=expresion.replaceAll("[^\\{\\}\\(\\)\\[\\]]","");
		
		if(expresion.length()%2!=0) {
			return false;
		}else {
			return true;
		}
		
	}

}