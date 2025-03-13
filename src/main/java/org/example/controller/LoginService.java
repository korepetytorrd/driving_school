package org.example.controller;


public class LoginService {

    public static void start(String email, String haslo){ /** To jest dokumentacja*/
        if (LoginManager.login(email, haslo)){
            System.out.println("Zalogowany");
            switch (LoginManager.whoIsLogged(email)){

                case 1:
                    System.out.println("admin");

                    
                    break;
                case 2:
                    System.out.println("instruktor");
                    break;
                case 3:
                    System.out.println("kursant");
                    break;
                default:
                    System.out.println("Nieznany User");



            }

        }else{
            System.out.println("Niezalogowany");
        }
}
}

