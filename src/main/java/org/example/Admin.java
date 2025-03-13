package org.example;

import java.util.Scanner;

public class Admin extends User{
    String[] options = {"Dodaj nowych uzytkownikow","Edycja uzytkownika", "Uson uzytkownika", "Wyswietl uzytkownikow"};

        public Admin(String email, String haslo) {
            super(email, haslo);
            //TODO Auto-generated constructor stub
        }

        public void addAdmin (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Podaj email: ");
            String email = sc.nextLine();
            String haslo = sc.nextLine();

            sc.close();

        }
}