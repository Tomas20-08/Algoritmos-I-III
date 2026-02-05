
package Case_InterfazUso;

public class Ejemplo02_Case01_Interfaz_ {
    
    public static void main(String[] args) {
        
        int day=7;
        
        String dayString;
        //Instrucción Switch con tipo de dato int
        switch (day)
        {
            case 1: dayString = "Lunes";
            break;
            case 2: dayString = "Martes";
            break;
            case 3: dayString = "Miercoles";
            break;
            case 4: dayString = "Jueves";
            break;
            case 5: dayString = "Viernes";
            break;
            case 6: dayString = "Sabdo";
            break;
            case 7: dayString = "Domingo";
            break;
            default: dayString = "Dia Invalido";
            break;
        }
            System.out.println(dayString);
    }
    
}
