package edu.marco.garcia.actividades.actividad2.ui;

import java.util.Scanner;

import edu.marco.garcia.actividades.actividad2.process.NameValidator;

public class CLI2 {
    
    public static void showChat(){
        System.out.println("╔══════════════════════════════╗");
        System.out.println("║            MENÚ              ║");
        System.out.println("╠══════════════════════════════╣");
        System.out.println("║ 1. Validador de nombres      ║");
        System.out.println("║ 2. Demo Números              ║");
        System.out.println("║ 3. Salir                     ║");
        System.out.println("╚══════════════════════════════╝");
    }

    public static void runApp(){
        showChat();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();scanner.nextLine();
        while(opcion!=3){
            switch (opcion) {
                case 1 -> {
                    System.out.println("\nDime un nombre:\n");
                    String name =scanner.nextLine();
                    if(NameValidator.validateName(name)){
                        System.out.println("Orale, si existe\n");
                    }else{
                        System.out.println("A ese no lo conozco, viejo\n");
                    }
                }
                default -> {
                }
            }
            showChat();
            opcion = scanner.nextInt();scanner.nextLine();
        }
    }
    
}
