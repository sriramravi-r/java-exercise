package org.arrays.singledimensional_array;

import java.util.Arrays;

//delete element in array
public class Exercise7 {
    public static void main(String[] args) {
        int A[]=new int[10];
        int n=A.length;
        int total_value=6;
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int index=3;
        for(int i=0;i<n;i++){
            if(i==index){
                A[i]=A[i+1];
            }
        }
        System.out.println(Arrays.toString(A));
    }
}
