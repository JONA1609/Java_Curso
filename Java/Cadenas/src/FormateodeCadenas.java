public class FormateodeCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        var nombre= "Carlos";
        var edad= 35;
        var salario = 21000.231;

        //String.format
        var mensaje = String.format("Nombre: %s, Edad: %d, Salario $%.2f",nombre, edad
                , salario);
        System.out.println(mensaje);
        var numeroEmpleado= 132;
        //Formateo utilisando texy Block  "\s-> agrega un espacio entre texto en un bloque de texto
        mensaje = """
                %nDetalle de la persona:\s
                ---------------------------------
                \tNombre: %s
                \tNumero de Empleado: %05d
                \tEdad: %d
                \tsalario: %.2f
                ---------------------------------
                """.formatted(nombre,numeroEmpleado,edad,salario);
        System.out.println(mensaje);

    }
}
