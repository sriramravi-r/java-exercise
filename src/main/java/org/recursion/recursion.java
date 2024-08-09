package org.recursion;

public class recursion {
    static void fun(int a){
        if(a>0){
            System.out.println(a);
            fun(a-1);
        }
    }
    static void fun2(int a){
        if(a>0){
            fun2(a-1);
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
        //fun(3);
        fun2(3);
    }
}
