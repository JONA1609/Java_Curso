public class ComparacionCadenas {

    public static void main(String[] args) {
        //comparacion de cadenas
        var cadena1= "Java";
        var cadena2= "Java";
        var cadena3 = new String("Java");


        //comparacion de cadenas (==) comparan la cadena
        System.out.print("Cadena1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        //comparacion de cadena 1 con cadena 3 (referencia)
        System.out.print("cadena1 les igual que cadena 3: ");
        System.out.println(cadena1 == cadena3);
        System.out.println("Cadena1 es igual en contenido a cadena3");
        System.out.println(cadena1.equals(cadena3));
    }
}
