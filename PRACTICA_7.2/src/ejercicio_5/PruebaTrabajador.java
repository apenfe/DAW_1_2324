package ejercicio_5;

import java.util.ArrayList;
import java.util.Collections;

import ejercicio_3.*;

public class PruebaTrabajador{

	public static void main(String[] args) {
		
		double sueldo = 3;
		
		ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();

		trabajadores.add(new Trabajador(2,"Andres","Pérez"));
		trabajadores.add(new Trabajador(5,"Alejandro","López"));
		trabajadores.add(new Trabajador(1,"Luz","García"));
		trabajadores.add(new Trabajador(3,"David","González"));
		trabajadores.add(new Trabajador(8,"Juan","Sánchez"));
		trabajadores.add(new Trabajador(4,"Andres","Pérez"));
		trabajadores.add(new Trabajador(6,"Alejandro","López"));
		trabajadores.add(new Trabajador(10,"Luz","García"));
		trabajadores.add(new Trabajador(7,"David","González"));
		trabajadores.add(new Trabajador(9,"Juan","Sánchez"));
		
		for (int i = 0 ; i<trabajadores.size() ;i++) {
			trabajadores.get(i).calcularSueldo(sueldo);
	    }
        
        Collections.sort(trabajadores);
        
        System.out.println("Lista de estudiantes ordenados por nota de evaluación:");
        
        for (int i = 0 ; i<trabajadores.size() ;i++) {
        	System.out.println(trabajadores.get(i).toString());
	    }
		
	}
	
}