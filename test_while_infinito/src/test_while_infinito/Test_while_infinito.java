
package test_while_infinito;
import java.util.Scanner;

public class Test_while_infinito {

    public static void main(String[] args) {
        int numeraco = 0;
        Scanner teclado = new Scanner(System.in);
        while(true){
            
             System.out.println("adivine el numero, pruebe ingresando un"
                     + " numero cualquiera");
             numeraco = teclado.nextInt();
             if(numeraco == 20){
                 System.out.println("yay adivinaste el numerado, era 20");
                 break;
             }
             else{
                 System.out.println("Buen intento, try again");
             }
         }
    }
}
