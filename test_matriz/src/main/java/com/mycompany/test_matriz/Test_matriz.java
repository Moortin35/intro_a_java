package com.mycompany.test_matriz;
import java.util.Scanner;

public class Test_matriz {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean centinela = false;
        int filas = 0;
        int columnas = 0;
    
    
        while(!centinela){
            System.out.println("Ingrese la cantidad de filas de la matriz: ");
            filas = teclado.nextInt();
            System.out.println("Ingrese la cantidad de columnas de la matriz: ");
            columnas = teclado.nextInt();
            if(filas > 0 && columnas > 0){
                centinela = true;
            }
        }
        System.out.println("La cantidad de filas de la matriz es: " +filas);
        System.out.println("La cantidad de columnas de la matriz son: " +columnas);
        
        int matriz [][]= new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Ingrese el elemento de la matriz:");
                matriz[i][j] = teclado.nextInt();
            }
        }
        //recorrido y muestra:
        System.out.println("------------------");    
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println("");
        }
        System.out.println("------------------");
    }
}
