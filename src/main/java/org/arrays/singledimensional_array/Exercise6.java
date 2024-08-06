package org.arrays.singledimensional_array;

import java.util.Arrays;

//inserting a element in array
public class Exercise6 {
    public static void main(String[] args) {
        int A[]=new int[10];
        int n=A.length;
        int sn=6;
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=10;
        A[4]=12;
        A[5]=7;
        int index=3;
        int value=24;
        for(int i=sn;i>index;i--){
            A[i]=A[i-1];
        }
        A[index]=value;
        System.out.println(Arrays.toString(A));
    }
}
