//1. Crear un método vacío que imprima los datos para n empleados (nombres, apellidos 
//y la edad)  ingresado por teclado e imprimir el salario neto a partir de un salario básico, 
//No de Horas Extra, la hora extra se incrementa en 25% con respecto al valor de la hora 
//normal, imprimir el mayor, el menor y el promedio de los salarios netos calculados. 
//Implementar un método vacío en donde se envían los argumentos y recibe parámetros. 

package TallerAlgoritmosCorte3;

import java.util.Scanner;

public class Ejercicio01_SalarioNetoEmpleados_ {
    
    public static void ejercicio1(Scanner scanner) {
        
        //Variables
        
        int n , edad , he;
        int i;
        double sb , sn;
        double vh , vhe;
        double sum = 0 , prom , men = 1000000000 ,may = 0;
        String nombres , apellidos;
        
        //Entrada
        
        System.out.println("Digite el numero de empleados a procesar");
        n = scanner.nextInt();
        
        //Bucle (for)
        
        for(i=1; i<=n; i++){
            
            //Información
            
            System.out.println("Empleado "+i);
            System.out.println("Digite Nombres del empleado: ");
            nombres = scanner.next();
            System.out.println("Digite Apellidos del empleado: ");
            apellidos = scanner.next();
            System.out.println("Digite Edad del empleado: ");
            edad = scanner.nextInt();
            System.out.println("Digite Salario Basico del empleado: ");
            sb = scanner.nextDouble();
            System.out.println("Digite las Horas Extras del empleado: ");
            he = scanner.nextInt();
            
            //Operaciones
            
            vh = (sb / 240);
            
            vhe = (vh * 1.25);
            
            sn = sb + (he * vhe);
            
            //Salidas
            
            System.out.println("Nombre: "+nombres);
            System.out.println("Apellidos: "+apellidos);
            System.out.println("Edad: "+edad);
            System.out.println("El Salario Neto del empleado "+ i +" es: " + sn);
            
            //Mayor & Menor
            
            if (sn > may){
                may = sn;
            }
            if(sn < men){
                men = sn;
            }    
                sum += sn;
        }
        
        //Operación
        
        prom = (sum / n);
        
        //Salidas
        
        System.out.println("Salario mayor: " + may);
        System.out.println("Salario menor: " + men);
        System.out.println("Promedio Salarios: " + prom);
           
    }
    
}