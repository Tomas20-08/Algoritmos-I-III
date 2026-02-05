//4. Implementar un método vacío  que calcule el factorial de un número ingresado por 
//teclado,  . Para calcular el factorial, ejemplo, si introducimos un 5, se realizará esta 
//operación  y se imprimirá lo siguiente: Factorial de 5 = operación 5*4*3*2*1=120.  

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio04_Factorial_ {
    
    public static void ejercicio4(Scanner scanner) {
        
        //Variables
        
        int n , i;
        int factorial = 1;
        
        //Entrada
        
        System.out.println("Ingrese un numero positivo para calcular su factorial");
        n = scanner.nextInt();
        
        //Condición de Salida
        
        if(n < 0){
            System.out.println("El factorial no está definido para números negativos");
            return;
        }
        
        System.out.println("El factorial de " + n + "! es: ");
        
        //Bucle (For)
        
        for (i = n; i >= 1; i--) {
            factorial *= i;
            System.out.print(i);
            if (i != 1) {
                System.out.print("*");
            }
        }
        
        //Salida
        
        System.out.println(" = " + factorial);
        
    }
    
}
