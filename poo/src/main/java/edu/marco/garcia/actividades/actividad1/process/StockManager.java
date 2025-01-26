package edu.marco.garcia.actividades.actividad1.process;

import java.util.ArrayList;
import java.util.List;

import edu.marco.garcia.actividades.actividad1.models.Car;

public class StockManager {
    ArrayList<Car> stock;

    public StockManager() {
        this.stock = new ArrayList<>();
    }
    
    /**
     * @param modelo El año fabricación del auto
     * @param marca La marca del carro
     * @param estereo El tipo de estereo del carro (1-5)
     * @param color El color del carro (Gris, Blanco, Negro y Rojo)
     */

    public void addCar(String modelo, String marca, int estereo, String color){
        Car car= new Car(modelo,marca,estereo,color);
        stock.add(car);

    }
/**
 * 
 * @return Regresa una lista con todo el stock en la memoria
 */
    public List<Car> getStock(){
        return this.stock;
    }
}