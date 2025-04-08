public class OperadorTernario {
    public static void main(String[] args) {

        System.out.println("*** Operador ternario ***");

        //Sintaxis
        //Condicion ? expe1 : exp2

        //Determinar si un numero es par o no
        var numero = 4;
        var resultado = (numero%2 == 0)? "Par": "Impar";
        System.out.println("El numero "+numero+ "es "+ resultado);

    }
}
