package org.condition.statement;

import java.util.Scanner;

// find a grades of given mark
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.printf("enter mark 1:- ");
        int mark1=scanner.nextInt();
        System.out.printf("enter mark 2:- ");
        int mark2=scanner.nextInt();
        System.out.printf("enter mark 3:- ");
        int mark3=scanner.nextInt();
        int total=mark1+mark2+mark3;
        System.out.println("total mark:- "+total);
        float avg=total/3;
        System.out.println("avg mark:- "+avg);
        if(avg>=70){
            System.out.println("grade:- A");
        } else if (avg<=60 && avg<70) {
            System.out.println("grade:- B");
        } else if (avg<=50 && avg<60) {
            System.out.println("grade:- C");
        }else if (avg<=40 && avg<50){
            System.out.println("grade:- D");
        }else{
            System.out.println("grade:- F");
        }
    }
}
