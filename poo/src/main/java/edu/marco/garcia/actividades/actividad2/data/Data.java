package edu.marco.garcia.actividades.actividad2.data;

public class Data {
    private String name;
    public static String[] nombres= {"Maria", "Pepe", "Manuel", "Regina", "Jaime"};

    public Data(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }
}
