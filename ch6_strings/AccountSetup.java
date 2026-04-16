package ch6_strings;
import java.util.*;

public class AccountSetup {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a user name : ");
        String username = scanner.nextLine();

        String password = "";
        
        while (password.length() < 8) {

                System.out.print("Enter a password that is at least 8 characters: ");   
                password = scanner.nextLine();
        }

                username = username.toLowerCase();
                password = password.toLowerCase(); 

            System.out.print("Your user name is " + username + " and your password is " + password);
   }

        }
    
