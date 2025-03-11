import java.net.SocketTimeoutException;
import java.util.Scanner;

import static java.lang.Double.*;

public class SistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("    **** Sistema de Empleados ****  ");
        var consola = new Scanner(System.in);

        //Pedimos el nombre del empleado
        System.out.println(" Nombre del empleado");
        var nombreEMpleado =  consola.nextLine();

        //Pedimos el salario del empleado
        System.out.println("Salario de empleado");
        var salarioEmpleado =  Double.parseDouble(consola.nextLine());

        //pedimos la edad del empleado
        System.out.println("Edad del empleado");
        var edadEmpoleado = Integer.parseInt(consola.nextLine());

        //Preguntamos si es jefe de departamento
        System.out.println(" eS jefe de departamento (True/False)");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Mandar de imprimir los valores
        System.out.println("\nDatos del empleado");
        System.out.println("\t Nombre empleado: "+nombreEMpleado);
        System.out.println("\t Edad empleado: "+edadEmpoleado);
        System.out.printf("\t Salario de empleado: $ %.2f%n", salarioEmpleado);
        System.out.println("\t Es jefe de departamento: "+esJefeDepartamento);


    }
}
