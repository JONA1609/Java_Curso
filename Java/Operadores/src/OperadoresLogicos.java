public class OperadoresLogicos {
    public static void main(String[] args) {
        System.out.println("**** Operador and ****");
        boolean a = true, b=false;
        //and (regresa true si ambos son true)
        var resultado = a&&b;
        System.out.println("Resltado de operador logico && ="+resultado );
        //or (sin uno es verdadero el resultado tambien es verdadero)
        resultado= a||b;
        System.out.println("Resultado de operador or = "+resultado);
        // not (invierte el valor logico y es un operador unario)
        resultado = !a;
        System.out.println("ahora el valor de a es  = "+resultado);
    }
}
