//5. Programar un método que retorne el número de veces que se saca dinero de una 
//cuenta bancaria , permitiendo retirar el dinero,  hasta que el saldo se agote o el usuario 
//decida salir, retornar el número de retiros y el valor del saldo. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio05_RetirosCuentaBancaria_ {
    
    public static String ejercicio5(Scanner scanner) {
        
        //Variables
        
        double sal,ret1;
        int ret = 0, option;
        
        //Entrada
        
        System.out.println("Ingrese el Saldo Inicial");
        sal = scanner.nextDouble();
        
        //Bucle (Do - While)
        
        do{
            
            //Condición de Salida
            
             if (sal <= 0) {
                System.out.println("No hay suficiente saldo, no se puede retirar mas.");
                break;
            }

            System.out.print("Ingrese el valor a retirar: ");
            ret1 = scanner.nextDouble();
            
            //Condicionales

            if (ret1 <= sal) {
                sal = sal - ret1;
                ret = ret + 1;
                System.out.println("Retiro exitoso. Saldo actual: " + sal);
            } else {
                System.out.println("Fondos insuficientes para ese retiro.");
            }
            
            //Opciones

            System.out.println("Desea realizar otro retiro?");
            System.out.println("1. Si");
            System.out.println("2. No");
            option = scanner.nextInt();
            
            //Ciclo anidado

            while (option != 1 && option != 2) {
                
                System.out.println("Opción invalida. Intente de nuevo.");
                System.out.println("1. Si");
                System.out.println("2. No");
                option = scanner.nextInt();
            }

        } while (option == 1 && sal > 0);

        // Salida
        
        return "Número total de retiros: " + ret + " Saldo final: " + sal;
            
        }
    
}