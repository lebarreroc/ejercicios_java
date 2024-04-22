/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package algoritmo_4_digitos;

import java.util.Scanner;

/**
 * Name: LUIS EDUARDO BARRERO CÓRDOBA
 * DATE :22/04/2024
 * CLASE: ENFASIS EN JAVA
 * CESDE
 * DESCRIPTION: Este algoritmo permite realizar una serie de calculos entre cuatro(4) números decimales ingresados por el usuario
 * para los primeros dos número se realizara una multiplicación, el resultado de esta sera dividido por el tercer digito ingresado
 * el resultado de esta operación se le restara el cuarto digito ingresado
 * 
 *
 * @author LB-PC
 */
public class Algoritmo_4_digitos {
    public static void main(String[] args) {
        //
        try (Scanner scanner = new Scanner(System.in)) {
            // Se solicitan al usuario los 4 digitos en valores decimales
            System.out.println("Ingrese el primer valor decimal:");
            double valor1 = scanner.nextDouble();
            System.out.println("Ingrese el segundo valor decimal:");
            double valor2 = scanner.nextDouble();
            System.out.println("Ingrese el tercer valor decimal:");
            double valor3 = scanner.nextDouble();
            System.out.println("Ingrese el cuarto valor decimal:");
            double valor4 = scanner.nextDouble();
            // Se genera el primer calculo entre las dos variables 
            double producto = valor1 * valor2;
            // 
            double resultadoIntermedio = producto / valor3;
            // 
            double resultadoFinal = resultadoIntermedio - valor4;
            // 
            System.out.println("El resultado final es: " + resultadoFinal);
            // 
        }
    }
}
