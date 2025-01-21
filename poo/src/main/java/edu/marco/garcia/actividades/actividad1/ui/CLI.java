package edu.marco.garcia.actividades.actividad1.ui;

import java.util.Scanner;

import edu.marco.garcia.actividades.actividad1.models.Car;
import edu.marco.garcia.actividades.actividad1.process.StockManager;

/**
 * @param scanner en este retiene la información sobre el carro
 */
public class CLI {
    public static void runApp(){
        try (Scanner scanner = new Scanner(System.in)) {
            StockManager stockManager = new StockManager();
            showMenu();
            int opcion = scanner.nextInt();scanner.nextLine();

            while (opcion!=3){
                switch (opcion){
                    case 1 -> {
                        System.out.println("\nIntroduce el tipo de estereo (1-5)");
                        int estereo = scanner.nextInt();scanner.nextLine();
                        System.out.println("Introduce el color");
                        String color = scanner.nextLine();
                        System.out.println("Introduce el modelo");
                        String modelo = scanner.nextLine();
                        System.out.println("Introduce el marca");
                        String marca = scanner.nextLine();
                        stockManager.addCar(modelo,marca,estereo,color);
                    }
                    case 2 -> {
                        int auto=1;
                        for(Car car : stockManager.getStock()){
                            System.out.println("\nAuto"+auto+":");
                            System.out.println("    Modelo: "+car.getModelo());
                            System.out.println("    Color: "+car.getColor());
                            System.out.println("    Tipo de estereo: "+car.getEstereo());
                            System.out.println("    Marca: "+car.getMarca());
                            auto++;
                        }
                    }
                    default -> System.out.println("opcion no valida");
                }
                showMenu();
                opcion = scanner.nextInt();
            }
        }
    }
    public static void showMenu(){
        System.out.println("""
                \nMenu
                1. Agregar Carro al inventario
                2. Mostrar stock
                3. Salir
                """);
    }
}