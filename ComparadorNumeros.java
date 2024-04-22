/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package algoritmo_4_digitos;
import java.util.Scanner;

/**
 *
 * @author LB-PC
 */
public class ComparadorNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los dos números decimales
        System.out.println("Ingrese el primer número decimal:");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número decimal:");
        double numero2 = scanner.nextDouble();

        // Comparar los números y mostrar el resultado
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        } else if (numero1 < numero2) {
            System.out.println(numero1 + " es menor que " + numero2);
        } else {
            System.out.println(numero1 + " y " + numero2 + " son iguales");
        }

        // Cerrar el scanner
        scanner.close();
    }
}