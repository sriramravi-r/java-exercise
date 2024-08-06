package org.arrays.singledimensional_array;

import java.lang.reflect.Array;

//increasing a size of array
public class Exerccise8 {
    public static void main(String[] args) {
        int[] a={1,2,3,4};
        System.out.println(a.length);
        int[] b=new int[2*a.length];
        System.out.println(b.length);

    }
}
