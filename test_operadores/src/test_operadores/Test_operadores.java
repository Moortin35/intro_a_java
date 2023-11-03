
package test_operadores;


public class Test_operadores {

    public static void main(String[] args) {
        int num1, num2, num3, resultado;
        num1= 4;
        num2 = 2;
        num3 = 5;
        
        resultado = num1 + num2;
        System.out.println("el resultado de la suma es: "+ resultado);
        resultado = num1 * num3;
        System.out.println("el resultado del producto es: "+ resultado);
        resultado = num1 / num2;
        System.out.println("el resultado de la division es: "+ resultado);
        resultado = num3 - num2;
        System.out.println("el resultado de la resta es: "+ resultado);
        
        /*ejemplo de swap*/
        
        int a = 23;
        int b = 50;
        int aux;
        
        System.out.println("Valores previos al swap, a: "+a+" y b: "+b);
        aux = a;
        a = b;
        b = aux;
        System.out.println("Valores posteriores al swap, a: "+a+" y b: "+b);
        
    }
}
