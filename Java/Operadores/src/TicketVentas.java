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

        //Aplicar descuento
        System.out.println("¿Se aplicara algun descuento (%)?: ");
        var descuentoPorcentaje = Integer.parseInt(consola.nextLine());

        //Calculo del subtotal sin impuestos
        var subTotal= precioLeche + precioPan + precioHuevo + precioHuevo + precioManzanas;

        //calcular descuento
        var descuento = subTotal *(descuentoPorcentaje/100.0);

        //Subtotal con descuento
        var subtotalConDescuento= subTotal-descuento;

        //Calculo iva o impuesto
        var impuestos= subTotal * 0.16;

        //Calculo total con impuestos
        var costoTotal= subtotalConDescuento + impuestos;

        //Imprimir ticket
        System.out.printf("""
                Subtotal:$%.2f
                Descuento:$%.2f (%d%%)
                Impuesto (16%%):$%.2f
                Costo Total: $%.2f
                """, subtotalConDescuento,descuento,
                impuestos, costoTotal);
    }
}
