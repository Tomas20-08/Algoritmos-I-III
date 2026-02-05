//2.Crea un solo método vacío que cuente e imprima los números primos en un rango de numeros
//entre (x , y), validar que x sea inferior a y. para la solución de este ejercicio se necesitan 
//dos ciclos, codificar implementado un ciclo for y un while. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio02_NumerosPrimosRango_ {
    
    public static void ejercicio2(int x, int y, Scanner scanner) {
        
    //Variables
    
    int i , divisor , cont , primo = 0;

    // ¿(x > y)? Condicion de Salida
    
    if (x >= y) {
            System.out.println("Invalido x debe ser menor que y");
            return;
    } 
    
        System.out.println("Numeros Primos en el intervalo de " + x + " & " + y + ": ");
       
    //Bucle 1 }(for)
    
    for (i = x; i<= y; i++){
        
        if (i < 2)
            continue;
    
        divisor = 1;
        
        cont = 0;
        
        //Bucle 2 (While)
        
        while(divisor <= i){
            
            if(i % divisor == 0){
                
                cont++;
                
            }
            
            divisor++;
            
        }
    
       if(cont == 2){
           
           //Salidas
           
           System.out.println(i + " es primo ");
           primo++;
           
       }     
    
    }
    
    //Salidas
    
        System.out.println("Total de numeros primos en el rango de x: " + x + " & y "+ y + " : " + primo);
    
}

}