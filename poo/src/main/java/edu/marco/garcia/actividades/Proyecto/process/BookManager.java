package edu.marco.garcia.actividades.proyecto.process;

import java.util.ArrayList;

import edu.marco.garcia.actividades.proyecto.models.Book;

public class BookManager {

    ArrayList<Book> books;

    public BookManager(){
        this.books = new ArrayList<>();
        addBook("juego de tronos", "sadasd", "asdasd", true, 2008, "fantasia");
    }

    public void addBook(String title, String author, String isbn, boolean available, int year, String genre){
        Book newBook = new Book(title, author, isbn, available, year, genre);
        books.add(newBook);
    }

    public ArrayList<Book> getBooks(){
        return this.books;
    }
}