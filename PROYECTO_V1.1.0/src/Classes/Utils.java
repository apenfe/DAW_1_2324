package Classes;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;

import java.text.*;

public class Utils{
	
	private static final String EU_FORMAT = "dd/MM/yyyy";
	private static final String SQL_FORMAT = "yyyy-MM-dd";
	
	public static int getAge(String birthdate) {
		
		birthdate = formatDateEU(birthdate);
		
		if(validateDate(birthdate)) {
			
			String[] data = birthdate.split("/");
			int year = Integer.parseInt(data[2]);
			int month = Integer.parseInt(data[1]);
			int day = Integer.parseInt(data[0]);
			
			Date date = new Date(System.currentTimeMillis());
			String today = new SimpleDateFormat(EU_FORMAT).format(date);
			
			String[] todayData = today.split("/");
			int actualYear = Integer.parseInt(todayData[2]);
			int actualMonth = Integer.parseInt(todayData[1]);
			int actualDay = Integer.parseInt(todayData[0]);
			
			int years = actualYear-year;
			
			if (actualMonth < month || (actualMonth == month && actualDay < day)) {
				
                years--;
                
            }
			
			return years;
		}
		
		return -1;
		
	}

	public static String formatDateSQL(String date) {

		DateFormat sqlFormat = new SimpleDateFormat(SQL_FORMAT);
		DateFormat euFormat = new SimpleDateFormat(EU_FORMAT);

		try {

			Date sqlDate = euFormat.parse(date);
			return sqlFormat.format(sqlDate);

		} catch (ParseException e) {

			e.printStackTrace();
			return date;

		}

	}
	
	public static String formatDateEU(String sqlDate) {
		
        DateFormat sqlFormat = new SimpleDateFormat(SQL_FORMAT);
        DateFormat euFormat = new SimpleDateFormat(EU_FORMAT);
        
        try {
            
            Date date = sqlFormat.parse(sqlDate);
            return euFormat.format(date);
            
        } catch (ParseException e) {
            
            e.printStackTrace();
            return sqlDate;
            
        }
        
	}
	
	public static String encryptMd5(String password) {
		
		try {
			
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(password.getBytes());
            byte[] digest = md.digest();
            
            StringBuilder hexString = new StringBuilder();
            
            for (byte b : digest) {
                hexString.append(String.format("%02x", b & 0xff));
            }
            
            return hexString.toString();
            
        } catch (NoSuchAlgorithmException e) {
        	
            System.err.println("Error al encriptar la contraseña.");
            e.printStackTrace();
            
        }
		
		return password;
		
	}
	
	/* METODO PARA COMPROBAR FORMATO DE EMAIL */
	
	/**
	 * Método estático que comprueba si un email tiene formato correcto.
	 * 
	 *  @param email Email a comprobar.
	 *  @return boolean Check del email.
	 */
	
	public static boolean validateEmail(String email) {
		
		return email.matches("^[\\w-\\+]+(\\.[\\w-\\+]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

	}
	
	/* METODO PARA COMPROBAR FORMATO DE NIF */
	
	/**
	 * Método estático que compruba si un DNI tiene formato correcto.
	 * 
	 *  @param nif DNI a comprobar.
	 *  @return boolean Check del nif.
	 */
	
	public static boolean validateNif(String nif) {
		
		return nif.matches("^\\d{8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E|t|r|w|a|g|m|y|f|p|d|x|b|n|j|z|s|q|v|h|l|c|k|e]$");
		
	}
	
	/* METODO PARA COMPROBAR FORMATO DE FECHA */
	
	/**
	 * Método estático que compruba si una fecha tiene formato correcto y es válida.
	 * Además comprueba si la fecha no va más allá del año actual.
	 * 
	 *  @param birthdate Fecha a comprobar.
	 *  @param currentYear Año actual.
	 *  @return boolean Check de la fecha de nacimiento.
	 */
	
	public static boolean validateDate(String date) {
        
        if(!date.matches("^\\d{1,2}/\\d{1,2}/\\d{4}$")) {
        	
        	return false;
        	
        }
        
        String[] data = date.split("/");
        int day = Integer.parseInt(data[0]);
        int month = Integer.parseInt(data[1]);
        int year = Integer.parseInt(data[2]);
        
        boolean bisiesto = false;

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			bisiesto = true;
		}

		if (month >= 1 && month <= 12) {

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				return day <= 31;	

			} else if (month == 4 || month == 6 || month == 9 || month == 11) {

				return day <= 30;

			} else {

				return (day <= 29 && bisiesto)||(day<=28 && !bisiesto);	

			}

		}
		
		return false;
	}
	
	/* METODO PARA COMPROBAR SI ES UN NOMBRE VÁLIDO */
	
	/**
	 * Método estático que compruba si un nombre tienen un formato válido.
	 * 
	 *  @param text Texto a comprobar.
	 *  @return boolean Check de la comprobación del nombre.
	 */
	
	public static boolean validateName(String name) {
		
		return name.matches("^([a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÜÈÌÙÒñÑ][a-záéíóúàèìòùñüç']+)( [a-zA-ZáéíóúÁÉÍÓÚàèìòùÀÈÌÙÜÒñÑ]{1}[a-záéíóúàèìòùñüç']+(-[a-záéíóúàèìòùñüç']+)?){1,2}$");
		
	}
	
	public static boolean validateUserName(String username) {
		
		return username.matches("^@[\\w-]+$");
		
	}
	
	public static boolean validatePassword(String password) {
		
		return password.matches("(?=.*[A-ZÑ])(?=.*[a-zñ])(?=.*\\d)(?=.+[$*-+&!¡#?%]).{8,}");
	
	}
	
	
/* METODO PARA CONFIRMAR LA SALIDA CON UNA S u s */
	
	/**
	 * Método estático que permite mostar un mensaje para pedir al usuario si quiere salir del programa.
	 * 
	 * @return Boolean confirmación de salida.
	 */
	
	public static boolean confirmExit() {
		
		if(Input.getString("\n\t¿Está seguro que desea salir? SI -> s ").equalsIgnoreCase("S")) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
	}
	
	/* METODO PARA CONFIRMAR UN MENSAJE CON UNA LETRA A ELEGIR */
	
	/**
	 * Método estático que sobrecargado, permite mostar un mensaje y también recibe un mensaje de aceptación.
	 * 
	 *  @param enunciado Enunciado que se desea introducir.
	 *  @param respuesta Respuesta deseada para ser afirmativa.
	 *  @return boolean Confirmación de ununciado.
	 */
	
	public static boolean confirmExit(String enun, String response) { 
		
		if(Input.getString(enun).equalsIgnoreCase(response)) {
			
			return true;
			
		}else {
			
			return false;
			
		}
		
		//return Input.getString(enun).equalsIgnoreCase(response);
		
	}
	
}