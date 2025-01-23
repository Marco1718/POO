package edu.marco.garcia.actividades.actividad2.retos;

public class MenorNumero {
    public static void main(String[] args) {
        int[] numbers = {10, 5, 3, 7, 2, 8, 1, 100, -1}; 

        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("El número más pequeño es: " + min);
    }
}
