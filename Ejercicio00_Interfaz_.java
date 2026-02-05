//Nota: se debe implementar una estructura switch y para cada uno de los métodos realizar 
//el llamado en cada una de las opciones ( case ) para cada punto, si el usuario selecciona 
//una opción inválida se debe presentar de nuevo las opciones, crear clases diferentes. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio00_Interfaz_ {

    public static void main(String[] args) {
        
        //Scanner
        
        Scanner scanner = new Scanner(System.in);
        
        //Variables
        
        int opcion;
        
        //Entrada

        do {
            System.out.println("Por favor, elige una opcion:");
            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Opcion 4");
            System.out.println("5. Opcion 5");
            System.out.println("6. Opcion 6");
            System.out.println("7. Opcion 7");
            System.out.println("8. Opcion 8 (Salir)");
            
        // Leer la opción del usuario
        
        opcion = scanner.nextInt();
        
        // Estructura switch para manejar las opciones.
        
        switch (opcion){
            
                // SALARIOS
            
            case 1:
                System.out.println("Has seleccionado la opcion 1.(Salarios).");
                Ejercicio01_SalarioNetoEmpleados_.ejercicio1(scanner);
                break;
                
                // # PRIMOS
                
            case 2:
                System.out.println("Has seleccionado la opcion 2.(Numero Primos).");
                //Entrada 
                System.out.println("Digite 2 numeros x & y (x tiene que ser menor que y)");
                System.out.println("Digite x");
                int x = scanner.nextInt();
                System.out.println("Digite y");
                int y = scanner.nextInt();
                Ejercicio02_NumerosPrimosRango_.ejercicio2(x,y,scanner);
                break;
                
                // SERIE (i*(i+1))^2
                
            case 3:
                System.out.println("Has seleccionado la opcion 3.(Serie (i*(i+1))^2).");
                Ejercicio03_SerieMatematicaBucle_.ejercicio3(scanner);
                break;
                
                // FACTORIALES
                
            case 4:
                System.out.println("Has seleccionado la opcion 4.(!Factoriales!).");
                Ejercicio04_Factorial_.ejercicio4(scanner);
                break;
                
                // CUENTA BANCARIA
                
            case 5:
                System.out.println("Has seleccionado la opcion 5.($Cuenta Bancaria$).");
                String resultado = Ejercicio05_RetirosCuentaBancaria_.ejercicio5(scanner);
                //Retorno de salida
                System.out.println(resultado);
                break;
                
                // PATRON DE FIGURA 
                
            case 6:
                System.out.println("Has seleccionado la opcion 6.(*Figura*).");
                System.out.print("Ingrese el tamaño del cuadrado (n) *debe ser mayor que 0* ");
                //Entrada
                int j = scanner.nextInt();
                Ejercicio06_FiguraConAsteriscos_.ejercicio6(j,scanner);
                break;
                
                // MULTIPLOS DE 3,5 & 7
                
            case 7:
                System.out.println("Has seleccionado la opcion 7.(Multiplos de 3 , 5 & 7).");
                //Entrada
                System.out.println("Digite 2 numeros m & n (m tiene que ser menor que n)");
                System.out.println("Digite m");
                int m = scanner.nextInt();
                System.out.println("Digite n");
                int n = scanner.nextInt();
                Ejercicio07_MultiplosTresCincoSiete_.ejercicio7(m,n,scanner);
                break;
                
                // Opción de Salida del Programa
                
            case 8:
                System.out.println("Saliendo del programa...");
                break;
                
            default:
                
                // Opción invalida
                
                System.out.println("Has seleccionado una opcion invalida.");
        
        //El bucle sigue mientras que la opción no sea 8(salir)
        
            } 
        
        } while (opcion != 8); 

    }
    
}
