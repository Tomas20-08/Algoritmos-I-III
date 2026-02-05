
//Crear un método vacío que imprima  los datos para n empleados  (nombres, apellidos 
//y la edad)  ingresado por teclado e imprimir el salario neto a partir de un salario básico, 
//No de Horas Extra, la hora extra se incrementa en 25% con respecto al valor de la hora 
//normal, imprimir el mayor, el menor y el promedio de los salarios netos calculados. 
//Implementar un método vacío en donde se envían los argumentos y recibe parámetros. 

package Metodos04_Interfaz02;

import java.util.Scanner;

public class Metodos07_Interfaz02_ {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
                
        int opcion;

        do {
            System.out.println("Porfavor, elige una opcion");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
        // Leer la opción del usuario
        
        opcion = scanner.nextInt();
        
        // Estructura switch para manejar las opciones.
        switch (opcion){
            case 1:
                System.out.println("Has seleccionado la opcion 1. (Salario)");
                Metodos08_SalarioNeto_.opcion1(scanner);
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2.");
                break;
            case 3:
                System.out.println("Has seleccionado la opcion 3.");
                break;
            case 4:   
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Has seleccionado una opcion invalida");
        
        //El bucle sigue mientras que la opción no sea 4(salir)
        
        } 
        }while (opcion !=4); 
           
        
    }

}
