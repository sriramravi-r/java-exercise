package org.condition.statement;

import java.util.Scanner;

//Display name of a day based on number
public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date:- ");
        int date = scanner.nextInt();
        if(date == 0){
            System.out.println("monday");
        }else if(date == 1){
            System.out.println("tuesday");
        }else if(date == 2){
            System.out.println("wednesday");
        }else if(date == 3){
            System.out.println("theasday");
        }else if(date == 4){
            System.out.println("friday");
        }else{
            System.out.println("saturday");
        }
    }
}
