import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        System.out.println("***** Identifica las estaciones del año *****");
        var consola= new Scanner(System.in);

        System.out.print("Proporciona un mes del año: ");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion="";

        if (mes==1|| mes==2 || mes==12){
           estacion= "Invierno :)";
        } else if (mes==3||mes==4||mes==5) {
            estacion= "Primavera :)";
        } else if (mes==6||mes==7||mes==8) {
            estacion= "Verano :)";
        }else if (mes==9||mes==10||mes==11) {
            estacion= "Otoño :)";
        }else{
            estacion= "El mes que ingresaste no existe :( :";
        }
        System.out.println("La estacion del año a la que corresponde el mes "+mes+" es "+estacion);

    }
}
