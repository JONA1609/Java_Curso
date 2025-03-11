public class BusquedaSubcadenas {
    //Manejo de subcadenas
    public static void main(String[] args) {
       //Buscar subcadenas
        //indexOf- Devuelve el indice de la primer aparicion de la subcadena
        var cadena1 = "Hola mundo";
        //subcadena  a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = "+ indice1);
        //lastIndixOf - devuelve el indice de la ultima aparicion de la subcadena
        var indice2 = cadena1.lastIndexOf("mundo");
        System.out.println("indice2 = " +indice2);
        //si la busqueda no encuentra la subcadena en la cadena principal  arroja -1 como indice
        var indice3 = cadena1.lastIndexOf("Java");
        System.out.println("indice3 = " +indice3);


    }


}
