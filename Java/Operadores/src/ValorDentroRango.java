import java.util.Scanner;

public class ValorDentroRango {
     //Programa que determina si el valor proporcionado
    //se encuentra dentro de un rango
     public static void main(String[] args) {
         System.out.println("**** Valor dentro Rango ****");
         //Definir limites
         final var minimo= 0;
         final var maximo= 5;
         //SOlicitar el numero al usuario
         System.out.printf("Proporciona un numero entre el 0 y el 5 ");
         var  dato = Integer.parseInt(new Scanner(System.in).nextLine());
         var estaDentroRango = dato<= maximo && dato >= minimo;
         System.out.println("Esta dentro del rango = "+estaDentroRango);

     }


}
