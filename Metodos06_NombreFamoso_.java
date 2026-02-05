
package Metodos03_Interfaz01;

import java.util.Scanner;

public class Metodos06_NombreFamoso_ {

    public static void opcion1(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String name = null;
        
        System.out.println("Ingrese su nombre");
        name = scanner.next();
        if(name.equals("Elvis"))
            System.out.println("You are the king of rock and roll");
        else if (name.equals("Michael Jackson"))
            System.out.println("You are the king of pop!!!");
        else
            System.out.println("You are not the king");

    }
    
}
