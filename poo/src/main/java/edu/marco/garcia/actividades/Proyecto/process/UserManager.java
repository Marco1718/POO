package edu.marco.garcia.actividades.proyecto.process;

import java.util.ArrayList;

import edu.marco.garcia.actividades.proyecto.models.Users;

public class UserManager {

    ArrayList<Users> users;
    

    public UserManager(){
        this.users = new ArrayList<>();
        addUser("admin", "admin");
    }

    public void addUser(String username, String password){
        Users newUser = new Users(username, password);
        users.add(newUser);
    }

    public ArrayList<Users> getUsers(){
        return this.users;
    }

    public boolean validateUser(String username, String password) {
        for (Users user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isFirstUser(String username) {
        return !users.isEmpty() && users.get(0).getUsername().equals(username);
    }
    
    public void lendBookToUser(String username, String bookTitle){
        for(Users user : users){
            if (user.getUsername().equals(username)) {
                user.lendBook(bookTitle);
                break;
            }
        }
    }

    public ArrayList<String> getBorrowedBooks(String username){
        for(Users user : users){
            if (user.getUsername().equals(username)) {
                return user.borrowedBooks;

            }
        }
        return new ArrayList<>();
    }
}

