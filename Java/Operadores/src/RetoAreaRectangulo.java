import java.util.Scanner;

public class RetoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("*****  Area y perimetro de un Rectangulo");
        var consola = new Scanner(System.in);


        System.out.print("Proporciona la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());

        var area = base*altura;
        var perimetro = 2*(base+altura);
        System.out.println("El area del rectangulo es: "+area);
        System.out.println("El perimetro del rectangulo es: "+perimetro);




    }

}
