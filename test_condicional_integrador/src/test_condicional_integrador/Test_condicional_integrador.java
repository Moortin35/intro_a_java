
package test_condicional_integrador;
import java.util.Scanner;

public class Test_condicional_integrador {

    public static void main(String[] args) {
        double sueldo;
        int categoria;
        
        
        while(true){
            
            System.out.println("Ingrese el tipo de categoria que desea calcular el sueldo");
            Scanner teclado = new Scanner (System.in);
            categoria = teclado.nextInt();
            if (categoria == 1){
                sueldo = 15890 + (15890*0.10);
                System.out.println("El total de sueldo para la categoria seleccionada "+ sueldo);
                break;
            }
            else if(categoria == 2){
                sueldo = 25630.89;
                System.out.println("El total de sueldo para la categoria seleccionada "+ sueldo);
                break;
            }
            else if(categoria == 3){
                sueldo = 35560.20 - (35560.20*0.11);
                System.out.println("El total de sueldo para la categoria seleccionada "+ sueldo);
                break;
            }
            else{
                System.out.println("La categoria ingresada es incorrecta, ingrese nuevamente");
            }
        }
        
    }
    
}
