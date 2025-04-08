import java.util.Random;

public class OperadorTernario {
    public static void main(String[] args) {

        System.out.println("*** Operador ternario ***");

        //Sintaxis
        //Condicion ? expe1 : exp2

        //Determinar si un numero es par o no
        var numero = new Random();
        var numero1= numero.nextInt(100);

        var resultado = (numero1%2 == 0)? "Par": "Impar";
        System.out.println("El numero "+numero1+ " es "+ resultado);

    }
}
