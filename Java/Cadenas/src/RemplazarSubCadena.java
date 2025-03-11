public class RemplazarSubCadena {
    public static void main(String[] args) {
        //Remplazar Subcadenas
        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " +cadena1);

        // remplazar "Mundo" por "a todos"

        var nuevaCadena = cadena1.replace("mundo", "a todos");
        System.out.println("nueva cadena = "+nuevaCadena);

        //remplazar "hola" por "saludos"
        nuevaCadena =cadena1.replace("Hola", "saludos");
        System.out.println("nueva cadena = " +nuevaCadena);




    }
}
