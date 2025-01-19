package edu.marco.garcia.actividades.actividad1.models;

public class Car {
    private String modelo;
    private String marca;
    private int estereo;
    private String color;

    @Override
    public String toString() {
        return "Car{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", estereo=" + estereo +
                ", color='" + color + '\'' +
                '}';
    }
    
    public Car(String modelo, String marca, int estereo, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        setEstereo(estereo);

    }
    /**
     * @return Retorna el tipo de estereo del carro, entre 1 y 5
     */

    public int getEstereo() {return estereo; }

    /**
     * @throws IllegalArgumentException Si el tipo de estereo no está en el rango de 1 a 5
     */

    public void setEstereo(int estereo) {
        if(estereo<1 || estereo>5){
            throw new IllegalArgumentException("tipo de estereo esta entre 1 y 5");
        }

        this.estereo = estereo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
