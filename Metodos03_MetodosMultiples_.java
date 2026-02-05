
package Metodos02_Uso;

import java.util.Scanner;

public class Metodos03_MetodosMultiples_ {
    
    //Metodo 1
    
    public void Saludar(){
        System.out.println("Hola Mundo!");
    } 
    
    public void Sumar(int x , int y){ 
        int suma=0;
                suma = (x+y);
        System.out.println("La Suma es..."+suma);
}
    
    public int Multi(int x , int y){
    int res = 0;
    res = (x*y);
    return res;
    }

    public static void main(String[] args) {
        
        //Metodo 1

        Scanner scanner = new Scanner(System.in);
        
        //Instanciar clase
        
        Metodos03_MetodosMultiples_ me3 = new Metodos03_MetodosMultiples_();
        Metodos04_MensajeLigado_ me4 = new Metodos04_MensajeLigado_();
        me3.Saludar();        
        me4.Saludar();
        
        //Metodo 2
        
        System.out.println("Digite No1");
        int n1 = scanner.nextInt();
        System.out.println("Digite No2");
        int n2 = scanner.nextInt();
        
        me3.Sumar(n1,n2);
        
        // Metodo 3
        
        int mul=me3.Multi(n1,n2);
        System.out.println("La multiplicación es..."+mul);
        
        
    }
    
}
