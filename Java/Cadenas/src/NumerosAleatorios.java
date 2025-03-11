import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        System.out.println(("*** Numeros aleatorios ***"));
        var random = new Random();

        // Generar un numero aleatorio entre 0 y 9
        var numeroAleatorio = random.nextInt(10);
        System.out.println("Numero aleatorio entre 0 y 9 = "+numeroAleatorio);
        // Numero aleatorio entre 1 y 10
        numeroAleatorio = random.nextInt(10) + 1;
        System.out.println("Numero aleatorio entre 1 y 10 = "+numeroAleatorio);
        /

    }

}
