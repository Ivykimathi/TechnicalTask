
/*  Question 3:  Write a program that takes an integer as input and returns true if the input is  a power of two*/

package task3;
import java.util.Scanner;
public class Task3 {

    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int x=0;
        boolean valid = false;
        
         while (!valid) {
            System.out.println("Enter an integer to check if it's a power of 2");
             if (obj.hasNextInt()) {
             x= obj.nextInt();
             valid = true;
             }else {
                    System.out.println("Invalid input. Please enter an integer.");
                    obj.next(); // consume the invalid input
                }
         }
        boolean answer= checkPower(x);
        System.out.println(answer);
    }
    public static boolean checkPower(int x){
        if(x<=0){
            return false;
        }
        return (x & (x -1)) == 0;
    }
}
