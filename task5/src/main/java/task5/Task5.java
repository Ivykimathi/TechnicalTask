
/* Question 5: Reverse interger
Write a program that takes an integer as input and returns an interger with reversed digit ordering
 */

package task5;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
           Scanner obj =new Scanner(System.in);
           int x=0;
           boolean input= false;
           while(!input){
               System.out.println("Enter an integer.");
               if(obj.hasNextInt()){
                   x= obj.nextInt();
                   input= true;
               }else{
                   System.out.println("Wrong input.Please enter an integer");
                   obj.next();
               }
           
           }
      
        
        int result= reverse(x);
        System.out.println("Reverse is: "+ result);
    }
    public static int reverse(int x){
        int result= 0;
        while(x != 0){
            int num= x%10;
            result=result *10 +num;
            x/=10;
        }
        return result;
    }
}
