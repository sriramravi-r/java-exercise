package org.twodimensional_array;

import java.util.Arrays;

//Adding 2 Matrices
public class Excersie1 {
    public static void main(String[] args) {
        int[][] A= {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B={{1,5,2},{6,8,4},{3,9,7}};
        int[][] C=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                C[i][j]=A[i][j]+B[i][j];
            }
        }
    }
}
