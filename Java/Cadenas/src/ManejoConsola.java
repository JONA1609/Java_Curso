import java.util.Scanner;

public class ManejoConsola {

    public static void main(String[] args) {
        //introducir valores por consola
        var consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre ");
        var nombre = consola.nextLine();
        System.out.println("Nombre =" +nombre);


    }
}
