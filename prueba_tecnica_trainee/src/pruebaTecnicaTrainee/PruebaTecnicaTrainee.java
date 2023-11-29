package pruebaTecnicaTrainee;
import java.util.Scanner;

//Parte 1 de una prueba trainee donde se pide implementar un sistema de reservas.

public class PruebaTecnicaTrainee {
    
    public char[][] creacionMatriz(){

        // Creacion de la matriz antiteatro:
        char anfiteatro[][] = new char[10][10];

        // Incializacion de la matriz, con los asientos en "L" que significa
        //libre

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                anfiteatro[i][j] = 'L';
            }
        }
        return anfiteatro;
    }
    
    public void imprimirMatriz(char[][]matriz){
        //se va a imprimir una vez para demostrar como se ve. "L" representa los
        //asientos libres, mientras que "X" los ocupados.
        System.out.println("Asientos disponibles:");
        System.out.println("");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
    
    public void hacerReserva(char[][] anfiteatro){
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        int fila;
        int columna;
        System.out.println("");
        System.out.println("Desea hacer una reserva, conteste Y(si) o N(no):");
        char respuestaUsuario = teclado.next().charAt(0);
        while(true){

            if(respuestaUsuario == 'Y'){
                System.out.println("Indique que numero de fila quiere, indicando un numero del 1 al 10:");
                fila =teclado2.nextInt();
                if(fila > 0 && fila <= 10){
                    System.out.println("Indique que numero de columna quiere, indicando un numero del 1 al 10:");
                    columna =teclado2.nextInt();
                    if(columna > 0 && columna <= 10){
                        if(anfiteatro[fila-1][columna-1] == 'L'){
                            anfiteatro[fila-1][columna-1] = 'X';
                            System.out.println("La reserva ha sido solicitado con exito");
                            System.out.println("Desea hacer otra reserva? Conteste Y(si) o N(no)");
                            respuestaUsuario = teclado.next().charAt(0);
                            if(respuestaUsuario == 'N'){
                                System.out.println("Gracias por usar nuestro servicio, hasta luego");
                                break;
                            }
                        }
                        else{
                            System.out.println("El asiento esta ocupado, por favor seleccione otro.");
                        }
                    }
                    else{
                        System.out.println("El número de columna ingresado es incorrecto, intente de nuevo");
                    }
                }
                else{
                    System.out.println("El número de fila ingresado es incorrecto, intente de nuevo");
                }
                
            }
            else if(respuestaUsuario == 'N'){
                System.out.println("Gracias por usar nuestros servicios, hasta luego");
                break;
            }
            else{
                System.out.println("La opción ingresada es incorrecta, intente de nuevo.");
            }
        }
    }
    
    
    public static void main(String[] args) {
        //Creo una instancia de la clase
        PruebaTecnicaTrainee anfiteatro = new PruebaTecnicaTrainee();
        
        //Cargo el "mapa" del anfiteatro y hago una impresion en consola para 
        //mostrarle al usuario.
        char matrizAnfiteatro[][] = anfiteatro.creacionMatriz();
        
        //menu de control
        Scanner teclado3 = new Scanner(System.in);
        int centinela = 0;
        while(centinela != 3){
            System.out.println("Bievenido al sistema de reservas, vea las siguientes opciones."
                + " y elija cual realizar:");
            System.out.println("1. Ver asientos");
            System.out.println("2. Hacer una reserva");
            System.out.println("3. Salir");
            System.out.println("A continuacion ingrese un número para elegir su opción:");
            centinela = teclado3.nextInt();
            if(centinela == 1){
                anfiteatro.imprimirMatriz(matrizAnfiteatro);
            }
            else if(centinela == 2){
                anfiteatro.hacerReserva(matrizAnfiteatro);
            }
            else if(centinela == 3){
                System.out.println("Gracias por usar nuestro servicio, hasta luego");
            }
            else{
                System.out.println("Opción invalida, intente de nuevo.");
            }
        }
    }
}
