
package Metodos01_Introducción;

import java.util.Scanner;

public class Metodos02_SumaConParametros_ {
    
     public void Sumar(int x , int y){   
         
        int suma = x + y;
        
         System.out.println("El Resultado es: "+suma);
        
    }

    public static void main(String[] args) {
        
        int n1,n2;
        
        Scanner scanner = new Scanner(System.in);
   
        System.out.println("Digite No1");
        n1 = scanner.nextInt();
        
        System.out.println("Digite No2");
        n2 = scanner.nextInt();
        
        //Instanciar Clase
        
        Metodos02_SumaConParametros_ met = new Metodos02_SumaConParametros_();
        
        met.Sumar(n1,n2);  
    }
    
}
