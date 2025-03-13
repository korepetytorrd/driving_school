package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
            String email="rd@gmail.com";
            String haslo="1234";
            //TODO Wczytanie danych email i hasło od użytkownika
           /* System.out.println("Podaj email");
            email = sc.nextLine();
            System.out.println("Podaj hasło");
            haslo = sc.nextLine();
            */
            sc.close();
         LoginService.start(email,haslo);


        }
}