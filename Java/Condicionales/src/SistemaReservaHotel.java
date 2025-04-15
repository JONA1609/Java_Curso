import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        final var CUARTO_SIN_VISTA_MAR = 150.50;
        final var CUARTO_CON_VISTA_MAR = 190.50;
        var consola = new Scanner(System.in);

        //Solicitamos el nombre del cliente
        System.out.print("Proporciona tu nombre: ");
        var nombre= consola.nextLine();
        //solicitamos los dias de estadia
        System.out.print("¿Cuantos dias te quieres hospedar?: ");
        var diasHospedaje = Integer.parseInt(consola.nextLine());

        //solicitamos que habitacion quiere el cliente
        System.out.print("¿Quieres una habitacion con vista al mar?(true/false): ");
        var seleccionaHabitacion = Boolean.parseBoolean(consola.nextLine());

        //Calculamos el monto a pagar
        var costoHospedaje = (seleccionaHabitacion)? diasHospedaje*CUARTO_CON_VISTA_MAR:
                diasHospedaje*CUARTO_SIN_VISTA_MAR;
        var mensaje= (seleccionaHabitacion)?"Si":"no";

        System.out.printf("""
                Cliente: %s
                Dias de estadia: %d
                Costo Total: %.2f
                Habitacion con vista al mar: %s
                """,nombre, diasHospedaje, costoHospedaje,mensaje);
    }
}
