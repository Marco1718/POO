package edu.marco.garcia.actividades.actividad2.ui;

import java.util.Scanner;

import edu.marco.garcia.actividades.actividad2.process.NameValidator;
import edu.marco.garcia.actividades.actividad2.process.NumberGenerator;

public class CLI2 {
    /**
     * despliega el menú de la aplicación
     */
    public static void showChat(){
        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║            MENÚ              ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Validador de nombres      ║");
        System.out.println("║ 2. Demo Números              ║");
        System.out.println("║ 3. Salir                     ║");
        System.out.println("╚══════════════════════════════╝");
    }

    /**
     * Hace correr la aplicación en un bucle
     * 
     * Este método muestra un menú y ejecuta la acción que el usuario seleccionó, como:
     *  1. Validar un nombre ingresado por el usuario
     *  2. Mostrar una demo de números pares
     *  3. salir de la aplicación
     */
    public static void runApp(){
        showChat();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while(opcion != 3){
            switch (opcion) {
                case 1 -> {
                    System.out.println("\nDime un nombre:\n");
                    String name = scanner.nextLine();
                    if(NameValidator.validateName(name)){
                        System.out.println("\nSi está en la base de datos!!\n");
                    } else {
                        System.out.println("\n No esta en la base de datos :(\n");
                    }
                }
                case 2 -> {
                    System.out.println("\nNúmeros pares registrados:");
                    NumberGenerator.numerosPares();
                }
                default -> {
                    System.out.println("Opción no válida. Intenta de nuevo.");
                }
            }
            showChat();
            opcion = scanner.nextInt();scanner.nextLine();
        }
        System.out.println("¡Gracias por usar la aplicación!");
    }
}

