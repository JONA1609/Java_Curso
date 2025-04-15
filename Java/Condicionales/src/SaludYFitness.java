import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Salud y Fitness ***");

        //constantes
        final var META_PASO_DIARIO = 10000;
        final var CALORIA_POR_PASO = 0.04; //valor aproximado. son kilocalorias

        var consola = new Scanner(System.in);

        System.out.print("¿Cual es tu nombre?: ");
        var nombreUsuario = consola.nextLine();

        System.out.print("¿Cuantos pasos has dado?: ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        //verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = (pasosDiarios>= META_PASO_DIARIO)?"Si :)" : "No :(";

        //calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios* CALORIA_POR_PASO;

        //Mostramos la informacion
        System.out.printf("""
                %nUsuario:---------%s
                Pasos dados hoy------%d
                Calorias quemadas: %.2f
                Meta de pasos diarios alcanzada: %s
                ------------------------------------
                La meta de pasos diarios es de: %d pasos
                """,nombreUsuario,pasosDiarios,caloriasQuemadas,metaAlcanzada,
                META_PASO_DIARIO);
    }
}
