package ejercicio_arbolito_de_navidad;
import java.util.Scanner;

/*
Queremos construir un arbol de navidad, para eso necesitamos tener en cuenta
las filas y los espacios:
Filas 4
Espacios
    Arranca de Filas -1
    Termina en 0
Asteriscos
    1, 3, 5, 7, 9 ...
*/

public class Ejercicio_arbolito_de_navidad {

    public static void main(String[] args) {
        //declarar la altura del arbol
        int altura = 10;
        
        //bucle para recorrer todas las filas(altura)
        for(int fila = 0; fila < altura; fila++){
            //bucle para espacios
            for (int espacio = 0; espacio < (altura-fila-1); espacio++) {
                System.out.print(" ");
            }
            for (int asterisco = 0; asterisco < (fila*2)+1; asterisco++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        //tronco
        int largoTronco = 2;
        for (int base=0; base<largoTronco; base++) {

            //espacios en blanco
            for (int espacio=0;espacio<(altura-2);espacio++) {
                System.out.print(" ");
            }

            //barritas tronco
            for (int tronco=0; tronco<3; tronco++) {
                System.out.print("|");
            }
            System.out.println("");
        }
        
    }   
}
