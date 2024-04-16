package ejercicio_4;

import java.util.ArrayList;
import java.util.Collections;

import ejercicio_3.*;

public class PruebaEstudiante{

	public static void main(String[] args) {
		
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

        estudiantes.add(new Estudiante(2,"Andres","Pérez"));
        estudiantes.add(new Estudiante(5,"Alejandro","López"));
        estudiantes.add(new Estudiante(1,"Luz","García"));
        estudiantes.add(new Estudiante(3,"David","González"));
        estudiantes.add(new Estudiante(8,"Juan","Sánchez"));
        
        Collections.sort(estudiantes);
        
        System.out.println("Lista de estudiantes ordenados por nota de evaluación:");
        
        for (int i = estudiantes.size()-1 ; i>= 0;i--) {
            System.out.println(estudiantes.get(i).toString());
        }
		
	}
	
}