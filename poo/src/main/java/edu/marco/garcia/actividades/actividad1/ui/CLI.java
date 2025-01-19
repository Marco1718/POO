package edu.marco.garcia.actividades.actividad1.ui;

import java.util.Scanner;

public class CLI {
    public static void showMenu() {
        System.out.println("Welcome to marco's app");
        System.out.println("1. Muestra carro");
        System.out.println("2. Agrega carros");
    }

    public void showMessage(String message) {
        System.out.println(message);
    }

    public void showError(String message) {
        System.out.println("Error: "+message);
    }

    public void showCars(String[] cars) {
        for (String car : cars){
            System.out.println(car);
        }
    }  
    
    public static void runApp() {
        showMenu();
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();
        while (opcion!=3){
            switch (opcion) {
                case 1 -> System.out.println("Introduce el numero de puertas");
                case 2 -> System.out.println("Introduce el color");
                default -> System.out.println("opcion no valida");
            }
            showMenu();
            opcion = scanner.nextInt();
        }
    }
   
}

