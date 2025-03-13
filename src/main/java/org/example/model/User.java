package org.example.model;


public abstract class User {
    int id;
    String name;
    String surname;
    String email;
    String haslo;
    String rokUrodzenia;
    String pesel;
    int up;
    String miejscowosc;
    String ulica;
    String nr_domu;
    String nr_lokalu;

    public User(int id, String name, String surname, String email, String haslo, String rokUrodzenia, String pesel,
                int up, String miejscowosc, String ulica, String nr_domu, String nr_lokalu) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.haslo = haslo;
        this.rokUrodzenia = rokUrodzenia;
        this.pesel = pesel;
        this.up = up;
        this.miejscowosc = miejscowosc;
        this.ulica = ulica;
        this.nr_domu = nr_domu;
        this.nr_lokalu = nr_lokalu;
    }

    public User(String email, String haslo) {
        this.email = email;
        this.haslo = haslo;
    }




}
