package org.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class LoginManager {
    static String userFilePath = "user.txt";
    public static boolean  login(String email, String haslo){
        try (BufferedReader br = new BufferedReader(new FileReader(userFilePath))){
            String line;
            while ( (line =br.readLine()) != null ) {
                String [] values = line.split(";");
                if ( email.equals(values[3]) && haslo.equals(values[4]) ) return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static int whoIsLogged(String email){
        try (BufferedReader br = new BufferedReader(new FileReader(userFilePath))){
            String line;
            while ( (line =br.readLine()) != null ) {
                String [] values = line.split(";");
                if ( email.equals(values[3]) ) return Integer.parseInt(values[7]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void addToFile(Admin admin){
    }

}
