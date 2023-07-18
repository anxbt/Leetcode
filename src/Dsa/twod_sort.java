package Dsa;

import java.util.Arrays;

public class twod_sort {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        sort(matrix);
    }

    static void sort(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            int[] rowArray = Arrays.copyOf(matrix[row], matrix[row].length);
            Arrays.sort(rowArray);
            for (int element : rowArray) {
                System.out.print(element + " ");
            }
            //System.out.println();
        }
    }
}
