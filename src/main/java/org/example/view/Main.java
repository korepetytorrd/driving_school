package org.example.view;

import java.util.Scanner;

import org.example.controller.LoginService;

public class Main {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // String email="rd@gmail.com";
      // String haslo="1234";
      // //TODO Wczytanie danych email i hasło od użytkownika
      // /* System.out.println("Podaj email");
      // email = sc.nextLine();
      // System.out.println("Podaj hasło");
      // haslo = sc.nextLine();
      // */
      // sc.close();
      // LoginService.start(email,haslo);

      System.out.println("Podaj zdanie/wyraz do odwrócenia:");
      String zdanie = sc.nextLine();

      String[] slow = zdanie.split(" ");
      int iloscPalindromow = 0;

      for (int i = 0; i < slow.length; i++) {
         String slowo = slow[i];
         reverseString(slowo);
         iloscPalindromow += isPalindrom(slowo);
         System.out.print(" ");
      }
      System.out.println(iloscPalindromow);

   }

   public static int isPalindrom(String slowo) {
      int i = 0;
      int j = slowo.length() - 1;
      while (i < j) {
         if (slowo.charAt(i) != slowo.charAt(j)) {
            return 0;
         }
         i++;
         j--;
      }
      return 1;
   }

   public static void reverseString(String slowo) {
      for (int j = slowo.length() - 1; j >= 0; j--) {
         System.out.print(slowo.charAt(j));
      }
   }
}