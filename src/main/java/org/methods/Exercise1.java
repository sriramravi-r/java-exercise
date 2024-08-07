package org.methods;

//Find a Number is Prime
public class Exercise1 {
    static boolean isPrime(int num){
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(91));
    }
}
