package numeros_limite;
import java.util.Scanner;

//Tenemos un limite hasta el que tenemos que contar
//Ingresar ese limite

public class Numeros_Limite {

    public static void main(String[] args) {
        System.out.println("Ingrese el limite hasta que se quiere contar");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        for(int i = 1; i <= limite; i++){
            System.out.println(""+i);
        }
    }
    
}
