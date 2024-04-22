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
 * DESCRIPTION: Este algoritmo permite realizar el calculo del área de un hexágono cuando
 * el usuario introduce el área 
 * 
 *
 * @author LB-PC
 */
public class area_hexagono {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Se solicita al usuario ingresar el valor del área del hexágono
        System.out.println("Ingresa la longitud del lado del hexágono:");
        double lado = scanner.nextDouble();
        // se indica en el algoritmo que area sera igual al calculo realizado en calculAreaHexagono
        double area = calcularAreaHexagono(lado);
        //Se imprime el resultado del calculo:
        System.out.println("El área del hexágono es: " + area);
        // Se cierra el scanner 
        scanner.close();
    }
    // variable que permite realizar el calculo sobre el apotema y así calcular el área del hexágono
    public static double calcularAreaHexagono(double lado) {
        return (3 * Math.sqrt(3) / 2) * Math.pow(lado, 2);
    }
}