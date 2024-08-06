package org.arrays.singledimensional_array;

import java.util.stream.DoubleStream;

//find max element
public class Exercise3 {
    public static void main(String[] args) {
        int A[]=new int[]{3,9,7,8,12,6,15,5,4,10};
        int largest_element=A[0];
        for(int x=0;x<A.length;x++){
            if(A[x]>largest_element){
                largest_element=A[x];
            }
        }
        System.out.println("we found "+largest_element+"is a largest element");
    }
}
