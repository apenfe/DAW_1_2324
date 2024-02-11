package Tarea3_2;

public class Estudiante {
	
    private String nombre;
    private int edad;
    private double nota;

    public Estudiante(String nombre, int edad, double nota) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota = (nota >= 0 && nota <= 10) ? nota : 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getNota() {
        return nota;
    }

    public String obtenerEstadoAcademico() {
        if (nota >= 9 && nota <= 10) {
            return "Sobresaliente";
        } else if (nota >= 7) {
            return "Notable";
        } else if (nota >= 5) {
            return "Aprobado";
        } else {
            return "Suspenso";
        }
        
    }
    
}