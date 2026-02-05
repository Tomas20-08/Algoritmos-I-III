
package Metodos04_Interfaz02;

import java.util.Scanner;

public class Metodos08_SalarioNeto_ {

    public static void opcion1(Scanner scanner) {
        String nombres, apellidos;
        int he;
        double sb, sn;

        System.out.println("Digite el número de empleados:");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Digite Apellidos del empleado " + i + ":");
            apellidos = scanner.next();

            System.out.println("Digite Nombres del empleado " + i + ":");
            nombres = scanner.next();

            System.out.println("Digite No. Horas Extras:");
            he = scanner.nextInt();

            System.out.println("Digite Salario Básico del empleado:");
            sb = scanner.nextDouble();

            double valorHora = sb / 240; 
            double valorHoraExtra = valorHora * 1.25;
            sn = sb + (valorHoraExtra * he);

            System.out.println("Nombre: " + nombres);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("El salario neto del empleado es: " + sn);
        }
    }
}