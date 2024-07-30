package org.condition.statement;

import java.util.Scanner;

// find radix of number in given string
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("Enter input:- ");
        String num=scanner.nextLine();
        String num1= String.valueOf(num.charAt(0));
        String num2=String.valueOf(num.charAt(num.length()-1));
        if(num1.matches("[01]") && num2.matches("[01]")){
            System.out.println("binary 2");
        }else if(num1.matches("[1-7]") && num2.matches("[1-7]")) {
            System.out.println("octal 8");
        }else if(num1.matches("[A-F]") && num2.matches("[A-F]")) {
            System.out.println("hexa 16");
        }else{
            System.out.println("decimal 10");
        }
    }
}
