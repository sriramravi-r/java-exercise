package org.methodoverloading;

import java.util.Arrays;

//overloaded method to reverse a int or array
public class Exercise2 {
    static int reverse(int n){
        int s=n;
        int reverse_number=0;
        while(s!=0){
            int digit=s%10;
            reverse_number=reverse_number*10+digit;
            s/=10;
        }
        return reverse_number;
    }
    static int[] reverse(int[] n){
        int start=0;
        int end=n.length-1;
        while(start<end){
            int temp=n[start];
            n[start]=n[end];
            n[end]=temp;
            start++;end--;
        }
        return n;
    }
    public static void main(String[] args) {
        int[] arr=new int[]{1, 2, 3, 4, 5};
        int num=123;
        System.out.println(reverse(num));
        System.out.println(Arrays.toString(reverse(arr)));
    }
}
