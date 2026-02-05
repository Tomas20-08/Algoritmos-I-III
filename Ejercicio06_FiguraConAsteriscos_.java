//6. Crear un método vacío con parámetros enviados por el usuario que imprima la 
//siguiente figura, implementar ciclos anidados, no utilizar matriz, el tamaño lo define el 
//usuario, el numero de filas debe ser igual al número de columnas. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio06_FiguraConAsteriscos_ {
    
    public static void ejercicio6(int j,Scanner scanner) {
        
        //Variables
        
        int fil, col;
        
        //Condicion de Salida
        
        if (j <=0){
            System.out.println("El tamaño debe ser mayor que 0");
            return;
        }
        
        //Bucles anidados: (for)
        
        // Recorremos filas
        for (fil = 0; fil < j; fil++) {
            // Recorremos columnas
            for (col = 0; col < j; col++) {
                
                //Condionales +  Salidas

                if (fil == 0) {
                    System.out.print("* ");
                } else {
                    if (fil == j - 1) {
                        System.out.print("* ");
                    } else {
                        if (col == 0) {
                            System.out.print("* ");
                        } else {
                            if (col == j - 1) {
                                System.out.print("* ");
                            } else {
                                if (fil == col) {
                                    System.out.print("* ");
                                } else {
                                    if (fil + col == j - 1) {
                                        System.out.print("* ");
                                    } else {
                                        System.out.print("  ");
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.println();
        }      
    }
}

        