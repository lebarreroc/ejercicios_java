/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_java;
import java.util.Scanner;

/**
 * Name: LUIS EDUARDO BARRERO CÓRDOBA
 * DATE :22/04/2024
 * CLASE: ENFASIS EN JAVA
 * CESDE
 * DESCRIPTION: Este algoritmo permite realizar una secuencia de manera piramidal teniendo en cuenta el número ingresado por el usuario
 * EJEMPLO: USUARIO INGRESA :5
 * 
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 1234
 * 123
 * 12
 * 1
 */
public class ejercicio_for_piramide {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();
        // Imprimir la parte superior de la pirámide
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    // Imprimir la parte inferior de la pirámide
        for (int i = numero - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
}
}




        

        

        
    

