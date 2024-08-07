package org.methods;

// find GCD of two number
public class Exercise2 {
    static int gcd(int a,int b){
        while(a!=b){
            if(a>b){
                a=a-b;
            }else if(b>a){
                b=b-a;
            }
            if(a==b){
                return b;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(gcd(2,6));
    }
}
