/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_java;

import static clase_java.area_hexagono.calcularAreaHexagono;
import java.util.Scanner;

/**
 * Name: LUIS EDUARDO BARRERO CÓRDOBA
 * DATE :22/04/2024
 * CLASE: ENFASIS EN JAVA
 * CESDE
 * DESCRIPTION: Este algoritmo permite realizar el calculo del área de un hexágono cuando
 * el usuario introduce el área 
 * 
 *
 * @author LB-PC
 */
public class area_triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Se solicita al usuario ingresar la base y la altura del triángulo
        System.out.println("Ingresa la base del triángulo:");
        double base = scanner.nextDouble();
        
        System.out.println("Ingresa la altura del triángulo:");
        double altura = scanner.nextDouble();
        
        // Se calcula el área del triángulo utilizando la fórmula y se almacena en la variable "area"
        double area = calcularAreaTriangulo(base, altura);
        
        // Se imprime el resultado del cálculo
        System.out.println("El área del triángulo es: " + area);
        
        // Se cierra el scanner 
        scanner.close();
    }  
    
    // Método para calcular el área del triángulo
    public static double calcularAreaTriangulo(double base, double altura) {
        return base * altura / 2;
    }   
}
