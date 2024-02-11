package SupermercadoPoo03;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main{
	
	public static void main(String[] args) {
		
        Detergente detergente = new Detergente("Ariel", 5.99);
        detergente.setVolumen(1.5);
        detergente.setTipoEnvase("Botella");
        detergente.setDescuento(1);

        Cereales cereales = new Cereales("Kellogg's", 2.49, "Trigo");
        cereales.setCaducidad(LocalDate.of(2024, 12, 31));

        Vino vino = new Vino("Casillero del Diablo", 8.99, 2, "Tinto");
        vino.setCaducidad(LocalDate.of(2025, 6, 30));
        vino.setDescuento(2);

        // ArrayList de productos alimenticios
        ArrayList<EsAlimento> productosAlimenticios = new ArrayList<>();
        productosAlimenticios.add(cereales);
        productosAlimenticios.add(vino);

        // Calcular la suma de calorías utilizando polimorfismo
        int sumaCalorias = 0;
        for (EsAlimento producto : productosAlimenticios) {
            sumaCalorias += producto.getCalorias();
        }

        // Imprimir resultados
        System.out.println("Detergente: " + detergente);
        System.out.println("Cereales: " + cereales);
        System.out.println("Vino: " + vino);
        System.out.println("Suma de calorías de productos alimenticios: " + sumaCalorias);
		
	}
		
}