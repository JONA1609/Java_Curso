public class IndecesCadena {
    public static void main(String[] args) {
        System.out.println("*** Manejo de indices en una cadena ***");
        var cadena1 = "Hola Mundo";

        //recuperar primer caracter
        var primerCaracter= cadena1.charAt(0);//Recuperando el caracter H
        System.out.println("primer caracter = "+ primerCaracter);
        var letraM = cadena1.charAt(5);//recuperando letra M
        System.out.println("letraM = " + letraM);
    }
}
