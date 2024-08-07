package org.methods;

import java.util.Arrays;

//Find max element in array
public class Exercise3 {
    static int[] bubblesort(int[] arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    static int max(int[] arr){
        bubblesort(arr);
//        int max_element=arr[0];
//        for(int x:arr){
//            if(x>max_element){
//                max_element=x;
//            }
//        }
//        return max_element;
         return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] max={2,1,5,4};
        System.out.println(max(max));
    }
}
