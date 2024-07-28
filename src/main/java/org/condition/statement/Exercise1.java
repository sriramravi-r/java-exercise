package org.condition.statement;

import java.util.Scanner;

// find a number is odd or even
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter number:- ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
