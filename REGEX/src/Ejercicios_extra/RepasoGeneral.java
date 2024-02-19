package Ejercicios_extra;

import java.util.Scanner;

public class RepasoGeneral {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		//Binario();
		//Dni();
		//Email();
		//EnteroNegativo();
		//EnteroPositivo();
		//Fecha();
		//Hexadecimal();
		//Instagram();
		//IP();
		//ISBN();
		//Matricula();
		//NombresCompuestos();
		//NuemeroEntero();
		//Octal();
		//PasswordCompleja();
		//PasswordSimple();
		//Real();
		//RealConXDecimales(4);
		//RealNegativo();
		//RealNegativoConXDecimales(2);
		//RealPositivo();
		//RealPositivoConXDecimales();

	}

	public static void Binario() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^[01]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Dni() {
		
		System.out.print("Inserte DNI: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^[0-9]{8}[ABCDEFGHJKLMPQRSTUVYZ]$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Email() {
		
		System.out.print("Inserte un email: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void EnteroNegativo() {
		
		System.out.print("Inserte numero entero negativo (-): ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-[0-9]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void EnteroPositivo() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^[0-9]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Fecha() {
		
		System.out.print("Inserte una fecha: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Hexadecimal() {
		
		System.out.print("Inserte numero hexadecimal: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^[0-9ABCDEFabcdef]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Instagram() {
		
		System.out.print("Inserte un instagram: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^@[\\w-]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void IP() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void ISBN() {
		
		/*
		 * Validar ISBN de 13 digitos, siempre empieza en 978 o 979
		 */
		
		System.out.print("Inserte un ISBN: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^(978|979)-(\\d{1})-(\\d{3})-(\\d{5})-(\\d{1})";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Matricula() {
		
		System.out.print("Inserte una matricula moderna: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^(\\d{4})([BCDEFGHJKLMNPRSTVWXYZ]{3})$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}
		
		System.out.print("Inserte una matricula antigua: ");
		texto = teclado.nextLine().trim();
		
		regex="^(MU|MA|A|AL)-(\\d{4})-([BCDEFGHJKLMNPRSTVWXYZ]{2,3})$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void NombresCompuestos() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void NuemeroEntero() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Octal() {
		
		System.out.print("Inserte numero octal: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^[0-7]+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void PasswordCompleja() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void PasswordSimple() {
		
		System.out.print("Inserte numero binario: ");
		String texto = teclado.nextLine().trim();
		
		String regex="";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void Real() {
		
		System.out.print("Inserte numero real: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-?\\d+[\\.,]{1}\\d+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void RealConXDecimales(int num) {
		
		System.out.print("Inserte numero real con "+num+" decimales: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-?\\d+[\\.,]{1}\\d{"+num+"}$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void RealNegativo() {
		
		System.out.print("Inserte numero real negativo: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-\\d+[\\.,]{1}\\d+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void RealNegativoConXDecimales(int num) {
		
		System.out.print("Inserte numero real negativo con "+num+" decimales: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-\\d+[\\.,]{1}\\d{"+num+"}$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void RealPositivo() {
		
		System.out.print("Inserte numero real positivo: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^\\d+[\\.,]{1}\\d+$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void RealPositivoConXDecimales(int num) {
		
		System.out.print("Inserte numero real positivo con "+num+" decimales: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^\\d+[\\.,]{1}\\d{"+num+"}$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

}