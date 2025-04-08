import java.util.Random;

public class OperadorTernario {
    public static void main(String[] args) {

        System.out.println("*** Operador ternario ***");

        //Sintaxis
        //Condicion ? expe1 : exp2

        //Determinar si un numero es par o no
        var random = new Random();
        var numero1= random.nextInt(100);

        var resultado = (numero1%2 == 0)? "Par": "Impar";
        System.out.println("El numero "+numero1+ " es "+ resultado);

        var edad = random.nextInt(18);
        resultado= (edad>12)?"eres un adolecente": "Eres un niño";
        System.out.println(resultado+" Porque tu edad es de "+edad+ " Años");
    }
}
