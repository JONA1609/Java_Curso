import java.util.Scanner;

public class DescuentosVip {
    //programa que otorga descuentos a clientes vip
    //si el cliente compra 10 o mas priductos y tiene menbresia obtendra un descuento
    //pedir al usuario la cantidad de productos comprados
    //y adicional si tiene membresia

    public static void main(String[] args) {
        System.out.println("*****   Sistema de descuentos vip  *****\n");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuantos productos compraste hoy: ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresia de la tienda (true/false): ");
        var membresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento = cantidadProductos >= NO_PRODUCTOS_DESCUENTO && membresia;

        System.out.println("Tienes acceso al descuento VIP? "+esElegibleDescuento);


    }








}
