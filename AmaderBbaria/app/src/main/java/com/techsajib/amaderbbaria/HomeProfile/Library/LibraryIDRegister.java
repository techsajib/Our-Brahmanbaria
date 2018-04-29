package com.techsajib.amaderbbaria.HomeProfile.Library;

/**
 * Created by User on 1/3/2018.
 */

public class LibraryIDRegister {
    private int id;
    private int logo;
    private String library;
    private String placed;
    private String book;
    private String location;

    public LibraryIDRegister(int id, int logo, String library, String placed, String book, String location) {
        this.id = id;
        this.logo = logo;
        this.library = library;
        this.placed = placed;
        this.book = book;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getLibrary() {
        return library;
    }

    public void setLibrary(String library) {
        this.library = library;
    }

    public String getPlaced() {
        return placed;
    }

    public void setPlaced(String placed) {
        this.placed = placed;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
