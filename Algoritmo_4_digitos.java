/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo_4_digitos;

import java.util.Scanner;

/**
 *
 * @author LB-PC
 */
public class Algoritmo_4_digitos {
    public static void main(String[] args) {
        // Solicitar los cuatro valores decimales
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicitar los cuatro valores decimales
            System.out.println("Ingrese el primer valor decimal:");
            double valor1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo valor decimal:");
            double valor2 = scanner.nextDouble();
            System.out.println("Ingrese el tercer valor decimal:");
            double valor3 = scanner.nextDouble();
            System.out.println("Ingrese el cuarto valor decimal:");
            double valor4 = scanner.nextDouble();
            // Calcular el producto de los dígitos 1 y 2
            double producto = valor1 * valor2;
            // Dividir el resultado por el dígito 3
            double resultadoIntermedio = producto / valor3;
            // Restar el cuarto valor al resultado intermedio
            double resultadoFinal = resultadoIntermedio - valor4;
            // Mostrar el resultado final
            System.out.println("El resultado final es: " + resultadoFinal);
            // Cerrar el scanner
        }
    }
}
