import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        System.out.println("******  Tienda en linea con descuento  ******");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona el monto de tu compra; ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        System.out.print("¿Tienes mambresia de la tienda (true/false)? ");
        var membrecia = Boolean.parseBoolean(consola.nextLine());

        //calcular descuento y mostrar en pantalla
        //si no cumple las primeras condiciones hacer invitacion de volverse
        //mienbro de la tienda
        var descuento= 0.0;
        if (montoCompra>=1000 && membrecia){
            System.out.println("Tienes un desscuento del 10%");
             descuento = montoCompra*0.1;
            System.out.println("Cantidad a descontar: "+ descuento);
            var totalFinal = montoCompra - descuento;
            System.out.println("Total de compra: "+totalFinal );
        }else if (membrecia && montoCompra<1000) {
            System.out.println("Tienes un descuento del 5%");
             descuento = montoCompra * 0.05;
            System.out.println("Cantida a descontar"+ descuento);
            var totalFinal = montoCompra - descuento;
            System.out.println("El total con descuento es: "+ totalFinal);
        }else {
            System.out.println("tu descuento es del 0%");
        }
    }
}
