
/*Question 4:  Write a program that accepts a string as input and capitalizes the first letter of each word
in the string, and then returns the result string*/

package task4;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        String s="";
          boolean valid = false;
          
            while (!valid) {
                System.out.println("Enter a string:");
                if (obj.hasNextLine()) {
                    s = obj.nextLine();
                    if (!s.isEmpty() && s.matches("^[a-zA-Z\\s]*$")) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Please enter a string.");
                }
            } else {
                    System.out.println("Invalid input. Please enter a string.");
                    obj.next(); // consume the invalid input
                }
            }
            
  
        String result =capitalize(s);
        System.out.println(result);
    }
    public static String capitalize(String s){
        String[]words = s.split(" ");
        
        StringBuilder builder= new StringBuilder();
        
        for(String word : words){
            String capital = word.substring(0, 1).toUpperCase()+ word.substring(1);
            
            builder.append(capital).append(" ");
        }
        return builder.toString().trim();
    }
}
