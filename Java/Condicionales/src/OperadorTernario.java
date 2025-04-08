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

        //Operador ternario anidado
        var edad = random.nextInt(18);
        resultado= (edad==18)?"eres mayor de edad": (edad>12)?"Eres un adolecente":"Eres un niño";
        System.out.println(resultado+" porque tu edad es de "+edad+ " Años");

        resultado = (numero1 >0)? "positivo": (numero1<0)? "negativo": "Cero";
        System.out.println("El numero "+numero1+" es "+resultado);
    }
}
