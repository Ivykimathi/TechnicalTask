
/* Question 1:  Write a program that prints the numbers from 1-100. For multiples of 3,
print "Fizz",for multiples of 5 print "Buzz", and for numbers that are multiples
of 3 and 5 print "FizzBuzz".   */

package com.mycompany.task1;

public class Task1 {

    public static void main(String[] args) {
        
         for(int x =1; x<=100; x++){
             if(x%3 ==0  && x%5 ==0){
                 System.out.println("FizzBuzz");
             }
             else if(x%3 ==0){
                 System.out.println("Fizz");
             }
             else if(x%5 ==0){
                 System.out.println("Buzz");
             }
             else{
                 System.out.println(x);
             }
         }
    }
}
