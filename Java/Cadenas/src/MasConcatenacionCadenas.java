public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 usando + para concatenar " +cadena3);

        //Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat " + cadena3);

        // StringBuilder
        var constructorCadena= new StringBuilder();
        constructorCadena.append(cadena1);
        constructorCadena.append(" ");
        constructorCadena.append(cadena2);
        var resultado = constructorCadena.toString();
        System.out.println(" resultado = " + resultado);

        //StringBuffer
        var stringbBuffer = new StringBuffer();
        stringbBuffer.append(cadena1).append("v").append(cadena2);
        resultado=stringbBuffer.toString();
        System.out.println("concatenar con StringBuffer = "+ resultado);

        // joind
        resultado = String.join(" ", cadena1, cadena2, "y Adios");
        System.out.println("concatenar con join = " +resultado);

    }
}
