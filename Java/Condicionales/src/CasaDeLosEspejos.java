import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la casa de los espejos");
        var consola = new Scanner(System.in);

        System.out.print("Cual es tu edad? ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes miedo a la oscuridad(true/false)? ");
        var tienesMiedo = Boolean.parseBoolean(consola.nextLine());

        if (!tienesMiedo&&edad>=10){
            System.out.println("puedes entrar a la casa de los espejos");
        }else {
            System.out.println("lo siento la casa de los epejos puede darte miedo");
        }

    }
}
