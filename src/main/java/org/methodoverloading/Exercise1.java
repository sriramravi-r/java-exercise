package org.methodoverloading;

//overloading a method to calculate area
public class Exercise1 {
    static float findarea(float l,float b){
        return l*b;
    }
    static float findarea(float r){
        return (float) (Math.PI*r*r);
    }
    public static void main(String[] args) {
        System.out.println(findarea(2,3));
        System.out.println(findarea(2));
    }
}
