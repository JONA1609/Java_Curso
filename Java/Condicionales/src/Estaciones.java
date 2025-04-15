import java.util.Scanner;

public class Estaciones {
    public static void main(String[] args) {
        System.out.println("***** Identifica las estaciones del año *****");
        var consola= new Scanner(System.in);

        System.out.print("Proporciona un mes del año: ");
        var mes = Integer.parseInt(consola.nextLine());
        
        if (mes==1|| mes==2 || mes==12){
            System.out.println("La estacion del año segun el mes es Invierno :)");
        } else if (mes==3||mes==4||mes==5) {
            System.out.println("La estacion del año segun el mes es Primavera :)");
        } else if (mes==6||mes==7||mes==8) {
            System.out.println("La estacion del año segun el mes es Verano :)");
        }else if (mes==9||mes==10||mes==11) {
            System.out.println("La estacion del año segun el mes es Otoño :)");
        }else{
            System.out.println("El mes que ingresaste no existe, vuelve a intentar");
        }

    }

}
