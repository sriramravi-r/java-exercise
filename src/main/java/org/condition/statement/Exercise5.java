package org.condition.statement;

import java.util.Scanner;

// find a year leap year or not
public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter year:- ");
        int year=scanner.nextInt();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("it is a leap year");
                }else{
                    System.out.println("not a leap year");
                }
            }else{
                System.out.println("it is a leap year");
            }
        }else{
            System.out.println("not a leap year");
        }
    }
}
