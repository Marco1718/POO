package edu.marco.garcia.actividades.actividad1.ui;

public class CLI {
    public static void ShowMenu() {
        System.out.println("Welcome to marco's app");
        System.out.println("1. Muestra carro");
        System.out.println("2. Agrega carros");
    }

    public void ShowMessage(String message) {
        System.out.println(message);
    }

    public void ShowError(String message) {
        System.out.println("Error: "+message);
    }

    public void ShowCars(String[] cars) {
        for (String car : cars){
            System.out.println(car);
        }
    }    

}
