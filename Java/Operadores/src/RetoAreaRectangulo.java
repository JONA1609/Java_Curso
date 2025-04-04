import java.util.Scanner;

public class RetoAreaRectangulo {
    public static void main(String[] args) {
        System.out.println("***** Calculo Area y perimetro de un Rectangulo  *****\n");
        var consola = new Scanner(System.in);

        //Solicitamos los datos al usuario
        System.out.print("Proporciona la altura del rectangulo: ");
        var altura = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona la base del rectangulo: ");
        var base = Integer.parseInt(consola.nextLine());

        //Calculamos el area del rectangulo
        var area = base*altura;
        System.out.println("El area del rectangulo es: "+area);

        //Calculo de perimetro del rectangulo
        var perimetro = 2*(base+altura);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
    }
}
