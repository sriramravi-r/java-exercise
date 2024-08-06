package org.twodimensional_array;

public class practise1 {
    public static void main(String[] args) {
        int A[][]=new int[3][4];
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
//        for (int i = 0; i < B.length; i++) {
//            for (int j = 0; j < B[i].length; j++) {
//                System.out.print(B[i][j]);
//            }
//            System.out.print("\n");
//        }
        for(int[] x:B){
            for(int y:x){
                if(y>1){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(y+" ");
                }
            }
            System.out.print("\n");
        }
    }
}
