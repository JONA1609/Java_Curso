import java.util.Scanner;

public class RecetasCocina {
        //***Recetas de cocina

    public static void main(String[] args) {

        System.out.println("***** \tPrograma de recetas de cocina *****");
        var consola= new Scanner(System.in);
        //Ingresa tu receta de cocina
        System.out.print("ingresa tu reseta de cocina ");
        var nombreReceta = consola.nextLine();
        //Ingresar los ingredientes
        System.out.print("Ingresa los ingredientes ");
        var ingredientes = consola.nextLine();
        // Tiempo de preparacion
        System.out.print("ingresa el tiempo de preparacion ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());
        //Dificultad de preparacion
        System.out.print("Ingresa la dificultad (Facil/Media/Dificil)");
        var dificultadPeparacion = consola.nextLine();

        //Imprimir los valores de la receta
        System.out.println("\n\t\t *** Receta de cocina ***");
        System.out.println("\t Nombre receta: "+nombreReceta);
        System.out.println("\t Ingredientes de la receta: "+ingredientes);
        System.out.println("\t Tiempo de preparacion: "+tiempoPreparacion +" minutos");
        System.out.println("\t Dificultad : "+dificultadPeparacion);

    }







}
