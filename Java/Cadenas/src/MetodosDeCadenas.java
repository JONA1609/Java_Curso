import javax.sound.midi.Soundbank;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodo en cadenas
        var cadena1 = "Hola Mundo";

        //Obtener el largo de una cadena
        var longitud= cadena1.length();
        System.out.println("Longitud = "+longitud);

        //remplazar caracteres
        var nuevacadena = cadena1.replace('o','a');
        System.out.println("nuevaCadena = "+ nuevacadena);

        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("Mayusculas = "+ mayusculas);

        //Convertir a minusculas
        System.out.println("Minusculas = "+ cadena1.toLowerCase());

        //Eliminar espacion al principos y al final de cada cadena

        var cadena2= "      Jonathan aaron    ";
        System.out.println("Cadena 2 con espacios = "+ cadena2);
        System.out.println("Cadena 2 sin espacios = " + cadena2.trim());

    }

}
