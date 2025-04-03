import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        boolean estaDentroRango=true;
        boolean estaFueraRango=true;
        do {
            System.out.println("Proporciona un dato entero: ");
            var dato = Integer.parseInt(consola.nextLine());

            //Revisamos si esta dentro del rango (entre 1 y 10)
            estaDentroRango = dato>= 1 && dato <= 10;
            System.out.println("variable dentro de rango (1 y 10 )? "+ estaDentroRango);

            // Revisar la longitud inversa se el dato esta fuera de rango
             estaFueraRango = !(dato >= 1 && dato <= 10);
            System.out.println("Variable fuera de rango (1 y 10)" + estaFueraRango);


        }while (estaDentroRango||estaDentroRango);





    }

}
