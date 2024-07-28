package org.condition.statement;

import java.util.Scanner;

// find a number is young or not
public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter age:- ");
        int num=scanner.nextInt();
        if(num>=14 && num<=55){
            System.out.println("young");
        }else{
            System.out.println("not young");
        }
    }
}
