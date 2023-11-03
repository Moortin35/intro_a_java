
package test_condicional;

public class Test_condicional {

    public static void main(String[] args) {
        int num1, num2, num3, num4;
        boolean resultado = false;
        num1= 4;
        num2 = 2;
        num3 = 5;
        num4 = 2;
        if (num1 > num2){
            resultado = true;
        }
        System.out.println("los valores de num1 y num2 son: "+ num1+ ", "+num2);
        System.out.println("el resultado de de si num1 es mayor a num2: "+ resultado);
        
        if (num1 > num3){
            resultado = true;
        }
        else{
            resultado = false;
        }
        System.out.println("los valores de num1 y num3 son: "+ num1+ ", "+num3);
        System.out.println("el resultado de de si num1 es mayor a num3: "+ resultado);
        
        if (num2 > num4){
        System.out.println("num2 es mayor a num4");
        }
        else if(num2 == num4){
            System.out.println("num2 es igual a num4");
        }
        else{
            System.out.println("num2 es menor a num4");
        }
        
 
        
        
    }
    
}
