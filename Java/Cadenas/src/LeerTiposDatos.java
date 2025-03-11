import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        //leer un tipo int
        var consola =  new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        var edad = consola.nextInt();
        System.out.println("Edad = " +edad);
        //Tipo double
        System.out.println("Ingresa tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura = "+ altura);

        //conversion de datos

        //convertir una cadena en un dato entero
        System.out.println("Proporciona un valor entero");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);

        //convertir a tipo flotante
        System.out.println("Proporciona un valor de tipo flotante ");
        //aqui podemos convertir el dato ingresado al momento de leer la informacion
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("Flotante = " +flotante);
    }
}
