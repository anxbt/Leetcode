package Dsa;

import java.util.Arrays;

public class Two_Dimensional_Array {
    public static void main(String[] args) {
        int [] []matrix ={{1,5,9},{10,11,13},{12,13,15}};
        //int arr;
        sort(matrix);


    }
    static void sort(int [] [] matrix){
        for (int row=0;row<matrix.length;row++){
            for (int col=0;col<matrix[row].length;col++){
                int arr=matrix[row][col];
                Arrays.sort(new int[]{arr});
                System.out.print(arr+ " ");
            }
            //System.out.println();
        }

    }
}
