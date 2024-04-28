package snippet;

public class Snippet {
	Claro, aquí tienes un enunciado para un ejercicio de programación en Java que abarca todos esos conceptos:
	
	---
	
	En este ejercicio, vamos a crear un sistema de gestión de empleados para una empresa. Cada empleado puede ser de diferentes tipos: administrativo, técnico o gerencial. Cada tipo de empleado tiene sus propias características y comportamientos específicos.
	
	1. Define una clase abstracta `Empleado` que contenga los siguientes atributos y métodos:
	   - Atributos: `nombre`, `id`, `salario`.
	   - Métodos abstractos: `calcularSalario()`, `mostrarDetalles()`.
	
	2. Crea tres clases que hereden de `Empleado`: `Administrativo`, `Tecnico` y `Gerente`. Cada una de estas clases debe implementar los métodos abstractos heredados y definir sus propios atributos y métodos específicos:
	   - `Administrativo` debe tener un atributo `horasExtra` y un método para calcular el salario, que incluya el pago por horas extra.
	   - `Tecnico` debe tener un atributo `proyectosAsignados` y un método para calcular el salario, que tenga en cuenta la cantidad de proyectos asignados.
	   - `Gerente` debe tener un atributo `bono` y un método para calcular el salario, que incluya el bono.
	
	3. Define una interfaz `BaseDatos` con métodos para conectar a una base de datos, insertar, actualizar, y consultar empleados.
	
	4. Crea una clase `GestorBD` que implemente la interfaz `BaseDatos` y tenga una implementación básica para los métodos de la interfaz. Esta clase simulará la conexión y manipulación de una base de datos.
	
	5. Crea una clase `Main` que contenga el método `main` donde se realizará lo siguiente:
	   - Crear instancias de varios tipos de empleados (Administrativo, Técnico, Gerente).
	   - Almacenar los empleados en una lista de tipo `Empleado`.
	   - Utilizar el polimorfismo para mostrar los detalles y calcular el salario de cada empleado, independientemente de su tipo.
	   - Utilizar el método `insertar` de la clase `GestorBD` para guardar los empleados en la base de datos.
	   - Consultar la base de datos para recuperar los empleados almacenados y mostrar sus detalles.
	
	Este ejercicio pondrá a prueba tu comprensión de herencia, clases abstractas, interfaces, polimorfismo, métodos abstractos y la manipulación básica de bases de datos en Java.
}

