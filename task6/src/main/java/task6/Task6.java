
/*Question 6:  Write a program that counts the number of vowels in a sentence */

package task6;
import java.util.Scanner;

public class Task6 {

    public static void main(String[] args) {
         Scanner obj =new Scanner(System.in);
        String str="";
        boolean input=false;
        while(!input){
            System.out.println("Write a sentence and the number of vowels will be calculated.");
            if(obj.hasNextLine()){
                   str= obj.nextLine();
                      if (!str.isEmpty() && str.matches("^[a-zA-Z\\s]*$")) {
                    input = true;
                } else {
                    System.out.println("Invalid input. Please enter a string.");
                }
            }else{
                System.out.println("Invalid input.Please enter a String!!!");
                obj.next();
            }
        }
      
        int result= vowels(str);
        System.out.println("The number of vowels are: "+ result);

    }
  public static int vowels(String str){
      int count=0;
      for (char c: str.toLowerCase().toCharArray()){
          if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
              count ++;
          }
      }
      return count;
  }
}
