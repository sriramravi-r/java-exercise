package org.arrays.singledimensional_array;

import java.util.Arrays;

//Rotating a array
public class Exercise5 {
    public static void main(String[] args) {
        int A[]=new int[]{3,9,7,8,12,6,15,5,4,10};
        int n=A.length;
        //approach1
//        int start=0;
//        int end=A.length-1;
//        while(start<=end){
//            int temp=A[start];
//            A[start]=A[end];
//            A[end]=temp;
//            start++;end--;
//        }
        int temp=A[0];
        for(int i=1;i<A.length;i++){
            A[i-1]=A[i];
        }
        A[n-1]=temp;
        System.out.println(Arrays.toString(A));
    }
}
