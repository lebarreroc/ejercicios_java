/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_java;

/**
 * Name: LUIS EDUARDO BARRERO CÓRDOBA
 * DATE :22/04/2024
 * CLASE: ENFASIS EN JAVA
 * CESDE
 * DESCRIPTION: Este algoritmo permite realizar un conteo de manera decremental desde 99 a 0 en pares 
 *
 * @author LB-PC
 */
public class ejercicio_while_3 {
    public static void main(String[] args) {
        int i = 100; // Inicializamos el contador en 100
        
        while (i >= 0) { // Mientras el contador sea mayor o igual a 0
            System.out.println(i); // Imprimimos el valor del contador
            i -= 2; // Decrementamos el contador en 2 en cada iteración para que sea en pares
        }
    }   
}

