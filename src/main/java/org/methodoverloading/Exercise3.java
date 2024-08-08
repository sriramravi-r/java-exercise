package org.methodoverloading;

public class Exercise3 {
    static boolean validate(String name){
        return name.matches("[a-zA-Z\\s]*");
    }
    static boolean validate(int age){
        return age>=18 ;
    }
    public static void main(String[] args) {
        System.out.println(validate(8));
        System.out.println(validate("srira"));
    }
}
