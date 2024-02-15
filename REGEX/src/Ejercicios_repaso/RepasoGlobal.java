package Ejercicios_repaso;

import java.util.Scanner;

public class RepasoGlobal {

	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		//nick01();
		//DNINIE02();
		//IPV403();
		//FECHA04();
		//NOMBREYAPELLIDOS05();
		//UUID06();
		//TELEFONO07();
		//IBAN08();
		//MATRICULA09();

	}

	public static void nick01() {
		
		/*
		 * Crea un programa que pida un nombre de usuario e indique si es válido de acuerdo al siguiente formato:

Debe tener una longitud de entre 3 y 20 caracteres
Debe empezar por un carácter alfabético, mayúscula o minúscula
A partir del segundo carácter puede contener mayúsculas, minúsculas, números, y caracteres especiales como _ # $ % ? = + -
		 */
		
		String texto = pedirTexto("Inserte un nick: ");
		String regex = "^[A-Za-z]{1}[A-Za-z\\d_#$%?=+-]{2,19}$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void DNINIE02() {
		
		/*
		 * Crea un programa que pida un DNI o NIE e indique si es válido de acuerdo al siguiente formato:

Para DNI:

Se compone de 9 caracteres.
Los 8 primeros caracteres son números.
El último carácter es una letra, mayúscula o minúscula, la cual solo puede ser "TRWAGMYFPDXBNJZSQVHLCKE".
Para NIE:

Se compone de 9 caracteres.
El primer carácter es una letra, mayúscula o minúscula, la cual solo puede ser "XYZ".
Los 7 siguientes caracteres son números.
El último carácter es una letra, mayúscula o minúscula, la cual solo puede ser "TRWAGMYFPDXBNJZSQVHLCKE".
		 */
		
		String letrasFin = "TRWAGMYFPDXBNJZSQVHLCKE";
		letrasFin+=letrasFin.toLowerCase();
		String letrasInicio = "XYZ";
		letrasInicio+=letrasInicio.toLowerCase();
		String texto = pedirTexto("Inserte un DNI: ");
		String regex = "^\\d{8}["+letrasFin+"]$";
		String texto1 = pedirTexto("Inserte un NIE: ");
		String regex1 = "^["+letrasInicio+"]\\d{7}["+letrasFin+"]$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}
		
		if(texto1.matches(regex1)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void IPV403() {
		
		String texto = pedirTexto("Inserte una IP: ");
		String regex = "";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void FECHA04() {
		
		String texto = pedirTexto("Inserte una fecha: ");
		String regex = "";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void NOMBREYAPELLIDOS05() {
		
		String texto = pedirTexto("Inserte un nombre y apellidos: ");
		String regex = "";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void UUID06() {
		
		/*
		 * Crea un programa que pida un UUID e indique si es válido de acuerdo al siguiente formato:

El UUID es un Identificador único universal el cual se compone de 5 grupos de caracteres hexadecimales con un carácter guion "-" como separador.
El primer grupo debe 8 dígitos haxadecimales
El segundo, tercero y cuarto grupo debe tener 4 dígitos hexadecimales
El quinto grupo debe tener 12 dígitos hexadecimales.
		 */
		
		String texto = pedirTexto("Inserte un UUID: ");
		String regex = "^[A-F0-9a-f]{8}-[A-F0-9a-f]{4}-[A-F0-9a-f]{4}-[A-F0-9a-f]{4}-[A-F0-9a-f]{12}$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void TELEFONO07() {
		
		/*
		 * Crea un programa que pida un número de teléfono e indique si es válido de acuerdo al siguiente formato:

El número de teléfono puede empezar por un prefijo de país, el cual se compone de el carácter "+" y de uno a tres caracteres numéricos.
El resto del número de teléfono debe estar compuesto por 9 caracteres numéricos.
		 */
		
		String texto = pedirTexto("Inserte un telefono: ");
		String regex = "^(\\+[0-9]{1,3})?([0-9]{9})$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void IBAN08() {
		
		/*
		 * Crea un programa que pida un IBAN e indique si el formato es válido de acuerdo a las siguientes indicaciones:

Si se introduce todo junto sin espacios:

Los dos primeros caracteres deben ser letras mayúsculas.
Los siguientes 22 caracteres deben ser números.
Si se introduce separado por espacios:

Debe estar formado por cinco grupos separados por un solo carácter "espacio":
El primer grupo está formado por dos caracteres que deben ser letras mayúsculas y dos números
El segundo y el tercer grupo deben estar formados por cuatro caracteres numéricos cada uno.
El cuarto grupo debe estar formado por dos caracteres numéricos.
El quinto grupo debe estar formado por diez caracteres numéricos.
		 */
		
		String texto = pedirTexto("Inserte un IBAN: ");
		String regex = "^([A-Z]{2})([0-9]{22})$";
		String texto1 = pedirTexto("Inserte un IBAN: ");
		String regex1 = "^([A-Z]{2}[0-9]{2}) ([0-9]{4}) ([0-9]{4}) ([0-9]{2}) ([0-9]{10})$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}
		
		if(texto1.matches(regex1)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}

	public static void MATRICULA09() {
		
		/*
		 * Crea un programa que pida una matrícula de vehículo e indique si el formato es válido de acuerdo a las siguientes indicaciones:

Matrícula actual:

Las matrículas actuales se componen de 7 caracteres en dos grupos.
El primer grupo se compone de 4 caracteres numéricos.
El segundo grupo se compone de 3 caracteres alfabéticos mayúsculas en donde se excluyen las vocales (AEIOU), la Ñ y la Q.
Matrícula antigua:

Las matrículas antiguas se componen de entre 6 y 8 caracteres en tres grupos.
El primer grupo corresponde al identificador de provincia y contiene caracteres alfabéticos los cuales solo pueden ser los del siguiente listado (lista)
El segundo grupo se compone de 4 caracteres numéricos.
El tercer grupo se compone de 1 o 2 caracteres alfabéticos mayúsculas en donde se excluyen las vocales (AEIOU), la Ñ y la Q.
		 */
		
		String texto = pedirTexto("Inserte una matricula actual: ");
		String regex = "^([0-9]{4})([BCDFGHIJKLMNPRSTVWXYZ]{3})$";
		String texto1 = pedirTexto("Inserte una matricula antigua: ");
		String regex1 = "^(MU|A|MA)([0-9]{4})([BCDFGHIJKLMNPRSTVWXYZ]{1,2})$";
		
		if(texto.matches(regex)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}
		
		if(texto1.matches(regex1)) {
			System.out.println("CORRECTO");
		}else {
			System.err.println("INCORRECTO");
		}

	}
	
	public static String pedirTexto(String enunciado) {
		
		System.out.print(enunciado+" ");
		return teclado.nextLine().trim();
		
	}

}