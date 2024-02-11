package Ficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner; 


public class Fichero02{
	
	public static final String PATH= ".\\files\\";
	public static final String FILE= "alumnos.txt";
	
	public static void main(String[] args) {
		
		ArrayList<String> lista = obtenerAlumnos();
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
	
	public static ArrayList<String> obtenerAlumnos() {

		ArrayList<String> list = new ArrayList<String>();
		
		try {

			File myObj = new File(PATH + FILE);
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				list.add(data);
			}

			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

		return list;
	}
}