
package Case_InterfazUso;

import java.util.Scanner;

public class Ejemplo03_Case02_Interfaz_ {

    public static void main(String[] args) {
        
        String dia;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduce el dia de la semana: ");
        dia = scanner.next();
        
        switch(dia.toLowerCase()) {
            case "lunes":
                System.out.println("Hoy es Lunes.");
                break;
                case "martes":
                System.out.println("Hoy es Martes.");
                break;
                case "miercoles":
                System.out.println("Hoy es Miercoles.");
                break;
                case "jueves":
                System.out.println("Hoy es Jueves.");
                break;
                case "viernes":
                System.out.println("Hoy es Viernes.");
                break;
                case "sabado":
                System.out.println("Hoy es Sabado.");
                break;
                case "domingo":
                System.out.println("Hoy es Domingo.");
                break;
                default:
                System.out.println("Día no válido. Por favor ingresa un día de la semana válido.");
                
        }
        

    }
    
}
