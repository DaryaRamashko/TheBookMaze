package com.kolyadko_polovtseva.book_maze.entity;

import java.io.Serializable;
import java.util.Set;

/**
 * Created by DaryaKolyadko on 26.11.2016.
 */
public class LibraryBook implements Serializable {
    private String idLibraryBook;
    private Book book;
    private Set<RegisterRecord> registerRecords;

    public String getIdLibraryBook() {
        return idLibraryBook;
    }

    public void setIdLibraryBook(String idLibraryBook) {
        this.idLibraryBook = idLibraryBook;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Set<RegisterRecord> getRegisterRecords() {
        return registerRecords;
    }

    public void setRegisterRecords(Set<RegisterRecord> registerRecords) {
        this.registerRecords = registerRecords;
    }
}