package Ejercicios_extra;

import java.util.Scanner;

public class RepasoGeneral {
	
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Binario();
		Dni();
		Email();
		EnteroNegativo();
		EnteroPositivo();
		Fecha();
		Hexadecimal();
		Instagram();
		IP();
		ISBN();
		Matricula();
		NombresCompuestos();
		NuemeroEntero();
		Octal();
		PasswordCompleja();
		PasswordSimple();
		Real();
		RealConXDecimales(4);
		RealNegativo();
		RealNegativoConXDecimales(2);
		RealPositivo();
		RealPositivoConXDecimales(3);

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
		
		String regex="^([0-9A-Za-z-_]+)@([0-9A-Za-z-_]+)\\.([a-z]{2,4})$";
		
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
		
		System.out.print("Inserte una fecha (dd/mm/aaaa): ");
		String texto = teclado.nextLine().trim();
		
		String regex="^(0?[1-9]{1}|[12]{1}[0-9]{1}|3[0-1])/(0?[1-9]{1}|1[0-2]{1})/([12]{1}[0-9]{3})$";
		
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
		
		System.out.print("Inserte una IP: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^(([\\d]{1}|[1-9]{1}[0-9]{1}|1[0-9]{2}|2[0-4]{1}[0-9]{1}|2[0-5]{2})(\\.)){3}([\\d]{1}|[1-9]{1}[0-9]{1}|1[0-9]{2}|2[0-4]{1}[0-9]{1}|2[0-5]{2}){1}$";
		
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
		
		System.out.print("Inserte un nombre compuesto: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^([A-ZÁÉÍÓÚÑ]{1}[a-záéíóúñ]+[ ]?){2,3}$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void NuemeroEntero() {
		
		System.out.print("Inserte numero entero: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^-?[\\d]+$";
		
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
		
		/*
		 * Al menos 10 caracteres de longitud.
		 * Al menos una letra mayúscula.
		 * Al menos una letra minúscula.
		 * Al menos un dígito.
		 * Al menos un carácter especial (como @, #, $, etc.).
		 * 
		 */
		
		System.out.print("Inserte una contraseña compleja, digito, mayus, minus y simbolo especial, minimo 10: ");
		String texto = teclado.nextLine().trim();
		
		String regex="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[@#\\$]).{10,}$";
		
		if(texto.matches(regex)) {
			System.out.println("Coincide");
		}else {
			System.err.println("ERROR");
		}

	}

	public static void PasswordSimple() {
		
		/*
		 * Debe tener al menos 8 caracteres.
		 * Debe contener al menos una letra mayúscula.
		 * Debe contener al menos una letra minúscula.
		 * Debe contener al menos un dígito.
		 * 
		 */
		
		System.out.print("Inserte una contraseña, minimo 1 mayuscula, 1 minuscula, 1 digito, extension minima 8: ");
		String texto = teclado.nextLine().trim();
		
		/* (?=.*[...]) ---> LOOKHEAD BUSCA AL MENOS UNA COINCIDENCIA*/ 
		
		String regex="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";
		
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