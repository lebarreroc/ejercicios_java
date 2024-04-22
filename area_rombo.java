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
 * DESCRIPTION: Este algoritmo permite realizar el calculo del área de un rombo cuando
 * el usuario introduce la diagonal mayor y la diagonal menor 
 * 
 *
 * @author LB-PC
 */

public class area_rombo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Se solicita al usuario ingresar las diagonales del rombo
        System.out.println("Ingresa la diagonal mayor del rombo:");
        double diagMayor = scanner.nextDouble();
        
        System.out.println("Ingresa la diagonal menor del rombo:");
        double diagMenor = scanner.nextDouble();
        
        // Se calcula el área del rombo utilizando la fórmula y se almacena en la variable "area"
        double area = calcularAreaRombo(diagMayor, diagMenor);
        
        // Se imprime el resultado del cálculo
        System.out.println("El área del rombo es: " + area);
        
        // Se cierra el scanner 
        scanner.close();
    }  
    
    // Método para calcular el área del rombo
    public static double calcularAreaRombo(double diagMayor, double diagMenor) {
        return diagMayor * diagMenor / 2;
    }   
}


