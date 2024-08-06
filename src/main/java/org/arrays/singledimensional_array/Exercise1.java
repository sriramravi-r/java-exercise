package org.arrays.singledimensional_array;

// find sum of all elements
public class Exercise1 {
    public static void main(String[] args) {
        int A[]=new int[]{3,9,7,8,12,6,15,5,4,10};
        int count=0;
        for(int num:A){
            count+=num;
        }
        System.out.println(count);
    }
}
