package edu.marco.garcia.actividades.actividad2.data;

public class Data {
    private String name;
    public static String[] nombres= {"Daniela", "Michel", "Victor", "Sebastian", "Humberto", "Jose", "Christian", "Saul", "Marco", "Maximo", "Angel", "Sergio", "Miguel", "Daniel", "Jesus", "Alejandro", "Liam", "Jairo", "Alex", "Angel", "Pablo", "Antonio", "Luis", "Carlos"};

        /**
         * 
         * @param name el nombre que se asignará al atributo 'name'
         */
    public Data(String name) {
        this.name = name;
    }
    /**
     * 
     * @return da el nombre almacenado en el atributo anterior
     */
    public String getName(){
        return name;
    }
    /**
     * 
     * @param name es el nuevo nombre que se le asignará al atributo
     */
    public void SetName(String name) {
        this.name = name;
    }
}
