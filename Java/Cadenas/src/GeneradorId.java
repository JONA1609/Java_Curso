import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class GeneradorId {
    public static void main(String[] args) {
        System.out.println("***** Generador Unico de  Id *****");
        var cadena = new Scanner(System.in);
        var numeroAleatorio = new Random();

        //solicitamos las datos al usuario
        System.out.print("Cual es tu nombre: ");
        var nombre = cadena.nextLine();
        System.out.print("Ingresa tu apellido: ");
        var apellido = cadena.nextLine();
        System.out.println("Introduce tu año de nacimiento(AAAA): ");
        var fechaNacimiento = cadena.nextLine();

        //normalizamos los datos
        var nombreNormalizado = nombre.trim().toUpperCase().substring(0,2);
        var apellidoNormalizado = apellido.trim().toUpperCase().substring(0,2);
        var fecha2 = fechaNacimiento.trim().substring(2,4);

        //generar numero aleatorio
        var numeroalea = numeroAleatorio.nextInt(9999)+1;

        //formato de numero aleatorio
        var numAleatorio = String.format("%04d", numeroalea);

        var idUnico = nombreNormalizado+apellidoNormalizado+fecha2+numAleatorio;

        System.out.printf("""
                 %n Hola %s
                 \t Tu nuevo numero de identificacion (ID) generado por el sistema es: 
                 \t %s
                 \t ¡Felicidades!
                 """,nombre, idUnico);

    }



}
