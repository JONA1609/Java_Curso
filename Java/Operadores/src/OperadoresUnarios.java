public class OperadoresUnarios {
    public static void main(String[] args) {
        int a = 3, b = -2, resultado;
        var c = true;

        //Operador unario +
        resultado = +a;
        System.out.println("resultado de +a: " + resultado);
        //operador unario -
        resultado=-a;
        System.out.println("Resultado e -a "+resultado);

        //Operador unario de incremento y decremento
        //pre incremento y pre decremento
        resultado = a++;
        System.out.println("Resultado de incremento a++ "+ resultado);
        System.out.println("Resultado del pre incremento "+a);
        resultado = a--;
        System.out.println("Resultado de decremento a-- " +resultado);
        System.out.println("Resultado con el pre decremento: "+a);


    }



}
