package Leetcode;

import java.util.Arrays;

public class two_Array_Sort_CHATGPT {
    public static void main(String[] args) {
        int[][] matrix = {{1, 5, 9}, {10, 11, 13}, {12, 13, 15}};
        sort(matrix);
        printMatrix(matrix);
    }

    static void sort(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            Arrays.sort(matrix[row]);  // Sort each row numerically
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
