package ejercicio_estructura_repetitiva;
import java.util.Scanner;
/*En la ciudad de Oberá, Misiones se realiza año a año la "Maratón del
inmigrante" en el marco de la fiesta nacional del inmigrante. 
El evento cuenta con un dia de inscripciones el dia anterior a la carrera,
por a haber. Desde la federacion de coelctividades (organismo que organiza),
manifestaron que se solicitan los siguientes fatos para la inscripcion de cada
participante: dni, nombre y edad.
En cuanto a las categoria posibles para una inscripcion, se manejan las siguientes:

Menores A (de 6 a 10 años)
Menores B (de 11 a 17 años)
Juveniles (de 18 a 30 años)
Adultos (de 31 a 50 años)
Adultos mayores (mayores ed 50 años)

Se necesita un programa que, a partir del ingreso de los datos y edad de cada
participante, se muestre por pantalla a que categoria debe ser inscripto.
Cabe destacar que, al finalizar el dia, para dar a fin a las inscripciones,
se debe ingresar un dni con el valor 0, 

*/
public class Ejercicio_estructura_repetitiva {
    //Pedir datos a las personas, dni, nombre y edad
    //Determinar a que categoria se tiene que inscribir
    //Informarle a la persona
    //No sabemos la candiad de personas
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        
        System.out.println("Ingrese el DNI de la persona:");
        String dni = teclado.nextLine();
        
        System.out.println("Ingrese el nombre de la persona:");
        String nombre = teclado.nextLine();
        
        System.out.println("Ingrese la edad de la persona:");
        int edad = teclado2.nextInt();
        
        while(!dni.equals("0") && !nombre.equalsIgnoreCase("fin")){
            if (edad >= 6 && edad <=10) {
                System.out.println("La categoría es Menores A");
            }
            else if(edad >= 11 && edad <=17){
                System.out.println("La categoría es Menores B");
            }
            else if(edad >= 18 && edad <=30){
                System.out.println("La categoría es Juveniles");
            }
            else if(edad >= 31 && edad <=50){
                System.out.println("La categoría es Adultos");
            }
            else if(edad >= 50 && edad <=70){
                System.out.println("La categoría es Adultos Mayores");
            }
            else{
                System.out.println("Ingreso una edad incorrecta");
            }
            System.out.println("Ingrese el DNI de la persona:");
            dni = teclado.nextLine();

            System.out.println("Ingrese el nombre de la persona:");
            nombre = teclado.nextLine();

            System.out.println("Ingrese la edad de la persona:");
            edad = teclado2.nextInt();
        }
    }
    
}