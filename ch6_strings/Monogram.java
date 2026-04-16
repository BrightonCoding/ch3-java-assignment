package ch6_strings;
import java.util.*;

public class Monogram {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String middle = scanner.nextLine();
        String last = scanner.nextLine();

        int firstName = (int)first.charAt(0);
        int middleName = (int)middle.charAt(0);
        int lastName = (int)last.charAt(0);

        char outputFirst;
        char outputMiddle;
        char outputLast;

        if (firstName > 96) {
             outputFirst = first.charAt(0);
             String one = first.substring(0, 1).toUpperCase();
             System.out.print(one);
               } 
        
               else {
            
                outputFirst = first.charAt(0);
                String one = first.substring(0, 1).toLowerCase();
                System.out.print(one);
        }

        if (middleName > 96) {
            outputMiddle = middle.charAt(0);
            String two = middle.substring(0, 1).toUpperCase();
            System.out.print(two);
              } 
       
              else {
           
               outputMiddle = middle.charAt(0);
               String two = middle.substring(0, 1).toLowerCase();
               System.out.print(two);
       }

       if (lastName > 96) {
        outputLast = last.charAt(0);
        String three = last.substring(0, 1).toUpperCase();
        System.out.print(three);
          } 
   
          else {
       
           outputLast = last.charAt(0);
           String three = last.substring(0, 1).toLowerCase();
           System.out.print(three);
   }






    }
}
