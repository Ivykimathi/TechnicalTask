
//Question 2:  Write a program to generate the Fibonacci sequence up to 100

package com.mycompany.task2;

public class Task2 {

    public static void main(String[] args) {
       int x=0;
       int j=1;
       int k=100;
        System.out.println("Fibonacci Sequence");
        while(x<=k){
            System.out.println(x + "");
            int sum =x+j;
            x=j;
            j=sum;
        }
    }
}
