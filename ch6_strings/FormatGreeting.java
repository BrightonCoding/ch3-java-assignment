package ch6_strings;
import java.util.*;

public class FormatGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = scanner.next();

        String male = name.substring(0,2);
        String female1 = name.substring(0,2);
        String female2 = name.substring(0,3);
        String female3 = name.substring(0,4);

        if (male.equals("Mr")) {
            System.out.print("Hello, sir.");
        } else if (female1.equals ("Ms") || female2.equals ("Mrs") || female3.equals("Miss")) {
            System.out.print("Hello, ma'am.");            
        } else {
            System.out.print(name);            
        }
            }   
        }
    
