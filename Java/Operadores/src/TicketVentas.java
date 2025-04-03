import java.util.Scanner;

public class TicketVentas {
    public static void main(String[] args) {
        System.out.println("***** Generador de ticket de Venta *****");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio huevo: ");
        var precioHuevo = Double.parseDouble(consola.nextLine());

        System.out.print("Precio manzanas: ");
        var precioManzanas = Double.parseDouble(consola.nextLine());

        //Calculo del subtotal sin impuestos
        var subTotal= precioPan + precioPan + precioHuevo + precioHuevo;

        //Calculo iva o impuesto
        var impuestos= subTotal * 0.16;

        //Calculo total con impuestos
        var costoTotal= subTotal + impuestos;

        //Imprimir ticket
        System.out.printf("""
                Subtotal:$%.2f
                Impuesto (16%%):$%.2f 
                Costo Total: $%.2f
                """, subTotal, impuestos, costoTotal);
    }
}
