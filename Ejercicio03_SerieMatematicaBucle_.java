//3.Crear un método vacío que calcule e imprima cada uno de los términos de la siguiente 
//serie (i*(i+1))^2 sin que la suma de los términos exceda un valor x ingresado por el 
//usuario.

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio03_SerieMatematicaBucle_ {
    
    public static void ejercicio3(Scanner scanner) {
        
        //Variables
        
        int i = 1;
        int serie;
        int sum = 0;
        int x;
        
        //Entrada
        
        System.out.println("Ingrese x (valor maximo permitido para el resultado de la serie)");
        x = scanner.nextInt();
        
        //Condición de Salida
        
        if (x < 4) {
        System.out.println("El valor de x debe ser al menos 4 para generar terminos de la serie.");
        return;
        }
        
        System.out.println("Terminos de la serie (i*(i+1))^2 sin exceder el resultado " + x + " : ");
        
        //Bucle (While)
        
        while(true){
            
            serie = (i * (i + 1)) * (i * (i + 1));
            
            if (sum + serie > x){
                break;
            }
            System.out.println("Serie "+ i +" : " + serie);
        
            sum += serie;
            i++;
            
        }
        
        //Salida
        
        System.out.println("Resultado total: " + sum);
        
    }
    
}
