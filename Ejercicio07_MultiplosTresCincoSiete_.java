//7. crear un método vacío que imprima los números entre m y n que sean múltiplos de 3, 
//5 y 7, usando bucles anidados, el usuario digita m y n,  validar que m es menor a n. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio07_MultiplosTresCincoSiete_ {
    
    public static void ejercicio7(int m , int n , Scanner scanner) {
        
        //Variables
        
        int i,cont = 0;
        
        // ¿(m < n)? Condición de Salida
        
        if (m >= n) {
            System.out.println("Invalido m debe ser menor que n");
            return;
        }
        
        System.out.println("Numeros entre el intervalo de " + m + " y " + n + " que son multiplos de 3 , 5 y 7:");
        
        for(i = m; i <= n; i++) {
            
             // Contadores para múltiplos
              int mult3 = 0;
              int mult5 = 0;
              int mult7 = 0;

            // Verificar múltiplo de 3 con bucle anidado

            for (int j = 1; j <= i; j++) {
                if (3 * j == i) {
                    mult3 = 1;
                    break;
                }
            }

            // Verificar múltiplo de 5 con bucle anidado
            for (int j = 1; j <= i; j++) {
                if (5 * j == i) {
                    mult5 = 1;
                    break;
                }
            }

            // Verificar múltiplo de 7 con bucle anidado
            for (int j = 1; j <= i; j++) {
                if (7 * j == i) {
                    mult7 = 1;
                    break;
            
                        }
                    }    
            
                // Si es múltiplo de los tres (3,5 & 7)
            if (mult3 == 1 && mult5 == 1 && mult7 == 1) {
                System.out.println(i);
                cont++;
            
                }
            }
        
        //Salida
            
            System.out.println("Total de numero multiplos de 3,5 & 7 en el intervalo de " + m + " & " + n + " : " + cont);
            
        }
    }
    
