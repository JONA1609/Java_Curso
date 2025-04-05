import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        System.out.println("******  Tienda en linea con descuento  ******");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona el monto de tu compra; ");
        var montoCompra = Integer.parseInt(consola.nextLine());
        System.out.println("¿Tienes mambresia de la tienda? ");
        var membrecia = Boolean.parseBoolean(consola.nextLine());

        if (montoCompra>=1000 && membrecia==true){
            System.out.println("Tienes un desscuento del 10%");
        }else if (membrecia==true && montoCompra<1000) {
            System.out.println("Tienes un descuento del 5%");
        }else {
            System.out.println("tu descuento es del 0%");
        }




    }





}
