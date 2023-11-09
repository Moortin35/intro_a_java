package com.mycompany.test_array_recorrido;
import java.util.Scanner;


public class Test_array_recorrido {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean centinela = false;
        int tamaño = 0;
    
        while(!centinela){
            System.out.println("Ingrese el tamaño del arreglo: ");
            tamaño = teclado.nextInt();
            if(tamaño > 0){
                centinela = true;
            }
        }
        System.out.println("El tamaño de arreglo ingresado es: "+tamaño);
        int arreglo []= new int[tamaño];
        for (int i = 0; i < tamaño; i++) {
            System.out.println("Ingrese el elemento del indice: "+i);
            arreglo[i] = teclado.nextInt();
        }
        //recorrido y muestra:
        for (int i = 0; i < tamaño; i++) {
            System.out.println("------------------");
            System.out.println("Estoy el indice: "+i);
            System.out.println("El elemento es: "+arreglo[i]);
        }
        System.out.println("------------------");
    }
}
