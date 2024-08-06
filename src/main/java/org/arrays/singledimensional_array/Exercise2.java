package org.arrays.singledimensional_array;

// searching a element
public class Exercise2 {
    public static void main(String[] args) {
        int A[]=new int[]{3,9,7,8,12,6,15,5,4,10};
        int target=12;
        for(int x=0;x<A.length;x++){
            if(A[x] == target){
                System.out.println("found the element index no:- "+A[x]);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}
