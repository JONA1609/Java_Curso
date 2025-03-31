import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*****  Sistema Prestamo de Libros  *****");

        final var DISTANCIA_LIMITE= 3;
        var consola = new Scanner(System.in);

        System.out.print("¿Tienes credencial de estudiante (true/line)? " );
        var tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿A cuantos kilometros a la redonda vives? ");
        var distancia= Integer.parseInt(consola.nextLine());

        var sePrestaLibro= distancia <= DISTANCIA_LIMITE && tieneCredencial;

        System.out.println("¿Se puede prestar el libro al usuario? "+sePrestaLibro);

    }
}
