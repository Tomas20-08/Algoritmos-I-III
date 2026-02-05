
package Metodos03_Interfaz01;

import java.util.Scanner;

public class Metodos05_Interfaz01_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcion;
        Metodos05_Interfaz01_ pr = new Metodos05_Interfaz01_();//instanciar clase
        do {
            System.out.println("Por favor, elige una opción:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.println("4. Salir");
            // Leer la opción del usuario
            opcion = scanner.nextInt();
            // Estructura switch para manejar las opciones
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1.");
                    Metodos06_NombreFamoso_.opcion1(args);
                    scanner.next();
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2.");
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3.");
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingresa una opción válida.");
                    break;
            }
        } while (opcion != 4); // El bucle sigue mientras la opc

    }
    
}
