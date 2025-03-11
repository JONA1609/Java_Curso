public class GeneradorEmail {
    public static void main(String[] args) {
        //Generador de email.
        System.out.println("\t\t  **** Generador de Email ****\n");
        //Valores inciciales
        var nombre = " Jonathan Ramirez Pina ";
        var empresa= "Banco Azteca";

        //convertimos a minisculas
        var nombrenNormalizado = nombre.toLowerCase();
        var empresaNormalizada =empresa.toLowerCase();

        //Eliminar los espacios
        nombrenNormalizado = nombrenNormalizado.strip();
        empresaNormalizada = empresaNormalizada.strip();
        nombrenNormalizado = nombrenNormalizado.replace(" ", ".");
        empresaNormalizada = empresaNormalizada.replace(" ","");
        //Concatenamos la cadena
        var cadena = new StringBuffer();
         cadena.append("\t").append(nombrenNormalizado).append("@").append(empresaNormalizada).append(".com.mx");
         var email = cadena.toString();
        System.out.println(email);
    }

}
