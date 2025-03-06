package edu.marco.garcia.actividades.proyecto.models;

/**
 * Clase que se encarga de gestionar los usuarios del sistema
 */
public class Users {

    private String username;
    private String password;
    private int age;
    private String name;
    private String tipo;
    private int vencimientos;
    private int entregados;
/**
 * 
 * @param username permite que el usuario se identifique
 * @param password le asigna una contraseña al usuario
 * @param age le asigna una edad al usuario
 * @param name le asigna el nombre real al usuario
 * @param tipo le asigna un tipo de usuario al usuario (teen, jr, vip, adulto)
 * @param entregados le asigna un contador de libros entregados al usuario
 * @param vencimientos le asigna un contador de vencimientos al usuario
 */

    public Users(String username, String password, int age, String name, String tipo, int entregados, int vencimientos) {
        setUsername(username);
        setPassword(password);
        setAge(age); 
        setName(name);
        setTipo(tipo);
        setEntregados(entregados);
        setVencimientos(vencimientos);
        
    }

    public int getVencimientos() {
        return vencimientos;
    }

    public int getEntregados() {
        return entregados;
    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }
    
    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getTipo() {
        return tipo;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setTipo(String tipo) {
        
        this.tipo = tipo;
    }

    public void setVencimientos(int vencimientos) {
        this.vencimientos = vencimientos;
    }

    public void setEntregados(int entregados) {
        this.entregados = entregados;
    }
}