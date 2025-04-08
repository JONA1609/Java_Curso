import java.util.Scanner;

public class SistemaDescuentos {
    public static void main(String[] args) {
        System.out.println("******  Tienda en linea con descuento  ******");
        final int MONTO_MINIMO = 1000;
        var consola = new Scanner(System.in);

        System.out.print("Proporciona el monto de tu compra: ");
        var montoCompra = Double.parseDouble(consola.nextLine());
        System.out.print("¿Tienes mambresia de la tienda (true/false)? ");
        var membrecia = Boolean.parseBoolean(consola.nextLine());

        //calcular descuento y mostrar en pantalla
        //si no cumple las primeras condiciones hacer invitacion de volverse
        //mienbro de la tienda
        var descuento= 0.0;
        if (montoCompra>=MONTO_MINIMO && membrecia){
             descuento =0.1;
        }else if (membrecia && montoCompra<MONTO_MINIMO) {
             descuento = 0.05;
        }else {
           descuento= 0;
        }
        // Calculamos los
        if(descuento!=0) {
           var descuuentoCompra = montoCompra * descuento;
           var totalCompra =  montoCompra - descuuentoCompra;
            System.out.printf("""
                    **** Felicidas tienes un descuento ****
                      Descuento de :----------- $%.02f
                      Total a pagar:----------- $%.2f
                    """,descuento, totalCompra);
        }else {
            System.out.printf("""
                    %n**** Te invitamos a obtener tu membresia ****
                        Descuento:---------------------- $%f
                        Total a pagar:------------------ $%.2f
                    -----------------------------------------------
                    *****¿Que esperas?, Obten tu MEMBRECIA!!!!*****
                    
                    """,descuento, montoCompra);
        }
    }
}
