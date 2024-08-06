package org.arrays.singledimensional_array;

import java.lang.reflect.Array;
import java.util.Arrays;

// find second-largest element
// algorithm
// inilize two reference and create a object as A[0]
// loop array
// if A[i] is greater than max1
//    put max1 value in max2
//    put A[i] value in max1
// if A[i] is greater than max2
//    put A[i] value in max2
public class Exercise4 {
    public static void main(String[] args) {
        int A[]=new int[]{3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        max1=max2=A[0];
        for(int i=0;i<A.length;i++){
            if(A[i]>max1) {
                max2 = max1;
                max1 = A[i];
            }else if(A[i]>max2){
                max2=A[i];
            }
        }
        System.out.println(max2);
    }
}
