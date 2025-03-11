public class Tipovar
{
    public static void main(String[] args) {
        String nombre="Jose";
        System.out.println(nombre);

        var nombre2= "juan";
        System.out.println(nombre2);
        var edad= 30;
        System.out.println(edad);
        var sueldo = 3000.05F;//aqui se infiere el tipo de dato de var
        var esCasado = false; //se infiere el tipo booleano
        //en vafr no podemos asisgnar otro tipo de valo
        //var no acxepta un valor null


    }
}
