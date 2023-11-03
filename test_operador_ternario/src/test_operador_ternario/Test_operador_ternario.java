package test_operador_ternario;
import java.util.Scanner;

public class Test_operador_ternario {


    public static void main(String[] args) {
        double promedio;
        String condicionFinal;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el promedio general del alumno");
        promedio = teclado.nextDouble();
        
        condicionFinal = (promedio>=6) ? "Aprobado" : "Desaprobado";
        System.out.println("El alumno esta " + condicionFinal);
    }
    
}
