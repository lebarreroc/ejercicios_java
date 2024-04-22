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
public class CajeroAutomatico {
    private static double saldo = 1000; // Saldo inicial

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int opcion;
            
            do {
                System.out.println("Bienvenido al Cajero Automático");
                System.out.println("1. Ver saldo");
                System.out.println("2. Retirar dinero");
                System.out.println("3. Depositar dinero");
                System.out.println("4. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                
                switch (opcion) {
                    case 1 -> verSaldo();
                    case 2 -> retirarDinero(scanner);
                    case 3 -> depositarDinero(scanner);
                    case 4 -> System.out.println("Gracias por usar el Cajero Automático. ¡Hasta luego!");
                    default -> System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                }
            } while (opcion != 4);
        }
    }

    private static void verSaldo() {
        System.out.println("Su saldo actual es: $" + saldo);
    }

    private static void retirarDinero(Scanner scanner) {
        System.out.print("Ingrese la cantidad a retirar: $");
        double cantidad = scanner.nextDouble();
        if (cantidad <= saldo && cantidad > 0) {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Su nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente o cantidad inválida.");
        }
    }

    private static void depositarDinero(Scanner scanner) {
        System.out.print("Ingrese la cantidad a depositar: $");
        double cantidad = scanner.nextDouble();
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Su nuevo saldo es: $" + saldo);
        } else {
            System.out.println("Cantidad inválida.");
        }
    }
}
