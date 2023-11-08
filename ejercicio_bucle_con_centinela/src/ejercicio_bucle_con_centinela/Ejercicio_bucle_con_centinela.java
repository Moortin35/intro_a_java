package ejercicio_bucle_con_centinela;
import java.util.Scanner;

//Realizar un programa que muestre en pantalla palabras que sean ingresadas
//por teclado hasta que se ingrese la palabra salir
public class Ejercicio_bucle_con_centinela {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra = teclado.next();
        System.out.println("La palabra es: "+ palabra);
        while(!palabra.equals("salir")){
            System.out.println("Ingrese una palabra: ");
            palabra = teclado.next();
            System.out.println("La palabra es: "+ palabra);
        }
    }
}
