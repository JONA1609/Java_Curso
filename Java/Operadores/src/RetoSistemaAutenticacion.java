import java.util.Scanner;
import java.util.SortedMap;

public class RetoSistemaAutenticacion {

    public static void main(String[] args) {
        System.out.println("*****  Sistema de autenticacion de usuarios  *****");
        final String usuario= "alberto03";
        final String contrasenia= "nomelase";
        var consola = new Scanner(System.in);

        //Solicitamos usuario y contraseña
        System.out.println("Ingresa el usuario: ");
        var usuario2 = consola.nextLine();
        System.out.println("Ingresa la contraseña: ");
        var contrasenia2 = consola.nextLine();

        //Comparamos las cadenas solicitadas
        //Para confirmar que la informacion es la correcta
        var usuarioCorrecto = usuario.equals(usuario2)&&
                contrasenia.equals(contrasenia2);

        //imprimimos el resultado
        System.out.println("El accerso al sistema es: "+usuarioCorrecto);





    }




}
