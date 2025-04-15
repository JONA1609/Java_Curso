import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        System.out.println("***** Mayor de dos numero *****");
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el primer numero entero: ");
        var numero1 = Integer.parseInt(consola.nextLine());
        System.out.printf("Proporciona el segundo numero entero: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        var resultado = (numero1>numero2)?numero1:numero2;

        System.out.println("El numero "+resultado+" es mayor");






    }
}
